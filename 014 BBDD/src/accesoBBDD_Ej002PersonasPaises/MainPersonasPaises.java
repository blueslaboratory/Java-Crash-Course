/*
2º.- Se tiene la base de datos America, compuesta por las tablas Personas y 
Paises. Haz un programa en Java que cree la tabla PersonasPaises que tendra 
los siguientes atributos:

Id, Nombre, Apellido, Edad, NombrePais y Tamano.

La informacion que va almacenar es la sacada de las otras dos tablas. Tras 
crear dicha tabla, actualizarla sumando 1 a la edad de las personas de 
Costa Rica. Finalmente sacar un listado con toda la informacion de la 
nueva tabla.

*/

package accesoBBDD_Ej002PersonasPaises;

import java.sql.Connection;

public class MainPersonasPaises {
	
	public static void main(String[] args) {
		
		Connection con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		AccesoDatos.createDB(con);
		AccesoDatos.createTables(con);
		AccesoDatos.insertDB(con);
		AccesoDatos.printPersonasPaises(con);
//		AccesoDatos.updateStatement(con);
		AccesoDatos.updatePreparedStatement(con,"Costa Rica");
		AccesoDatos.printPersonasPaises(con);
		
		Conexion.desConexion(con);
	}

	

}
