package ejemplos005_condicionales;

import java.util.Scanner;


public class Condicionales {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		//Seleccion simple: impar
		
		int numero;
		
		System.out.print("Dime un numero: ");
		numero = sc.nextInt();
		
		if (numero%2 != 0) { 
			System.out.println("El numero " +numero +" es impar"); 
			//Estas llaves se utilizan para cuando hay >1 sentencia
		}
		
		
		
		//Seleccion doble: a>b o b>a
		
		float a,b;
	
		System.out.print("Introduce un numero a: ");
		a = sc.nextFloat();
		System.out.print("Introduce un numero b: ");
		b = sc.nextFloat();
		
		if (a>b)
			System.out.println(a + " es mayor que " +b);
		else 
			System.out.println(b + " es mayor que " +a);
		
		
		
		//Seleccion multiple: mes
		
		int mes;
		
		System.out.print("Introduce un mes: ");
		mes = sc.nextInt();
		
		if (mes == 12 || mes == 1 || mes == 2) 
			System.out.println ( "Invierno"); 
		else if (mes == 3 || mes == 4 || mes == 5) 
			System.out.println( "Primavera"); 
		else if (mes == 6 || mes == 7 || mes == 8) 
			System.out.println ("Verano"); 
		else 
			System.out.println ("Otono");
	
		
		sc.close();

	}
}
