package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import presentacion.vista.NuevoEquipo;
import presentacion.vista.PantallaPrincipal;
import presentacion.vista.SeleccionarEquipo;

public class PantallaPrincipalController
{
	private PantallaPrincipal vista;
	
	//Constructor
	public PantallaPrincipalController(PantallaPrincipal vista)
	{
		this.vista= vista;
		this.vista.frame.setVisible(true);
		this.vista.frame.setLocationRelativeTo(null); //asi aparece centrado en pantalla, no en la esquina.
		
		anhadirListeners();
	}//PantallaPrincipalController()
	
	private void anhadirListeners()
	{
		vista.addmntmNuevoEquipoActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					NuevoEquipo dialogo= new NuevoEquipo();
					new NuevoEquipoController(dialogo);
				}
		
			});
		
		vista.addmntmBuscarEquipoActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				SeleccionarEquipo dialogo= new SeleccionarEquipo();
				new SeleccionarEquipoController(dialogo);
			}
	
		});
	}//anhadirListeners()
	
	
}//class PantallaPrincipalController