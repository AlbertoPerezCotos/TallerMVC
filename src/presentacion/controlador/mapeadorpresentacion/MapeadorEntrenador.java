package presentacion.controlador.mapeadorpresentacion;

import java.util.ArrayList;

import negocio.modelo.entidades.Entrenador;
import presentacion.entidades.PEntrenador;

public class MapeadorEntrenador {

	public static PEntrenador obtenerPEntrenador(Entrenador e) {

		PEntrenador nuevoPEntr = new PEntrenador();
		nuevoPEntr.id = e.getId();
		nuevoPEntr.nombre = e.getNombre();
		nuevoPEntr.apellidos = e.getApellidos();
		nuevoPEntr.fechaInicioEntrenamiento = e.getFechaInicioEntrenador();
		nuevoPEntr.fechaNacimiento=e.getFechaNacimiento();
		return nuevoPEntr;
	}

	public static ArrayList<PEntrenador> obtenerPEntrenador(ArrayList<Entrenador> entrenadores) {
		ArrayList<PEntrenador> listaPEntrenador = new ArrayList<>();

		for (Entrenador e : entrenadores) {
			PEntrenador nuevoPEntr = obtenerPEntrenador(e);
			listaPEntrenador.add(nuevoPEntr);
		}

		return listaPEntrenador;
	}

	public static Entrenador obtenerEntrenador(PEntrenador e) {

		Entrenador nuevoEntr = new Entrenador();
		nuevoEntr.setId(e.id);
		nuevoEntr.setNombre(e.nombre);
		nuevoEntr.setApellidos(e.apellidos);
		nuevoEntr.setFechaInicioEntrenador(e.fechaInicioEntrenamiento);
		nuevoEntr.setFechaNacimiento(e.fechaNacimiento);
		return nuevoEntr;
	}

	public static ArrayList<Entrenador> obtenerEntrenador(ArrayList<PEntrenador> entrenadores) {
		ArrayList<Entrenador> listaEntrenador = new ArrayList<>();

		for (PEntrenador e : entrenadores) {
			Entrenador nuevoEntr = obtenerEntrenador(e);
			listaEntrenador.add(nuevoEntr);
		}

		return listaEntrenador;
	}
}
