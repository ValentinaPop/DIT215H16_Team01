package connection;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RatingStars extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RatingStars frame = new RatingStars();
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
	public RatingStars() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		Movie movie = new Movie();
		
		// Rating Star1
		JLabel star1 = new JLabel("");
		star1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//add 1 to Sum 
				//add 1 to Amount
				//add NewSum / NewAmount = Average
			}
		});
		star1.setBounds(72, 107, 22, 16);
		
		BufferedImage img1=null;
		File file1;
		
		if (movie.getAverageRate() < 1 ) {
		file1 = new File("C:\\Users\\Omistaja\\Downloads\\lataus.png");
		}
		
		else if (movie.getAverageRate() < 1.5) {
		file1 = new File("C:\\Users\\Omistaja\\Downloads\\lataus2.png");
		}
		
		else{
		file1 = new File("C:\\Users\\Omistaja\\Downloads\\lataus1.png");
		}
		
		try {
			img1 = ImageIO.read(file1);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		ImageIcon imgicn1 = new ImageIcon(img1.getScaledInstance(star1.getWidth(), star1.getHeight(), 0));
		star1.setIcon(imgicn1);		
		getContentPane().add(star1);
		
		
		//Rating Star2
		JLabel star2 = new JLabel("");
		star2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//add 2 to Sum 
				//add 1 to Amount
				//add NewSum / NewAmount = Average
			}
		});
		
		star2.setBounds(107, 107, 22, 16);
		
		BufferedImage img2=null;
		File file2;
		
		if (movie.getAverageRate() < 2 ) {
		file2 = new File("C:\\Users\\Omistaja\\Downloads\\lataus.png");
		}
		
		else if (movie.getAverageRate() < 2.5) {
		file2 = new File("C:\\Users\\Omistaja\\Downloads\\lataus2.png");
		}
		
		else{
		file2 = new File("C:\\Users\\Omistaja\\Downloads\\lataus1.png");
		}
		
		
		try {
			img2 = ImageIO.read(file2);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		ImageIcon imgicn2 = new ImageIcon(img2.getScaledInstance(star2.getWidth(), star2.getHeight(), 0));
		star2.setIcon(imgicn2);		
		getContentPane().add(star2);
		
		//Rating Star3
				JLabel star3 = new JLabel("");
				
				star3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						//add 3 to Sum 
						//add 1 to Amount
						//add NewSum / NewAmount = Average
					}
				});
				
				star3.setBounds(142, 107, 22, 16);
				
				BufferedImage img3=null;
				File file3;
				
				if (movie.getAverageRate() < 3 ) {
				file3 = new File("C:\\Users\\Omistaja\\Downloads\\lataus.png");
				}
				
				else if (movie.getAverageRate() < 3.5) {
				file3 = new File("C:\\Users\\Omistaja\\Downloads\\lataus2.png");
				}
				
				else{
				file3 = new File("C:\\Users\\Omistaja\\Downloads\\lataus1.png");
				}
				
				try {
					img3 = ImageIO.read(file3);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
						
				ImageIcon imgicn3 = new ImageIcon(img3.getScaledInstance(star3.getWidth(), star3.getHeight(), 0));
				star3.setIcon(imgicn3);		
				getContentPane().add(star3);
				
				//Rating Star4
				JLabel star4 = new JLabel("");
				star4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						//add 4 to Sum 
						//add 1 to Amount
						//add NewSum / NewAmount = Average
					}
				});
				
				star4.setBounds(177, 107, 22, 16);
				
				BufferedImage img4=null;
				File file4;
				
				if (movie.getAverageRate() < 4 ) {
				file4 = new File("C:\\Users\\Omistaja\\Downloads\\lataus.png");
				}
				
				else if (movie.getAverageRate() < 4.5) {
				file4 = new File("C:\\Users\\Omistaja\\Downloads\\lataus2.png");
				}
				
				else{
				file4 = new File("C:\\Users\\Omistaja\\Downloads\\lataus1.png");
				}
				
				try {
					img4 = ImageIO.read(file4);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
						
				ImageIcon imgicn4 = new ImageIcon(img4.getScaledInstance(star4.getWidth(), star4.getHeight(), 0));
				star4.setIcon(imgicn4);		
				getContentPane().add(star4);
		
				//Rating Star5
				JLabel star5 = new JLabel("");
				star5.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						//add 5 to Sum 
						//add 1 to Amount
						//add NewSum / NewAmount = Average
					}
				});
				star5.setBounds(212, 107, 22, 16);
				
				BufferedImage img5=null;
				File file5;
				
				if (movie.getAverageRate() < 5 ) {
				file5 = new File("C:\\Users\\Omistaja\\Downloads\\lataus.png");
				}
				
				else if (movie.getAverageRate() < 5.5) {
				file5 = new File("C:\\Users\\Omistaja\\Downloads\\lataus2.png");
				}
				
				else{
				file5 = new File("C:\\Users\\Omistaja\\Downloads\\lataus1.png");
				}
				
				try {
					img5 = ImageIO.read(file5);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
						
				ImageIcon imgicn5 = new ImageIcon(img5.getScaledInstance(star5.getWidth(), star5.getHeight(), 0));
				star5.setIcon(imgicn5);		
				getContentPane().add(star5);
	}
}
