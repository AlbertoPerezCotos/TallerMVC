package presentacion.controlador.utilerrores;

import javax.swing.JOptionPane;

public class UtilMensajesError {

	public static void mostrarDialogoError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
	}
}
