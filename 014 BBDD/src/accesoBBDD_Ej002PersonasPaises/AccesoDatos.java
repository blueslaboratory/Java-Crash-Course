package accesoBBDD_Ej002PersonasPaises;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoDatos {

	// Crea BD
	public static void createDB(Connection con) {
		if(con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try(Statement st = con.createStatement()){
			// Si quiero iniciar todo desde el principio
			st.execute("drop database if exists paises");
			st.execute("create database paises");
			st.execute("use paises");
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
			// CREATE TABLE PAISES, PERSONAS
			st.execute("drop table if exists Paises");
			st.execute("Create table Paises(" + 
					"    Id tinyint primary key," + 
					"    Nombre Varchar(15)," + 
					"    Tamanio varchar(15)) Engine=InnoDB;");

			st.execute("drop table if exists Personas");
			st.execute("Create table Personas(" + 
					"    Id int primary key," + 
					"    Nombre Varchar(15)," + 
					"    Apellido varchar(15)," + 
					"    Edad tinyint," + 
					"    Pais tinyint)Engine=InnoDB;");

			st.execute("Alter Table Personas add Foreign key (Pais) References Paises(Id);");
			System.out.println("Exito al crear las tablas Paises y Personas");
			
			
			// CREATE TABLE PERSONASPAISES
			// PersonasPaises(Id, Nombre, Apellido, Edad, NombrePais, Tamano);
			st.execute("DROP TABLE IF EXISTS PersonasPaises");
			st.execute("CREATE TABLE PersonasPaises ("
						+ "Id 			int,"
						+ "Nombre 		VARCHAR(15),"
						+ "Apellido 	VARCHAR(15),"
						+ "Edad			tinyint,"
						+ "NombrePais 	VARCHAR(15),"
						+ "Tamano	 	VARCHAR(15),"
						
						+ "PRIMARY KEY 	(Id, NombrePais),"
						+ "FOREIGN KEY (Id) REFERENCES Personas (Id))"
						
						/*
						+ "FOREIGN KEY (Nombre) REFERENCES Personas (Nombre),"
						+ "FOREIGN KEY (Apellido) REFERENCES Personas (Apellido),"
						+ "FOREIGN KEY (Edad) REFERENCES Personas (Edad),"
						
						+ "FOREIGN KEY (NombrePais) REFERENCES Paises (Nombre))"
						+ "FOREIGN KEY (Tamano) REFERENCES Paises (Tamanio))"
						*/
					);
			/*
			If you really want to create a foreign key to a non-primary key, it 
			MUST be a column that has a unique constraint on it.
			
			A FOREIGN KEY constraint does not have to be linked only to a PRIMARY KEY 
			constraint in another table; it can also be defined to reference the columns 
			of a UNIQUE constraint in another table.
			*/
			
			System.out.println("Exito al crear tabla PersonasPaises");
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
		
		
		try (Statement st = con.createStatement();
			 Statement st2 = con.createStatement();) {
			// INSERT PAISES Y PERSONAS
			st.executeUpdate("Insert into Paises values (1, 'Chile', 'Grande');");
			st.executeUpdate("Insert into Paises values (2, 'Costa Rica', 'Pequenio');");
			st.executeUpdate("Insert into Paises values (3, 'Mexico', 'Mediano');");
			st.executeUpdate("Insert into Paises values (4, 'Venezuela', 'Mediano');");
			
			st.executeUpdate("Insert into Personas values (1, 'Frank', 'Malfoy', 16,1);");
			st.executeUpdate("Insert into Personas values (2, 'Alis', 'Rodriguez', 30,2);");
			st.executeUpdate("Insert into Personas values (3, 'Karen', 'Juarez', 22,1);");
			st.executeUpdate("Insert into Personas values (4, 'Andrea', 'Fernandez', 21,3);");
			st.executeUpdate("Insert into Personas values (5, 'Alesa', 'Benede', 13,4);");
			st.executeUpdate("Insert into Personas values (6, 'Henry', 'Gonzalez', 21,2);");
			st.executeUpdate("Insert into Personas values (7, 'Daniel', 'Hidalgo', 16,1);");
			st.executeUpdate("Insert into Personas values (8, 'Roy', 'Castro', 20,4);");
			st.executeUpdate("Insert into Personas values (9, 'Sabrina', 'de la Torre', 18,2);");
			
			System.out.println("Exito al insertar en las tablas Paises y Personas");
			
			
			// Recorrer las tablas
			// INSERT PERSONAS PAISES
			ResultSet rs;
			rs = st2.executeQuery("SELECT Personas.Id, Personas.Nombre, Personas.Apellido, Personas.Edad, "
									  + " Paises.Nombre, Paises.Tamanio "
								+ "FROM Personas, Paises "
								+ "WHERE Personas.Pais = Paises.Id"
								);
			
			// hay que usar 2 st, porque el while se queda usando st2
			while(rs.next()) {
				/*
				System.out.println();
				System.out.print(rs.getInt("Personas.Id") +"\t");
				System.out.print(rs.getString("Personas.Nombre") +"\t");
				System.out.print(rs.getString("Personas.Apellido") +"    \t");
				System.out.print(rs.getInt("Personas.Edad") +"\t");
				System.out.print(rs.getString("Paises.Nombre") +"    \t");;
				System.out.print(rs.getString("Paises.Tamanio") +"\t");
				*/
				
				st.executeUpdate("INSERT INTO PersonasPaises VALUES("
						+ rs.getInt("Personas.Id") +","
						+ "'" +rs.getString("Personas.Nombre") +"',"
						+ "'" +rs.getString("Personas.Apellido") +"',"
						+ rs.getInt("Personas.Edad") +"," 
						+ "'" +rs.getString("Paises.Nombre") +"',"
						+ "'" +rs.getString("Paises.Tamanio") +"'" 
						+")"
						);
			}
			
			System.out.println("Exito al insertar en la tabla PersonasPaises");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	// print PersonasPaises 
	public static void printPersonasPaises(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		
		try (Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery("SELECT * FROM PersonasPaises");){
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) +"\t" 
						  +rs.getString(2) +"\t"
						  +rs.getString(3) +"    \t"
						  +rs.getInt(4) +"\t"
						  +rs.getString(5) +"    \t"
						  +rs.getString(6));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// UPDATE STATEMENT
	// print PersonasPaises Costarricenses
	public static void updateStatement(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		int id, edad;
		int i = 0;
		
		System.out.println("Costarricenses en la tabla");
		
		try (Statement st = con.createStatement();
			 Statement st2 = con.createStatement();
			 ResultSet rs = st.executeQuery("SELECT * FROM PersonasPaises WHERE NombrePais = 'Costa Rica'");){
			
			// hay que usar 2 st:
			// 1 para el while st
			// 1 para el executeUpdate st2
			
			while(rs.next()) {
				id = rs.getInt(1);
				edad = rs.getInt(4);
				System.out.println(id +"\t" 
								  +rs.getString(2) +"\t"
								  +rs.getString(3) +"    \t"
								  +edad +"\t"
								  +rs.getString(5) +"    \t"
								  +rs.getString(6));
				
				String cnsSQL;
				cnsSQL="UPDATE PersonasPaises SET Edad='" +(edad+1) +"' WHERE Id='" +(id) +"'";
				//Poner las comillas simples '!'
				st2.executeUpdate(cnsSQL);
				
				i++;
			}
			
			System.out.println("Exito al actualizar la edad de los costarricenses");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// UPDATE PREPAREDSTATEMENT
	// print PersonasPaises Costarricenses
	public static void updatePreparedStatement(Connection con, String field) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		int id, edad;
		int i = 0;
		
		System.out.println("Costarricenses en la tabla");
		
		try (PreparedStatement pstmt = con.prepareStatement("SELECT * FROM PersonasPaises WHERE NombrePais = ? ");
			 PreparedStatement pstmt2 = con.prepareStatement("UPDATE PersonasPaises SET Edad= ? WHERE Id= ? ");){
			// Ya no ponemos comillas, al sustituir el valor sabe lo que es
			// el prepareStatement es el que lleva aqui la sentencia, no el execute
			
			pstmt.setString(1, field); // El 1 se refiere a la 1era interrogacion
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				id = rs.getInt(1);
				edad = rs.getInt(4);
				System.out.println(id +"\t" 
								  +rs.getString(2) +"\t"
								  +rs.getString(3) +"    \t"
								  +edad +"\t"
								  +rs.getString(5) +"    \t"
								  +rs.getString(6));
				
				
				pstmt2.setInt(1, (edad+1));
				pstmt2.setInt(2, id);
				
				
				//Poner las comillas simples '!'
				pstmt2.executeUpdate();
				
				i++;
			}
			
			System.out.println("Exito al actualizar la edad de los costarricenses");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
