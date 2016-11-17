package DIT215H16_Team01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuAdm extends JMenuBar {

	//private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdm frame = new MenuAdm();
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
	public MenuAdm() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		
		//JMenuBar menuBar = new JMenuBar();
//All the icons that I sent to you! - Change the address

		ImageIcon trailerIcon = new ImageIcon("/Users/LFigueroa/Desktop/Logomak.png");
		ImageIcon contactIcon = new ImageIcon("/Users/LFigueroa/Desktop/chat.png");
		ImageIcon helpIcon = new ImageIcon("/Users/LFigueroa/Desktop/Help.png");
	 	ImageIcon icon = new ImageIcon("/Users/LFigueroa/Desktop/exit.png");
        ImageIcon redoIcon = new ImageIcon("/Users/LFigueroa/Desktop/redo.png");
        ImageIcon undoIcon = new ImageIcon("/Users/LFigueroa/Desktop/undo.png");
        ImageIcon settingsIcon = new ImageIcon("/Users/LFigueroa/Desktop/SettingsMain.png");
	        
//First icon on the menu and all its subitens
	        
        JMenu file = new JMenu();
        file.setIcon(trailerIcon);
        //file.setMnemonic(KeyEvent.VK_T);
        
        JMenuItem theMainPage = new JMenuItem("Main page");
        theMainPage.setToolTipText("Return to the opening page");
        theMainPage.setMnemonic(KeyEvent.VK_M);
        theMainPage.addActionListener((ActionEvent event) -> {
        	
// change to the main page (Project) 
        	//Project.main(null);
       
	        });
	    theMainPage.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
	    theMainPage.addActionListener(null);
	    
	    JMenuItem searchPage = new JMenuItem("Search page");
	    searchPage.setToolTipText("Return to the page where you can search for movies");
	    searchPage.setMnemonic(KeyEvent.VK_S);
	    searchPage.addActionListener((ActionEvent event) -> { 
	    	
// change to the search page (Second Page) 
        	//SecondPage.main(null);
       
	        });
	    searchPage.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
	    searchPage.addActionListener(null);
		 
		JMenuItem undo = new JMenuItem("Undo", undoIcon);
	    undo.setMnemonic(KeyEvent.VK_Z);
	    undo.addActionListener((ActionEvent event) -> { 
	    	
//return to previous state (JInternalFrame)	
	    	
	    });
	    undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.ALT_MASK));
	    undo.addActionListener(null);
	     
	     JMenuItem redo = new JMenuItem("Redo", redoIcon);
	     redo.setMnemonic(KeyEvent.VK_R);
	     redo.addActionListener((ActionEvent event) -> { 
	    	 
//return to subsequent state (JInternalFrame)	
	    	 
	     });
	     redo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
	     redo.addActionListener(null);  
	
        JMenuItem exit = new JMenuItem("Exit", icon);
        exit.setToolTipText("Exit application");
        exit.setMnemonic(KeyEvent.VK_E);
        exit.addActionListener((ActionEvent event) -> { 
        	System.exit(0);	
        });
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
        exit.addActionListener(null);
        
        
// putting the menu item in the order I want
        
        file.add(theMainPage);
        file.add(searchPage);
        file.addSeparator();
        file.add(undo);
        file.add(redo);
        file.addSeparator();
        file.add(exit);
    
//Second icon on the menu if the adm is logged

        JMenu settings = new JMenu("Settings"); 
        settings.setIcon(settingsIcon);
        
        JMenuItem addMovies = new JMenuItem("Add movies");
        addMovies.setMnemonic(KeyEvent.VK_A);
        addMovies.addActionListener((ActionEvent event) -> { 
        	
// change to the add page 
        	
        });
        addMovies.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
        addMovies.addActionListener(null);
        
        JMenuItem deleteMovies = new JMenuItem("Delete movies");
        deleteMovies.setMnemonic(KeyEvent.VK_D);
        deleteMovies.addActionListener((ActionEvent event) -> {
        	
// change to the delete page 
        	
        });
        deleteMovies.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.ALT_MASK));
        deleteMovies.addActionListener(null);
        
        
        JMenuItem changeMovieInfo = new JMenuItem("Change movie Information");
        changeMovieInfo.setMnemonic(KeyEvent.VK_C);
        changeMovieInfo.addActionListener((ActionEvent event) -> {
        	
// change to the update page
        	
        });
        changeMovieInfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
        changeMovieInfo.addActionListener(null);
        
        JMenuItem reportedComments = new JMenuItem("Reported comments");
        reportedComments.setMnemonic(KeyEvent.VK_R);
        reportedComments.addActionListener((ActionEvent event) -> {
        	
// change to the rude and spoilers page 
        	
        });
        reportedComments.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
        reportedComments.addActionListener(null);
        
        JMenuItem spoilerAlert = new JMenuItem("Spoiler alert");
        spoilerAlert.setMnemonic(KeyEvent.VK_S);
        spoilerAlert.addActionListener((ActionEvent event) -> {
        	
// change to the update page
        	
        });
        spoilerAlert.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        spoilerAlert.addActionListener(null);
        
        JMenuItem managingUser = new JMenuItem("Managing users");
        managingUser.setMnemonic(KeyEvent.VK_O);
        managingUser.addActionListener((ActionEvent event) -> {
        	
// change to the managing user page
        	
        });
        managingUser.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.ALT_MASK));
        managingUser.addActionListener(null);
        
        JMenuItem fixHelp = new JMenuItem("Update help");
        fixHelp.setMnemonic(KeyEvent.VK_U);
        fixHelp.addActionListener((ActionEvent event) -> { 
        	
// change to the page where the help can be changed  
        	
        });
        fixHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.ALT_MASK));
        fixHelp.addActionListener(null);
        
// putting the menu item in the order I want        

        settings.add(addMovies);
        settings.add(deleteMovies);
        settings.add(changeMovieInfo);
        settings.addSeparator();
        settings.add(reportedComments);
        settings.add(spoilerAlert);
        settings.addSeparator();
        settings.add(managingUser);
        settings.addSeparator();
        settings.add(fixHelp);
        
//Third icon on the menu

        JMenu contact = new JMenu("User's Feedback");
        contact.setIcon(contactIcon);
        
        JMenuItem suggestions = new JMenuItem("See suggestions");
        suggestions.addActionListener((ActionEvent event) -> { 

// change to the page where all the info is showed 
        
        });
        suggestions.setMnemonic(KeyEvent.VK_A);
        suggestions.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
        suggestions.addActionListener(null);
        
        JMenuItem problems = new JMenuItem("See problems");
        problems.setMnemonic(KeyEvent.VK_P);
        problems.addActionListener((ActionEvent event) -> { 
        	
// change to the page where all the info is showed  
        	
        });
        problems.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
        problems.addActionListener(null);
        
// putting the menu item in the order I want
        
        contact.add(suggestions);
        contact.add(problems);    
          
 // adding the menu bar itens        
        add(file);
        add(settings);
        add(contact);
        
        /*setJMenuBar(menuBar);
		       
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);*/
	}

}