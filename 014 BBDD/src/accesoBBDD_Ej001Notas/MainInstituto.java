/* 
 * IMPORTANTE: HAY QUE CARGAR EL DRIVER
 * Project/Properties/Java Build Path/Class Path/Add external JAR
 * mysql-connector-java-8.0.20.jar
 */

/*
1º.- Crea la base de datos Instituto, cuyas tablas y valores se encuentran en 
el fichero instituto.sql. Una vez creada la base de datos haz un programa en 
Java que cree una nueva tabla llamada NotasFinales que tendra la siguiente 
estructura: 
	NotasFinales(Mat, Cod, NotaMedia); 

Y cuyos valores se sacaran de la tabla Notas. 

Por ultimo, se imprimira un listado de todos los alumnos con el siguiente formato: 
	Nombre Alumno  Nombre Asignatura  Nota 1 Nota 2 Nota 3  NotaMedia 
*/


package accesoBBDD_Ej001Notas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainInstituto {
	
	public static void main(String[] args) {
		
		Connection con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		

		AccesoDatos.createDB(con);
		AccesoDatos.createTables(con);
		AccesoDatos.insertDB(con);
		AccesoDatos.insertNotasFinales(con);
		AccesoDatos.printListado(con);
		
		Conexion.desConexion(con);
	}
}