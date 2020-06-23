package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import crosscutting.excepciones.ConexionBBDDException;
import datos.equipo.PersistenciaEquipoBBDD;
import negocio.modelo.entidades.Equipo;
import negocio.persistencia.equipo.IPersistenciaEquipo;
import presentacion.controlador.mapeadorpresentacion.MapeadorEquipo;
import presentacion.entidades.PEquipo;
import presentacion.vista.NuevoEquipo;
import presentacion.vista.SeleccionarEquipo;

public class SeleccionarEquipoController
{
	private SeleccionarEquipo vista;
	
	public SeleccionarEquipoController(SeleccionarEquipo vista)
	{
		this.vista= vista;
		anhadirListeners(); //mejor lanzarlo aki para que las ventanas desactivadas se carguen bien
		
		this.vista.setVisible(true);
		this.vista.setLocationRelativeTo(null);
		
		mostrarEquiposDesplegable();
		
	}
	
	private void anhadirListeners()
	{
		vista.addbtnSeleccionarAddActionPerformedEvent(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {

					}
		
				});
		
		
		vista.addbtnCerrarAddActionPerformedEvent(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						vista.dispose();
					}
			
				});
		
		vista.addbtncbSelectEquipoItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) //itemStateChanged es cuando pasas de tener seleccionado
			{											//un elemento del comboBox a seleccionar otro distinto
				if(e.getStateChange()== ItemEvent.SELECTED)
				{
					vista.actualizarPantalla();
				}
			}
		});
	}//anhadirListeners()
	
	
	private void mostrarEquiposDesplegable()
	{
		IPersistenciaEquipo persEq= new PersistenciaEquipoBBDD();
		try {
			ArrayList<Equipo> listaEquipos= (ArrayList<Equipo>) persEq.obtenerListadoEquipos(null);
			ArrayList<PEquipo> listaEquiposPresent= MapeadorEquipo.obtenerPEquipo(listaEquipos);
			vista.mostrarEquiposDesplegable(listaEquiposPresent);
		} catch (ConexionBBDDException e) {
			e.printStackTrace();
		}
	}
}//class SeleccionarEquipoController