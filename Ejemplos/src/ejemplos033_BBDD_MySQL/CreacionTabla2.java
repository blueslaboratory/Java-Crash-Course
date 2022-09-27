package ejemplos033_BBDD_MySQL;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreacionTabla2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion = null;
		
		try {
			String url = "jdbc:mysql://localhost/Prueba";
			// Class.forName("com.mysql.jdbc.Driver";)
			
			conexion = DriverManager.getConnection(url, "root", "");
			
			if(conexion!=null)
				System.out.println("Conectados");
			
			// Tiene que estar creada ya la conexion para crear sentencia
			// Si quiero iniciar todo desde el principio
			Statement st = conexion.createStatement();
			st.execute("drop database prueba");
			st.execute("create database prueba");
			st.execute("use prueba");
			st.execute("drop table if exists datos");
			st.execute("create table datos(descripcion varchar(100), primary key(descripcion))");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conexion != null)
					conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
