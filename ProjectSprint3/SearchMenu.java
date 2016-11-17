package DIT215H16_Team01;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Project.Table;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class SearchMenu extends JMenuBar {

	//private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeftMenu frame = new LeftMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public SearchMenu() {
		
//I will send all the icons - just change the address here!
		
		ImageIcon personIcon = new ImageIcon("/Users/LFigueroa/Desktop/person.png");
		ImageIcon bookIcon = new ImageIcon("/Users/LFigueroa/Desktop/book.png");
		ImageIcon movieIcon = new ImageIcon("/Users/LFigueroa/Desktop/tape.png");
		
		/*Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = dim.width;
		int screenHeight = dim.height;
		
		getSize();
		setBounds(0, 0, dim.width, dim.height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		*/
		//JMenuBar menuBar = new JMenuBar();
		setBackground(new Color(255, 255, 255));
		setFont(new Font("Times New Roman", Font.PLAIN, 14));
		setVisible(true);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//contentPane.add(menuBar, BorderLayout.WEST);
	
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(128, 0, 0));
		separator_1.setBackground(new Color(128, 0, 0));
		add(separator_1);
		
		JLabel lblSearch = new JLabel("       Search");
		lblSearch.setForeground(new Color(128, 0, 0));
		lblSearch.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add(lblSearch);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(128, 0, 0));
		separator.setForeground(new Color(128, 0, 0));
		add(separator);
		
// Creating the title menu item with text field
		
		JMenu mnTitle = new JMenu("Title");
		mnTitle.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnTitle.setAlignmentX(Component.LEFT_ALIGNMENT);
		add(mnTitle);
		
		textField = new JTextField();
		mnTitle.add(textField);
		textField.setColumns(10);
		
//Creating the actor menu item with text field 
		
		JMenu mnActor = new JMenu("Actor");
		mnActor.setAlignmentX(Component.LEFT_ALIGNMENT);
		mnActor.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(mnActor);
		
		JTextField actorName = new JTextField();
		actorName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		mnActor.add(actorName);
		actorName.setColumns(10);
		
//Creating the director menu item with text field 
		
		JMenu mnDirector = new JMenu("Director");
		mnDirector.setAlignmentX(Component.LEFT_ALIGNMENT);
		mnDirector.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(mnDirector);
		
		JTextField director = new JTextField();
		director.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		mnDirector.add(director);
		director.setColumns(10);
		
//Creating the studio menu item with text field 
		
		JMenu mnStudio = new JMenu("Studio");
		mnStudio.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		mnStudio.setAlignmentX(Component.LEFT_ALIGNMENT);
		mnStudio.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(mnStudio);
		
		JTextField studio = new JTextField();
		mnStudio.add(studio);
		studio.setColumns(10);
		
		
//Creating the genre menu item with all the subitems

		JMenu mnGener = new JMenu("Genre");
		mnGener.setAlignmentX(Component.LEFT_ALIGNMENT);
		mnGener.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		//mnGener.setHorizontalAlignment(NORMAL);
		add(mnGener);
		
		JCheckBoxMenuItem action = new JCheckBoxMenuItem("Action");
		action.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			
		JCheckBoxMenuItem adventure = new JCheckBoxMenuItem("Adventure");
		adventure.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem animation = new JCheckBoxMenuItem("Animation");
		animation.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem biography = new JCheckBoxMenuItem("Biography");
		biography.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem comedy = new JCheckBoxMenuItem("Comedy");
		comedy.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem crime = new JCheckBoxMenuItem("Crime");
		crime.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem drama = new JCheckBoxMenuItem("Drama");
		drama.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem fantasy = new JCheckBoxMenuItem("Fantasy");
		fantasy.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem family = new JCheckBoxMenuItem("Family");
		family.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem history = new JCheckBoxMenuItem("History");
		history.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem horror = new JCheckBoxMenuItem("Horror");
		horror.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem musical = new JCheckBoxMenuItem("Musical");
		musical.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem mystery = new JCheckBoxMenuItem("Mystery");
		mystery.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem romance = new JCheckBoxMenuItem("Romance");
		romance.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem scifi = new JCheckBoxMenuItem("Sci-Fi");
		scifi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem sport = new JCheckBoxMenuItem("Sport");
		sport.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem thriller = new JCheckBoxMenuItem("Thriller");
		thriller.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem war = new JCheckBoxMenuItem("War");
		war.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
