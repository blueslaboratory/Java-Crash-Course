package accesoBBDD_Ej004TiendaEnum;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AccesoDatos {

	// crearDB
	public static void crearDB(Connection con) {
		if(con == null)
			con = Conexion.conexion(ConstantesDB.URL, ConstantesDB.USER, ConstantesDB.PWD);
		
		try(Statement st = con.createStatement()){
			/*
			st.execute("drop database if exists Tienda");
			st.execute("create database Tienda");
			*/
			st.execute("use Tienda");
			
//			System.out.println("Exito al crear la DB Tienda");
			
			// Los coge de 013Ficheros/ejercicios3_fichSerializable3TiendaSol:
			/*
			st.execute("CREATE TABLE IF NOT EXISTS articulos ( \r\n" + 
					"  ClArt int(11) NOT NULL, \r\n" + 
					"  Nombre varchar(30) COLLATE utf8_spanish_ci NOT NULL, \r\n" + 
					"  Precio int(11) NOT NULL, \r\n" + 
					"  ClFab int(11) NOT NULL \r\n" + 
					") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;");
			
			System.out.println("Exito al crear la tabla articulos");
			
			
			st.execute("CREATE TABLE IF NOT EXISTS fabricantes (\r\n" + 
					"  ClFab int(3) NOT NULL,\r\n" + 
					"  Nombre varchar(30) COLLATE utf8_spanish_ci NOT NULL\r\n" + 
					") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;");
			
			System.out.println("Exito al crear la tabla fabricantes");
			*/
			
			st.execute("CREATE TABLE IF NOT EXISTS ArtFab ("
					+ "nomArt VARCHAR(30), "
					+ "nomFab VARCHAR(30), "
					+ "precio INT(11), "
					+ "iva FLOAT(11,2))"
					);
			
			System.out.println("Exito al crear la tienda Artfab");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	// rellenarTabla
	public static void rellenarTabla(Connection con, Scanner sc) {
		if(con == null)
			con = Conexion.conexion(ConstantesDB.URL, ConstantesDB.USER, ConstantesDB.PWD);
		
		String query = "SELECT articulos.nombre, fabricantes.nombre, precio FROM articulos, fabricantes "
					 + "WHERE articulos.ClFab = fabricantes.ClFab";
		
		String query2 = "INSERT INTO ArtFab VALUES (?, ?, ?, ?)";
		
		try(Statement st = con.createStatement();
			PreparedStatement pstmt = con.prepareStatement(query2)){
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				String nomArt = rs.getString(1);
				String nomFab = rs.getString(2);
				int precio = rs.getInt(3);
				
				Iva v = elegirIva(sc);
				
				while(v == null) {
					v = elegirIva(sc);
				}
				
				pstmt.setString(1, nomArt);
				pstmt.setString(2, nomFab);
				pstmt.setInt(3, precio);
				pstmt.setDouble(4, calculaIva(v));
				
				pstmt.execute();
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Iva elegirIva (Scanner sc) {
		System.out.print("Introduzca el iva a aplicar (ALTO, MEDIOALTO, MEDIOBAJO, BAJO): ");
		String resp = sc.nextLine().toUpperCase();
		try {
			Iva v = Iva.valueOf(resp);
			return v;
		} catch (Exception E) {
			System.out.println("El valor no esta en la lista de enum");
		}
		
		return null;
	}
	
	public static double  calculaIva(Iva tiposIva) {
		double result = 0;
		switch(tiposIva) {
		case ALTO:
			result = tiposIva.getI();
		case MEDIOALTO:
			result = tiposIva.getI();
		case MEDIOBAJO:
			result = tiposIva.getI();
		case BAJO:
			result = tiposIva.getI();
		}

		return result;
	}
	
	
	// printTabla
	public static void printTabla(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesDB.URL, ConstantesDB.USER, ConstantesDB.PWD);
		
		String query = "SELECT * FROM ArtFab";
		
		try(Statement st = con.createStatement()){
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString(1) +"  -  "
								  +rs.getString(2) +"  -  "
								  +rs.getInt(3) +"  -  "
								  +rs.getFloat(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
