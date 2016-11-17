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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

import Project.ProblemsForm;
import Project.SuggestionForm;

public class MenuSearch extends JMenuBar {

	//private JPanel contentPane;
	//static JMenuBar menuBar;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuSearch frame = new MenuSearch();
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
	public MenuSearch() {
		//AbstractUndoableEdit UndoRedo = new AbstractUndoableEdit();
		
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//setBounds(100, 100, 612, 300);
				
				//menuBar = new JMenuBar();
				
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
		        
			    
			    JMenuItem searchPage = new JMenuItem("Search page");
			    searchPage.setToolTipText("Return to the page where you can search for movies");
			    searchPage.setMnemonic(KeyEvent.VK_S);
			    searchPage.addActionListener((ActionEvent event) -> { 
			    	
		// change to the search page (Second Page) 
		        	//SecondPage.main(null);
		       
			        });
			    searchPage.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
			    searchPage.addActionListener(null);
				 
			
		        JMenuItem exit = new JMenuItem("Exit", icon);
		        exit.setToolTipText("Exit application");
		        exit.setMnemonic(KeyEvent.VK_E);
		        exit.addActionListener((ActionEvent event) -> { 
		        	System.exit(0);	
		        });
		        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
		        exit.addActionListener(null);
		        
		        
		// putting the menu item in the order I want
		        
		        file.add(searchPage);
		        file.add(exit);
		    
		//Second icon on the menu if the user is logged

		        JMenuItem userName = new JMenuItem("Log in", user);
		        userName.addActionListener((ActionEvent event) -> { 
		        	
		// change to the login page 
		        	Login frame = new Login();
					frame.setVisible(true); 
		        });
		        userName.addActionListener(null);
		       
		//Third icon on the menu if the user is logged
    	        JTextField textField = new JTextField();
     	        textField.setColumns(10);
     	        textField.setText("Title");
     	        textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
     	        textField.addFocusListener(new FocusAdapter() {
     	        	@Override
   					public void focusGained(FocusEvent e) {
     	        		if(textField.getText().equals("Title"))
     	        			
//I want to leave the text there until the user starts to type in - ????
     	        			
     	        			textField.setText("");
     	        	}
     	        	@Override
     	        	public void focusLost(FocusEvent e) {
     	        		if(textField.getText().equals(""))
     	        			textField.setText("Title");
   				}
   			});
     	       textField.setForeground(new Color(128, 128, 128));
     	       
     	        JButton searchB = new JButton("Search");
     	       
    	        
    	//5 icon on the menu

    	        JMenu contact = new JMenu("Contact");
    	        contact.setAlignmentX(LEFT_ALIGNMENT);
    	        contact.setIcon(contactIcon);
    	        //file.setMnemonic(KeyEvent.VK_C);
    	        
    	        JMenuItem suggestions = new JMenuItem("Suggestions");
    	        suggestions.setToolTipText("Give your idea to make this application better");
    	        suggestions.addActionListener((ActionEvent event) -> { 

    	// change to the suggestions page 
    	        	SuggestionForm.main(null);
    	        
    	        });
    	        suggestions.setMnemonic(KeyEvent.VK_A);
    	        suggestions.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
    	        suggestions.addActionListener(null);
    	        
    	        JMenuItem problems = new JMenuItem("Problems");
    	        problems.setToolTipText("Inform us about anything wrong in the system");
    	        problems.setMnemonic(KeyEvent.VK_P);
    	        problems.addActionListener((ActionEvent event) -> { 
    	        	
    	// change to the problem page       
    	        	ProblemsForm.main(null);
    	        	
    	        });
    	        problems.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
    	        problems.addActionListener(null);
    	        
    	// putting the menu item in the order I want
    	        
    	        contact.add(suggestions);
    	        contact.add(problems);
    	        
    	//6 icon on the menu      
    	 
    	        JMenu help = new JMenu("Help");
    	        help.setAlignmentX(LEFT_ALIGNMENT);
    	        help.addFocusListener(new FocusAdapter() {
    	        	@Override
    	        	public void focusGained(FocusEvent e) {
    	        		
    	//Go to a tutorial how to navegate the webpage
    	        		
    	        	}
    	        });
    	        help.setIcon(helpIcon);
    	        //help.setMnemonic(KeyEvent.VK_H);
    	        
    	        
    	 // adding the menu bar itens    
    	       
    	        add(file);
    	        add(userName);
    	        add(textField);
    	        add(searchB);
    	        add(contact);
    	        add(help);
    	  
  
		        
		        //setJMenuBar(menuBar);
		        
		    
				//contentPane = new JPanel();
				//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				//contentPane.setLayout(new BorderLayout(0, 0));
				//setContentPane(contentPane);
			}

		}
