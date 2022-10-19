package accesoBBDD_Ej001Notas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoDatos {

	// Create BD
	public static void createDB(Connection con) {
		if(con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try(Statement st = con.createStatement()){
			// Si quiero iniciar todo desde el principio
			st.execute("drop database if exists instituto"); 
			st.execute("create database instituto");
			st.execute("use instituto");
			System.out.println("Exito al crear la DB");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// Create tables
	public static void createTables(Connection con) {
		if(con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try(Statement st = con.createStatement()){
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
			
			
			// NotasFinales(Mat, Cod, NotaMedia);
			st.execute("DROP TABLE IF EXISTS NotasFinales");
			st.execute("CREATE TABLE NotasFinales ("
						+ "MAT VARCHAR(10),"
						+ "COD tinyint(2),"
						+ "notaMedia FLOAT(2.2) DEFAULT NULL,"
						+ "PRIMARY KEY (MAT, COD),"
						+ "FOREIGN KEY (MAT) REFERENCES ALUMNOS (MAT) ON DELETE CASCADE,"
						+ "FOREIGN KEY (COD) REFERENCES ASIGNATURAS (COD))");
			
			
			System.out.println("Exito al crear las tablas");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Podriamos desconectarnos cada vez, depende de las circunstancias de la aplicacion
	}
	
	
	// Inserts
	public static void insertDB(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try (Statement st = con.createStatement();) {
			
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
			
			System.out.println("Exito al insertar en las tablas");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	// insert Notas Finales 
	public static void insertNotasFinales(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		String mat;
		int cod;
		int n1, n2, n3, cont=0;
		float avg;
		
		try (Statement st = con.createStatement();
			 Statement st2 = con.createStatement();
			 ResultSet rs = st.executeQuery("SELECT * FROM NOTAS");){
			
			// hay que usar 2 ST, porque el while se queda usando 1 st
			while(rs.next()) {
				mat=rs.getString("MAT");
				cod=rs.getInt("COD");
				n1=rs.getInt("NOTA1");
				n2=rs.getInt("NOTA2");
				n3=rs.getInt("NOTA3");
				
				avg=(n1+n2+n3)/3;
				System.out.println(cont++ +" Media: " +avg);
				
				st2.executeUpdate("INSERT INTO NotasFinales VALUES('" +mat +"'," +cod +"," +avg +")");
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// print Listado
	public static void printListado(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		int cont=0;
		
		try (Statement st = con.createStatement();){
			
			
			// recorrer todas las tablas
			// si no le pones alias da error en el rs.getString
			// RPAD(APEL_NOM, 25, ' ') APEL_NOM, RPAD(NOMBRE, 25, ' ') NOMBRE,
			// APEL_NOM, NOMBRE,
			ResultSet rs = st.executeQuery("SELECT RPAD(APEL_NOM, 25, ' ') APEL_NOM, RPAD(NOMBRE, 25, ' ') NOMBRE, NOTA1, NOTA2, NOTA3, NOTAMEDIA "
								+ "FROM ALUMNOS, ASIGNATURAS, NOTAS, NOTASFINALES "
								
								+ "WHERE ALUMNOS.MAT = NOTAS.MAT AND "
						  		+ "ASIGNATURAS.COD = NOTAS.COD AND "
						  		
						  		+ "ALUMNOS.MAT = NOTASFINALES.MAT AND "
						  		+ "ASIGNATURAS.COD = NOTASFINALES.COD"
						  		
//								Este producto cartesiano no funciona:
//								+ "WHERE ALUMNOS.MAT = NOTAS.MAT = NOTASFINALES.MAT AND "
//								+ "ASIGNATURAS.COD = NOTAS.COD = NOTASFINALES.COD "
						  		);
			
			
			cont = 0;
			while(rs.next()) {
				System.out.println("\nAlumno " +cont++ +": " +rs.getString("APEL_NOM")
								  +"\n\tAsignatura: " +rs.getString("NOMBRE")
								  +"\n\tNota 1: " +rs.getInt("NOTA1")
								  +"\tNota 2: " +rs.getInt("NOTA2")
								  +"\tNota 3: " +rs.getInt("NOTA3")
								  +"\n\tNota media: " +rs.getFloat("NOTASFINALES.NOTAMEDIA")); 
			}
			
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
