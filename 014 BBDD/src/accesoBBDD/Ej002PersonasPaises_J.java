/*
2º.- Se tiene la base de datos America, compuesta por las tablas Personas y 
Paises. Haz un programa en Java que cree la tabla PersonasPaises que tendra 
los siguientes atributos:

Id, Nombre, Apellido, Edad, NombrePais y Tamano.

La informacion que va almacenar es la sacada de las otras dos tablas. Tras 
crear dicha tabla, actualizarla sumando 1 a la edad de las personas de 
Costa Rica. Finalmente sacar un listado con toda la informacion de la 
nueva tabla.

*/



package accesoBBDD;

//Modelizarlo en paquetes como pidio la profe: hecho en accesoBBDD_Ej002PersonasPaises

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ej002PersonasPaises_J {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/";
		try(Connection conexion = DriverManager.getConnection(url, "root", "");
			Statement st = conexion.createStatement();
			Statement st2 = conexion.createStatement();
			Statement st3 = conexion.createStatement()) {
			
			
			if (conexion != null)
				System.out.println("Conectados");
			
			createDB(st);
			System.out.println("Exito al crear la DB");
			
			createTables(st);
			System.out.println("Exito al crear las tablas");
			
			insertDB(st);
			System.out.println("Exito al insertar en las tablas");
			
			
			// CREATE TABLE
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
			
			
			// Recorrer las tablas
			// INSERT
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
			
			System.out.println("Exito al insertar");
			
			
			// PRINT
			rs = st.executeQuery("SELECT * FROM PersonasPaises");
			while(rs.next()) {
				System.out.println(rs.getInt(1) +"\t" 
						  +rs.getString(2) +"\t"
						  +rs.getString(3) +"    \t"
						  +rs.getInt(4) +"\t"
						  +rs.getString(5) +"    \t"
						  +rs.getString(6));
			}
			
			
			// UPDATE
			System.out.println("Costarricenses en la tabla");
			
			int id, edad;
			int i = 0;
			rs = st2.executeQuery("SELECT * FROM PersonasPaises WHERE NombrePais = 'Costa Rica'");

			// hay que usar 2 st:
			// 1 para el while st2
			// 1 para el executeUpdate st
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
				st.executeUpdate(cnsSQL);
				
				i++;
			}
			
			System.out.println("Exito al actualizar la edad de los costarricenses");
			
			
			// PRINT
			rs = st2.executeQuery("SELECT * FROM PersonasPaises"); // WHERE NombrePais = 'Costa Rica'
			
			// hay que usar 2 st, porque el while se queda usando 1 st
			while(rs.next()) {
				System.out.println(rs.getInt(1) +"\t" 
						  +rs.getString(2) +"\t"
						  +rs.getString(3) +"    \t"
						  +rs.getInt(4) +"\t"
						  +rs.getString(5) +"    \t"
						  +rs.getString(6));
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
		st.execute("drop database if exists paises");
		st.execute("create database paises");
		st.execute("use paises");

	}

	// Create tables
	public static void createTables(Statement st) throws SQLException {

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
		
	}

	// Inserts
	public static void insertDB(Statement st) throws SQLException {
		// Hay que ir fila a fila, no se pueden ejecutar todas con 1 solo executeUpdate
		
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
	}
}
