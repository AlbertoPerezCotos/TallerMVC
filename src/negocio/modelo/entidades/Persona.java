package negocio.modelo.entidades;

import java.time.LocalDate;

public abstract class Persona {
	private int id;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private Integer idEquipo;
	
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
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Integer getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(Integer idEquipo) {
		this.idEquipo=idEquipo;
	}
	
	public Persona(int id, String nombre, String apellidos, LocalDate fechaNacimiento) {
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNacimiento;
	}
	
	public Persona() {
		
	}
	
	
}//class
