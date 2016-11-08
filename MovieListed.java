package connection;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollBar;
import javax.swing.JPanel;

public class MovieListed extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieListed frame = new MovieListed();
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
	public MovieListed() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
								
								JPanel panel = new JPanel();
								getContentPane().add(panel);
								panel.setBounds(0, 0, 434, 264);
								
								//Go Back Button
								JButton button = new JButton("<---");
								button.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
													//internalFrame.add(new MovieInformation());
									}
								});
								panel.setLayout(null);
								button.setBounds(330, 13, 57, 25);
								panel.add(button);
								

								JScrollBar scrollBar = new JScrollBar();
								scrollBar.setBounds(419, 5, 15, 714);
								panel.add(scrollBar);
								scrollBar.setVisible(true);
								
								
								////////////////////////////////////
								// Deleting the old buttons every time you click search for getting only new results

								DBConnection dBConnection = new DBConnection();
								ArrayList<Movie> movieList = new ArrayList<>();
										
								movieList.clear();			//Makes movieListed empty before new search
										
								dBConnection.getMovie(); // adds new movies to the Arraylist
								
								int place = 0;
								for(int i = 0; i < movieList.size(); i++) {
									
									JButton[] btnNewButton_1 = new JButton[movieList.size()];
									btnNewButton_1[i] = new JButton(movieList.get(i).toString());
									btnNewButton_1[i].setBounds(5, 73 + place, 1000, 54);
									panel.add(btnNewButton_1[i]);
									btnNewButton_1[i].setFont(new Font("Times New Roman", Font.BOLD, 20));
									
									btnNewButton_1[i].addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											MovieInformation movieInformation = new MovieInformation();			
										}
									});					
					
									place = place + 70;
									}
							
		
	}
}
