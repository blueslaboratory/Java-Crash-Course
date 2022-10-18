/*
Ejercicio 1 - PAR / IMPAR
Escribe una clase con un metodo que en funcion de un dato saque por consola los impares
entre 1 y 10 o los pares entre 1 y 10.
Genera 2 hilos de la clase, uno para que genere los pares y otro para generar los impares.
Prueba y documenta varias respuestas
*/

package practica1;

import java.util.Scanner;

public class Ej001_ParesImparesMain {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		System.out.println("***** MENU *****");
		System.out.println("  1. Pares");
		System.out.println("  2. Impares");
		do {
			System.out.print("\nOpcion: ");
			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Introduzca 1 o 2");
			}
		} while(opcion!=1 && opcion!=2);
		
		
		if(opcion==1) {
			Ej001_Pares pares = new Ej001_Pares("", 1);
			// Con extends Thread
			pares.start();
		}
		
		if(opcion==2) {
			Ej001_Impares impares = new Ej001_Impares("", 1);
			// Con implements Runnable
			new Thread(impares).start();
		}
		
	}
	
}
