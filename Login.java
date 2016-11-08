package connection;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtPassword;
	private JTextField txtUsername;
	private JTextField textField_UserName;
	private JTextField textField_Email;
	private JTextField textField_Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = dim.width;
		int screenHeight = dim.height;
		
		getSize();
		setBounds(0, 0, dim.width, dim.height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnJoinUs = new JButton("Join us!");
		
		
		JLabel lblForgotPassword = new JLabel("<HTML><U>Forgot your password?</U></HTML>");
		lblForgotPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
// Go to a new JinternalFrame where asks for an email to send the password connected to it.
			}
		});
		lblForgotPassword.setForeground(Color.BLUE);
		

				
			lblForgotPassword.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			
			JLabel lblCreateAccount = new JLabel("Create account");
			lblCreateAccount.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
			lblCreateAccount.setForeground(new Color(128, 0, 0));
			
			JLabel lblUsername = new JLabel("Username");
			
			textField_UserName = new JTextField();
			textField_UserName.setColumns(10);
			
			JButton btnSignIn = new JButton("Sign in");
			

			
			JLabel lblEmail = new JLabel("e-mail");
			
			JLabel lblPassword = new JLabel("Password");
			
			textField_Password = new JTextField();
			textField_Password.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
				}
			});
			textField_Password.setToolTipText("The password should be 6 digits and contain at least one number and one capital letter");
			textField_Password.setColumns(10);
			
			textField_Email = new JTextField();
			textField_Email.setToolTipText("Use a valid e-mail");
			textField_Email.setColumns(10);
			
			JLabel UserIcon = new JLabel("");
			UserIcon.setIcon(new ImageIcon("/Users/LFigueroa/Desktop/user.png"));
			
			txtUsername = new JTextField();
			txtUsername.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			txtUsername.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					if(txtUsername.getText().equals("Username"))
						txtUsername.setText("");
				}
				@Override
				public void focusLost(FocusEvent e) {
					if(txtUsername.getText().equals(""))
						txtUsername.setText("Username");
				}
			});
			txtUsername.setForeground(new Color(128, 128, 128));
			txtUsername.setText("Username");
			txtUsername.setColumns(10);
			
			txtPassword = new JTextField();
			txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			txtPassword.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					if(txtPassword.getText().equals("Password"))
						txtPassword.setText("");
				}
				@Override
				public void focusLost(FocusEvent e) {
					if(txtPassword.getText().equals(""))
						txtPassword.setText("Password");
				}
			});
			
			txtPassword.setForeground(new Color(128, 128, 128));
			txtPassword.setText("Password");
			txtPassword.setColumns(10);
			
			JSeparator separator = new JSeparator();
			separator.setForeground(new Color(128, 0, 0));
			separator.setBackground(new Color(128, 0, 0));
			GroupLayout gl_contentPane = new GroupLayout(contentPane);
			gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addContainerGap(81, Short.MAX_VALUE)
								.addComponent(UserIcon)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblForgotPassword, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addContainerGap(347, Short.MAX_VALUE)
								.addComponent(btnSignIn))
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblCreateAccount))
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addGap(114)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(1)
										.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(textField_Password, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(textField_UserName, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
											.addComponent(textField_Email, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))))
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addContainerGap(343, Short.MAX_VALUE)
								.addComponent(btnJoinUs)))
						.addContainerGap())
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(UserIcon, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblForgotPassword, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnSignIn, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblCreateAccount, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblUsername)
							.addComponent(textField_UserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblEmail))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_Password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPassword))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnJoinUs)
						.addContainerGap(35, Short.MAX_VALUE))
			);
			contentPane.setLayout(gl_contentPane);
			btnSignIn.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
// new page -> where????
				}
			});
	}
}
