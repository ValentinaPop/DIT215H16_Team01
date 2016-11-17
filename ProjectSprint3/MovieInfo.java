package DIT215H16_Team01;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JTextArea;

public class MovieInfo extends JPanel {

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieInfo frame = new MovieInfo();
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
	public MovieInfo(String title) {
		
		ImageIcon blueStar = new ImageIcon("/Users/LFigueroa/Desktop/icons/BlueStar.png");
		
		setBorder(null);
		setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setVisible(true);
		
		JLabel lblTitle = new JLabel(title);
		lblTitle.setForeground(new Color(128, 0, 0));
		lblTitle.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(128, 0, 0));
		separator_1.setBackground(new Color(128, 0, 0));
		
// Stars to the rating
		
		JLabel lblRating = new JLabel();
		lblRating.setIcon(blueStar);
		
		JLabel label = new JLabel();
		label.setIcon(blueStar);
		
		JLabel label_1 = new JLabel();
		label_1.setIcon(blueStar);
		
		JLabel label_2 = new JLabel();
		label_2.setIcon(blueStar);
		
		JLabel label_3 = new JLabel();
		label_3.setIcon(blueStar);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(255, 255, 255));
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(new Color(128, 0, 0));
		separator.setBackground(new Color(128, 0, 0));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(new Color(128, 0, 0));
		separator_2.setBackground(new Color(128, 0, 0));
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(128, 0, 0));
		separator_3.setBackground(new Color(128, 0, 0));
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(128, 0, 0));
		separator_4.setBackground(new Color(128, 0, 0));
		
	
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addComponent(lblTitle)
					.addContainerGap(395, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(separator_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(separator_3, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(lblRating)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(31))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(313, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(lblTitle)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
								.addComponent(separator)
								.addComponent(separator_2))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRating)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setForeground(new Color(128, 0, 0));
		lblGenre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setForeground(new Color(128, 0, 0));
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel lblLength = new JLabel("Length");
		lblLength.setForeground(new Color(128, 0, 0));
		lblLength.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel lblReleaseDay = new JLabel("Release Day");
		lblReleaseDay.setForeground(new Color(128, 0, 0));
		lblReleaseDay.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setForeground(new Color(128, 0, 0));
		lblDirector.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel lblActors = new JLabel("Starring actors:");
		lblActors.setForeground(new Color(128, 0, 0));
		lblActors.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel lblStudio = new JLabel("Studio:");
		lblStudio.setForeground(new Color(128, 0, 0));
		lblStudio.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel lblLanguage = new JLabel("Language");
		lblLanguage.setForeground(new Color(128, 0, 0));
		lblLanguage.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("Director info from DB\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel lblActorsInfoFrom = new JLabel("Actors info from DB\n");
		lblActorsInfoFrom.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel lblStudioInfoFrom = new JLabel("Studio info from DB\n");
		lblStudioInfoFrom.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JTextArea txtrDescription = new JTextArea();
		txtrDescription.setEditable(false);
		txtrDescription.setWrapStyleWord(true);
		txtrDescription.setLineWrap(true);
		txtrDescription.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtrDescription.setText("Description");
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setForeground(new Color(128, 0, 0));
		lblDescription.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrDescription, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblDirector)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblActors, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblAge, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblGenre)))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
									.addComponent(lblLength)
									.addGap(38)
									.addComponent(lblReleaseDay))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblActorsInfoFrom, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblStudio)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblStudioInfoFrom, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblLanguage)
						.addComponent(lblDescription))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAge, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblReleaseDay, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLength, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGenre))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDirector, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActors, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblActorsInfoFrom))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStudio, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStudioInfoFrom))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLanguage, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblDescription, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrDescription, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		setLayout(groupLayout);
		setBounds(100, 100, 450, 300);

	}
}
