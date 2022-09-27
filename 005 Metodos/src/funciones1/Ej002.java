//2.-Muestra por pantalla los resultados de las 4 operaciones b�sicas 
//entre 2 n�meros que se le pedir�n al usuario, realizando una subrutina 
//para cada una de dichas operaciones. El resultado de la operaci�n se 
//imprime dentro de la subrutina. Y fuera

//Intentos fallidos: 0

package funciones1;

import java.util.Scanner;


public class Ej002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2;
		Scanner sc = new Scanner(System.in);
		
		num1 = leer("Dime N1: ", sc);
		num2 = leer("Dime N2: ", sc);
		
		System.out.println("Suma: " +suma(num1,num2));
		System.out.println("Resta: " +resta(num1,num2));
		System.out.println("Multiplicacion: " +multi(num1,num2));
		System.out.println("Division: " +div(num1,num2));
		
		sc.close();

	}
	
	public static float leer(String msg, Scanner teclado) {
		System.out.print(msg);
		return Float.parseFloat(teclado.nextLine());
	}
	
	public static float suma(float num1, float num2) {
		//System.out.println("Suma: " +(num1+num2));
		return (num1+num2);
	}
	
	public static float resta(float num1, float num2) {
		//System.out.println("Resta: " +(num1-num2));		
		return (num1-num2);
	}
	
	public static float multi(float num1, float num2) {
		//System.out.println("Multiplicacion: " +(num1*num2));		
		return (num1*num2);
	}
	
	public static float div(float num1, float num2) {
		//System.out.println("Division: " +(num1/num2));
		return (num1/num2);
	}
	
}
