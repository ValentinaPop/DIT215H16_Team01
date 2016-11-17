package DIT215H16_Team01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class WorkPage extends JFrame {
	private static JInternalFrame internalWorkPage;
	private JPanel contentPane;
	private SearchMenu searchMenu = new SearchMenu();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkPage frame = new WorkPage(new InternalWorkPage(new MenuAdm()));
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
	public WorkPage(JInternalFrame newInternalWorkPage) { //Takes an JInternalFrame as an argument (This is so that we can set is as visible in the WorkPage)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 830);
		//setBounds(1000, 830, 880, 512);
		this.internalWorkPage = newInternalWorkPage;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(searchMenu, BorderLayout.WEST);
		contentPane.add(internalWorkPage, BorderLayout.CENTER);
		internalWorkPage.setVisible(true);
		
		
	}
	public static JInternalFrame getInternalFrame(){
		return internalWorkPage;
	}

}
