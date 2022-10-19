// Hay que crear la DB biblioteca
// Se puede hacer con las sentencias de abajo o:

// WINDOWS+R: cmd.exe
// > mysql -u root
// > show databases;
// > create database biblioteca;
 

package ejemplos033_BBDD_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TablaAutores {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost/"; //no hace falta aprenderse de memoria la cadena
		try(Connection conexion = DriverManager.getConnection(url, "root", "");
			Statement st = conexion.createStatement();
			Scanner sc = new Scanner(System.in);) {
			
			if (conexion != null)
				System.out.println("Conectados");
			
			// Si quiero iniciar todo desde el principio
			st.execute("drop database biblioteca"); // drop database if exists biblioteca
			st.execute("create database biblioteca");
			st.execute("use biblioteca");
			
			st.execute("drop table if exists autor");
			st.execute("drop table if exists libros");
			
			st.execute("create table autor(id integer primary key, nombre varchar(25), apellido varchar(25));");
			st.execute("create table libros(id integer primary key, titulo varchar(25));");
			
			
			//Inserts
			int nr, cont, inserts; 
			String cnsSQL, str1, str2;
			
			
			System.out.print("Inserts que quiere hacer en libros: ");
			inserts = Integer.parseInt(sc.nextLine());
			cont = 0;
			do {
				System.out.println("\nInsert " +(cont+1));
				System.out.print("Nombre: ");
				str1 = sc.nextLine();
				System.out.print("Apellido: ");
				str2 = sc.nextLine();
				
				
				cnsSQL="INSERT INTO autor VALUES(" +cont +",'" +str1 +"','" +str2 +"')"; 
				nr=st.executeUpdate(cnsSQL); 
				cont++;
				
			} while(cont<inserts);
			// st.executeUpdate("INSERT INTO autor VALUES(1,'Peter', 'Schiff')");
			
			System.out.print("Inserts que quiere hacer en autores: ");
			inserts = Integer.parseInt(sc.nextLine());
			cont = 0;
			do {
				System.out.println("\nInsert " +(cont+1));
				System.out.print("id: ");
				str1 = sc.nextLine();
				System.out.print("Titulo: ");
				str2 = sc.nextLine();
				
				
				cnsSQL="INSERT INTO libros VALUES(" +str1 +",'" +str2 +"')"; 
				nr=st.executeUpdate(cnsSQL); 
				cont++;
				
			} while(cont<inserts);
			// st.executeUpdate("INSERT INTO libros VALUES(1,'Libro1')");
			
			
			// Update
			cnsSQL="UPDATE autor SET nombre='Pedro' WHERE nombre='Peter'"; 
			nr=st. executeUpdate(cnsSQL);

			
			// Print Results
			System.out.println("\nPrint Query Results");
			ResultSet rs=st.executeQuery("SELECT * FROM autor");
			String misDatos;
			while(rs.next()) {
				misDatos = rs.getString("id");
				System.out.print("Leido: " +misDatos);
				misDatos = rs.getString("nombre");
				System.out.print(" " +misDatos);
				System.out.println();
			}
						
			// conexion se cierra en el try con recursos
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e);
		}
			
	}
}
