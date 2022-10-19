package ejemplos033_BBDD1_MySQL;

import java.sql.*; 

public class Main {

	public static void main(String[] args) {
		
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		System.out.println("\n");
		AccesoDatos.borrarAutores(conexion);
		AccesoDatos.crearTablaAutores(conexion);
		AccesoDatos.rellenarAutores(conexion);

		System.out.println("\n");
		AccesoDatos.mostrarAutores(conexion);
		
		System.out.println("\n");
		AccesoDatos.mostrarAutoresPrepared(conexion, "Miguel");

		System.out.println("\n");
		Conexion.desConexion(conexion);		
	}

}