// Creating a group to only one be selected at time
		
		ButtonGroup genreGroup = new ButtonGroup();
		genreGroup.add(action);
		genreGroup.add(adventure);
		genreGroup.add(animation);
		genreGroup.add(biography);
		genreGroup.add(comedy);
		genreGroup.add(crime);
		genreGroup.add(drama);
		genreGroup.add(fantasy);
		genreGroup.add(family);
		genreGroup.add(history);
		genreGroup.add(horror);
		genreGroup.add(musical);
		genreGroup.add(mystery);
		genreGroup.add(romance);
		genreGroup.add(scifi);
		genreGroup.add(sport);
		genreGroup.add(thriller);
		genreGroup.add(war);
		
// Putting then in the order I want
		
		mnGener.add(action);
		mnGener.add(adventure);
		mnGener.add(animation);
		mnGener.add(biography);
		mnGener.add(comedy);
		mnGener.add(crime);
		mnGener.add(drama);
		mnGener.add(fantasy);
		mnGener.add(family);
		mnGener.add(history);
		mnGener.add(horror);
		mnGener.add(musical);
		mnGener.add(mystery);
		mnGener.add(romance);
		mnGener.add(scifi);
		mnGener.add(sport);
		mnGener.add(thriller);
		mnGener.add(war);
		
//Creating the year menu item with all the subitems
		
		JMenu mnYear = new JMenu("Year");
		mnYear.setAlignmentX(Component.LEFT_ALIGNMENT);
		mnYear.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(mnYear);
		
		JCheckBoxMenuItem oldest = new JCheckBoxMenuItem("20's to 70's");
		oldest.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JMenu eighties = new JMenu("80's");
		eighties.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem eighty = new JCheckBoxMenuItem("1980");
		eighty.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem eightyOne = new JCheckBoxMenuItem("1981");
		eightyOne.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem eightyTwo = new JCheckBoxMenuItem("1982");
		eightyTwo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem eightyThree = new JCheckBoxMenuItem("1983");
		eightyThree.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem eightyFour = new JCheckBoxMenuItem("1984");
		eightyFour.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem eightyFive = new JCheckBoxMenuItem("1985");
		eightyFive.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem eightieSix = new JCheckBoxMenuItem("1986");
		eightieSix.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem eightieSeven = new JCheckBoxMenuItem("1987");
		eightieSeven.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem eightyEight = new JCheckBoxMenuItem("1988");
		eightyEight.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem eightyNine = new JCheckBoxMenuItem("1989");
		eightyNine.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JMenu nineties = new JMenu("90's");
		nineties.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem ninety = new JCheckBoxMenuItem("1991");
		ninety.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem ninetyOne = new JCheckBoxMenuItem("1991");
		ninetyOne.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem ninetyTwo = new JCheckBoxMenuItem("1992");
		ninetyTwo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem ninetyThree = new JCheckBoxMenuItem("1993");
		ninetyThree.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem ninetyFour = new JCheckBoxMenuItem("1994");
		ninetyFour.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem ninetyFive = new JCheckBoxMenuItem("1995");
		ninetyFive.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem ninetySix = new JCheckBoxMenuItem("1996");
		ninetySix.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem ninetySeven = new JCheckBoxMenuItem("1997");
		ninetySeven.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem ninetyEight = new JCheckBoxMenuItem("1998");
		ninetyEight.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem ninetyNine = new JCheckBoxMenuItem("1999");
		ninetyNine.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JMenu mns = new JMenu("00's");
		mns.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousand = new JCheckBoxMenuItem("2000");
		twoThousand.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandOne = new JCheckBoxMenuItem("2001");
		twoThousandOne.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandTwo = new JCheckBoxMenuItem("2002");
		twoThousandTwo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandThree = new JCheckBoxMenuItem("2003");
		twoThousandThree.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandFour = new JCheckBoxMenuItem("2004");
		twoThousandFour.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandFive = new JCheckBoxMenuItem("2005");
		twoThousandFive.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandSix = new JCheckBoxMenuItem("2006");
		twoThousandSix.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandSeven = new JCheckBoxMenuItem("2007");
		twoThousandSeven.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandEight = new JCheckBoxMenuItem("2008");
		twoThousandEight.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandNine = new JCheckBoxMenuItem("2009");
		twoThousandNine.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandTen = new JCheckBoxMenuItem("2010");
		twoThousandTen.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandEleven = new JCheckBoxMenuItem("2011");
		twoThousandEleven.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandTwelve = new JCheckBoxMenuItem("2012");
		twoThousandTwelve.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandThirteen = new JCheckBoxMenuItem("2013");
		twoThousandThirteen.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandFourteen = new JCheckBoxMenuItem("2014");
		twoThousandFourteen.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandFifteen = new JCheckBoxMenuItem("2015");
		twoThousandFifteen.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandSixteen = new JCheckBoxMenuItem("2016");
		twoThousandSixteen.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem twoThousandSeventeen = new JCheckBoxMenuItem("2017");
		twoThousandSeventeen.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
