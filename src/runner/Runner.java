package runner;

import interfaz.Login;

import java.awt.EventQueue;

import logica.Tienda;


public class Runner {

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
		
		Tienda t1 = new Tienda("CuCorsair Store", "123", "Dolores", "76900500", null);
		
		
	}

}
