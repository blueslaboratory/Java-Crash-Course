package accesoBBDD_Ej003Empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoDatos {

	// Crea BD
	public static void createDB(Connection con) {
		if(con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try(Statement st = con.createStatement()){
			// Si quiero iniciar todo desde el principio
			st.execute("DROP DATABASE IF EXISTS EMPRESA");
			st.execute("CREATE DATABASE EMPRESA");
			st.execute("USE EMPRESA");
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
			st.execute("drop table if exists departamentos");
			st.execute("CREATE TABLE departamentos (" + 
					" 	dept_no  NUMERIC(2) NOT NULL PRIMARY KEY, " + 
					" 	dnombre  VARCHAR(15), " + 
					" 	loc      VARCHAR(15) " + 
					"	);");
					
			st.execute("drop table if exists empleados");
			st.execute("CREATE TABLE empleados ( " + 
					" 	emp_no    NUMERIC(4) NOT NULL PRIMARY KEY, " + 
					"	apellido  VARCHAR(10), " + 
					" 	oficio    VARCHAR(10), " + 
					" 	dir       NUMERIC, " + 
					" 	fecha_alt DATE, " + 
					" 	salario   FLOAT(6,2), " + //FLOAT(2.2)
					" 	comision  FLOAT(6,2), " + //FLOAT(2.2)
					" 	dept_no   NUMERIC(2), " + 
					" 	CONSTRAINT FK_EMPLEADOS_DEPARTAMENTOS FOREIGN KEY (dept_no) REFERENCES departamentos(dept_no) " + 
					");");

			System.out.println("Exito al crear las tablas Departamentos y Empleados");
			
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
			// INSERT departamentos Y empleados
			st.executeUpdate("INSERT INTO departamentos VALUES (10,'CONTABILIDAD','SEVILLA');");
			st.executeUpdate("INSERT INTO departamentos VALUES (20,'INVESTIGACION','MADRID');");
			st.executeUpdate("INSERT INTO departamentos VALUES (30,'VENTAS','BARCELONA');");
			st.executeUpdate("INSERT INTO departamentos VALUES (40,'PRODUCCION','BILBAO');");
			
			st.executeUpdate("INSERT INTO empleados VALUES (7369,'SANCHEZ','EMPLEADO',7902,'1990/12/17',1040,NULL,20);");
			st.executeUpdate("INSERT INTO empleados VALUES (7499,'ARROYO','VENDEDOR',7698,'1990/02/20',1500,390,30);");
			st.executeUpdate("INSERT INTO empleados VALUES (7521,'SALA','VENDEDOR',7698,'1991/02/22',1625,650,30);");
			st.executeUpdate("INSERT INTO empleados VALUES (7566,'JIMENEZ','DIRECTOR',7839,'1991/04/02',2900,NULL,20);");
			st.executeUpdate("INSERT INTO empleados VALUES (7654,'MARTIN','VENDEDOR',7698,'1991/09/29',1600,1020,30);");
			st.executeUpdate("INSERT INTO empleados VALUES (7698,'NEGRO','DIRECTOR',7839,'1991/05/01',3005,NULL,30);");
			st.executeUpdate("INSERT INTO empleados VALUES (7782,'CEREZO','DIRECTOR',7839,'1991/06/09',2885,NULL,10);");
			st.executeUpdate("INSERT INTO empleados VALUES (7788,'GIL','ANALISTA',7566,'1991/11/09',3000,NULL,20);");
			st.executeUpdate("INSERT INTO empleados VALUES (7839,'REY','PRESIDENTE',NULL,'1991/11/17',4100,NULL,10);");
			st.executeUpdate("INSERT INTO empleados VALUES (7844,'TOVAR','VENDEDOR',7698,'1991/09/08',1350,0,30);");
			st.executeUpdate("INSERT INTO empleados VALUES (7876,'ALONSO','EMPLEADO',7788,'1991/09/23',1430,NULL,20);");
			st.executeUpdate("INSERT INTO empleados VALUES (7900,'JIMENO','EMPLEADO',7698,'1991/12/03',1335,NULL,30);");
			st.executeUpdate("INSERT INTO empleados VALUES (7902,'FERNANDEZ','ANALISTA',7566,'1991/12/03',3000,NULL,20);");
			st.executeUpdate("INSERT INTO empleados VALUES (7934,'MUNOZ','EMPLEADO',7782,'1992/01/23',1690,NULL,10);");
			st.executeUpdate("INSERT INTO empleados VALUES (7901,'LOPEZ','ANALISTA',7782,'1993/02/23',1000,1000,10);");
									
			System.out.println("Exito al insertar en las tablas Departamentos y Empleados");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	// print Departamentos
	public static void printDepartamentos(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		System.out.println("***Tabla de departamentos***");
		try (Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery("SELECT * FROM departamentos");){
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) +"\t" 
						  +rs.getString(2) +"  \t"
						  +rs.getString(3) +"\t");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	// print Empleados
	public static void printEmpleados(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		System.out.println("***Tabla de empleados***");
		try (Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery("SELECT * FROM empleados");){
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) +"\t" 
						  +rs.getString(2) +"      \t"
						  +rs.getString(3) +"\t"
						  +rs.getInt(4) +"\t"
						  +rs.getDate(5) +"\t"
						  +rs.getFloat(6) +"\t"
						  +rs.getFloat(7) +"\t"
						  +rs.getInt(8) +"\t"
						  );
			}
			
			/*
			 * Es mejor guardar valores numericos en variables String cuando
			 * es algo como un numero de telefono porque ocupa menos espacio 
			 */
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//b. Insercion de un departamento. Escribe un metodo llamado insertarDepto que 
	//   recibira tres argumentos (numero, nombre y localidad del departamento).
	public static void insertarDepto(Connection con, int n, String nom, String loc) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO departamentos VALUES ( ?, ?, ?);")){
			// Ya no ponemos comillas, al sustituir el valor sabe lo que es
			// el preparedStatement es el que lleva aqui la sentencia, no el execute
			
			pstmt.setInt(1, n); // El 1 se refiere a la 1era interrogacion
			pstmt.setString(2, nom);
			pstmt.setString(3, loc);
			
			pstmt.executeUpdate(); // Para INSERTS/UPDATES/DELETE
			
			System.out.println("***Exito al insertar Departamento***");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//c. Insercion de un departamento. El mismo nombre de metodo que b, pero recibiendo un 
	//   solo argumento: un objeto de la clase Departamento. Sera necesario por tanto, crear 
	//   una clase Departamento, con sus atributos y metodos getter y setter.
	public static void insertarDepto(Connection con, Departamento d) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO departamentos VALUES ( ?, ?, ?);")){
			// Ya no ponemos comillas, al sustituir el valor sabe lo que es
			// el preparedStatement es el que lleva aqui la sentencia, no el execute
			
			pstmt.setInt(1, d.getN()); // El 1 se refiere a la 1era interrogacion
			pstmt.setString(2, d.getNom());
			pstmt.setString(3, d.getLoc());
			
			pstmt.executeUpdate(); // Para INSERTS/UPDATES/DELETE
			
			System.out.println("***Exito al insertar Departamento***");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//d. Metodo (listarDepartamentos) que devuelva un ArrayList de objetos Departamento a 
	//   partir de una consulta de todas las columnas de todos los departamentos de la tabla 
	//   departamentos.
	public static ArrayList<Departamento> listarDepartamentos(Connection con) {
		ArrayList<Departamento> aDepto = new ArrayList<Departamento>();
		
		try (Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery("SELECT * FROM departamentos");){
			
			while(rs.next()) {
				Departamento d = new Departamento(rs.getInt(1), rs.getString(2), rs.getString(3));
				aDepto.add(d);
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return aDepto;
	}
	
	
	//e. Metodo (borrarDepartamento) que reciba un numero de departamento y lo de de baja.
	public static void borrarDepartamento(Connection con, int n) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM departamentos WHERE dept_no = ? ")){
			// Ya no ponemos comillas, al sustituir el valor sabe lo que es
			// el prepareStatement es el que lleva aqui la sentencia, no el execute
			
			pstmt.setInt(1, n); // El 1 se refiere a la 1era interrogacion
			pstmt.executeUpdate();
			
			System.out.println("***Exito al borrar el departamento " +n +"***");
				
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	//f. Metodo (actualizarDepartamento) que reciba un numero de departamento y una localidad 
	//   y actualice su localidad, con ese nuevo valor.
	public static void actualizarDepartamento(Connection con, int n, String loc) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try (PreparedStatement pstmt = con.prepareStatement("UPDATE departamentos SET loc= ? WHERE dept_no = ? ")){
			// Ya no ponemos comillas, al sustituir el valor sabe lo que es
			// el prepareStatement es el que lleva aqui la sentencia, no el execute
			
			pstmt.setString(1, loc); // El 1 se refiere a la 1era interrogacion
			pstmt.setInt(2, n);
			pstmt.executeUpdate();
			
			System.out.println("***Exito al actualizar la localidad del departamento " +n +"***");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//g. Metodo (actualizarDepartamento) que reciba un objeto departamento y actualice el 
	//   departamento con el numero de departamento indicado a los valores dados en el objeto.
	public static void actualizarDepartamento(Connection con, Departamento d) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		try (PreparedStatement pstmt = con.prepareStatement("UPDATE departamentos SET loc = ? , dnombre = ? WHERE dept_no = ? ")){
			// Ya no ponemos comillas, al sustituir el valor sabe lo que es
			// el prepareStatement es el que lleva aqui la sentencia, no el execute
			
			pstmt.setString(1, d.getLoc()); // El 1 se refiere a la 1era interrogacion
			pstmt.setString(2, d.getNom());
			pstmt.setInt(3, d.getN());
			pstmt.executeUpdate();
			
			System.out.println("***Exito al actualizar el departamento " +d.getN() +"***");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//h. Metodo (devolverDepartamento) que reciba un numero de departamento y devuelva un 
	//   objeto con sus datos	
	public static Departamento devolverDepartamento(Connection con, int n) {
		Departamento d = null;
		
		try (Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery("SELECT * FROM departamentos WHERE dept_no = " +n)) {
			
			while(rs.next()) {
				d = new Departamento(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return d;
	}
	public static Departamento devolverDepartamento2(Connection con, int n) {
		Departamento d = null;
		
		try (PreparedStatement pstmt = con.prepareStatement("SELECT * FROM departamentos WHERE dept_no = ? ")) {
			
			pstmt.setInt(1, n);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				d = new Departamento(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return d;
	}
	
	
	//i. Metodo (subirSalario) que reciba una cantidad y un numero de departamento e incremente 
	//   el sueldo de todos los empleados de ese departamento en esa cantidad.
	public static void subirSalario(Connection con, int n, float cantidad) {
		
		try (PreparedStatement pstmt = con.prepareStatement("SELECT emp_no, salario FROM empleados WHERE dept_no = ? ");
			 PreparedStatement pstmt2 = con.prepareStatement("UPDATE empleados SET salario = ? WHERE emp_no = ? ")) {
			
			pstmt.setInt(1, n);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//System.out.println(cantidad+rs.getFloat(2));
				
				pstmt2.setFloat(1, cantidad+rs.getFloat(2));
				pstmt2.setInt(2, rs.getInt(1));
				pstmt2.executeUpdate();
				
			}
			
			System.out.println("Se ha incrementado el salario del depto " +n +" en " +cantidad +"$");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	
}
