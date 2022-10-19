package ejemplos033_BBDD2_MySQL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoDatos {

	// crea BD
	public static void crearDB(Connection con) {
		if(con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try(Statement st = con.createStatement()){
			st.execute("drop database if exists PruebaPrepared");
			st.execute("create database PruebaPrepared");
			st.execute("use PruebaPrepared");
			System.out.println("***Se ha creado la BD***");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// borrar tabla Registro
	public static void borrarTablaRegistro(Connection con) {
		if(con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try(Statement st = con.createStatement()){
			st.execute("drop table if exists registro");
			System.out.println("***Se ha borrado la tabla registro***");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// crear tabla Registro
	public static void crearTablaRegistro(Connection con) {
		if(con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try(Statement st = con.createStatement()){
			st.execute("CREATE TABLE registro(usuario VARCHAR(30) PRIMARY KEY, "
										   + "email VARCHAR(30), "
										   + "fechaNac DATE)");
			System.out.println("***Se ha creado la tabla registro***");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Podriamos desconectarnos cada vez, depende de las circunstancias de la aplicacion
	}
	
	
	// RellenarAutores
	public static void rellenarRegistro(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		String insercion = "INSERT INTO registro(usuario, email, fechaNac) values (?, ?, ?)";
		
		try (PreparedStatement pstmt = con.prepareStatement(insercion);) {
			
			String user = "Lola";
			String email = "lola@email.es";
			Date date = Date.valueOf("1990-2-20"); // convertimos string en sql date
			/*
			Para convertir de LocalDate a java.sql.Date se puede usar:
			java.sql.Date.valueOf( localDate );
			Y para convertir de java.sql.Date a LocalDate:
			sqlDate.toLocalDate();
			*/
			pstmt.setString(1, user);
			pstmt.setString(2, email);
			pstmt.setDate(3, date);
			// cuidado, hay 3 formas de tratar las fechas desde la v5-v6
			
			pstmt.executeUpdate();
			
			System.out.println("Se ha rellenado el registro");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	// RellenarRegistro
	public static void rellenarRegistroGeneral(Connection con, String user, String email, Date date) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		String insercion = "INSERT INTO registro(usuario, email, fechaNac) values (?, ?, ?)";
		
		try (PreparedStatement pstmt = con.prepareStatement(insercion);) {
			
			pstmt.setString(1, user);
			pstmt.setString(2, email);
			pstmt.setDate(3, date);
			// cuidado, hay 3 formas de tratar las fechas desde la v5-v6
			
			pstmt.executeUpdate();
			
			System.out.println("Se ha rellenado el registro");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	// leerRegistrados
	public static void leerRegistrados(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		System.out.println("***Query: leerRegistrados***");
		
		// TYPE_SCROLL_SENSITIVE, si algo cambia en la BD mientra la aplicacion esta recogiendo los datos, se recoge lo modificado
		// TYPE_SCROLL_INSENSITIVE, no se recogen las modificaciones hechas mientras se esta recorriendo el ResultSet
		try (Statement st1 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//		try (Statement st1 = con.createStatement();
			 ResultSet rs = st1.executeQuery("SELECT * FROM Registro")){
			
			System.out.println("user \temail \t\tbirthdate");
			while(rs.next()) {
				System.out.println(rs.getString(1) +"\t" +rs.getString(2) +"\t" +rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// leerRegistradosPrepared
	public static void leerRegistradosPrepared(Connection con, String user) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		System.out.println("***PreparedStatement: leerRegistradosPrepared***");
		
//		try (PreparedStatement pstmt = con.prepareStatement("select * from registro where usuario = ?",
//			 ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
		try (PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Registro WHERE usuario = ?")){
			// Ya no ponemos comillas, al sustituir el valor sabe que es un String
			// el prepareStatement es el que lleva aqui la sentencia, no el execute
			
			pstmt.setString(1, user); // El 1 se refiere a la 1era interrogacion
			
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println("user \temail \t\t\tbirthdate");
			while(rs.next()) {
				System.out.println(rs.getString(1) +"\t" +rs.getString(2) +"\t" +rs.getString(3));
			}
			
//			//rs.beforeFirst();
//			// Ahora quiero empezar desde el ppio de nuevo
//			rs = pstmt.executeQuery();
//			System.out.println("user \temail \t\t\tbirthdate");
//			while (rs.next()) {
//				System.out.println(rs.getString(1) +"\t" +rs.getString(2) +"\t" +rs.getString(3));
//			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
	// modificar el email
	// recibe el nombre y el mail
	public static void cambiarMail(Connection con, String user, String email) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		System.out.println("***PreparedStatement: cambiarMail***");
		
		try (PreparedStatement pstmt = con.prepareStatement("UPDATE Registro SET email = ? WHERE usuario = ? ")){
			// Ya no ponemos comillas, al sustituir el valor sabe que es un String
			// el prepareStatement es el que lleva aqui la sentencia, no el execute
			
			pstmt.setString(1, email); // El 1 se refiere a la 1era interrogacion
			pstmt.setString(2, user); 
			
			int cambiados = pstmt.executeUpdate();
			System.out.println("Cambiados " +cambiados +((cambiados==1) ? " registro" : " registros"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// modificar el email
	// recibe el nombre y el mail
	public static void borrarRegistro(Connection con, String user) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		System.out.println("***PreparedStatement: borrarRegistro***");
		
		try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM Registro WHERE usuario = ? ")){
			// Ya no ponemos comillas, al sustituir el valor sabe que es un String
			// el prepareStatement es el que lleva aqui la sentencia, no el execute
			
			pstmt.setString(1, user); // El 1 se refiere a la 1era interrogacion
			
			int borrados = pstmt.executeUpdate();
			System.out.println("Borrados " +borrados +((borrados==1) ? " registro" : " registros"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// leer de fichero
	public static void insertarFichero(Connection con, File f) {
		String linea = "";
		String[] aStr;
		
		String user;
		String email;
		Date date; // convertimos string en sql date
		
		BufferedReader br = null;
		
		System.out.println("***Insertar desde un .txt: insertarFichero***");
		
		try {
			br = new BufferedReader(new FileReader(f));
			//linea = br.readLine();
			
			//while(linea!=null) {
			while((linea = br.readLine())!=null) {
				
				aStr = linea.split(";", 0); 
				// el 0 del 2do parametro te permite separarlo tantas veces como
				// punto y coma, ";", existan
				
				//System.out.println(aStr[0].trim() +"\t" +aStr[1].trim() +"\t" +aStr[2].trim());
				
				user = aStr[0].trim();
				email = aStr[1].trim();
				date = Date.valueOf(aStr[2].trim());
				
				//System.out.println(user +"\t" +email +"\t" +date);
				
				AccesoDatos.rellenarRegistroGeneral(con, user, email, date);
				
				//linea = br.readLine();
			}
			
			
		} catch(Exception e) {
			System.out.println("ERROR DE LECTURA" +e);
		} finally {
			try {
				if (br != null)	br.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
