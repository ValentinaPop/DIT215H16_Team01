package DIT215H16_Team01;

import java.awt.EventQueue;

// Running the entire program
public class Main {
	public static void main(String[] args){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage window = new FirstPage(); //Initialize the FirstPage, look in the FirstPage 
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
