//Dado un numero de dos cifras, diseñe un algoritmo que permita obtener 
//el numero invertido. Ejemplo, si se introduce 23 que muestre 32.


package repaso;

import java.util.Scanner;


public class Ej014Invertir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numc, cad1, cad2;
		int num;
		
		Scanner sc = new Scanner(System.in); //crear un objeto Scanner
		
		
		System.out.print("Dime un numero de 2 cifras: ");
		numc = sc.nextLine();
		
		
		cad1 = numc.substring(0,1);
		cad2 = numc.substring(1,2);
		
		numc = cad2 + cad1;
		
		num = Integer.parseInt(numc); // Integer <- String
		
		System.out.print("El numero invertido es " +num);
		
		sc.close();
	}

}
//Hay otra forma de hacerlo que es con numeros,
//(esta en Ej014 NO MIRAR)
//(y esta en la solucion de pseint)


//System.out.println("abc");
//String cde = "cde";
//System.out.println("abc" + cde);
//String c = "abc".substring(2,3);
//String d = cde.substring(1, 2);
