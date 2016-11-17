package DIT215H16_Team01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JSeparator;

public class Advanced extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Title;
	private JTextField textField_Actor;
	private JTextField textField_Director;
	private JTextField txtYear;
	private JTextField textField_Studio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advanced frame = new Advanced();
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
	public Advanced() {
		
		ImageIcon background = new ImageIcon("/Users/LFigueroa/Desktop/filmroll.png");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		
		JLabel lblTitle = new JLabel("Title");
		
		textField_Title = new JTextField();
		textField_Title.setColumns(10);
		
		JLabel lblAdvancedSearch = new JLabel("Advanced Search ");
		lblAdvancedSearch.setForeground(new Color(128, 0, 0));
		lblAdvancedSearch.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		
		JLabel lblActor = new JLabel("Actor");
		
		textField_Actor = new JTextField();
		textField_Actor.setColumns(10);
		
		JLabel lblDirector = new JLabel("Director");
		
		textField_Director = new JTextField();
		textField_Director.setColumns(10);
		
		JLabel lblYear = new JLabel("Year");
		
		txtYear = new JTextField();
		txtYear.setForeground(Color.GRAY);
		txtYear.setText("YYYY");
		txtYear.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtYear.getText().equals("YYYY"))
					txtYear.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtYear.getText().equals(""))
					txtYear.setText("YYYY");
			}
		});
		txtYear.setColumns(10);
		
		JLabel lblBasedOn = new JLabel("Based on");
		
		JComboBox comboBox_BasedOn = new JComboBox();
		comboBox_BasedOn.setModel(new DefaultComboBoxModel(new String[] {"...", "Book", "Person", "Movie"}));
		
		JLabel lblGenre = new JLabel("Genre");
		
		JComboBox comboBox_Genre = new JComboBox();
		comboBox_Genre.setModel(new DefaultComboBoxModel(new String[] {"...", "Action", "Adventure", "Animation", "Biography", "Comedy", "Crime", "Drama", "Fantasy", "Family", "History", "Horror", "Musical", "Mystery", "Romance", "Sci-fi", "Sport", "Thriller", "War"}));
		
		JLabel lblLanguage = new JLabel("Language");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"...", "Arabic", "English", "Finish", "French", "German", "Indi", "Italian", "Portuguese", "Spanish", "Swedish", "Others"}));
		
		JLabel lblLenght = new JLabel("Length");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"...", "Less than 1 hour", "1 h 01 min to 1 h 30 min", "1 h 31 min to 2 hours", "2 h 01 min to 2 h 30 min", "More than 2 h 31 min"}));
		
		JLabel lblStudio = new JLabel("Studio");
		
		textField_Studio = new JTextField();
		textField_Studio.setColumns(10);
		
		JButton btnApplySelection = new JButton("Apply selection");
		btnApplySelection.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
//The JInternalFrame should be created here with all the info selected				
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(128, 0, 0));
		separator.setForeground(new Color(128, 0, 0));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(128, 0, 0));
		separator_1.setBackground(new Color(128, 0, 0));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
										.addComponent(lblLanguage)
										.addGap(46)
										.addComponent(comboBox, 0, 213, Short.MAX_VALUE))
									.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
										.addComponent(lblBasedOn)
										.addGap(50)
										.addComponent(comboBox_BasedOn, 0, 213, Short.MAX_VALUE))
									.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
										.addComponent(lblGenre)
										.addGap(70)
										.addComponent(comboBox_Genre, 0, 213, Short.MAX_VALUE))
									.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(lblYear)
											.addComponent(lblStudio)
											.addComponent(lblDirector)
											.addComponent(lblActor)
											.addComponent(lblTitle))
										.addGap(55)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(textField_Title, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
											.addComponent(textField_Actor, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
											.addComponent(textField_Director, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
											.addComponent(textField_Studio, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
											.addComponent(txtYear, 213, 213, 213)))
									.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
										.addComponent(lblLenght)
										.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
										.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addComponent(separator, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)))
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(64)
								.addComponent(lblAdvancedSearch))
							.addComponent(btnApplySelection, Alignment.TRAILING)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(13)
					.addComponent(lblAdvancedSearch)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_Title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTitle))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActor)
						.addComponent(textField_Actor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDirector)
						.addComponent(textField_Director, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStudio)
						.addComponent(textField_Studio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYear))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_Genre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGenre))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_BasedOn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBasedOn, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLanguage))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLenght)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnApplySelection)
					.addContainerGap(150, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
