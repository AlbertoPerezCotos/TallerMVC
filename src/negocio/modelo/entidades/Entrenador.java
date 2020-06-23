package negocio.modelo.entidades;

import java.time.LocalDate;

public class Entrenador extends Persona{
	private LocalDate fechaInicioEntrenador;
	
	public LocalDate getFechaInicioEntrenador() {
		return fechaInicioEntrenador;
	}

	public void setFechaInicioEntrenador(LocalDate fechaInicioEntrenador) {
		this.fechaInicioEntrenador = fechaInicioEntrenador;
	}
	
	@Override
	public String toString() {
		return String.format("Id:%s\nNombre:%s\nFecha Nacimiento:%s\nFecha Inicio de Entrenador:%s",
				getId(),getNombre(),getFechaNacimiento(),getFechaInicioEntrenador());
	}
	
	
	public Entrenador(int id, String nombre,String apellidos, LocalDate fechaNacimiento,LocalDate fechaInicioEntrenador) {
		super(id, nombre,apellidos, fechaNacimiento);
		this.fechaInicioEntrenador=fechaInicioEntrenador;
	}

	public Entrenador() {
		// TODO Auto-generated constructor stub
	}

}//class
