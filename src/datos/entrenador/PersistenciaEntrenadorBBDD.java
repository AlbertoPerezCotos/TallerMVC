package datos.entrenador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import crosscutting.GestorLog;
import crosscutting.excepciones.ConexionBBDDException;
import datos.conexion.PersistenciaBBDD;
import datos.filtro.FiltroEntrenador;
import negocio.modelo.entidades.Entrenador;
import negocio.persistencia.entrenador.IPersistenciaEntrenador;

public class PersistenciaEntrenadorBBDD extends PersistenciaBBDD implements IPersistenciaEntrenador {

	@Override
	public List<Entrenador> obtenerListadoEntrenadores(FiltroEntrenador filtro) throws ConexionBBDDException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarListadoEntrenadores(List<Entrenador> listadoEntrenadores) throws ConexionBBDDException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarListadoEntrenadores(List<Entrenador> listadoEntrenadores) throws ConexionBBDDException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarListadoEntrenadores(List<Entrenador> listadoEntrenadores) throws ConexionBBDDException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarEntrenador(Entrenador entrenador) throws ConexionBBDDException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertarEntrenador(Entrenador entrenador) throws ConexionBBDDException {
		// TODO Auto-generated method stub
		
	}

}// PersistenciaEntrenadorBBDD
