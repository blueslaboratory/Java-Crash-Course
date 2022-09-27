/*
EJERCICIO TIENDA
Utilizando la aplicación PHPMyAdmin crea una base de datos llamada Tienda con las siguientes tablas:

 

Escribe un programa en Java para conectarse a esta base de datos que:
a.- Cree una tabla de nombre ArtFab con los campos: nombre del artículo,
    nombre del fabricante, precio e iva (con 2 decimales)
b.- Rellene la tabla ArtFab con los valores correspondientes. Para el 
    campo IVA lo harás en función del precio, teniendo en cuenta:
    
	Si es > 500 se aplica un 14%
	Entre 500 y 200 (no incluido) se aplica un 12%
	Entre 200 y 100 (no incluido) se aplica un 10%
	100 ó menos se aplica un 8%

c.- Muestre el contenido de la nueva tabla ArtFab.

 */
package accesoBBDD_Ej004TiendaEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	//Conexion
	public static Connection conexion(String url, String user, String pwd) {
		try {
			Connection con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Exito en la conexion");
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void desConexion(Connection con) {
		if (con!=null) {
			try {
				con.close();
				System.out.println("Exito en la desconexion");
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
			
		
	}
}
