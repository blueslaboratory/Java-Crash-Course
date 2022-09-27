//Programa que lea una cadena por teclado y compruebe si es una letra mayuscula.


package ejercicios;

import java.util.Scanner;


public class Ej006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cad1, cadMay;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una cadena: ");
		cad1 = sc.nextLine();
		
		cadMay = cad1.toUpperCase();
		
		if ((cad1.substring(0,1)).equals(cadMay.substring(0,1)))
			System.out.println("La primera letra de la cadena esta en mayusculas");
		else
			System.out.println("La primera letra de la cadena NO esta en mayusculas");
		
		if (cad1.compareTo(cad1.toUpperCase())==0)
			System.out.println("La cadena esta en mayusculas");
		else
			System.out.println("La cadena NO esta en mayusculas");
		
		
		sc.close();
	}

}
