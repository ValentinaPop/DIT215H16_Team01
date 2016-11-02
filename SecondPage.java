package connection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JInternalFrame;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class SecondPage extends JFrame {
	MovieList movieList;
	Movie movie;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel lblActor;
	private JLabel lblGenre;
	private JLabel lblStudio;
	private JLabel lblRating;
	private JLabel lblNewLabel_1;
	private JLabel lblAgeRestriction;
	private JLabel lblNewLabel_2;
	private JLabel lblLength;
	private JTextField textField_Actor;
	private JTextField textField_Rating;
	private JTextField textField_Language;
	private JTextField textField_Studio;
	private JTextField textField_Year;
	private JTextField textField_Title;
	private JTextField textField_Director;
	private JTextField textField_AgeRes;
	private JButton btnSearch;
	private JTextField textField_Genre;
	private JTextField textField_Length;
	
	
	private JFrame frame;
	private JLabel lblMessageMovie1;
	private JLabel lblMessageMovie2;
	private JLabel lblMessageMovie3;
	private JLabel photoLabel;
	private JTextField txtReady;
	private JTextField txtReady_1;
	private JButton button;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondPage frame = new SecondPage();
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
	public SecondPage() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = dim.width;
		int screenHeight = dim.height;
		
		getSize();
		setBounds(0, 0, dim.width, dim.height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);

		JLabel lblTrailerPark = new JLabel("Trailer Park");
		lblTrailerPark.setForeground(new Color(128, 0, 0));
		lblTrailerPark.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));

		textField = new JTextField();
		textField.setColumns(10);

		lblNewLabel = new JLabel("Year");

		lblActor = new JLabel("Actor");

		lblGenre = new JLabel("Genre");

		lblStudio = new JLabel("Studio");

		JLabel lblLanguage = new JLabel("Language");

		lblRating = new JLabel("Rating");

		lblNewLabel_1 = new JLabel("Title");

		lblAgeRestriction = new JLabel("Age restriction");

		lblNewLabel_2 = new JLabel("Director");

		lblLength = new JLabel("Length");

		textField_Actor = new JTextField();
		textField_Actor.setColumns(10);

		textField_Rating = new JTextField();
		textField_Rating.setColumns(10);

		textField_Language = new JTextField();
		textField_Language.setColumns(10);

		textField_Studio = new JTextField();
		textField_Studio.setColumns(10);

		textField_Year = new JTextField();
		textField_Year.setColumns(10);

		textField_Title = new JTextField();
		textField_Title.setColumns(10);
		

		textField_Director = new JTextField();
		textField_Director.setColumns(10);

		textField_AgeRes = new JTextField();
		textField_AgeRes.setColumns(10);

		
		btnSearch = new JButton("Search");
		

		textField_Genre = new JTextField();
		textField_Genre.setColumns(10);

		textField_Length = new JTextField();
		textField_Length.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblGenre)
										.addComponent(lblStudio)
										.addComponent(lblRating)
										.addComponent(lblActor)
										.addComponent(lblLanguage))
									.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
											.addComponent(textField_Rating, Alignment.TRAILING)
											.addComponent(textField_Actor, Alignment.TRAILING))
										.addComponent(textField_Language, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_Studio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_Genre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel))
									.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(textField_Title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(textField_Year, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblAgeRestriction)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_AgeRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
							.addComponent(textField_Director, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblLength)
							.addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
							.addComponent(textField_Length, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap(158, Short.MAX_VALUE)
							.addComponent(btnSearch))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(43)
							.addComponent(lblTrailerPark)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTrailerPark)
					.addGap(13)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_Title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField_Year, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGenre)
						.addComponent(textField_Genre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStudio)
						.addComponent(textField_Studio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLanguage)
						.addComponent(textField_Language, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRating)
						.addComponent(textField_Rating, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActor)
						.addComponent(textField_Actor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAgeRestriction)
						.addComponent(textField_AgeRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_Director, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLength)
						.addComponent(textField_Length, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSearch)
					.addContainerGap(643, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);

		
		
		/////////////////////// Internal Frame: List Of Movies
		
		JInternalFrame internalFrame = new JInternalFrame("JInternalFrame");
		internalFrame.setBorder(null);
		contentPane.add(internalFrame, BorderLayout.CENTER);
		internalFrame.getContentPane().setLayout(null);
		

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1008, 54, 15, 714);
		internalFrame.getContentPane().add(scrollBar);
		internalFrame.setVisible(true);
				
		movieList = new MovieList("The");
		int length = movieList.getNrOfMovies();
		int place = 0;
		int choice = 0;
		movie = movieList.getMovieList().get(choice);
								
								/*JButton btnNewButton_2 = new JButton(movie.getTitle());
								btnNewButton_2.setBounds(0, 205, 1023, 54);
								internalFrame.getContentPane().add(btnNewButton_2);
								btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
								
								JButton btnNewButton = new JButton(movie.getTitle());
								btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
								btnNewButton.setBounds(0, 139, 1023, 54);
								internalFrame.getContentPane().add(btnNewButton);
								*/
								
								//Go Back Button
								button = new JButton("<--");
								button.setBounds(29, 28, 97, 25);
								internalFrame.getContentPane().add(button);
								
								//Log In Button
								button4 = new JButton("Log in");
								button4.setBounds(854, 35, 97, 25);
								internalFrame.getContentPane().add(button4);
								
				

				
				/////////////////////Information of the movie Elaine
							
				JInternalFrame internalFrame1 = new JInternalFrame("New JInternalFrame");
				internalFrame1.setBorder(null);
				internalFrame1.getContentPane().setLayout(null);
				internalFrame1.setVisible(true);
				
				photoLabel = new JLabel("");
				photoLabel.setIcon(new ImageIcon("C:\\Users\\Omistaja\\Downloads\\TrailerPark\\14886335_1153238338097728_590646191_n.png"));
				photoLabel.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
				photoLabel.setBackground(new Color(128, 0, 0));
				photoLabel.setBounds(27, 76, 211, 273);
				internalFrame1.getContentPane().add(photoLabel);
				
				
				JLabel titleLabel = new JLabel(movie.getTitle());
				titleLabel.setForeground(new Color(128, 0, 0));
				titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
				titleLabel.setBounds(271, 33, 380, 44);
				internalFrame1.add(titleLabel);
				
				JPanel infoPanel = new JPanel();
				infoPanel.setBackground(new Color(253, 253, 253));
				infoPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(128,0,0), null, new Color(128, 0, 0), null));
				infoPanel.setBounds(258, 75, 403, 139);
				internalFrame1.add(infoPanel);
				infoPanel.setLayout(null);
				
				JLabel releaseDateLabel = new JLabel(" Release date:  " + movie.getReleaseDate());
				releaseDateLabel.setForeground(new Color(0, 0, 0));
				releaseDateLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
				releaseDateLabel.setBounds(207, 62, 196, 29);
				infoPanel.add(releaseDateLabel);
				
				JLabel runtimeLabel = new JLabel(" Runtime:  " + movie.getRuntime());
				runtimeLabel.setForeground(new Color(0, 0, 0));
				runtimeLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
				runtimeLabel.setBounds(0, 0, 155, 29);
				infoPanel.add(runtimeLabel);
				
				JLabel ageLabel = new JLabel(" Age restriction:  " + movie.getAgeRestriction());
				ageLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
				ageLabel.setBounds(0, 62, 155, 29);
				infoPanel.add(ageLabel);
				
				JLabel languageLabel = new JLabel(" Language:  " + movie.getLanguage());
				languageLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
				languageLabel.setBounds(0, 30, 155, 29);
				infoPanel.add(languageLabel);
				
				JLabel lblStudioDisney = new JLabel(" Studio: " + movie.getStudio());
				lblStudioDisney.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
				lblStudioDisney.setBounds(207, 30, 167, 29);
				infoPanel.add(lblStudioDisney);
				
				JLabel lblDirectorStevenSpielberg = new JLabel(" Director: " + movie.getDirector());
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
				internalFrame1.add(lblBack);
				
				JLabel lblRate = new JLabel("Rate: " + movie.getAverageRate());
				lblRate.setForeground(Color.ORANGE);
				lblRate.setHorizontalAlignment(SwingConstants.CENTER);
				lblRate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				lblRate.setBounds(27, 362, 211, 33);
				internalFrame1.add(lblRate);
				
				JTextArea txtDescription = new JTextArea();
				txtDescription.setForeground(new Color(128,0,0));
				txtDescription.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				txtDescription.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				txtDescription.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(128,0,0), null));
				txtDescription.setLineWrap(true);
				txtDescription.setText(movie.getDescription());
				txtDescription.setBounds(258, 212, 403, 169);
				internalFrame1.add(txtDescription);
				
				//This was a JLabel
				button5 = new JButton("Back");
				button5.setForeground(Color.BLACK);
				button5.setFont(new Font("Times New Roman", Font.BOLD, 10));
				button5.setBackground(new Color(128,0,0));
				button5.setBounds(610, 33, 60, 25);
				internalFrame1.add(button5);
				
				//Added to be able to get to Log in
				button3 = new JButton("Log In");
				button3.setBounds(24, 13, 97, 25);
				internalFrame1.add(button3); 
			
				
				///////////////////// InternalFrame2: Log In
				
				JInternalFrame InternalFrame2 = new JInternalFrame("JJInternalFrame");
				InternalFrame2.setBorder(null);
				InternalFrame2.getContentPane().setLayout(null);
		
				JScrollBar scrollBar3 = new JScrollBar();
				scrollBar3.setBounds(1008, 54, 15, 714);
				InternalFrame2.getContentPane().add(scrollBar3);
				InternalFrame2.setVisible(true);

				// Text field
				JTextPane textPane1 = new JTextPane();
				textPane1.setText("Logging in!");
				textPane1.setBounds(0, 60, 1023, 391);
				InternalFrame2.getContentPane().add(textPane1);
				
				// Going to Movies button
				button2 = new JButton("Movies");
				button2.setBounds(24, 13, 97, 25);
				InternalFrame2.getContentPane().add(button2);
				
				
				//////////////////// Button actions
				
				for(int i = 0; i < length; i++) {
					
					JButton[] btnNewButton_1 = new JButton[length];
					btnNewButton_1[i] = new JButton(movieList.getMovieList().get(i).toString());
					btnNewButton_1[i].setBounds(5, 73 + place, 1000, 54);
					internalFrame.getContentPane().add(btnNewButton_1[i]);
					btnNewButton_1[i].setFont(new Font("Times New Roman", Font.BOLD, 20));
					
					btnNewButton_1[i].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							contentPane.remove(internalFrame);
							contentPane.add(internalFrame1);
							
						}
					});
					
	
					place = place + 70;
					}
				
				// From Log In To Movie List
				button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.remove(InternalFrame2);
					contentPane.add(internalFrame);
				}
			});
				
				// From List to Previous Movie??
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {					 
						contentPane.remove(internalFrame);
						contentPane.add(internalFrame1);
					}
				});
				
		/*		//From Movie Information to Movie List ELAINE
				button5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						contentPane.remove(internalFrame1);
						contentPane.add(internalFrame);
					}
				}); 
				
				//From Movie Information to Log In
				button3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						contentPane.remove(internalFrame1);
						contentPane.add(InternalFrame2);
					} 
				}); */
				
				//From Movie List to Log In
				button4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						contentPane.remove(internalFrame);
						contentPane.add(InternalFrame2);
					}
				});
				
				//Search Button: To Movie List
			
				 btnSearch.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {				 
							contentPane.remove(internalFrame1);
							contentPane.add(internalFrame);
						}
					});
				
				//"Movie1" Button: From Movie List to Movie Information + Connection to Database
			/*	 btnNewButton.addActionListener(new ActionListener() { 
					 public	void actionPerformed(ActionEvent arg0) {				 
					contentPane.remove(internalFrame);
					contentPane.add(internalFrame1);
				 }
				 });
				 
					
				//"Movie2" Button: From Movie List to Movie Information + Connection to Database
				 btnNewButton_1.addActionListener(new ActionListener() {
					 public void actionPerformed(ActionEvent e) {			 
							contentPane.remove(internalFrame);
							contentPane.add(internalFrame1);
					  } 
					  
					  });
					 
				//"Movie3" Button: From Movie List to Movie Information + Connection to Database
				 btnNewButton_2.addActionListener(new ActionListener() {
					  public void actionPerformed(ActionEvent e) {			 
							contentPane.remove(internalFrame);
							contentPane.add(internalFrame1);
					  } 
					  
					  });				 */
		 
			}
	
}