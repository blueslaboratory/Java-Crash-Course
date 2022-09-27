package accesoBBDD_Ej004Tienda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

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
	public static void rellenarTabla(Connection con) {
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
				float iva = calculaIva(precio);
				
				pstmt.setString(1, nomArt);
				pstmt.setString(2, nomFab);
				pstmt.setInt(3, precio);
				pstmt.setFloat(4, iva);
				
				pstmt.execute();
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static float calculaIva(int precio) {
		float result = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		
		if (precio>500) {
			result = (float)(precio*0.14);
		}
		else if (precio<500 && precio>200) {
			result = (float)(precio*0.12);
		}
		else if (precio<200 && precio>100) {
			result = (float)(precio*0.1);
		}
		else if (precio<=100) {
			result = (float)(precio*0.08);
		}

		return Float.parseFloat(df.format(result).replace(',', '.'));
	}
	
	
	// printTabla
	public static void printTabla(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesDB.URL, ConstantesDB.USER, ConstantesDB.PWD);
		
		String query = "SELECT * FROM ArtFab";
		
		try(Statement st = con.createStatement()){
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString(1) +"\t"
								  +rs.getString(2) +"\t"
								  +rs.getInt(3) +"\t"
								  +rs.getFloat(4) +"\t");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
