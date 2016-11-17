package DIT215H16_Team01;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import Project.Table;

public class Result extends JInternalFrame {

	/**
	 * Launch the application.
	
	*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result frame = new Result(new Table());
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
	public Result(JPanel tables) {
		//setBounds(100, 100, 450, 300);
		setContentPane(tables);

	}

}
