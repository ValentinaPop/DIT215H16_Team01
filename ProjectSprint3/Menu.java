package DIT215H16_Team01;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Menu extends JFrame {

	private JPanel contentPane;
	
	 public Menu() {

	        initUI();
	    }

	/** Create the frame. */
	
	private void initUI() {
        
        createMenuBar();

        setTitle("Main menu");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	
	
	private void createMenuBar() {
		
		JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon("/Users/LFigueroa/Desktop/exit.png");
        ImageIcon redoIcon = new ImageIcon("/Users/LFigueroa/Desktop/redo.png");
        ImageIcon undoIcon = new ImageIcon("/Users/LFigueroa/Desktop/undo.png");
        ImageIcon user = new ImageIcon("/Users/LFigueroa/Desktop/user.png");
        ImageIcon favourite = new ImageIcon("/Users/LFigueroa/Desktop/favourite.png");
        ImageIcon historicIcon = new ImageIcon("/Users/LFigueroa/Desktop/history.png");
        ImageIcon settingsIcon = new ImageIcon("/Users/LFigueroa/Desktop/settings.png");
        
//First icon on the menu
        
        JMenu file = new JMenu("Trailer Park");
        file.setMnemonic(KeyEvent.VK_T);
        
        JMenuItem theMainPage = new JMenuItem("Main page");
        theMainPage.setToolTipText("Return to the first page");
        theMainPage.setMnemonic(KeyEvent.VK_M);
        theMainPage.addActionListener((ActionEvent event) -> { 
        	//Project.main(null);
// change to the main page        
        });
        theMainPage.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
//theMainPage.addActionListener(this);
        
        JMenuItem eMenuItem = new JMenuItem("Exit", icon);
        eMenuItem.setToolTipText("Exit application");
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.addActionListener((ActionEvent event) -> { 
        	System.exit(0);	
        });
        eMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
//eMenuItem.addActionListener(this);
        
        JMenuItem undo = new JMenuItem("Undo", undoIcon);
        undo.setMnemonic(KeyEvent.VK_Z);
        undo.addActionListener((ActionEvent event) -> { 
// return to previous state (JInternalFrame)	
        });
        undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.ALT_MASK));
//undo.addActionListener(this);
        
        JMenuItem redo = new JMenuItem("Redo", redoIcon);
        redo.setMnemonic(KeyEvent.VK_R);
        redo.addActionListener((ActionEvent event) -> { 
// return to subsequent state (JInternalFrame)	
        });
        redo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
//redo.addActionListener(this);
        
// putting the menu item in the order I want
        
        file.add(theMainPage);
        file.addSeparator();
        file.add(undo);
        file.add(redo);
        file.addSeparator();
        file.add(eMenuItem);
    
//Second icon on the menu

// If it has done the login process
        JMenu userName = new JMenu("User"); 
        userName.setMnemonic(KeyEvent.VK_U);
        userName.setIcon(user);
        
        JMenuItem favourites = new JMenuItem("Favourites", favourite);
        favourites.setToolTipText("Shows the list of movies that you chose as favourite");
        favourites.setMnemonic(KeyEvent.VK_F);
        favourites.addActionListener((ActionEvent event) -> { 
// change to the list of favourites movies from this specific user     
        });
        favourites.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.ALT_MASK));
//favourites.addActionListener(this);
        
        JMenuItem historic = new JMenuItem("Historic", historicIcon);
        historic.setMnemonic(KeyEvent.VK_L);
        historic.addActionListener((ActionEvent event) -> { 
// change to the list of movies viewed by this specific user     
        });
        historic.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK));
//historic.addActionListener(this);
        
        JMenuItem settings = new JMenuItem("Settings", settingsIcon);
        settings.setMnemonic(KeyEvent.VK_COMMA);
        settings.addActionListener((ActionEvent event) -> { 
// change to the list of movies viewed by this specific user     
        });
        settings.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_COMMA, ActionEvent.ALT_MASK));
//settings.addActionListener(this);
        
        userName.add(favourites);
        userName.add(historic);
        userName.addSeparator();
        userName.add(settings);
        
//Third icon on the menu

        JMenu contact = new JMenu("Contact");
        file.setMnemonic(KeyEvent.VK_C);
        
        JMenuItem suggestions = new JMenuItem("Suggestions");
        suggestions.setToolTipText("Give your idea to make this application better");
        suggestions.setMnemonic(KeyEvent.VK_I);
        suggestions.addActionListener((ActionEvent event) -> { 
        //	SuggestionForm.main(null);
// change to the suggestions page      
        });
        suggestions.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.ALT_MASK));
//suggestions.addActionListener(this);
        
        JMenuItem problems = new JMenuItem("Problems");
        problems.setToolTipText("Inform us about anything wrong in the system");
        problems.setMnemonic(KeyEvent.VK_P);
        problems.addActionListener((ActionEvent event) -> { 
// change to the problem page       
        //	ProblemsForm.main(null);
        });
        problems.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
//problems.addActionListener(this);
        
// putting the menu item in the order I want
        contact.add(suggestions);
        contact.add(problems);
        
//Fourth icon on the menu      
 
        JMenu help = new JMenu("Help");
        help.setMnemonic(KeyEvent.VK_H);
        
        
 // adding the menu bar itens        
        menubar.add(file);
        menubar.add(userName);
        menubar.add(contact);
        menubar.add(help);
        
        setJMenuBar(menubar);
        
    }
	
	
	/** Launch the application. */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
