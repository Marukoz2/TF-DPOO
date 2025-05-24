import java.awt.EventQueue;


public class Runner {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Tienda t1 = new Tienda("CuCorsair Store", "123", "Dolores", "76900500", null);
		
		
	}

}
