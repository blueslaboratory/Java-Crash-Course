/*
Ejercicio 1 - PAR / IMPAR
Escribe una clase con un metodo que en funcion de un dato saque por consola los impares
entre 1 y 10 o los pares entre 1 y 10.
Genera 2 hilos de la clase, uno para que genere los pares y otro para generar los impares.
Prueba y documenta varias respuestas
*/

package practica1;

import java.util.Scanner;

public class Ej001_MainParesImpares {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		
		// MENU
		System.out.println("***** MENU *****");
		System.out.println("  1. Pares");
		System.out.println("  2. Impares");
		System.out.println("  3. Pares e impares a la vez");
		
		do {
			System.out.print("\nOpcion: ");
			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Introduzca 1, 2 o 3");
			}
			
			if(opcion!=1 && opcion!=2 && opcion!=3)
				System.out.println("Introduzca 1, 2 o 3");
			
		} while(opcion!=1 && opcion!=2 && opcion!=3);
		
		
		// opcion=1
		if(opcion==1) {
			Ej001_Pares pares = new Ej001_Pares("", 1);
			// Con extends Thread
			pares.start();
		}
		
		// opcion=2
		if(opcion==2) {
			Ej001_Impares impares = new Ej001_Impares("", 1);
			// Con implements Runnable
			new Thread(impares).start();
		}
		
		// opcion=3
		if(opcion==3) {
			Ej001_Pares pares = new Ej001_Pares("", 1);
			Ej001_Impares impares = new Ej001_Impares("", 1);
			
			pares.start();
			new Thread(impares).start();
		}
		
	}
	
}
