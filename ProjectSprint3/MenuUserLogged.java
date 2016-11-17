package DIT215H16_Team01;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MenuUserLogged extends JMenuBar {

	//private JPanel contentPane;
	
	 public MenuUserLogged() {
		 createMenuBar();
	    }

	/** Create the frame. */
	
	/*private void initUI() {
        
        createMenuBar();

        setTitle("Main menu");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }*/
	
	
	private void createMenuBar() {
		
		//JMenuBar menuBar = new JMenuBar();
		
//All the icons that I sent to you! - Change the address
		
		ImageIcon trailerIcon = new ImageIcon("/Users/LFigueroa/Desktop/Logomak.png");
		ImageIcon contactIcon = new ImageIcon("/Users/LFigueroa/Desktop/chat.png");
		ImageIcon helpIcon = new ImageIcon("/Users/LFigueroa/Desktop/Help.png");
	 	ImageIcon icon = new ImageIcon("/Users/LFigueroa/Desktop/exit.png");
        ImageIcon redoIcon = new ImageIcon("/Users/LFigueroa/Desktop/redo.png");
        ImageIcon undoIcon = new ImageIcon("/Users/LFigueroa/Desktop/undo.png");
        ImageIcon user = new ImageIcon("/Users/LFigueroa/Desktop/User1.png");
        ImageIcon favourite = new ImageIcon("/Users/LFigueroa/Desktop/favourite.png");
        ImageIcon historicIcon = new ImageIcon("/Users/LFigueroa/Desktop/history.png");
        ImageIcon settingsIcon = new ImageIcon("/Users/LFigueroa/Desktop/settings.png");
	        
//First icon on the menu and all its subitens
	        
        JMenu file = new JMenu();
        file.setIcon(trailerIcon);
        file.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        file.setForeground(new Color(128, 0, 0));
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
    
//Second icon on the menu if the user is logged

        JMenu userName = new JMenu("Username"); //here it should print the specific username
        //userName.setMnemonic(KeyEvent.VK_U);
        userName.setIcon(user);
        
        JMenuItem favourites = new JMenuItem("Favourites", favourite);
        favourites.setToolTipText("Shows the list of movies that you chose as favourite");
        favourites.setMnemonic(KeyEvent.VK_F);
        favourites.addActionListener((ActionEvent event) -> { 
        	
// change to the list of favourites movies from this specific user 
        	
        });
        favourites.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.ALT_MASK));
        favourites.addActionListener(null);
        
        JMenuItem historic = new JMenuItem("Historic", historicIcon);
        historic.setMnemonic(KeyEvent.VK_L);
        historic.addActionListener((ActionEvent event) -> {
        	
// change to the list of movies viewed by this specific user 
        	
        });
        historic.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK));
        historic.addActionListener(null);
        
        JMenuItem settings = new JMenuItem("Settings", settingsIcon);
        settings.setMnemonic(KeyEvent.VK_C);
        settings.addActionListener((ActionEvent event) -> { 
        	
// change to the settings page of this specific user 
        	
        });
        settings.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
        settings.addActionListener(null);
        
        userName.add(favourites);
        userName.add(historic);
        userName.addSeparator();
        userName.add(settings);
        
//Third icon on the menu

        JMenu contact = new JMenu("Contact");
        contact.setIcon(contactIcon);
        //file.setMnemonic(KeyEvent.VK_C);
        
        JMenuItem suggestions = new JMenuItem("Suggestions");
        suggestions.setToolTipText("Give your idea to make this application better");
        suggestions.addActionListener((ActionEvent event) -> { 

// change to the suggestions page 
        	//SuggestionForm.main(null);
        
        });
        suggestions.setMnemonic(KeyEvent.VK_A);
        suggestions.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
        suggestions.addActionListener(null);
        
        JMenuItem problems = new JMenuItem("Problems");
        problems.setToolTipText("Inform us about anything wrong in the system");
        problems.setMnemonic(KeyEvent.VK_P);
        problems.addActionListener((ActionEvent event) -> { 
        	
// change to the problem page       
        	//ProblemsForm.main(null);
        	
        });
        problems.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
        problems.addActionListener(null);
        
// putting the menu item in the order I want
        
        contact.add(suggestions);
        contact.add(problems);
        
//Fourth icon on the menu      
 
        JMenu help = new JMenu("Help");
        help.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		
//Go to a tutorial how to navegate the webpage
        		
        	}
        });
        help.setIcon(helpIcon);
        help.setMnemonic(KeyEvent.VK_H);
        
        
 // adding the menu bar itens        
        add(file);
        add(userName);
        add(contact);
        add(help);
        
        //setJMenuBar(menuBar);
        
    }
	
	/** Launch the application. */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUserLogged frame = new MenuUserLogged();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
}