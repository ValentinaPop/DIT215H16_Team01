package connection;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class MovieList {
	 private ArrayList<Movie> movieList = new ArrayList<>();
	 private int nrOfMovies;
	 
	 public MovieList(String n){
		 try {
				java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://leia.skip.chalmers.se:3306/team_01", "team_01", "yOZGjlGknjwdiG4B");

				Statement stm = conn.createStatement();

						ResultSet rs = stm.executeQuery("SELECT * FROM `TrailerPark` WHERE Title REGEXP '[[:<:]]" + n + "[[:>:]]'");


						while (rs.next()) {
							System.out.println(rs.getString("Title"));
							byte[] image = null;
				            
				                image = rs.getBytes("Picture");

				            
				            //Image img = Toolkit.getDefaultToolkit().createImage(image);
				            //ImageIcon coverPhoto = new ImageIcon(img);
							
							this.movieList.add(new Movie(rs.getInt("Id"), rs.getString("Title"), /*coverPhoto,*/ rs.getString("Length"), rs.getString("Language"),
									rs.getDate("Release"), rs.getString("Description of the movie"), rs.getDouble("Rate"),rs.getString("Director"),
									rs.getString("Studio"), rs.getString("Age restriction") ));
							this.nrOfMovies++;
						}
				
			}

			catch (Exception ex) {
				ex.printStackTrace();
			}
	 }
	 public ArrayList<Movie> getMovieList(){
		 return this.movieList;
	 }
	 public int getNrOfMovies(){
		 return this.nrOfMovies;
	 }
}
