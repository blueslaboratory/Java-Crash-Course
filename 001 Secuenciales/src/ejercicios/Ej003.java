//Dados los catetos de un triangulo rectangulo, calcular su hipotenusa.

package ejercicios;

import java.util.Scanner;


public class Ej003 {

	public static void main(String[] args) {
		
		
		float cat1, cat2, hip;
		
		Scanner sc = new Scanner(System.in); //crear un objeto Scanner
		
		
		System.out.print("Introduce el cateto 1 del triangulo rectangulo en cm: ");
		cat1 = sc.nextFloat();
		//Para leer datos, lee con "," por el SO, a no ser que este en ingles
		
		System.out.print("Introduce el cateto 2 del triangulo rectangulo en cm: ");
		cat2 = sc.nextFloat();
		//Para leer datos, lee con "," por el SO, a no ser que este en ingles
		
		
		hip = (float)Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		//Math devuelve un double, asi que hay que hacer un casting
		
		System.out.println("La hipotenusa del triangulo rectangulo es " +hip +" cm");
		
		sc.close();
	}

}
