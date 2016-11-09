package connection;

import java.awt.EventQueue;

public class Main {
	public static void main(String [] args){
		
		//Running Project
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project window = new Project();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
