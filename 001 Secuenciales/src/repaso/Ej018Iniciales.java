//Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.

package repaso;

import java.util.Scanner;


public class Ej018Iniciales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre, apellido1, apellido2, iniciales;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine();
		
		System.out.print("Dime tu primer apellido: ");
		apellido1 = sc.nextLine();
		
		System.out.print("Dime tu segundo apellido: ");
		apellido2 = sc.nextLine();
		
		
		
		iniciales = nombre.substring(0,1) + apellido1.substring(0,1) + apellido2.substring(0,1);
		System.out.println("Tus iniciales son: " + iniciales.toUpperCase());
		
		
		//Otra forma
		iniciales = "" + nombre.charAt(0) + apellido1.charAt(0) + apellido2.charAt(0);
		System.out.println("Tus iniciales son: " + iniciales.toUpperCase());
		
		sc.close();
	}

}



//System.out.println("abc");
//String cde = "cde";
//System.out.println("abc" + cde);
//String c = "abc".substring(2,3);
//String d = cde.substring(1, 2);
