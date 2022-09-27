package accesoBBDD_Ej004TiendaEnum;

import java.sql.Connection;
import java.util.Scanner;

public class MainTienda {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection con = Conexion.conexion(ConstantesDB.URL, ConstantesDB.USER, ConstantesDB.PWD);
		
		
		AccesoDatos.crearDB(con);
		AccesoDatos.rellenarTabla(con, sc);
		AccesoDatos.printTabla(con);
		
		Conexion.desConexion(con);
		
		
	}
}
