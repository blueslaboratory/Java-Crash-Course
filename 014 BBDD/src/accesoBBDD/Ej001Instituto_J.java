/* 
 * IMPORTANTE: HAY QUE CARGAR EL DRIVER
 * Project/Properties/Java Build Path/Class Path/Add external JAR
 * mysql-connector-java-8.0.20.jar
 */

/*
1º.- Crea la base de datos Instituto, cuyas tablas y valores se encuentran en 
el fichero instituto.sql. Una vez creada la base de datos haz un programa en 
Java que cree una nueva tabla llamada NotasFinales que tendra la siguiente 
estructura: 
	NotasFinales(Mat, Cod, NotaMedia); 

Y cuyos valores se sacaran de la tabla Notas. 

Por ultimo, se imprimira un listado de todos los alumnos con el siguiente formato: 
	Nombre Alumno  Nombre Asignatura  Nota 1 Nota 2 Nota 3  NotaMedia 
*/


package accesoBBDD;

// Modelizarlo en paquetes como pidio la profe: hecho en accesoBBDD_Ej001Notas


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ej001Instituto_J {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/";
		try(Connection conexion = DriverManager.getConnection(url, "root", "");
			Statement st = conexion.createStatement();
			Statement st2 = conexion.createStatement()) {
			
			if (conexion != null)
				System.out.println("Conectados");
			
			createDB(st);
			System.out.println("Exito al crear la DB");
			
			createTables(st);
			System.out.println("Exito al crear las tablas");
			
			insertDB(st);
			System.out.println("Exito al insertar en las tablas");
			System.out.println();
			
			// NotasFinales(Mat, Cod, NotaMedia);
			st.execute("DROP TABLE IF EXISTS NotasFinales");
			st.execute("CREATE TABLE NotasFinales ("
						+ "MAT VARCHAR(10),"
						+ "COD tinyint(2),"
						+ "notaMedia FLOAT(2.2) DEFAULT NULL,"
						+ "PRIMARY KEY (MAT, COD),"
						+ "FOREIGN KEY (MAT) REFERENCES ALUMNOS (MAT) ON DELETE CASCADE,"
						+ "FOREIGN KEY (COD) REFERENCES ASIGNATURAS (COD))");
			
			
			// recorrer notas
			ResultSet rs;
			rs = st2.executeQuery("SELECT * FROM NOTAS"); 
			
			String mat;
			int cod;
			int n1, n2, n3, cont=0;
			float avg;
			
			// hay que usar 2 ST, porque el while se queda usando 1 st
			while(rs.next()) {
				mat=rs.getString("MAT");
				cod=rs.getInt("COD");
				n1=rs.getInt("NOTA1");
				n2=rs.getInt("NOTA2");
				n3=rs.getInt("NOTA3");
				
				avg=(n1+n2+n3)/3;
				System.out.println(cont++ +" Media: " +avg);
				
				st.executeUpdate("INSERT INTO NotasFinales VALUES('" +mat +"'," +cod +"," +avg +")");
				
			}
			
			// recorrer todas las tablas
			// si no le pones alias da error en el rs.getString
			// RPAD(APEL_NOM, 25, ' ') APEL_NOM, RPAD(NOMBRE, 25, ' ') NOMBRE,
			// APEL_NOM, NOMBRE,
			rs = st2.executeQuery("SELECT RPAD(APEL_NOM, 25, ' ') APEL_NOM, RPAD(NOMBRE, 25, ' ') NOMBRE, NOTA1, NOTA2, NOTA3, NOTAMEDIA "
								+ "FROM ALUMNOS, ASIGNATURAS, NOTAS, NOTASFINALES "
								
								+ "WHERE ALUMNOS.MAT = NOTAS.MAT AND "
						  		+ "ASIGNATURAS.COD = NOTAS.COD AND "
						  		
						  		+ "ALUMNOS.MAT = NOTASFINALES.MAT AND "
						  		+ "ASIGNATURAS.COD = NOTASFINALES.COD"
						  		
//						  		Este producto cartesiano no funciona:
//								+ "WHERE ALUMNOS.MAT = NOTAS.MAT = NOTASFINALES.MAT AND "
//								+ "ASIGNATURAS.COD = NOTAS.COD = NOTASFINALES.COD "						  		
						  		);
			
			// hay que usar 2 ST, porque el while se queda usando 1 st
			cont = 0;
			while(rs.next()) {
				System.out.println("\nAlumno " +cont++ +": " +rs.getString("APEL_NOM")
								  +"\n\tAsignatura: " +rs.getString("NOMBRE")
								  +"\n\tNota 1: " +rs.getInt("NOTA1")
								  +"\tNota 2: " +rs.getInt("NOTA2")
								  +"\tNota 3: " +rs.getInt("NOTA3")
								  +"\n\tNota media: " +rs.getFloat("NOTASFINALES.NOTAMEDIA")); 
			}
			
			// conexion se cierra en el try con recursos
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e);
		}
			
	}
	
	// Create DB
	public static void createDB(Statement st) throws SQLException {
		
		// Si quiero iniciar todo desde el principio
		st.execute("drop database if exists instituto"); 
		st.execute("create database instituto");
		st.execute("use instituto");
		
	}
	
	// Create tables
	public static void createTables(Statement st) throws SQLException {
		
		st.execute("drop table if exists alumnos");
		st.execute("CREATE TABLE ALUMNOS (" + 
				"  MAT  VARCHAR(10) NOT NULL  PRIMARY KEY," + 
				"  APEL_NOM  VARCHAR(30) DEFAULT NULL," + 
				"  POBLACION  VARCHAR(15) DEFAULT NULL," + 
				"  TELEFONO  VARCHAR(10) DEFAULT NULL" + 
				");");
		
		st.execute("drop table if exists asignaturas");
		st.execute("CREATE TABLE ASIGNATURAS (" + 
				"  COD  tinyint(2) NOT NULL PRIMARY KEY," + 
				"  NOMBRE  VARCHAR(25) DEFAULT NULL" + 
				");");
		
		st.execute("drop table if exists notas");
		st.execute("CREATE TABLE NOTAS (" + 
				"  MAT  VARCHAR(10) NOT NULL," + 
				"  COD  tinyint(2) NOT NULL DEFAULT '0'," + 
				"  NOTA1 INT(2) DEFAULT NULL," + 
				"  NOTA2 INT(2) DEFAULT NULL," + 
				"  NOTA3 INT(2) DEFAULT NULL," + 
				"  PRIMARY KEY (MAT,COD)," + 
				"  FOREIGN KEY (MAT) REFERENCES ALUMNOS (MAT) ON DELETE CASCADE," + 
				"  FOREIGN KEY (COD) REFERENCES  ASIGNATURAS (COD)" + 
				");");
	}
	
	// Inserts
	public static void insertDB(Statement st) throws SQLException {
		//Hay que ir fila a fila, no se pueden ejecutar todas con 1 solo executeUpdate
		st.executeUpdate("INSERT INTO ALUMNOS VALUES ('25889878C', 'Martinez  Lopez , Manuel','SEVILLA','987755465');"); 
		st.executeUpdate("INSERT INTO ALUMNOS VALUES ('45665448K', 'Jimenez Choren, M. Isabel','CORUNA','686987785');"); 
		st.executeUpdate("INSERT INTO ALUMNOS VALUES ('45665884R', 'Ortiz Sanchez, M. Jose','VIGO','623154687');");
		st.executeUpdate("INSERT INTO ALUMNOS VALUES ('45687998X', 'Gutierrez Gomez, Elias','SANTIAGO','614658779');"); 
		st.executeUpdate("INSERT INTO ALUMNOS VALUES ('53259877Q', 'Diaz Fernandez, Pablo','MADRID','684455664');");
		st.executeUpdate("INSERT INTO ALUMNOS VALUES ('67897546S', 'Rodriguez Alonso, Juan','BARCELONA','651154465');"); 
		st.executeUpdate("INSERT INTO ALUMNOS VALUES ('68798545B', 'Fernandez Maria, Justo','MADRID','987756654');");
		
		
		st.executeUpdate("INSERT INTO ASIGNATURAS VALUES" + 
				"  (1, 'FOL')," + 
				"  (2, 'Sistemas Operativos')," + 
				"  (3, 'Lenguaje de Marcas')," + 
				"  (4, 'Programacion')," + 
				"  (5, 'Entornos de Desarrollo')," + 
				"  (6, 'Bases de datos');" 
				);
		
		st.executeUpdate("INSERT INTO NOTAS  VALUES" + 
				"  ('25889878C', 2, 6,4,7)," + 
				"  ('25889878C', 5, 5,9,3)," + 
				"  ('45665884R', 1, 8,8,7)," + 
				"  ('45665884R', 2, 8,6,6)," + 
				"  ('45665884R', 3, 3,4,2)," + 
				"  ('45687998X', 1, 6,9,6)," + 
				"  ('45687998X', 6, 4,5,3)," + 
				"  ('53259877Q', 4, 6,6,6)," + 
				"  ('53259877Q', 5, 5,7,6);" 
				);
	}
	
}