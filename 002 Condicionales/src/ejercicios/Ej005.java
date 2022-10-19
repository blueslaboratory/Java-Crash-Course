//Escribe un programa que pida un nombre de usuario y una contrase�a y 
//si se ha introducido pepe y asdasd se indica Has entrado al sistema, si no se da un error.


package ejercicios;

import java.util.Scanner;


public class Ej005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cad1, cad2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un usuario: ");
		cad1 = sc.nextLine();
		
		System.out.print("Introduce una contrasena: ");
		cad2 = sc.nextLine();

		
		//hay 2 formas de comparar strings en java, compareTo y equals
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html		
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#compareTo(java.lang.String)
		
		// if (cad1 == "pepe" && cad2 == "asdasd") NOOO!
		
		//EQUALS		
		//if (cad1.equals("pepe") && cad2.equals("asdasd"))

		//COMPARETO
		if (cad1.compareTo("pepe")==0 && (cad2.compareTo("asdasd")==0))
			System.out.print("Has entrado al sistema.");
		else
			System.out.print("Error. Estas fuera del sistema.");
		
		
		sc.close();
		
	}

}
