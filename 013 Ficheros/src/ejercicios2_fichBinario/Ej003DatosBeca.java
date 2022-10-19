/*
3.- Realiza un programa que lea de teclado los siguientes datos y los 
	almacene en un fichero binario llamado "datosbeca.bin".
	- Nombre y apellido de un supuesto becario.
	- Genero (M-F)
	- Edad (20-60)
	- Numero de suspensos del curso anterior (0-4).
	- Residencia familiar (SI o NO)
	- Ingresos anuales de la familia.
*/

package ejercicios2_fichBinario;

import java.io.*;
import java.util.*;

public class Ej003DatosBeca {
	final static String FICHERO = "datosbeca.bin";


	public static void main(String[] args) {
		crearFichero();
	}
	
	
	public static void crearFichero() {
		
		Scanner sc = new Scanner(System.in);
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO, true))) {
			char seguir = 's';
			// Suponemos que al menos se escribira un alumno
			do {
				System.out.println("Datos del nuevo alumno");
				escribirFichero(dos, sc);
				
				System.out.println();
				System.out.print("Desea introducir nuevos alumnos (s/n): ");
				seguir = sc.nextLine().charAt(0);
			} while (seguir == 's');

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	
	public static void escribirFichero(DataOutputStream dos, Scanner sc) throws Exception {
		String nombre;
		int ingresos;

		System.out.print("Nombre y apellidos: ");
		nombre = sc.nextLine();
		dos.writeUTF(nombre);

		// como despues leemos strings, lo guardamos como String
		dos.writeUTF(validarGenero(sc)); 
		dos.writeInt(validarEdad(sc));
		dos.writeInt(validarSuspensos(sc));
		dos.writeUTF(validarResiFamiliar(sc));
		
		System.out.print("Ingresos anuales familiares: ");
		ingresos = Integer.parseInt(sc.nextLine());
		dos.writeInt(ingresos);
	}

	
	public static int validarSuspensos(Scanner sc) {
		int suspensos;

		do {
			System.out.print("Numero de suspensos: ");
			suspensos = Integer.parseInt(sc.nextLine());
			if ((suspensos < 0) || (suspensos > 4)) {
				System.out.println("numero de suspensos erroneo");
			}
		} while ((suspensos < 0) || (suspensos > 4));

		return suspensos;
	}

	
	public static String validarResiFamiliar(Scanner sc) {
		String resiFamiliar;

		do {
			System.out.print("Residencia familiar (s/n): ");
			resiFamiliar = sc.nextLine();
			if ((!resiFamiliar.equalsIgnoreCase("s")) && (!resiFamiliar.equalsIgnoreCase("n"))) {
//			if (!((resiFamiliar.equalsIgnoreCase("s")) || (resiFamiliar.equalsIgnoreCase("n")))) {
				System.out.println("Error caracter");
			}
		} while ((!resiFamiliar.equalsIgnoreCase("s")) && (!resiFamiliar.equalsIgnoreCase("n")));
		
		return resiFamiliar;
	}

	
	public static int validarEdad(Scanner sc) {
		int edad;

		do {
			System.out.print("Edad: ");
			edad = Integer.parseInt(sc.nextLine());

			if ((edad < 20) || (edad > 60)) {
				System.out.println("edad erronea");
			}

		} while ((edad < 20) || (edad > 60));
		return edad;
	}

	
	public static String validarGenero(Scanner teclado) {
		char genero;

		do {
			System.out.print("Introduce el genero (m/f): ");
			genero = teclado.nextLine().charAt(0);
			if (!(genero == 'm') && !(genero == 'f')) {
				System.out.println("error caracter");
			}
			
		} while (!(genero == 'm') && !(genero == 'f'));
		return ""+genero; //String.valueOf(genero)
	}
}