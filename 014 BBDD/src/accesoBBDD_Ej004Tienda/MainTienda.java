package accesoBBDD_Ej004Tienda;

import java.sql.Connection;

public class MainTienda {
	public static void main(String[] args) {
		
		Connection con = Conexion.conexion(ConstantesDB.URL, ConstantesDB.USER, ConstantesDB.PWD);
		
		
		AccesoDatos.crearDB(con);
		AccesoDatos.rellenarTabla(con);
		AccesoDatos.printTabla(con);
		
		Conexion.desConexion(con);
		
		
	}
}
