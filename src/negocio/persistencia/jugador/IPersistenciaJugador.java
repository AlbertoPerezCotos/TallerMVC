package negocio.persistencia.jugador;

import java.util.List;

import crosscutting.excepciones.ConexionBBDDException;
import datos.filtro.FiltroJugador;
import negocio.modelo.entidades.Jugador;

public interface IPersistenciaJugador {
	public List<Jugador> obtenerListadoJugadores(FiltroJugador filtro) throws ConexionBBDDException;
	public boolean insertarListadoJugadores(List<Jugador> jugadores) throws ConexionBBDDException;
	public boolean eliminarListadoJugadores(List<Jugador> jugadores) throws ConexionBBDDException;
	public boolean actualizarListadoJugadores(List<Jugador> listaJugadores) throws ConexionBBDDException;
	public Jugador obtenerJugador(FiltroJugador filtro) throws ConexionBBDDException;
}
