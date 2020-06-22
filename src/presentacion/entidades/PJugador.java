package presentacion.entidades;

import java.time.LocalDate;

public class PJugador {
	public int id;
	public String nombre;
	public String apellidos;
	public int dorsal;
	public LocalDate fechaNacimiento;
	public String demarcacion;
	public Integer equipoId;
	
	public PJugador(int id, String nombre, String apellidos, int dorsal, LocalDate fechaNacimiento, String demarcacion, Integer equipoId) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dorsal = dorsal;
		this.fechaNacimiento = fechaNacimiento;
		this.demarcacion = demarcacion;
		this.equipoId = equipoId;
	}

	public PJugador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("Id:%s Nombre:%s Posicion:%s", id, nombre, demarcacion);
	}
}
