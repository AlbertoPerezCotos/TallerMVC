package presentacion;

import java.awt.EventQueue;

import presentacion.controlador.PantallaPrincipalController;
import presentacion.vista.PantallaPrincipal;

public class Programa {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal window = new PantallaPrincipal();
					new PantallaPrincipalController(window);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}//class Programa