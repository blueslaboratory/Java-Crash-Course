package accesoBBDD_Ej003Empresa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	
	// Conexion
	
	public static Connection conexion(String url, String usuario, String password) {
		// No se puede hacer un try con recursos, porque se cerraria la bd

		try {
			// Se carga automaticamente la clase como driver a partir del jdk7
			
			Connection con = null;
			con = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexion establecida");
			return con;
			
			
		} catch(SQLException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	
	// desConexion
	
	public static void desConexion(Connection con) {
		try {
			if(con!=null) {
				con.close();
				System.out.println("Desconexion");
			}
		} catch(SQLException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}