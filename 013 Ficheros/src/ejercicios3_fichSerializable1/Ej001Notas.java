/*
1.- Realiza un programa en JAVA en el que se le pida al usuario 
notas de asignaturas y se guarden en un fichero cuando ya se 
hayan introducido todas las notas.
Posteriormente se leera el fichero y se calculara la nota media del curso.
Cada una de las asignaturas sera un objeto que se encuentra en una lista, 
y cuyos atributos seran el nombre y la nota.
El usuario establecera el nombre de la asignatura mediante un metodo que 
pedira el nombre de la asignatura. El atributo nota, tambien sera el usuario 
quien lo introduzca mediante un metodo que controle que la nota tenga 
un valor entre 0 y 10.

Ejemplo de ejecucion:

Por favor, introduzca el nombre de la asignatura: Programacion.
Introduzca la nota de Programacion: 8,5
¿Desea introducir otra asignatura? SI
Por favor, introduzca el nombre de la asignatura: Lenguajes de Marcas.
Introduzca la nota de Lenguajes de Marcas: 9
¿Desea introducir otra asignatura? SI
Por favor, introduzca el nombre de la asignatura: Bases de Datos
Introduzca la nota de Bases de Datos: 8
¿Desea introducir otra asignatura? NO
***** Notas almacenadas en la lista *****
……………… Volcando la lista al fichero…………….
***** Volcado finalizado con exito *****
………Leyendo el fichero (mostramos los datos) y calculando media…………….
Su nota media del curso es de: 8,5

*/

package ejercicios3_fichSerializable1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Ej001Notas {
	final static String NOM_FICH = "notas.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ej001Asignatura> asignaturas = new ArrayList<Ej001Asignatura>();
		Scanner sc = new Scanner(System.in);
		char r;
		
		do {
			Ej001Asignatura a = introAsignatura(sc);
			
			System.out.print("Introducir otra asignatura (s/n): ");
			r = sc.nextLine().charAt(0);
			
			asignaturas.add(a);
		} while(r=='s');
		
		System.out.println("\n***** Notas almacenadas en la lista *****");
		System.out.println("……………… Volcando la lista al fichero…………….");
		
		
		// Escritura del objeto en un fichero
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOM_FICH))) {
			oos.writeObject(asignaturas);
		} catch (IOException ex) {
			System.out.println(ex);
		}

		System.out.println("\n***** Volcado finalizado con exito *****");
		System.out.println("………Leyendo el fichero y calculando media………");
		// Lectura del objeto en un fichero
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH))) {
			ArrayList<Ej001Asignatura> arrayAux = (ArrayList<Ej001Asignatura>) ois.readObject();
			float acum = 0;
			int cont = 0;
			
			for(Ej001Asignatura a : arrayAux) {
				acum += a.getNota();
				cont++;
			}
			
			System.out.println("\nSu nota media del curso es: " +acum/cont);
			
		} catch (EOFException ex) {
			// System.out.println(ex);
			// La captura siempre cuando termina de leer
			// pero no se suele mostrar
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	public static Ej001Asignatura introAsignatura(Scanner sc) {
		String nombre;
		float nota = -1;
		
		System.out.print("Nombre de la asignatura: ");
		nombre = sc.nextLine();
		
		do {
			try {
				System.out.print("Nota (0-10): ");
				nota = Float.parseFloat(sc.nextLine());
			} catch (NumberFormatException e ) {
				System.out.println("Introduzca un numero decimal (0-10)");
				System.out.println(e.getMessage());
			}
		} while(nota<0 || nota>10);
		
		return new Ej001Asignatura(nombre, nota);
	}

}
