package DIT215H16_Team01;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.Scrollable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.text.AbstractDocument.Content;

import java.awt.Font;
import java.awt.List;
import java.awt.MenuBar;
import java.awt.Scrollbar;
import java.awt.TextArea;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JToolBar;
import javax.swing.JCheckBox;

public class AddingMovies extends JInternalFrame{

	protected static final Icon icon = null;
	protected static final boolean Null = false;
	private JFrame frame;
	private JTextField textField_length;
	private JTextField textField_director;
	private JTextField textField_studio;
	private JTextField textField_release;
	private JTextField textField_language;
	private JTextField textField_title;
	public static String picture_file_name = null;

	public Object InputData;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddingMovies window = new AddingMovies();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public AddingMovies() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Get the screen dimension
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = dim.width;
		int screenHeight = dim.height;

		// Frame( main)
		//frame = new JFrame();
		setResizable(false);
		
		
		setBackground(Color.WHITE);
		setBounds(0, 0, dim.width, dim.height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBorder(null);
		//setLocationRelativeTo(null);
		
		// adding the AdMenu 
		
		//setJMenuBar(new MenuAdm());
		// ------------------------------------info_ Labels + font + color
		// ------------

		JLabel info = new JLabel("Fill in movie information");
		info.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		info.setForeground(new Color(128, 0, 0));

		JLabel lbl_tittel = new JLabel("Title *");
		lbl_tittel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbl_tittel.setForeground(new Color(128, 0, 0));

		JLabel lbl_length = new JLabel("Length");
		lbl_length.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbl_length.setForeground(new Color(128, 0, 0));

		JLabel lbl_director = new JLabel("Director");
		lbl_director.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbl_director.setForeground(new Color(128, 0, 0));

		JLabel lbl_studio = new JLabel("Studio");
		lbl_studio.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbl_studio.setForeground(new Color(128, 0, 0));

		JLabel lbl_release = new JLabel("Release  *");
		lbl_release.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbl_release.setForeground(new Color(128, 0, 0));

		JLabel lbl_language = new JLabel("Language  *");
		lbl_language.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbl_language.setForeground(new Color(128, 0, 0));

		JLabel lbl_age = new JLabel("Age restriction");
		lbl_age.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbl_age.setForeground(new Color(128, 0, 0));

		JLabel lbl_description = new JLabel("Description of the movie");
		lbl_description.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbl_description.setForeground(new Color(128, 0, 0));

		JLabel lbl_pic = new JLabel("Picture  *");
		lbl_pic.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbl_pic.setForeground(new Color(128, 0, 0));

		// ------------------ text fields/input Values ------------

		textField_length = new JTextField();
		textField_length.setColumns(10);
		textField_length.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), null, null, null));

		textField_director = new JTextField();
		textField_director.setColumns(10);
		textField_director.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), null, null, null));

		textField_studio = new JTextField();
		textField_studio.setColumns(10);
		textField_studio.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), null, null, null));

		textField_release = new JTextField();
		textField_release.setColumns(10);
		textField_release.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), null, null, null));

		textField_language = new JTextField();
		textField_language.setColumns(10);
		textField_language.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), null, null, null));

		textField_title = new JTextField();
		textField_title.setColumns(10);
		textField_title.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), null, null, null));
		
		JTextArea txtAreaDescription = new JTextArea();
		txtAreaDescription.setText("descripe here!....");
		txtAreaDescription.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), null, null, null));

		JComboBox comboBox_age = new JComboBox();
		comboBox_age.setModel(new DefaultComboBoxModel(new String[] { "None", "G", "PG", "PG-13", "R" }));
		comboBox_age.setToolTipText("");
		
		
		// -------- upload/ choose button + action listener ==> choose a photo
		// from the PC and upload it to database--------------------
		JButton btnChoosePicture = new JButton("Choose a picture");
		final JFileChooser fileDialog = new JFileChooser();

		btnChoosePicture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int returnVal = fileDialog.showOpenDialog(frame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					java.io.File file = fileDialog.getSelectedFile();
					// statusLabel.setText("File Selected :" + file.getName());
					picture_file_name = file.getAbsolutePath();
				} else {
					// statusLabel.setText("Open command cancelled by user." );

				}
			}
		});

		// ----------- separator for between tables in SQL -------
		JToolBar separator = new JToolBar();
		separator.setForeground(new Color(128, 0, 0));
		separator.setBackground(Color.WHITE);

		JLabel lbl_actors = new JLabel("Actors");
		lbl_actors.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbl_actors.setForeground(new Color(128, 0, 0));

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), null, null, null));

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), null, null, null));

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), null, null, null));

		JToolBar toolBar = new JToolBar();
		toolBar.setOrientation(SwingConstants.VERTICAL);
		toolBar.setForeground(new Color(128, 0, 0));
		toolBar.setBackground(Color.WHITE);

		JLabel lbl_genre = new JLabel("Genre");
		lbl_genre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbl_genre.setForeground(new Color(128, 0, 0));

		// vector/ list of genre check box & the check box
		Vector<JCheckBox> genre = new Vector<JCheckBox>();
		JCheckBox chckbxDrama = new JCheckBox("Drama");
		genre.addElement(chckbxDrama);
		JCheckBox chckbxRomance = new JCheckBox("Romance");
		genre.addElement(chckbxRomance);
		JCheckBox chckbxAdventure = new JCheckBox("Adventure");
		genre.addElement(chckbxAdventure);
		JCheckBox chckbxComedy = new JCheckBox("Comedy");
		genre.addElement(chckbxComedy);
		JCheckBox chckbxAction = new JCheckBox("Action");
		genre.addElement(chckbxAction);
		JCheckBox chckbxMystery = new JCheckBox("Mystery");
		genre.addElement(chckbxMystery);
		JCheckBox chckbxFantasy = new JCheckBox("Fantasy");
		genre.addElement(chckbxFantasy);
		JCheckBox chckbxHorror = new JCheckBox("Horror");
		genre.addElement(chckbxHorror);
		JCheckBox chckbxFamily = new JCheckBox("Family");
		genre.addElement(chckbxFamily);
		JCheckBox chckbxCrime = new JCheckBox("Crime");
		genre.addElement(chckbxCrime);
		JCheckBox chckbxSci_Fi = new JCheckBox("Sci-Fi");
		genre.addElement(chckbxSci_Fi);
		JCheckBox chckbxMusical = new JCheckBox("Musical");
		genre.addElement(chckbxMusical);
		JCheckBox chckbxAnimation = new JCheckBox("Animation");
		genre.addElement(chckbxAnimation);
		JCheckBox chckbxSport = new JCheckBox("Sport");
		genre.addElement(chckbxSport);
		JCheckBox chckbxWar = new JCheckBox("War");
		genre.addElement(chckbxWar);
		JCheckBox chckbxThriller = new JCheckBox("Thriller");
		genre.addElement(chckbxThriller);
		JCheckBox chckbxHistory = new JCheckBox("History");
		genre.addElement(chckbxHistory);
		JCheckBox chckbxBiography = new JCheckBox("Biography");
		genre.addElement(chckbxBiography);

		// -------- Save button + action listener ==> upload the whole
		// information into database--------------------

		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(255, 255, 255));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// mandatory filling choices
				if (!textField_title.getText().equals("") && !textField_release.getText().equals("")
						&& !textField_language.getText().equals("") && picture_file_name != null) {
					// getting the texts from the fields to implement them into
					// DB query
					int movieID = DB_Methods.insertMovie(textField_title.getText(), textField_length.getText(),
							textField_director.getText(), textField_studio.getText(), textField_release.getText(),
							textField_language.getText(), comboBox_age.getSelectedItem().toString(),
							txtAreaDescription.getText(),
							// textField_basedOn.getText(),
							picture_file_name);

					String first_actor = textField.getText();
					String secound_actor = textField_1.getText();
					String third_actor = textField_2.getText();

					// the process is completed
					if (movieID != 0) {

						// adding actors & making sure txt_actors are not
						// null
						if (!first_actor.equals("")) {
							DB_Methods.insertActorRelation(movieID, DB_Methods.checkInsertActor(first_actor));

						}

						if (!secound_actor.equals("")) {
							DB_Methods.insertActorRelation(movieID, DB_Methods.checkInsertActor(secound_actor));
						}

						if (!third_actor.equals("")) {
							DB_Methods.insertActorRelation(movieID, DB_Methods.checkInsertActor(third_actor));
						}

						// loop throw the genre list to get the selected items
						// => get the matching GenreId by adding to the selected
						// index number 1.
						for (int i = 0; i < genre.size(); i++) {
							if (movieID != 0) {
								// if the movie info is added so start add the
								// GenreRelation.
								if (genre.elementAt(i).isSelected()) {
									DB_Methods.insertGenreRelation(movieID, i + 1);
									System.out.println(genre.elementAt(i).getText() + " is selected");
								} /*
									 * else {
									 * DB_Methods.insertGenreRelation(movieID,
									 * 0); }
									 */
							}
						}

						JDialog dialoge = new JDialog();
						JOptionPane.showMessageDialog(frame, " Information has been saved..! ", "Information saved",
								JOptionPane.INFORMATION_MESSAGE);
						// Clean all the input fields or go to the main page
						System.out.println("info saved ...");

						// if leave empty...every input .settext("") ...
						// setSelected(False)
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_director.setText("");
						textField_language.setText("");
						textField_length.setText("");
						textField_release.setText("");
						textField_studio.setText("");
						textField_title.setText("");
						txtAreaDescription.setText("");
						comboBox_age.setSelectedIndex(0);
						for (int i = 0; i < genre.size(); i++) {
							genre.elementAt(i).setSelected(false);
						}
					}

					// dialog message if the date format is wrong
					else {
						JDialog dialog = new JDialog();

						JOptionPane.showMessageDialog(frame,
								"somethig went wrong. \n" + "not that the realease should have yyyy-mm-dd format ",
								"Inane error", JOptionPane.ERROR_MESSAGE);
					}

					// dialog message if nothing is implemented in the fields or
					// missing mandatory choices
				} else {
					JDialog dialog = new JDialog();

					JOptionPane.showMessageDialog(frame,
							"please fill in the information needed\n"
									+ "(title,release,language) and choose a picture ",
							"Inane error", JOptionPane.ERROR_MESSAGE);

				}
			}
		});

		// ---------- placement on the layout-------------------

		GroupLayout groupLayout = new GroupLayout(this.getContentPane());
		groupLayout
				.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup().addGap(68).addGroup(groupLayout
								.createParallelGroup(
										Alignment.LEADING)
								.addGroup(
										groupLayout
												.createSequentialGroup().addGroup(groupLayout.createParallelGroup(
														Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
																.addGroup(groupLayout
																		.createParallelGroup(
																				Alignment.LEADING)
																		.addGroup(groupLayout
																				.createParallelGroup(Alignment.TRAILING)
																				.addGroup(groupLayout
																						.createSequentialGroup()
																						.addGroup(groupLayout
																								.createParallelGroup(
																										Alignment.LEADING)
																								.addComponent(
																										lbl_tittel)
																								.addComponent(
																										lbl_director)
																								.addComponent(
																										lbl_length))
																						.addGap(144))
																				.addGroup(groupLayout
																						.createSequentialGroup()
																						.addComponent(lbl_pic,
																								GroupLayout.PREFERRED_SIZE,
																								101,
																								GroupLayout.PREFERRED_SIZE)
																						.addGap(104)))
																		.addComponent(lbl_description))
																.addGap(58)
																.addGroup(groupLayout
																		.createParallelGroup(Alignment.LEADING, false)
																		.addComponent(txtAreaDescription,
																				GroupLayout.DEFAULT_SIZE, 257,
																				Short.MAX_VALUE)
																		.addComponent(textField_studio)
																		.addComponent(textField_director)
																		.addComponent(textField_length)
																		.addComponent(textField_title)
																		.addComponent(textField_language)
																		.addComponent(textField_release)
																		.addComponent(comboBox_age, 0,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(btnChoosePicture,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)))
														.addComponent(lbl_age).addComponent(lbl_language)
														.addComponent(lbl_release).addComponent(lbl_studio))
												.addGap(25)
												.addComponent(separator, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED).addGroup(
																		groupLayout
																				.createParallelGroup(Alignment.LEADING)
																				.addGroup(groupLayout
																						.createSequentialGroup()
																						.addComponent(lbl_actors)
																						.addGap(87).addGroup(groupLayout
																								.createParallelGroup(
																										Alignment.LEADING,
																										false)
																								.addComponent(
																										textField_2,
																										Alignment.TRAILING)
																								.addComponent(
																										textField_1,
																										Alignment.TRAILING)
																								.addComponent(textField,
																										Alignment.TRAILING,
																										GroupLayout.PREFERRED_SIZE,
																										218,
																										GroupLayout.PREFERRED_SIZE)))
																				.addComponent(toolBar,
																						Alignment.TRAILING,
																						GroupLayout.DEFAULT_SIZE, 631,
																						Short.MAX_VALUE)))
														.addGroup(groupLayout.createSequentialGroup().addGap(22)
																.addComponent(lbl_genre))
														.addGroup(groupLayout.createSequentialGroup().addGap(82)
																.addGroup(groupLayout
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(chckbxDrama)
																		.addComponent(chckbxRomance)
																		.addGroup(groupLayout.createSequentialGroup()
																				.addGroup(groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(chckbxAdventure)
																						.addComponent(chckbxComedy)
																						.addComponent(chckbxAction)
																						.addComponent(chckbxMystery))
																				.addGap(33)
																				.addGroup(groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(chckbxFantasy)
																						.addComponent(chckbxFamily)
																						.addComponent(chckbxCrime)
																						.addComponent(chckbxSci_Fi)
																						.addComponent(chckbxMusical)
																						.addComponent(
																								chckbxAnimation))))
																.addGap(41)
																.addGroup(groupLayout
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(chckbxHistory)
																		.addComponent(chckbxThriller)
																		.addComponent(chckbxWar)
																		.addComponent(chckbxSport)
																		.addComponent(chckbxHorror)
																		.addComponent(chckbxBiography)))
														.addGroup(Alignment.TRAILING, groupLayout
																.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 107,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(26))))
								.addComponent(info, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		groupLayout
				.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup().addGap(41).addComponent(info, GroupLayout.PREFERRED_SIZE, 43,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
								.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(lbl_actors)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(textField, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(textField_2,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)))
								.addGap(125)
								.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(
												groupLayout.createSequentialGroup().addGap(18).addComponent(lbl_genre))
										.addGroup(groupLayout.createSequentialGroup().addGap(43).addGroup(groupLayout
												.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(chckbxFantasy)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxFamily)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxCrime)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxSci_Fi)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxMusical)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxAnimation))
												.addGroup(groupLayout.createSequentialGroup().addComponent(chckbxDrama)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxRomance)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxAdventure)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxComedy)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxAction)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxMystery))
												.addGroup(groupLayout.createSequentialGroup().addComponent(chckbxHorror)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxSport)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxWar)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxThriller)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxHistory)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxBiography)))))
								.addGap(98).addComponent(btnSave))
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lbl_tittel).addComponent(textField_title,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addGap(16)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lbl_length)
												.addComponent(textField_length, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(16)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lbl_director).addComponent(textField_director,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lbl_studio).addComponent(textField_studio,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addGap(8)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lbl_release).addComponent(textField_release,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addGap(8)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lbl_language).addComponent(textField_language,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lbl_age).addComponent(comboBox_age,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtAreaDescription, GroupLayout.PREFERRED_SIZE, 172,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lbl_description))
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lbl_pic).addComponent(btnChoosePicture))))
						.addContainerGap(23, Short.MAX_VALUE)));

		// --------------------------------
		getContentPane().setLayout(groupLayout);

	}
}
