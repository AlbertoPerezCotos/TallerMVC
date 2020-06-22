package presentacion.controlador.mapeadorpresentacion;

import java.util.ArrayList;

import negocio.modelo.entidades.Jugador;
import negocio.modelo.enumerados.Demarcacion;
import presentacion.entidades.PJugador;

public class MapeadorJugador {

	public static PJugador obtenerPJugador(Jugador j) {
		PJugador nuevoPJug = new PJugador();
		nuevoPJug.id = j.getId();
		nuevoPJug.nombre = j.getNombre();
		nuevoPJug.apellidos = j.getApellidos();
		nuevoPJug.dorsal = j.getDorsal();
		nuevoPJug.demarcacion =j.getDemarcacion()!=null? j.getDemarcacion().toString():null;
		nuevoPJug.fechaNacimiento = j.getFechaNacimiento();
		nuevoPJug.equipoId=j.getIdEquipo();
		return nuevoPJug;
	}

	/**
	 * @param jugadores
	 * @return
	 */
	public static ArrayList<PJugador> obtenerPJugador(ArrayList<Jugador> jugadores) {
		ArrayList<PJugador> listaPJugador = new ArrayList<>();

		for (Jugador j : jugadores) {
			PJugador nuevoPJug = obtenerPJugador(j);
			listaPJugador.add(nuevoPJug);
		}

		return listaPJugador;
	}

	public static Jugador obtenerJugador(PJugador j) {

		Jugador nuevoEntr = new Jugador();
		nuevoEntr.setId(j.id);
		nuevoEntr.setNombre(j.nombre);
		nuevoEntr.setApellidos(j.apellidos);
		nuevoEntr.setDorsal(j.dorsal);
		nuevoEntr.setDemarcacion(Demarcacion.obtenerDemarcacion(j.demarcacion));
		nuevoEntr.setFechaNacimiento(j.fechaNacimiento);
		nuevoEntr.setIdEquipo(j.equipoId);
		return nuevoEntr;
	}

	public static ArrayList<Jugador> obtenerJugador(ArrayList<PJugador> jugadores) {
		ArrayList<Jugador> listaJugador = new ArrayList<>();

		for (PJugador j : jugadores) {
			Jugador nuevoJug = obtenerJugador(j);
			listaJugador.add(nuevoJug);
		}

		return listaJugador;
	}
}
