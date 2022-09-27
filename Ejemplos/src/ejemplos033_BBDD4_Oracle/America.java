package ejemplos033_BBDD4_Oracle;

import java.sql.*;

public class America {
	  public static void main(String[] args) {
		  Connection conexion = null;
		  
		  conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
     
          AccesoDatos.borrarPersonasPaises(conexion);
          AccesoDatos.crearPersonasPaises(conexion);
          AccesoDatos.actualizarPersonasPaises(conexion);
          AccesoDatos.imprimirPersonasPaises(conexion);
          
   	   	  Conexion.desConexion(conexion);			   			   			     
	
	   }
   
  }
