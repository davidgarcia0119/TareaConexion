package modelo;

import java.sql.*;

public class Conexion {
	
	Connection miConexion = null;
	
	public Conexion() {
		
		
		
		
		
	}
	
	public Connection dameConexion() {
		
		try {
			
		    miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tarea?serverTimezone=UTC&useSSL=false","root","");
			
		
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		
		return miConexion;
		
	}
	
	
		
	

}
