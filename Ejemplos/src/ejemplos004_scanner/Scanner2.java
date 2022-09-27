package ejemplos004_scanner;

import java.util.Scanner;


public class Scanner2 {	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre, radioS, nS;
		double radio;
		int n;

		
		System.out.print("Introduzca el radio de la circunferencia: ");
		radioS = sc.nextLine();
		//radioS es radio en string
		radio = Double.parseDouble(radioS);
		
		//Se puede hacer todo de golpe:
		//radio = Double.parseDouble(sc.nextLine());
		//.parseDouble recoge un string y lo pasa a Double
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Double.html#parseDouble(java.lang.String)

		System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
		
		
		System.out.print("Introduzca un numero entero: ");
		nS = sc.nextLine();
		//nS es n en string
		n = Integer.parseInt(nS);
		//.parseInt recoge un string y lo pasa a Int
		//n = (int)nS; //da error, no se puede hacer un casting de un string
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#parseInt(java.lang.String)
		
		System.out.println("El cuadrado es: " + Math.pow(n,2));

		
		System.out.print("Introduzca su nombre: ");
		nombre = sc.nextLine(); //leemos el String despues del double
		System.out.println("Hola " + nombre + "!!!");
		
		sc.close();
		
	}
}
