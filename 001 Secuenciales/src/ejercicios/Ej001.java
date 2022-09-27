//Escribir un programa que pregunte al usuario su nombre, y luego lo salude.

package ejercicios;

import java.util.Scanner;


public class Ej001 {
	
	public static void main(String args[]) {

		String nombre;
		Scanner sc = new Scanner(System.in); //crear un objeto Scanner
		
		System.out.println("¿Como te llamas?");
		nombre = sc.nextLine();
		
		System.out.println("Hola " + nombre);
		
		sc.close();
	}

}
