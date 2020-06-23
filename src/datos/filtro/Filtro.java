package datos.filtro;

public abstract class Filtro {

	public TipoBusqueda tipoBusqueda;
	
	
	public Filtro() {
		this.tipoBusqueda=TipoBusqueda.EXACTA;
	}
	
}
