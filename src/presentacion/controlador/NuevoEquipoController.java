package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import crosscutting.excepciones.ConexionBBDDException;
import datos.equipo.PersistenciaEquipoBBDD;
import negocio.modelo.entidades.Equipo;
import negocio.persistencia.equipo.IPersistenciaEquipo;
import presentacion.controlador.mapeadorpresentacion.MapeadorEntrenador;
import presentacion.controlador.mapeadorpresentacion.MapeadorEquipo;
import presentacion.entidades.PEquipo;
import presentacion.vista.NuevoEquipo;

public class NuevoEquipoController
{
	private NuevoEquipo vista;
	
	public NuevoEquipoController(NuevoEquipo vista)
	{
		this.vista= vista;
		anhadirListeners(); //mejor lanzarlo aki para que las ventanas desactivadas se carguen bien
		
		this.vista.setVisible(true);
		this.vista.setLocationRelativeTo(null);
		
	}
	
	
	private void anhadirListeners()
	{
		vista.addbtnGuardarAddActionPerformedEvent(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						guardarDatosEquipo();
					}
			
				});
		
		
		vista.addbtnCancelarAddActionPerformedEvent(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						vista.dispose();
					}
			
				});
	}//anhadirListeners()
	
	
	private void guardarDatosEquipo()
	{
		PEquipo datosEquipo= vista.obtenerDatosEquipo(); //obtenemos un objeto de tipo PEquipo
		ArrayList<Equipo> listaEqu= new ArrayList<Equipo>();
		Equipo eq= MapeadorEquipo.obtenerEquipo(datosEquipo); //mapeamos el objeto PEquipo a ArrayList
		listaEqu.add(eq); 
		IPersistenciaEquipo persEq= new PersistenciaEquipoBBDD();
		try {
			persEq.insertarListadoEquipos(listaEqu);
		} catch (ConexionBBDDException e) {
			e.printStackTrace();
		}
	}//guardarDatosEquipo()
	
}//class PantallaEquipoController