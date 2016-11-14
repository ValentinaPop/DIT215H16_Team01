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
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Component;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

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

		// Frame( main)
		frame = new JFrame();
		frame.setResizable(false);
		frame.getSize();
		frame.setBounds(0, 0, dim.width, dim.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		JButton play_button = new JButton("play_button");
		play_button.setVerticalAlignment(SwingConstants.CENTER);
		play_button.setBorderPainted(false);
		play_button.setContentAreaFilled(false);
		play_button.setFocusPainted(false);
		play_button.setOpaque(false);
		ImageIcon img = new ImageIcon(getClass().getResource("/resources/mouseOut.png"));
		play_button.setIcon(img);
		play_button.setBounds(859, 301, 261, 287);

		// mouse over the play button
		play_button.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				ImageIcon img = new ImageIcon(getClass().getResource("/resources/mouseOn.png"));
				play_button.setIcon(img);
				
			}

			// mouse not over the play button
			public void mouseExited(MouseEvent evt) {
				ImageIcon img = new ImageIcon(getClass().getResource("/resources/mouseOut.png"));
				play_button.setIcon(img);
				
			}

			// Play_button mouseClicked ==> opens the 2nd Page
			public void mouseClicked(MouseEvent e) {
				SecondPage.main(null);
			}
		});

		// -------------- Log In Button--------------------------------
		JButton LogIn = new JButton("");
		LogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecondPage.main(null); // change this to a loggin page
			}
		});
		LogIn.setBorderPainted(false);
		LogIn.setContentAreaFilled(false);
		LogIn.setFocusPainted(false);
		LogIn.setOpaque(false);
		ImageIcon user = new ImageIcon(getClass().getResource("/resources/User.png"));
		LogIn.setIcon(user);
		LogIn.setBounds(980, 22, 72, 57);
		
		// adding buttons to frame
		frame.getContentPane().add(LogIn);
		frame.getContentPane().add(play_button);

		JLabel lblNewLabel_1 = new JLabel("Log In");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setBounds(989, 79, 72, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/resources/logoTrailerPark.png")));
		//lblNewLabel.add(lblNewLabel, new ImageIcon(logoTrailerPark));
		//lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 60));
		//lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBounds(359, 96, 512, 152);
		frame.getContentPane().add(lblNewLabel);

		// ------------------- Background image (the theater)------------------------------------------
		JLabel background = new JLabel("background");
		// implement images from the package
		InputStream umg3 = getClass().getClassLoader().getResourceAsStream("resources/Theater.jpg");
		BufferedImage img3 = null;
		try {
			img3 = ImageIO.read(umg3);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		img3.getScaledInstance(background.WIDTH, background.HEIGHT, Image.SCALE_SMOOTH);
		background.setIcon(new ImageIcon(img3));
		background.setBounds(-238, -64, 1557, 800);
		frame.getContentPane().add(background);

	}
}
