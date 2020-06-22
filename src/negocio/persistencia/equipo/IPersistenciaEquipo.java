package negocio.persistencia.equipo;

import java.util.List;

import crosscutting.excepciones.ConexionBBDDException;
import datos.filtro.FiltroEquipo;
import negocio.modelo.entidades.Equipo;

public interface IPersistenciaEquipo {
	public List<Equipo> obtenerListadoEquipos(FiltroEquipo filtro) throws ConexionBBDDException;
	public boolean insertarListadoEquipos(List<Equipo> listadoEquipos) throws ConexionBBDDException;
	public boolean eliminarListadoEquipos(List<Equipo> listadoJugadores) throws ConexionBBDDException;
	public boolean actualizarListadoEquipos(List<Equipo> listaEquipos) throws ConexionBBDDException;
}