// Creating a group to only one be selected at time

		ButtonGroup yearGroup = new ButtonGroup();
		yearGroup.add(oldest);
		yearGroup.add(eighty);
		yearGroup.add(eightyOne);
		yearGroup.add(eightyTwo);
		yearGroup.add(eightyThree);
		yearGroup.add(eightyFour);
		yearGroup.add(eightyFive);
		yearGroup.add(eightieSix);
		yearGroup.add(eightieSeven);
		yearGroup.add(eightyEight);
		yearGroup.add(eightyNine);
		yearGroup.add(ninety);
		yearGroup.add(ninetyOne);
		yearGroup.add(ninetyTwo);
		yearGroup.add(ninetyThree);
		yearGroup.add(ninetyFour);
		yearGroup.add(eightyFive);
		yearGroup.add(ninetySix);
		yearGroup.add(ninetySeven);
		yearGroup.add(ninetyEight);
		yearGroup.add(ninetyNine);
		yearGroup.add(twoThousand);
		yearGroup.add(twoThousandOne);
		yearGroup.add(twoThousandTwo);
		yearGroup.add(twoThousandThree);
		yearGroup.add(twoThousandFour);
		yearGroup.add(twoThousandFive);
		yearGroup.add(twoThousandSix);
		yearGroup.add(twoThousandSeven);
		yearGroup.add(twoThousandEight);
		yearGroup.add(twoThousandNine);
		yearGroup.add(twoThousandTen);
		yearGroup.add(twoThousandEleven);
		yearGroup.add(twoThousandTwelve);
		yearGroup.add(twoThousandThirteen);
		yearGroup.add(twoThousandFourteen);
		yearGroup.add(twoThousandFifteen);
		yearGroup.add(twoThousandSixteen);
		yearGroup.add(twoThousandSeventeen);
	
