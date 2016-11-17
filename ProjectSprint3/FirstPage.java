package DIT215H16_Team01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

import Project.Table;

public class FirstPage extends JFrame{
	public static WorkPage workPage;
	MenuSearch menu = new MenuSearch();
    JLabel pick;
    Timer timer;
    int x = 0;
    
//Array to store all photos 
    
    String[] photos = {
                      "/Users/LFigueroa/Desktop/7.jpg",
                      "/Users/LFigueroa/Desktop/6.jpg",
                      "/Users/LFigueroa/Desktop/5.jpg",
                      "/Users/LFigueroa/Desktop/4.jpg",
                      "/Users/LFigueroa/Desktop/3.jpg",
                      "/Users/LFigueroa/Desktop/2.jpg",
                      "/Users/LFigueroa/Desktop/1.jpg"
                    };
    
    public FirstPage(){
        super("Trailer Park");
        SetButton();
        setJMenuBar(menu);
        pick = new JLabel();
        pick.setBounds(40, 40, 920, 600);
//Call the method SetImage
        SetImage(6);
//Set a timer in milliseconds
        timer = new Timer(3000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetImage(x);
                x++;
                if(x >= photos.length)
                    x = 0; 
            }
        });
        add(pick);
        timer.start();
        setLayout(null);
        setSize(1000, 830);
     	setBackground(new Color(128, 0, 0));
        getContentPane().setBackground(new Color(128, 0, 0));
       
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        
    }
    
//create a method to pick the photos 
    public void SetImage(int i){
        ImageIcon icon = new ImageIcon(photos[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pick.getWidth(), pick.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pick.setIcon(newImc);
    }
    
// Create a method to do the button (as a label)
    public void SetButton(){
    	ImageIcon trailerPark = new ImageIcon("/Users/LFigueroa/Desktop/trailer.png");
    	ImageIcon open = new ImageIcon("/Users/LFigueroa/Desktop/openTrailer.png");
    	
    	JLabel trailer = new JLabel(trailerPark);
        trailer.setBounds(770 , 400 , trailerPark.getIconWidth(), trailerPark.getIconHeight());
        getContentPane().add(trailer);
    	trailer.setVisible(true);
    	trailer.addMouseListener(new MouseAdapter(){
    		public void mouseEntered(MouseEvent evt){
    			// mouse over the button
    			trailer.setIcon(open);
    		}
    		public void mouseExited(MouseEvent evt){
    			// mouse not over the button
    			trailer.setIcon(trailerPark);
    		}
    			// mouseClicked 
    			public void mouseClicked(MouseEvent e) {
    				workPage = new WorkPage(new InternalWorkPage(new MenuNoUser(), new LatestMovies())); //Initialize the WorkPage when clicked
					workPage.setVisible(true);
					dispose();
    			}
    		});
    	
    }
    
// Create a method to do the menu 
 /*   public void SetMenu(){
    	  
    	       setJMenuBar(new MenuSearch().menuBar);
    }

public static void main(String[] args){ 
      
    new FirstPage();
}*/
}



/*import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Label;
import java.awt.Rectangle;
import javax.swing.JMenuBar;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Component;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuItem;

public class FirstPage {

	public JFrame frame;
	private JTextField txtTrailerPark;

	*//**
	 * Create the application.
	 *//*
	public FirstPage() {
		initialize();
	}
	
	*//**
	 * Initialize the contents of the frame.
	 *//*
	private void initialize() {
		// Get the screen dimension
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();  
		//int screenWidth = dim.width;
		//int screenHeight = dim.height;
		
		// Frame( main)
		frame = new JFrame();
		frame.getSize();
		frame.setBounds(0, 0, dim.width, dim.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton icon_button = new JButton("icon_button");
		icon_button.setVerticalAlignment(SwingConstants.CENTER);
		icon_button.setBorderPainted(false);
		icon_button.setContentAreaFilled(false);
		icon_button.setFocusPainted(false);
		icon_button.setOpaque(false);		
		icon_button.setIcon(new ImageIcon("/Users/Elaine/Desktop/TrailerParkImage/Play.png"));
		icon_button.setBounds(833, 306, 311, 330);
		
		icon_button.addMouseListener(new MouseAdapter(){
		public void mouseEntered(MouseEvent evt){
			// mouse over the button
			icon_button.setIcon(new ImageIcon("/Users/Elaine/Desktop/TrailerParkImage/Hoover.png"));
		}
		
		public void mouseExited(MouseEvent evt){
			// mouse not over the button
			icon_button.setIcon(new ImageIcon("/Users/Elaine/Desktop/TrailerParkImage/Play.png"));
		}
			
			
			// mouseClicked 
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							WorkPage frame1 = new WorkPage(new InternalWorkPage(new MenuNoUser())); //Initialize the WorkPage when clicked
							frame1.setVisible(true);
							frame.dispose();
						
			}
		});
		
		JButton LogIn = new JButton("");
		LogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
							Login frame = new Login(); //Initialize the Login when clicked
							frame.setVisible(true);		
			}
		});
		LogIn.setBorderPainted(false);
		LogIn.setContentAreaFilled(false);
		LogIn.setFocusPainted(false);
		LogIn.setOpaque(false);	
		LogIn.setIcon(new ImageIcon("/Users/Elaine/Desktop/TrailerParkImage/Login.png"));
		LogIn.setBounds(980, 22, 72, 57);
		frame.getContentPane().add(LogIn);
		
		
		
		frame.getContentPane().add(icon_button);
		
		JLabel lblNewLabel_1 = new JLabel("Log In");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setBounds(989, 79, 72, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Trailer Park");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBounds(473, 175, 384, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel inner_frame = new JLabel("inner_frame");
		inner_frame.setIcon(new ImageIcon("/Users/Elaine/Desktop/TrailerParkImage/Background.jpg"));
		inner_frame.setBounds(115, -40, 1025, 584);
		frame.getContentPane().add(inner_frame);
		
		JLabel background = new JLabel("background");
		background.setIcon(new ImageIcon("/Users/Elaine/Desktop/TrailerParkImage/Frame.jpg"));
		background.setBounds(-238, -64, 1557, 800);
		frame.getContentPane().add(background);
		
	}

}*/
