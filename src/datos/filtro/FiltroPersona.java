package datos.filtro;

import java.time.LocalDate;

public abstract class FiltroPersona extends Filtro {
	public Integer id;
	public String nombre;
	public String apellidos;
	public LocalDate fechaNacimiento;
	public Integer equipoId;
}
