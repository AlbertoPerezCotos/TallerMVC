package datos.equipo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import crosscutting.excepciones.ConexionBBDDException;
import datos.conexion.PersistenciaBBDD;
import datos.filtro.FiltroEquipo;
import datos.filtro.TipoBusqueda;
import negocio.modelo.entidades.Equipo;
import negocio.persistencia.equipo.IPersistenciaEquipo;

public class PersistenciaEquipoBBDD extends PersistenciaBBDD implements IPersistenciaEquipo {

	@Override
	public List<Equipo> obtenerListadoEquipos(FiltroEquipo filtro) throws ConexionBBDDException {
		String consulta= "SELECT id, nombre, anho_fundacion FROM equipo";
		ArrayList<Equipo> listaEquipos= new ArrayList<Equipo>();
		String clausulaWhere="";
		
		try {
			cargarDriverConexionBBDD();
			Connection con= obtenerConexion();
			
			if(filtro!=null)
			{
				if(filtro.id!=null)
				{
					clausulaWhere= clausulaWhere + " id=?";
				}
				if(filtro.nombre!=null && !filtro.nombre.isEmpty())
				{
					if(!clausulaWhere.isEmpty())
					{
						clausulaWhere= clausulaWhere + " and ";
					}
					clausulaWhere= clausulaWhere + " nombre like ?";
				}
				if(!clausulaWhere.isEmpty())
				{
					clausulaWhere= " where " + clausulaWhere;	
				}
			}
			
			consulta= consulta+clausulaWhere;
			PreparedStatement ps= con.prepareStatement(consulta);
			
			if(!clausulaWhere.isEmpty())
			{
				int index=1;
				if(filtro.id!=null)
				{
					ps.setInt(index, filtro.id);
					index++;
				}
				if(filtro.nombre!=null && !filtro.nombre.isEmpty())
				{
					if(filtro.tipoBusqueda==TipoBusqueda.EXACTA)
					{
						ps.setString(index, filtro.nombre);
					}
					else
						if(filtro.tipoBusqueda==TipoBusqueda.COMIENZA_POR)
							ps.setString(index, filtro.nombre+"%");
					index++;
				}
			}
			
			
			ps.execute();
			
			try(ResultSet rs= ps.getResultSet())
			{
				while(rs.next())
				{
					int id= rs.getInt("id");
					String nombre= rs.getString("nombre");
					int anhoFundacion= rs.getInt("anho_fundacion");
					
					Equipo e= new Equipo(id, nombre, anhoFundacion);
					listaEquipos.add(e);
				}//while
			}//try
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			cerrarConexion();
			
		}
	return listaEquipos;
	}

	@Override
	public boolean insertarListadoEquipos(List<Equipo> listadoEquipos) throws ConexionBBDDException {
		String consulta= "INSERT INTO equipo (nombre, anho_fundacion) VALUES(?, ?)";
		
		try {
			cargarDriverConexionBBDD();
			Connection con= obtenerConexion();
			
			PreparedStatement ps= con.prepareStatement(consulta);
			
			for(Equipo e:listadoEquipos)
			{
				ps.setString(1, e.getNombre());
				ps.setInt(2, e.getAnhoFundacion());
				ps.addBatch();
			}
			ps.executeBatch();
			return true;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean eliminarListadoEquipos(List<Equipo> listadoJugadores) throws ConexionBBDDException {
		String consulta= "DELETE FROM equipo WHERE id=?";
		
		try {
			cargarDriverConexionBBDD();
			Connection con= obtenerConexion();
			
			PreparedStatement ps= con.prepareStatement(consulta);
			
			for(Equipo e:listadoJugadores)
			{
				ps.setInt(1, e.getId());
				ps.addBatch();
			}
			ps.executeBatch();
			return true;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean actualizarListadoEquipos(List<Equipo> listaEquipos) throws ConexionBBDDException {
		String consulta= "UPDATE equipo SET nombre=?, anho_fundacion=? WHERE id=?";
		
		try {
			cargarDriverConexionBBDD();
			Connection con= obtenerConexion();
			
			PreparedStatement ps= con.prepareStatement(consulta);
			
			for(Equipo e:listaEquipos)
			{
				ps.setString(1, e.getNombre());
				ps.setInt(2, e.getAnhoFundacion());
				ps.setInt(3, e.getId());
				ps.addBatch();
			}
			ps.executeBatch();
			return true;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		return false;
		
	}



}// PersistenciaEquipoBBDD
