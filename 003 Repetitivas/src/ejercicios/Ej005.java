//################################################################################
//Algoritmo que pida caracteres e imprima 'VOCAL' si son vocales y 'NO VOCAL' 
//en caso contrario, el programa termina cuando se introduce un espacio.
//################################################################################
//Analisis
//Leer un caracter hasta que sea el espacio.
//Si el caracter no es espacio -> si es una vocal -> Muestro "Es vocal"
//Si no muestro "No es vocal"
// Datos de entrada:vamos leyendo un caracter.
// Informacion de salida: Mensajes: "Es vocal", "No es vocal"
// Variables:car (caracter)
//################################################################################
//Diseño
//1.- Repetir
//		2.- Repetir -> Leer caracter hasta que sea un splo caracter
//		3.- Si car no es el espacio
//			4.- Si es A,E,I,O,U o a,e,i,o,u -> Mostrar "Es vocal"
//			5.-Si no mostrar "No es vocal"
//hasta que el caracter sea espacio
//################################################################################


package ejercicios;

import java.util.Scanner;


public class Ej005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letra;
		Character l;
		Scanner sc = new Scanner(System.in);
		
		
		
		
		//WHILE
		
		do {
			System.out.print("Introduce un caracter (a-z) o un espacio para terminar: ");
			letra = sc.nextLine();
		} while (letra.length()!=1);
		
		l = letra.charAt(0);
		l = Character.toLowerCase(l);
		//convertimos un String a char
		//la 1era posicion es 0
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#charAt(int)
		
		while(l!=' ') {
			if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u')
				System.out.println("VOCAL");
			else
				System.out.println("NO VOCAL");
			
			do {
				System.out.print("Introduce un caracter (a-z) o un espacio para terminar: ");
				letra = sc.nextLine();
			} while (letra.length()!=1);
			
			l = letra.charAt(0);
			l = Character.toLowerCase(l);
		}
		
		
		
		
		//DO-WHILE	
		
		do {
			do {
				System.out.print("Introduce un caracter (a-z) o un espacio para terminar: ");
				letra = sc.nextLine();
			} while (letra.length()!=1);
			
			l = letra.charAt(0);
			l = Character.toLowerCase(l);
			
			if (!Character.isWhitespace(l)) {
				if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u')
					System.out.println("VOCAL");
				else 
					System.out.println("NO VOCAL");
			}
			
		} while(l!=' ');
		
		
		
		
		//SWITCH
		String caracter;
		caracter = "x";
		
		do {
			System.out.print("Introduce un caracter (a-z) o un espacio para terminar: ");
			caracter = sc.nextLine();
			caracter = caracter.toLowerCase();
			
			switch (caracter) {
				case "a":
				case "e":
				case "i":
				case "o":
				case "u":
					System.out.println("VOCAL");
					break;
				case " ":
					break;
				default:
					System.out.println("NO VOCAL");
					break;
			}
			
		} while (!caracter.equals(" "));
		
		
		
		sc.close();
	}
}
