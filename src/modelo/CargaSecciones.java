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
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	

	}

	Conexion miConexion;
	
	private ResultSet rs; 

}
