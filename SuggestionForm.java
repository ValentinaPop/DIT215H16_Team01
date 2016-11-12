package Project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class SuggestionForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuggestionForm frame = new SuggestionForm();
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
	public SuggestionForm() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSuggestions = new JLabel("Describe your idea(s)");
		lblSuggestions.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JTextArea textArea_Suggestions = new JTextArea();
		textArea_Suggestions.setBackground(Color.WHITE);
		
		JLabel lblRelatedToWhat = new JLabel("Related to what is your suggestion?");
		lblRelatedToWhat.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose one category", "Interface", "Information", "Movies", "Rating", "Comments", "Trailers", "Help", "Others"}));
		
		JButton btnSend = new JButton("Send");
		btnSend.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
// Send the info to the administrator DB - Should have a new window that says info sent or if the email is not registered on the DB.
				
			}
		});
		
		JLabel lblEmail = new JLabel("E-mail for contact");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblRelatedToWhat)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox, 0, 222, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblEmail)
									.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
									.addComponent(textField_Email, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblSuggestions)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textArea_Suggestions, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(6, Short.MAX_VALUE))
						.addComponent(btnSend, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRelatedToWhat)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSuggestions)
						.addComponent(textArea_Suggestions, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnSend))
		);
		contentPane.setLayout(gl_contentPane);
		
		
		comboBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
	}
}
