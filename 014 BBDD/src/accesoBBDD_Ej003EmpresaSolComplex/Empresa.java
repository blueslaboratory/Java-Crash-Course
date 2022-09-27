package accesoBBDD_Ej003EmpresaSolComplex;

import java.sql.*;
import java.util.*;

public class Empresa {
	  public static void main(String[] args) {
		  Connection conexion = null;
		  
		  conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);		 
                  
          ArrayList <Departamento> lista;
                    
          System.out.println("d.- Lista de departamentos en un ArrayList");
          System.out.println("\nNombre Depto " + "\tLocalidad " + "\tNúmero Depto ");
          
          lista = AccesoDatos.listarDepartamentos(conexion);
          System.out.println(lista);
          
          System.out.println("b.- Insertar un departamento.");
          AccesoDatos.insertarDepartamento(60, "RRHH", "Madrid", conexion);
          
          System.out.println("c.- Insertar un objeto departamento.");
          Departamento dpt2 = new Departamento(70, "Informatica", "Barcelona");
          AccesoDatos.insertarDepartamento(dpt2,conexion);
                  
          System.out.println("d.- Lista de departamentos en un ArrayList");
         
          System.out.println("\nNombre Depto " + "\tLocalidad " + "\tNúmero Depto ");
          
          lista = AccesoDatos.listarDepartamentos(conexion);
          System.out.println(lista);
          
          System.out.println("e.- Borrar un departamento");
          AccesoDatos.borrarDepartamento(60,conexion);
          System.out.println("Borrado el departamento 60\n");
          lista = AccesoDatos.listarDepartamentos(conexion);
          System.out.println(lista);
                  
          System.out.println("f.- Actualizar localidad de un departamento");
          AccesoDatos.actualizarDepartamento(70,"Valencia",conexion);
          System.out.println("Actualizado a VALENCIA el departamento 70");
          
          System.out.println("h.- Devolver un departamento (objeto)");
          Departamento dpt = AccesoDatos.devolverDepartamento(40,conexion);
          System.out.println(dpt);
                   
          System.out.println("g.- Actualizar un departamento con los datos de un objeto pasado.");
          dpt.setNumDep(50);// el departamento 70 pasa a tener los mismos datos que el 40
          AccesoDatos.actualizarDepartamento(dpt, conexion);
          System.out.println("El departamento 50 pasa a tener los mismos datos que el 40\n");
          
       // Los vuelvo a cargar en la lista
          lista = AccesoDatos.listarDepartamentos(conexion);
          System.out.println(lista);
               
          System.out.println("i.- Subir el sueldo a todos los trabajadores de un departamento.");
          AccesoDatos.subirSalario(200,30,conexion);
          System.out.println("200 euros más salario del depto 30\n");
	      
          System.out.println("EMPLEADOS");
          AccesoDatos.listarEmpleados(conexion);
          
	       // Mostramos MetaDatos:
          AccesoMetaDatos.verInfo(conexion);
          AccesoMetaDatos.infoTablas("empresa","empresa",conexion);
          AccesoMetaDatos.infoConsulta("SELECT * FROM empleados, departamentos where empleados.dept_no=departamentos.dept_no",conexion);
       
   	   	  Conexion.desConexion(conexion);			   			   			     
	
	   }
   
  }
