package crosscutting.excepciones;

import java.sql.SQLException;

@SuppressWarnings("serial")
public class ConexionBBDDException extends SQLException{
	public ConexionBBDDException(String mensaje) {
		super(mensaje);
	}
}
