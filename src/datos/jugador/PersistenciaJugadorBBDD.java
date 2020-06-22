package datos.jugador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import crosscutting.excepciones.ConexionBBDDException;
import datos.conexion.PersistenciaBBDD;
import datos.filtro.FiltroJugador;
import negocio.modelo.entidades.Jugador;
import negocio.modelo.enumerados.Demarcacion;
import negocio.persistencia.jugador.IPersistenciaJugador;

public class PersistenciaJugadorBBDD extends PersistenciaBBDD implements IPersistenciaJugador {

	@Override
	public List<Jugador> obtenerListadoJugadores(FiltroJugador filtro) throws ConexionBBDDException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertarListadoJugadores(List<Jugador> jugadores) throws ConexionBBDDException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarListadoJugadores(List<Jugador> jugadores) throws ConexionBBDDException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizarListadoJugadores(List<Jugador> listaJugadores) throws ConexionBBDDException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Jugador obtenerJugador(FiltroJugador filtro) throws ConexionBBDDException {
		// TODO Auto-generated method stub
		return null;
	}

}// PersistenciaJugadorBBDD
