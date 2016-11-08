package connection;
import java.awt.EventQueue;

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

public class Project {

	private JFrame frame;
	private JTextField txtTrailerPark;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project window = new Project();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Project() {
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
		String [] action = new String [1]; // To log in or list
		
		// Frame(main)
		frame = new JFrame();
		frame.setResizable(false);
		frame.getSize();
		frame.setBounds(0, 0, dim.width, dim.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton icon_button = new JButton("icon_button");
		icon_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		icon_button.setVerticalAlignment(SwingConstants.CENTER);
		icon_button.setBorderPainted(false);
		icon_button.setContentAreaFilled(false);
		icon_button.setFocusPainted(false);
		icon_button.setOpaque(false);		
		icon_button.setIcon(new ImageIcon("C:\\Users\\Omistaja\\Downloads\\TrailerPark\\14876016_1153238348097727_916387429_o.png"));
		icon_button.setBounds(842, 261, 311, 330);
		
		icon_button.addMouseListener(new MouseAdapter(){
		public void mouseEntered(MouseEvent evt){
			// mouse over the button
			icon_button.setIcon(new ImageIcon("C:\\Users\\Omistaja\\Downloads\\TrailerPark\\14922986_1153238351431060_1537298087_o.png"));
		}
		
		public void mouseExited(MouseEvent evt){
			// mouse not over the button
			icon_button.setIcon(new ImageIcon("C:\\Users\\Omistaja\\Downloads\\TrailerPark\\14876016_1153238348097727_916387429_o.png"));
		}
		
			// mouseClicked 
			public void mouseClicked(MouseEvent e) {
				SecondPage.main(null);
			}
		});
		
		JButton LogIn = new JButton("");
		
			
		LogIn.setBorderPainted(false);
		LogIn.setContentAreaFilled(false);
		LogIn.setFocusPainted(false);
		LogIn.setOpaque(false);	
		LogIn.setIcon(new ImageIcon("C:\\Users\\Omistaja\\Downloads\\TrailerPark\\14886335_1153238338097728_590646191_n.png"));
		LogIn.setBounds(980, 22, 72, 57);
		frame.getContentPane().add(LogIn);
		
	LogIn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			SecondPage.main(null); // change this to a logging page
		}
	});
		
		
		frame.getContentPane().add(icon_button);
		
		JLabel lblNewLabel_1 = new JLabel("Log In");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setBounds(990, 76, 72, 57);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Trailer Park");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBounds(473, 175, 384, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel inner_frame = new JLabel("inner_frame");
		inner_frame.setIcon(new ImageIcon("C:\\Users\\Omistaja\\Downloads\\TrailerPark\\14858692_1153238344764394_580171547_o.jpg"));
		inner_frame.setBounds(115, -40, 1025, 584);
		frame.getContentPane().add(inner_frame);
		
		JLabel background = new JLabel("background");
		background.setIcon(new ImageIcon("C:\\Users\\Omistaja\\Downloads\\TrailerPark\\14894596_1153238354764393_1284257927_o.jpg"));
		background.setBounds(-238, -64, 1557, 800);
		frame.getContentPane().add(background);
		
	
	}
}
