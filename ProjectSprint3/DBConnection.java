package DIT215H16_Team01;

import java.awt.Image;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class DBConnection {
	private static final String URL = "jdbc:mysql://leia.skip.chalmers.se:3306/team_01?autoReconnect=true&useSSL=false";
	private static final String USER = "team_01";
	private static final String PASSWORD = "yOZGjlGknjwdiG4B";
	private User user;
	private ArrayList<Movie> movieList = new ArrayList<>();
	private ImageIcon displayedImage;
	
	public DBConnection(String sqlStmt, String type){
		
			try {
				Connection conn = DriverManager.getConnection(URL, USER, PASSWORD) ;
				Statement stmt = conn.createStatement() ;
									
						if (type.equals("Update")){
							stmt.executeUpdate(sqlStmt);
						}
						else{
							
							ResultSet rs = stmt.executeQuery(sqlStmt) ;
							if (type.equals("User")){
								while ( rs.next() ) {
									user = (new User(rs.getInt("USER_ID"), rs.getString("USERNAME"), rs.getString("PASSWORD"), rs.getString("E-MAIL"),rs.getBoolean("ADMINISTRATOR")));		
								}
							}
							else if(type.equals("Movie")){
								while ( rs.next() ) {
								
									byte[] picture = rs.getBytes("Picture");
									ImageIcon iconImage = new ImageIcon(picture);
									Image image = iconImage.getImage();
									Image image2 = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
									ImageIcon coverPhoto = new ImageIcon(image2);
								
									movieList.add( new Movie(rs.getInt("Id"), rs.getString("Title"), coverPhoto, rs.getString("Length"), rs.getString("Language"),
										rs.getDate("Release"), rs.getString("Description of the movie"), rs.getDouble("Rate"), rs.getString("Director"),
										rs.getString("Studio"), rs.getString("Age restriction"))) ;
							}	
							}
							else if (type.equals("Image")){
								while ( rs.next() ) {
								
									byte[] picture = rs.getBytes("Image");
								ImageIcon iconImage = new ImageIcon(picture);
								Image image1 = iconImage.getImage();
								Image image2 = image1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
								displayedImage = new ImageIcon(image2);
								}
						}
						rs.close();
					}
						stmt.close();
						conn.close();
			}
			
			catch ( SQLException ex ) {
				ex.printStackTrace() ;
			} 
	}
	public User getUser(){		
		return this.user;	
	}
	public ArrayList<Movie> getMovie(){
		return this.movieList;
	}
	public ImageIcon getImageIcon(){
		return displayedImage;
	}

}
