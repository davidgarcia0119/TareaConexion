package modelo;

import java.sql.*;

import controlador.*;

public class CargaSecciones {

	public CargaSecciones(){
		
		miConexion= new Conexion();
			
	}

	public String ejecutaConsultas() {

		
		Productos miProducto=null;
		Connection accesoBBDD=miConexion.dameConexion();
		
		
		try {
			
			Statement secciones= accesoBBDD.createStatement();
			rs=secciones.executeQuery("SELECT DISTINCTROW SECCIÓN FROM PRODUCTOS");
			
			
			while(rs.next()) {
				
				rs.previous();
				miProducto=new Productos();
				miProducto.setSeccion(rs.getString(1));
				
				return miProducto.getSeccion();
					
			}
			
			
			rs.close();
			 
			 
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return miProducto.getSeccion();

	}

	Conexion miConexion;
	
	public ResultSet rs; 

}
