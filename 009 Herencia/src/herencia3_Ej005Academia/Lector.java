/*
Tenemos que hacer un programa que gestione un centro en el que 
se dispone de 5 asignaturas en las que se podran matricular los 
alumnos del centro. Cada alumno se matriculara de 3 asignaturas.

De dichos alumnos nos interesan las siguientes propiedades:
nombre, DNI, curso, grupo y asignaturas en las que se ha 
matriculado (nombre), asi como la nota que ha obtenido en cada una de ellas.

De cada asignatura queremos conocer el nombre y el precio.

Crearas el siguiente menu:

	1.Introducir Asignaturas
	2. Matricular Alumno
	3. Calificar Alumno
	4. Mostrar Asignaturas
	5. Mostrar Alumnos
	6. Salir
	
	Elija opcion: 

En la opcion 1 el programa pedira las 5 asignaturas junto con sus 
precios de que dispone el centro.

En la opcion 2 el programa pedira los datos de un alumno a 
matricular y los nombres de 3 asignaturas de las 5 disponibles.

En la opcion 3 el programa pedira los datos de un alumno a 
calificar en una determinada asignatura, de la que pedira el nombre 
y le dara una calificacion de 1 a 10 al azar.

En la opcion 4 el programa muestra las asignaturas de las que se puede 
matricular un alumno, asi como sus precios.

En la opcion 5 el programa muestra todos los alumnos junto con las 
asignaturas de las que se ha matriculado, ademas de su nota en cada 
asignatura. (Si todavia no hay nota indicara “no disponible”) y el 
precio total de la matricula.

Muestra al usuario en cada opcion los datos que ya tiene almacenado 
el programa y que le puedan ser de ayuda para realizar la tarea 
pedida y considera los mensajes a mostrar en caso de no poder 
realizar la operacion, indicando al usuario el motivo por pantalla.
*/

package herencia3_Ej005Academia;

import java.util.ArrayList;
import java.util.Scanner;

public class Lector {

	//1
	public static ArrayList<Ej001Asignatura> introAsignaturas(Scanner sc) {
		ArrayList<Ej001Asignatura> asignaturasCentro = new ArrayList<Ej001Asignatura>();
		String nombre;
		double precio;
		
		for(int i=0; i<5; i++) {
			System.out.print("Nombre de la asignatura: ");
			nombre = sc.nextLine();
			System.out.print("Precio: ");
			precio = Double.parseDouble(sc.nextLine());
			asignaturasCentro.add(new Ej001Asignatura(nombre, precio));
		}
		
		return asignaturasCentro;
	}
	
	
	//2
	public static Alumno datosAlumno(Centro c, Scanner sc) {
		String nombre, DNI, curso, grupo;
		ArrayList<Ej001Asignatura> matriculas = new ArrayList<Ej001Asignatura>();
		int opcion;
		
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("DNI: ");
		DNI = sc.nextLine();
		System.out.print("Curso: ");
		curso = sc.nextLine();
		System.out.print("Grupo: ");
		grupo = sc.nextLine();
		
		c.printAsignaturas();
		System.out.println("\nElige las 3 asignaturas a matricular");
		
		for(int i=0; i<3; i++) {
			System.out.print("Codigo de la asignatura a matricular: ");
			opcion = Integer.parseInt(sc.nextLine());
			Ej001Asignatura a = new Ej001Asignatura(c.getAsignaturasCentro().get(opcion-1));
			matriculas.add(a);
			System.out.println(a +" matriculada");
		}
		
		return new Alumno(nombre, DNI, grupo, grupo, matriculas);
	}
	
	//3
	public static void calificar(Centro c, Scanner sc) {
		double calificacion;
		int opcion, cod;
		
		c.printAlumnos();
		System.out.print("\nCodigo del alumno a calificar: ");
		opcion = Integer.parseInt(sc.nextLine());
		
		System.out.println("\nEste alumno esta matriculado en: ");
		c.getAlumnos().get(opcion-1).matriculado(); 
		
		System.out.print("Codigo de la asignatura a calificar: ");
		cod = Integer.parseInt(sc.nextLine());
		
		Ej001Asignatura calificada = c.getAlumnos().get(opcion-1).getMatriculas().get(cod-1);
		calificada.setNota(Math.random()*(10-0));
		System.out.println("Asignatura calificada");
		
	}
}
