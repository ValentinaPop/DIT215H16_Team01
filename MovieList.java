package connection;

import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MovieList extends JInternalFrame {
	JInternalFrame frame;
	/**
	 * Create the frame.
	 */


public MovieList(ArrayList <Movie> movielist) {
	
		// instead of this frame use the main frame of app
		frame = new JInternalFrame();
		
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setVisible(true);
		frame.setSize(100, 100);
		
		for (int i=0; i<movielist.size();i++)	{
			JLabel lbl = new JLabel(movielist.get(i).toString());
			frame.getContentPane().add(lbl);
			//add action listeners
			
			
		}
	

	}
	public static void main(String[] args)	{
		
		ArrayList<Movie> movielist = new ArrayList<>();
		movielist.add(new Movie());
		movielist.add(new Movie());
		////////////////////// get the movie list from the DB instead
		MovieList frame = new MovieList(movielist);
		
	}
	
}