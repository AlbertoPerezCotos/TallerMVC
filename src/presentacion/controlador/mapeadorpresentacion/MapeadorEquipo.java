package presentacion.controlador.mapeadorpresentacion;

import java.util.ArrayList;

import negocio.modelo.entidades.Equipo;
import presentacion.entidades.PEquipo;

public class MapeadorEquipo {

	public static ArrayList<PEquipo> obtenerPEquipo(ArrayList<Equipo> equipos) {
		ArrayList<PEquipo> listaPEquipo = new ArrayList<>();

		for (Equipo e : equipos) {
			listaPEquipo.add(obtenerPEquipo(e));
		}

		return listaPEquipo;
	}

	public static PEquipo obtenerPEquipo(Equipo e) {
		PEquipo nuevoPEqu = new PEquipo();
		if (e != null) {
			nuevoPEqu.id = e.getId();
			nuevoPEqu.nombre = e.getNombre();
			nuevoPEqu.anhoFundacion = e.getAnhoFundacion();
		}

		return nuevoPEqu;
	}

	public static ArrayList<Equipo> obtenerEquipo(ArrayList<PEquipo> equipos) {
		ArrayList<Equipo> listaEquipo = new ArrayList<>();

		for (PEquipo e : equipos) {
			listaEquipo.add(obtenerEquipo(e));
		}

		return listaEquipo;
	}

	public static Equipo obtenerEquipo(PEquipo e) {
		Equipo nuevoEqu = new Equipo();
		nuevoEqu.setId(e.id);
		nuevoEqu.setNombre(e.nombre);
		nuevoEqu.setAnhoFundacion(e.anhoFundacion);

		return nuevoEqu;
	}
}
