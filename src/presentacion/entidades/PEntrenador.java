package presentacion.entidades;

import java.time.LocalDate;

public class PEntrenador {
	public int id;
	public String nombre;
	public String apellidos;
	public LocalDate fechaInicioEntrenamiento;
	public LocalDate fechaNacimiento;
	
	public PEntrenador(int id, String nombre, String apellidos, LocalDate fechaInicioEntrenamiento
			,LocalDate fechaNacimiento) {
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaInicioEntrenamiento=fechaInicioEntrenamiento;
		this.fechaNacimiento=fechaNacimiento;
	}

	public PEntrenador() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return String.format("%s %s", nombre,apellidos);
	}
	
}
