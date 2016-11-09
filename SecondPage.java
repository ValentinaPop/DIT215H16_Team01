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
import javax.imageio.ImageIO;
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
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SecondPage extends JFrame {
	
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

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieList frame = new MovieList();
					contentPane.add(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	
		
	//Search Button: To Movie List
	 btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				//Getting the User input from Text Fields
				String inputTitle = textField_Title.getText(); 
				String inputYear = textField_Year.getText(); //there is "0 +" because cannot change nothing to integer
				String inputGenre = textField_Genre.getText();
				String inputStudio = textField_Studio.getText();
				String inputLanguage = textField_Language.getText();
				String inputRating = textField_Rating.getText();
				String intputActor = textField_Actor.getText();
				String inputAgerestriction =  textField_AgeRes.getText();
				String inputDirector = textField_Director.getText();
				String inputRuntime = textField_Length.getText();
				
				String [] input = new String [10];
				input[0] = inputTitle;
				input[1] = inputYear;
				input[2] = inputGenre;
				input[3] = inputStudio;
				input[4] = inputLanguage;
				input[5] = inputRating;
				input[6] = intputActor;
				input[7] = inputAgerestriction;
				input[8] = inputDirector;
				input[9] = inputRuntime;
				
				//connecting to SearchQuery
				SearchQuery searchQuery = new SearchQuery(input);
				String query = searchQuery.getQuery();
				
				//connecting to DBConnection
				DBConnection dBConnection = new DBConnection(query, "Movie"); 
				ArrayList<Movie> movies= dBConnection.getMovieList();
				
				// connecting the list of movies and creating a new interface with searched movies
				MovieList movieList = new MovieList(movies);
			}				 
		});
				
				 }
}