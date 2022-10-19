package accesoBBDD_Ej004TiendaEnumSol;

import java.sql.*;

public class Tienda {
	  public static void main(String[] args) {
		  Connection conexion = null;
		  conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		  
		  AccesoDatos.borrarTablaIva(conexion);
		  AccesoDatos.crearTablaIva(conexion);          
		  AccesoDatos.insertarArtFab(conexion);
		  
		  System.out.println("\nFilas de la tabla ArtFab\n");		  
		  AccesoDatos.imprimirArtfab(conexion);
		  System.out.println();
        
   	   	  Conexion.desConexion(conexion);			   			   			     	
	   }
   
  }
