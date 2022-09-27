package ejemplos033_BBDD_MySQL;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreacionTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String url = "jdbc:mysql://localhost/Prueba";
			//Class.forName("com.mysql.jdbc.Driver");
			
			//Connection y Statement se podrian meter en un try con recursos
			Connection conexion = null;
			conexion = DriverManager.getConnection(url, "root", "");
			
			if(conexion!=null)
				System.out.println("Conectados");
			
			// Tiene que estar creada ya la conexion para crear sentencia
			Statement st = conexion.createStatement();
			st.execute("create table datos(descripcion varchar(100), primary key(descripcion));");
			
			if (conexion != null)
				conexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}