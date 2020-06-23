package negocio;

import java.util.ArrayList;

import crosscutting.excepciones.ConexionBBDDException;
import datos.equipo.PersistenciaEquipoBBDD;
import datos.filtro.FiltroEquipo;
import negocio.modelo.entidades.Equipo;
import negocio.persistencia.equipo.IPersistenciaEquipo;

public class Test {

	public static void main(String[] args)
	{
		IPersistenciaEquipo persEquipo= new PersistenciaEquipoBBDD();
		try
		{
			//FiltroEquipo filtro= new FiltroEquipo();
			//filtro.id= 3;
			ArrayList<Equipo> listaEq= (ArrayList<Equipo>) persEquipo.obtenerListadoEquipos(null);
			
			for(Equipo e: listaEq)
			{
				System.out.println(e);
			}
			
			//System.out.println("---ACTUALIZACION---");
			//ahora eliminamos el primer elemento de la lista 3 veces, así sólo queda el cuarto
			listaEq.remove(0);
			listaEq.remove(0);
			listaEq.remove(0);
			//y llamamos a la orden de borrado de la lista, que sólo tiene el cuarto elemento
			persEquipo.eliminarListadoEquipos(listaEq);
			/*listaEq.get(3).setNombre("prueba actualizacion");
			listaEq.get(3).setAnhoFundacion(1998);
			persEquipo.actualizarListadoEquipos(listaEq);*/
			/*ArrayList<Equipo> listaInsert= new ArrayList<>();
			Equipo eq= new Equipo(0, "Prueba1", 2020);
			listaInsert.add(eq);
			persEquipo.insertarListadoEquipos(listaInsert);		*/	
		}
		catch (ConexionBBDDException e)
		{
			e.printStackTrace();
		}
	}

}
