package datos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class PersistenciaBBDD {
	
	protected Connection conexion;
	
	protected void cargarDriverConexionBBDD() throws ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
	}// cargarDriverConexionBBDD

	protected Connection obtenerConexion() throws SQLException {
		if (conexion == null) {
			String url = "jdbc:mariadb://localhost:3306/liga_futbol";
			Connection con = DriverManager.getConnection(url, "root", "root");
			conexion = con;
		}
		return conexion;
	}// obtenerConexion
	
	protected void cerrarConexion() {
		try {
			if (conexion != null) {
				conexion.close();
				conexion = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// cerrarConexion
	
}
