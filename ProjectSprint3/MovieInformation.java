package DIT215H16_Team01;

import java.awt.EventQueue;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Cursor;

public class MovieInformation extends JInternalFrame {
	private JLabel photoLabel;
	private static final String URL = "";
	private static final String USER = "";
	private static final String PASSWORD = "";
	
	public static Connection con = null;
	
	/**
	 * Launch the application.
	 */
	
	public static Icon getIcon(String sql){
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()){
				byte[] img = rs.getBytes("Image");
				ImageIcon image = new ImageIcon(img);
				Image im = image.getImage();
				Image imNext = im.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
				ImageIcon newImage = new ImageIcon(imNext);
				con.close();
				return newImage;
				
			}
			
		} catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		Movie movie;
		Scanner input = new Scanner(System.in) ;
		ImageIcon coverPhoto;
		
		try {
			java.sql.Connection conn = DriverManager.getConnection( "jdbc:mysql://leia.skip.chalmers.se:3306/team_01", "team_01", "yOZGjlGknjwdiG4B" ) ;
			
			Statement stm = conn.createStatement() ;
				
					
					System.out.print( "Enter the Title: " ) ;
					String title = input.nextLine() ;
					
					ResultSet rs = stm.executeQuery( "SELECT * FROM `TrailerPark` WHERE title REGEXP '[[:<:]]" + title + "[[:>:]]'" ) ;
					
					while ( rs.next() ) {
						
						BufferedImage img = null;
						try {
						    img = ImageIO.read((File) rs.getBlob("Picture"));
						} catch (IOException e) {
						    e.printStackTrace();
						}
						//BufferedImage dimg = (BufferedImage) img.getScaledInstance(211, 273, Image.SCALE_SMOOTH);
						//coverPhoto = new ImageIcon(dimg);
						//coverPhoto
						
						///byte[] image = null;
			         
			              ///  image = rs.getBytes("Picture");

			            ///}
			            ///Image img = Toolkit.getDefaultToolkit().createImage(image);
			            ///coverPhoto = new ImageIcon(img);
						
						//movie = new Movie(rs.getInt("Id"), rs.getString("Title"), coverPhoto, rs.getString("Length"), rs.getString("Language"),
							//	rs.getDate("Release"), rs.getString("Description of the movie"), rs.getDouble("Rate"),rs.getString("Director"),
							//	rs.getString("Studio"), rs.getString("Age restriction") );
					}
				
		} 		
		catch ( Exception ex ) {
			ex.printStackTrace() ;
		} 
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieInformation frame = new MovieInformation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MovieInformation() {
		getContentPane().setBackground(new Color(253, 253, 253));
		setBounds(100, 100, 700, 500);
		getContentPane().setLayout(null);
		
		photoLabel = new JLabel("");
		photoLabel.setIcon(new ImageIcon("C:\\Users\\Elaine\\Desktop\\HT16\\Project - Programming\\Movie covers\\Interstellar.jpg"));
		photoLabel.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		photoLabel.setBackground(new Color(128, 0, 0));
		photoLabel.setBounds(27, 76, 211, 273);
		getContentPane().add(photoLabel);
		
		JLabel titleLabel = new JLabel("Title");
		titleLabel.setForeground(new Color(128, 0, 0));
		titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		titleLabel.setBounds(271, 33, 380, 44);
		getContentPane().add(titleLabel);
		
		JPanel infoPanel = new JPanel();
		infoPanel.setBackground(new Color(253, 253, 253));
		infoPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(128,0,0), null, new Color(128, 0, 0), null));
		infoPanel.setBounds(258, 75, 403, 139);
		getContentPane().add(infoPanel);
		infoPanel.setLayout(null);
		
		JLabel releaseDateLabel = new JLabel(" Release date:  28 february 2015");
		releaseDateLabel.setForeground(new Color(0, 0, 0));
		releaseDateLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		releaseDateLabel.setBounds(207, 62, 196, 29);
		infoPanel.add(releaseDateLabel);
		
		JLabel runtimeLabel = new JLabel(" Runtime:  1h 52min");
		runtimeLabel.setForeground(new Color(0, 0, 0));
		runtimeLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		runtimeLabel.setBounds(0, 0, 155, 29);
		infoPanel.add(runtimeLabel);
		
		JLabel ageLabel = new JLabel(" Age restriction:  PG");
		ageLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		ageLabel.setBounds(0, 62, 155, 29);
		infoPanel.add(ageLabel);
		
		JLabel languageLabel = new JLabel(" Language:  English");
		languageLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		languageLabel.setBounds(0, 30, 155, 29);
		infoPanel.add(languageLabel);
		
		JLabel lblStudioDisney = new JLabel(" Studio: Disney");
		lblStudioDisney.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblStudioDisney.setBounds(207, 30, 167, 29);
		infoPanel.add(lblStudioDisney);
		
		JLabel lblDirectorStevenSpielberg = new JLabel(" Director: Steven Spielberg");
		lblDirectorStevenSpielberg.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblDirectorStevenSpielberg.setBounds(207, 0, 167, 29);
		infoPanel.add(lblDirectorStevenSpielberg);
		
		JLabel lblStarringNamesOf = new JLabel(" Starring: Names of around three actors I think. ");
		lblStarringNamesOf.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblStarringNamesOf.setBounds(0, 93, 403, 22);
		infoPanel.add(lblStarringNamesOf);
		
		JLabel lblGenreAdventureComedy = new JLabel(" Genre:  Adventure, Comedy, Family");
		lblGenreAdventureComedy.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblGenreAdventureComedy.setBounds(0, 110, 403, 29);
		infoPanel.add(lblGenreAdventureComedy);
		
		JLabel lblBack = new JLabel("Back");
		lblBack.setForeground(Color.BLACK);
		lblBack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblBack.setBackground(new Color(128,0,0));
		lblBack.setBounds(610, 33, 44, 16);
		getContentPane().add(lblBack);
		
		JLabel lblRate = new JLabel("Rate: No votes");
		lblRate.setForeground(Color.ORANGE);
		lblRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblRate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblRate.setBounds(27, 362, 211, 33);
		getContentPane().add(lblRate);
		
		JTextArea txtDescription = new JTextArea();
		txtDescription.setForeground(new Color(128,0,0));
		txtDescription.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtDescription.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtDescription.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(128,0,0), null));
		txtDescription.setLineWrap(true);
		txtDescription.setText("It's a classic tale of human vs. machine. And you know... a lot of other stuff happens.");
		txtDescription.setBounds(258, 212, 403, 169);
		getContentPane().add(txtDescription);

	}
}
