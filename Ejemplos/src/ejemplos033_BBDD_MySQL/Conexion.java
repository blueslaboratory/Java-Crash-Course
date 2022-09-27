/*
Project/Properties/Java Build Path/Libraries/ClassPath
Add External Jars -> mysql-connector-java-8.0.20
G:\DOCUMENTS\DA1D1E\Programación\T10 Acceso a BBDD\Drivers

Hay que iniciar en XAMPP: Apache y MySQL
*/

package ejemplos033_BBDD_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Se carga automaticamente la clase como driver a partir del jdk7
			
			Connection conexion = null;
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/Prueba", "root","");
			if(conexion!=null)
				System.out.println("Conectados");
			conexion.close();
			
		} catch(SQLException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
