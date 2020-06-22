package negocio.modelo.enumerados;

public enum Demarcacion {
	PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO;

	public static Demarcacion obtenerDemarcacion(String demarcacion) {
		return Demarcacion.valueOf(demarcacion!=null?demarcacion.toUpperCase():null);
	}//obtenerDemarcacion
}//Demarcacion
