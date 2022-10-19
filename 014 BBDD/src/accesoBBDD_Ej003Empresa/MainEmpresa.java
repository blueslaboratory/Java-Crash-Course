/*

3º.- Realiza un programa en Java para trabajar con la base de datos Empresa (empleados y 
   departamentos), que haga lo siguiente:
    
a. Conexion a la base de datos (carga del driver y establecimiento de conexion). 
b. Insercion de un departamento. Escribe un metodo llamado insertarDepto que 
   recibira tres argumentos (numero, nombre y localidad del departamento). 
c. Insercion de un departamento. El mismo nombre de metodo que b, pero recibiendo un 
   solo argumento: un objeto de la clase Departamento. Sera necesario por tanto, crear 
   una clase Departamento, con sus atributos y metodos getter y setter.
d. Metodo (listarDepartamentos) que devuelva un ArrayList de objetos Departamento a 
   partir de una consulta de todas las columnas de todos los departamentos de la tabla 
   departamentos.
e. Metodo (borrarDepartamento) que reciba un numero de departamento y lo de de baja.
f. Metodo (actualizarDepartamento) que reciba un numero de departamento y una localidad 
   y actualice su localidad, con ese nuevo valor.
g. Metodo (actualizarDepartamento) que reciba un objeto departamento y actualice el 
   departamento con el numero de departamento indicado a los valores dados en el objeto.
h. Metodo (devolverDepartamento) que reciba un numero de departamento y devuelva un 
   objeto con sus datos 
i. Metodo (subirSalario) que reciba una cantidad y un numero de departamento e incremente 
   el sueldo de todos los empleados de ese departamento en esa cantidad. 

(Ampliacion:)
No hacerla
j. Metodo que imprima el gestor de base de datos empleado, el driver utilizado y el usuario 
   conectado.
k. Metodo que imprima del esquema actual todas las tablas y vistas que contiene, indicando 
   ademas del nombre, si se trata de una tabla o una vista.
l. Metodo que reciba una consulta (p.ej. SELECT * FROM departamentos) e imprima el numero 
   de columnas recuperadas, y por cada columna el nombre, tipo, tamano y si admite o no nulos.

*/

package accesoBBDD_Ej003Empresa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainEmpresa {
	
	public static void main(String[] args) {
		// En un prepared statement las interrogaciones se ponen en los campos, no en la select
		
		//a
		Connection con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.ROOT, ConstantesBD.PWD);
		
		AccesoDatos.createDB(con);
		AccesoDatos.createTables(con);
		AccesoDatos.insertDB(con);
		
		AccesoDatos.printDepartamentos(con);
		AccesoDatos.printEmpleados(con);
		
		
		//b
		AccesoDatos.insertarDepto(con, 99, "ANALISIS", "EEUU");
		AccesoDatos.printDepartamentos(con);
		
		
		//c
		Departamento d = new Departamento(50, "DISEGNO", "ITELIA");
		AccesoDatos.insertarDepto(con, d);
		AccesoDatos.printDepartamentos(con);
		
		
		//d
		System.out.println("***Departamentos en un array***");
		System.out.println(AccesoDatos.listarDepartamentos(con));
		
		
		//e
		AccesoDatos.borrarDepartamento(con, 99);
		AccesoDatos.borrarDepartamento(con, 51);
		AccesoDatos.printDepartamentos(con);
		
		
		//f
		AccesoDatos.actualizarDepartamento(con, 50, "BERLIN");
		AccesoDatos.printDepartamentos(con);
		
		
		//g
		d = new Departamento(50, "HACKING", "RUSIA");
		AccesoDatos.actualizarDepartamento(con, d);
		AccesoDatos.printDepartamentos(con);
		
		
		//h
		System.out.println(AccesoDatos.devolverDepartamento(con, 50));
		System.out.println(AccesoDatos.devolverDepartamento2(con, 30));
		
		
		//i
		AccesoDatos.printEmpleados(con);
		AccesoDatos.subirSalario(con, 20, 1000);
		AccesoDatos.printEmpleados(con);
		
		
		Conexion.desConexion(con);
	}

	

}
