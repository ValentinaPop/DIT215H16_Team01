package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ProblemsForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProblemsForm frame = new ProblemsForm();
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
	public ProblemsForm() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEmail = new JLabel("E-mail for contact");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		
		JLabel lblRelatedToWhat = new JLabel("Related to what is your problem?");
		lblRelatedToWhat.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JComboBox comboBox_Problems = new JComboBox();
		comboBox_Problems.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_Problems.setModel(new DefaultComboBoxModel(new String[] {"Choose one category", "Technical issues", "Long time loading ", "Difficult to use", "With other users", "Account", "Others problems"}));
		
		JLabel lblDescribeYourProblems = new JLabel("Describe the problem(s):");
		lblDescribeYourProblems.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JTextArea textArea_Problems = new JTextArea();
		
		JButton btnSend = new JButton("Send");
		btnSend.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
// Send the info to the administrator DB - Should have a new window that says info sent or if the email is not registered on the DB.
			
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEmail)
							.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
							.addComponent(textField_Email, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblRelatedToWhat)
							.addGap(18)
							.addComponent(comboBox_Problems, 0, 222, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDescribeYourProblems)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textArea_Problems, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
						.addComponent(btnSend, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textField_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRelatedToWhat)
						.addComponent(comboBox_Problems, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea_Problems, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDescribeYourProblems))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSend)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
