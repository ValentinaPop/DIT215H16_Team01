package DIT215H16_Team01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class InternalWorkPage extends JInternalFrame {
	private static JInternalFrame content;
	private static JMenuBar menuBar;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InternalWorkPage frame = new InternalWorkPage(new SearchMenu());
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
	public InternalWorkPage(JMenuBar menuBar, JInternalFrame content) { //Takes a JMenuBar as an argument (This is so depending on what kind of user we have, we can change the menubar)
		setBounds(100, 100, 450, 300);
		setBorder(null);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));
		add(content, BorderLayout.CENTER);
		content.setVisible(true);
		setJMenuBar(menuBar);
		//menuBar.setSize(this.WIDTH,this.HEIGHT);
	}
	public static void setContent(JInternalFrame newContent){
		//content = newContent;
		content.setContentPane(newContent);
	}
	public void setMenu(JMenuBar newMenuBar){
		//menuBar = newMenuBar;
		setJMenuBar(newMenuBar);
	}
}