// Putting then in the order I want
		
		mnYear.add(oldest);
		mnYear.add(eighties);
		eighties.add(eighty);
		eighties.add(eightyOne);
		eighties.add(eightyTwo);
		eighties.add(eightyThree);
		eighties.add(eightyFour);
		eighties.add(eightyFive);
		eighties.add(eightieSix);
		eighties.add(eightieSeven);
		eighties.add(eightyEight);
		eighties.add(eightyNine);
		mnYear.add(nineties);
		nineties.add(ninety);
		nineties.add(ninetyOne);
		nineties.add(ninetyTwo);
		nineties.add(ninetyThree);
		nineties.add(ninetyFour);
		nineties.add(ninetyFive);
		nineties.add(ninetySix);
		nineties.add(ninetySeven);
		nineties.add(ninetyEight);
		nineties.add(ninetyNine);
		mnYear.add(mns);
		mns.add(twoThousand);
		mns.add(twoThousandOne);
		mns.add(twoThousandTwo);
		mns.add(twoThousandThree);
		mns.add(twoThousandFour);
		mns.add(twoThousandFive);
		mns.add(twoThousandSix);
		mns.add(twoThousandSeven);
		mns.add(twoThousandEight);
		mns.add(twoThousandNine);
		mnYear.add(twoThousandTen);
		mnYear.add(twoThousandEleven);
		mnYear.add(twoThousandTwelve);
		mnYear.add(twoThousandThirteen);
		mnYear.add(twoThousandFourteen);
		mnYear.add(twoThousandFifteen);
		mnYear.add(twoThousandSixteen);
		mnYear.add(twoThousandSeventeen);
		
//Creating the age restriction menu item with all the subitems
		
		JMenu age = new JMenu("Age Restriction");
		age.setAlignmentX(Component.LEFT_ALIGNMENT);
		age.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(age);
		
		JCheckBoxMenuItem generalAudiences = new JCheckBoxMenuItem("G  General Audiences");
		generalAudiences.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem parentalGuidance = new JCheckBoxMenuItem("PG  Parental Guidance Suggested");
		parentalGuidance.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem parentsStrongly = new JCheckBoxMenuItem("PG-13  Parents Strongly Cautioned");
		parentsStrongly.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem restricted = new JCheckBoxMenuItem("R  Restricted");
		restricted.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem prohibitedFor = new JCheckBoxMenuItem("NC-17  Prohibited for under 17");
		prohibitedFor.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
// Creating a group to only one be selected at time
		
		ButtonGroup ageGroup = new ButtonGroup();
		ageGroup.add(generalAudiences);
		ageGroup.add(parentalGuidance);
		ageGroup.add(parentsStrongly);
		ageGroup.add(restricted);
		ageGroup.add(prohibitedFor);
		
// Putting then in the order I want
		
		age.add(generalAudiences);
		age.add(parentalGuidance);
		age.add(parentsStrongly);
		age.add(restricted);
		age.add(prohibitedFor);
		
//Creating the language menu item with all the subitems
		
		JMenu mnLanguage = new JMenu("Language");
		mnLanguage.setAlignmentX(Component.LEFT_ALIGNMENT);
		mnLanguage.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(mnLanguage);
		
		JCheckBoxMenuItem arabic = new JCheckBoxMenuItem("Arabic");
		arabic.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem english = new JCheckBoxMenuItem("English");
		english.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem finish = new JCheckBoxMenuItem("Finish");
		finish.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem french = new JCheckBoxMenuItem("French");
		french.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem german = new JCheckBoxMenuItem("German");
		german.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem indi = new JCheckBoxMenuItem("Indi");
		indi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem italian = new JCheckBoxMenuItem("Italian");
		italian.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem portuguese = new JCheckBoxMenuItem("Portuguese");
		portuguese.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem spanish = new JCheckBoxMenuItem("Spanish");
		spanish.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem swedish = new JCheckBoxMenuItem("Swedish");
		swedish.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem others = new JCheckBoxMenuItem("Other");
		others.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
// Creating a group to only one be selected at time

		ButtonGroup languageGroup = new ButtonGroup();
		languageGroup.add(arabic);
		languageGroup.add(english);
		languageGroup.add(finish);
		languageGroup.add(french);
		languageGroup.add(german);
		languageGroup.add(indi);
		languageGroup.add(italian);
		languageGroup.add(portuguese);
		languageGroup.add(spanish);
		languageGroup.add(swedish);
		languageGroup.add(others);
		
