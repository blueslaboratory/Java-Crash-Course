package ejemplos033_BBDD2_MySQL;

import java.io.File;
import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String FICH = "registro.txt";
		File f = new File(FICH);
		
		String user = "Lola";
		Connection con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		
		AccesoDatos.crearDB(con);
		
		AccesoDatos.borrarTablaRegistro(con);
		AccesoDatos.crearTablaRegistro(con);
		
		AccesoDatos.rellenarRegistro(con);
		AccesoDatos.leerRegistrados(con);
		
		AccesoDatos.cambiarMail(con, user, "lolita@nabokov.es");
		AccesoDatos.leerRegistradosPrepared(con, user);
		
		AccesoDatos.borrarRegistro(con, user);
		AccesoDatos.leerRegistrados(con);
		
		AccesoDatos.insertarFichero(con, f);
		AccesoDatos.leerRegistrados(con);
		
		AccesoDatos.borrarTablaRegistro(con);
		
		Conexion.desConexion(con);
		
	}

}
