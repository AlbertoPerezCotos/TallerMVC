package negocio.modelo.entidades;

import java.time.LocalDate;

import negocio.modelo.enumerados.Demarcacion;

public class Jugador extends Persona{
	private Demarcacion demarcacion;
	private int dorsal;
	
	public Jugador(int id, String nombre, String apellidos, LocalDate fechaNacimiento, Demarcacion demarcacion, int dorsal) {
		super(id, nombre,apellidos,fechaNacimiento);
		this.demarcacion=demarcacion;
		this.dorsal=dorsal;
	}//Jugador

	public Jugador() {
		// TODO Auto-generated constructor stub
	}

	public Demarcacion getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(Demarcacion demarcacion) {
		this.demarcacion = demarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	@Override
	public String toString() {
		return String.format("Id:%s\nNombre:%s\nApellidos:%s\nFecha Nacimiento:%s\nDemarcacion:%s\nDorsal:%s IdEquipo:%s",
				getId(),getNombre(),getApellidos(),getFechaNacimiento(),getDemarcacion(),getDorsal(),getIdEquipo());
	}
	
}//class
