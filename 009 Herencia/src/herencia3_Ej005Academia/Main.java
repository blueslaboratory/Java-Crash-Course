/*
Tenemos que hacer un programa que gestione un centro en el que 
se dispone de 5 asignaturas en las que se podran matricular los 
alumnos del centro. Cada alumno se matriculara de 3 asignaturas.

De dichos alumnos nos interesan las siguientes propiedades:
nombre, DNI, curso, grupo y asignaturas en las que se ha 
matriculado (nombre), asi como la nota que ha obtenido en cada una de ellas.

De cada asignatura queremos conocer el nombre y el precio.

Crearas el siguiente menu:

	1. Introducir Asignaturas
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

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Centro c = new Centro();
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
			opcion = menu(sc);
			switch(opcion) {
				case 1:
					c.setAsignaturasCentro(Lector.introAsignaturas(sc));
					break;
				case 2:
					c.addAlumno(Lector.datosAlumno(c, sc));
					break;
				case 3:
					Lector.calificar(c, sc);
					break;
				case 4:
					c.printAsignaturas();
					break;
				case 5:
					c.printAlumnos();
					break;
				case 6:
					break;
			}
		} while(opcion!=6);
		
	}
	
	public static int menu(Scanner sc) {
		int opcion;
		
		System.out.println("\n*****************************");
		System.out.println("BIENVENIDO A LA ACADEMIA");
		System.out.print("\n1. Introducir Asignaturas" 
						+"\n2. Matricular Alumno" 
						+"\n3. Calificar Alumno" 
						+"\n4. Mostrar Asignaturas" 
						+"\n5. Mostrar Alumnos" 
						+"\n6. Salir" 
						+"\n\nElija opcion: ");
		
		opcion = Integer.parseInt(sc.nextLine());
		return opcion;
	}
}
