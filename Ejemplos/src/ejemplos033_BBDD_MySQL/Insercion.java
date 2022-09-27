package ejemplos033_BBDD_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insercion {
	public static void main(String args[]) {
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = null;
			String conn = "jdbc:mysql://localhost/Prueba";
			conexion = DriverManager.getConnection(conn, "root", "");
			
			if (conexion != null)
				System.out.println("Conectados");

			Statement st = conexion.createStatement();
			// Tiene que estar creada ya la conexion para crear sentencia
			// Si no hubiera borrado la bd arriba, puedo borrar la tabla si existiera (en mySQL)

			st.execute("drop table if exists datos");
			st.execute("create table datos(descripcion varchar(100), primary key(descripcion))");

			int n = st.executeUpdate("insert into datos values('Esto es una prueba')");
//			String str = "insert into datos values";
//			n = st.executeUpdate(str +"('Esta es la 2da prueba')");
			
			System.out.println("Devuelto el valor n = " +n);

			if (conexion != null)
				conexion.close();

//		} catch (ClassNotFoundException e) {
//			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
