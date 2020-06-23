package negocio.modelo.entidades;

import java.util.ArrayList;

public class Equipo {
	private int id;
	private String nombre;
	private int anhoFundacion;
	private ArrayList<Jugador> jugadoresEquipo;
	private Entrenador entrenador;
	
	
	public Equipo(int id, String nombre, int anhoFundacion) {
		this.id=id;
		this.nombre=nombre;
		this.anhoFundacion=anhoFundacion;
	}//Equipo
	
	public Equipo() {
		// TODO Auto-generated constructor stub
	}

	public int getId () {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnhoFundacion() {
		return anhoFundacion;
	}
	public void setAnhoFundacion(int anhoFundacion) {
		this.anhoFundacion = anhoFundacion;
	}
	public ArrayList<Jugador> getJugadoresEquipo() {
		return jugadoresEquipo;
	}
	public void setJugadoresEquipo(ArrayList<Jugador> jugadoresEquipo) {
		this.jugadoresEquipo = jugadoresEquipo;
	}
	public Entrenador getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	
	@Override
	public String toString() {
		return String.format("Id:%s\nNombre:%s\nAño de Fundación:%s",
				getId(),getNombre(),getAnhoFundacion());
	}
}
