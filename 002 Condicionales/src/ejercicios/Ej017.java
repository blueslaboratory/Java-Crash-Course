//Realiza un programa que pida por teclado el resultado (dato entero) obtenido 
//al lanzar un dado de seis caras y muestre por pantalla el numero en letras 
//(dato cadena) de la cara opuesta al resultado obtenido.
//* Nota 1: En las caras opuestas de un dado de seis caras estan los numeros: 
//1-6, 2-5 y 3-4.
//* Nota 2: Si el numero del dado introducido es menor que 1 o mayor que 6, 
//se mostrara el mensaje: "ERROR: numero incorrecto.".

package ejercicios;

import java.util.Scanner;


public class Ej017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cara;
		//final int NCARAS = 6;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de la cara que ha salido: ");
		cara = sc.nextInt();
		//cara = (int) (Math.random()*NCARAS +1);
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html#random()
		//System.out.println(cara);
		
		switch(cara) {
		
			case 1: System.out.println("En la cara opuesta esta el seis");
					break;
			case 2: System.out.println("En la cara opuesta esta el cinco");
					break;
			case 3: System.out.println("En la cara opuesta esta el cuatro");
					break;				
			case 4: System.out.println("En la cara opuesta esta el tres");
					break;
			case 5: System.out.println("En la cara opuesta esta el dos");
					break;
			case 6: System.out.println("En la cara opuesta esta el uno");
					break;
			default: System.out.print("ERROR: Numero incorrecto.");
					break;
		}
		
		
		sc.close();
	}

}