// Putting then in the order I want
		
		mnLanguage.add(arabic);
		mnLanguage.add(english);
		mnLanguage.add(finish);
		mnLanguage.add(french);
		mnLanguage.add(german);
		mnLanguage.add(indi);
		mnLanguage.add(italian);
		mnLanguage.add(portuguese);
		mnLanguage.add(spanish);
		mnLanguage.add(swedish);
		mnLanguage.add(others);
		
//Creating the rating menu item with a slider
		
		JMenu rating = new JMenu("Rating");
		rating.setAlignmentX(Component.LEFT_ALIGNMENT);
		rating.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(rating);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 5, 5);
		slider.setMajorTickSpacing(5);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		rating.add(slider);
		
//Creating the length menu item with all the subitems		
		
		JMenu length = new JMenu("Length");
		length.setAlignmentX(Component.LEFT_ALIGNMENT);
		length.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(length);
		
		JSlider slider_Length = new JSlider();
		slider_Length.setMinorTickSpacing(1);
		slider_Length.setPaintTicks(true);
		slider_Length.setPaintLabels(true);
		slider_Length.setMaximum(4);
		slider_Length.setMajorTickSpacing(4);
		length.add(slider_Length);
		
//Creating the Based on menu item with all the subitems		
		
		JMenu basedOn = new JMenu("Based on");
		basedOn.setAlignmentX(Component.LEFT_ALIGNMENT);
		basedOn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(basedOn);
		
		JCheckBoxMenuItem books = new JCheckBoxMenuItem("Book", bookIcon);
		books.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem person = new JCheckBoxMenuItem("Person", personIcon);
		person.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JCheckBoxMenuItem movies = new JCheckBoxMenuItem("Movie", movieIcon);
		movies.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
// Creating a group to only one be selected at time

		ButtonGroup basedOnGroup = new ButtonGroup();
		basedOnGroup.add(books);
		basedOnGroup.add(person);
		basedOnGroup.add(movies);
		
// Putting then in the order I want
		
		basedOn.add(books);
		basedOn.add(person);
		basedOn.add(movies);
		
// Creating the search button
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(128, 0, 0));
		separator_2.setBackground(new Color(128, 0, 0));
		add(separator_2);
		
		JButton btnApplySelection = new JButton("Apply Selection");
		btnApplySelection.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnApplySelection.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
// Apply all itens selected before on the query				
			}
		});
		
		btnApplySelection.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Getting the User input from Text Fields
				String inputTitle = textField.getText(); 
				String inputActor = actorName.getText();; //there is "0 +" because cannot change nothing to integer
				String inputDirector = director.getText();
				String inputStudio = studio.getText();
				String inputGenre = "";
				String inputYear = "";
				String inputAgerestriction = "";
				String inputLanguage = "";
				String inputRating = "";
				String inputRuntime = "";
				
				//Using the array for sending to information to SearchQuery where the query will be completed
				String [] input = new String [10];
				input[0] = inputTitle;
				input[1] = inputActor;
				input[2] = inputDirector;
				input[3] = inputStudio;
				input[4] = inputGenre;
				input[5] = inputYear;
				input[6] = inputAgerestriction;
				input[7] = inputLanguage;
				input[8] = inputRating;
				input[9] = inputRuntime;
				
				//connecting to SearchQuery and gettinr the query with users input
				SearchQuery query = new SearchQuery(input);
				System.out.println(query.getQuery());
				//String query = searchQuery.getQuery();
				
				//connecting to DBConnection
				//DBConnection dBConnection = new DBConnection(query, "Movie"); 
				//ArrayList<Movie> movies = dBConnection.getMovie();				
				// connecting the list of movies and creating a new interface with searched movies
				
				FirstPage.workPage.getInternalFrame().setContentPane(new TestTable(query));
				FirstPage.workPage.setVisible(true);
			}
		});
		add(btnApplySelection);
		
	}

}
