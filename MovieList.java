package connection;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MovieList extends JInternalFrame {

	/**
	 * Create the frame.
	 */
	public MovieList() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		JButton btnHello = new JButton("Movies");
		btnHello.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				MovieInformation movieInformation = new MovieInformation();
				getContentPane().remove(panel);
				getContentPane().add(new MovieInformation());
			}
		});
		panel.add(btnHello);

	}
	
	public MovieList(ArrayList <Movie> movieList) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		//Creating buttons for each movie // this will be changed when Valentina is sending her part
		
		for (int i = 0; i < movieList.size(); i++) {
		JButton btnHello = new JButton(movieList.get(i).getTitle());
		btnHello.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				MovieInformation movieInformation = new MovieInformation();
				getContentPane().remove(panel);
				
				getContentPane().add(new MovieInformation());
			}
		});
		
		panel.add(btnHello);
		
		}

	}

}
