package negocio.persistencia.entrenador;

import java.util.List;

import crosscutting.excepciones.ConexionBBDDException;
import datos.filtro.FiltroEntrenador;
import negocio.modelo.entidades.Entrenador;

public interface IPersistenciaEntrenador {
	public List<Entrenador> obtenerListadoEntrenadores(FiltroEntrenador filtro) throws ConexionBBDDException;
	public void insertarListadoEntrenadores(List<Entrenador> listadoEntrenadores) throws ConexionBBDDException;
	public void eliminarListadoEntrenadores(List<Entrenador> listadoEntrenadores) throws ConexionBBDDException;
	public void actualizarListadoEntrenadores(List<Entrenador> listadoEntrenadores) throws ConexionBBDDException;
	public void actualizarEntrenador(Entrenador entrenador) throws ConexionBBDDException;
	public void insertarEntrenador(Entrenador entrenador) throws ConexionBBDDException;
	
}
