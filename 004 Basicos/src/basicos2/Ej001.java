//1. Escribir un programa que imprima cada uno de los terminos de la 
//serie 2, 5, 7, 10, 12, 15, 17,..., 1800. Ademas calcule e imprima 
//la suma de los terminos. 

//SOLUCION DE INTERNET

package basicos2;

import java.util.Scanner;


public class Ej001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, n, suma;
		
		i = 1;
		n = 2;
		suma = 0;
		
		while (n<=1800) {
			System.out.println("Numero: " +n);
			suma += n;

			if (i%2 == 0) 
				n+=2;

			else 
				n+=3;
			
			i++;
			//La clave es que i va desfasado
			//en los pares suma 2
			//en los impares suma 3
			//i 1  2  3   4   5   6   7
			//  2, 5, 7, 10, 12, 15, 17
			//   +3 +2 +3  +2  +3  +2
		}

		System.out.println("\nLa suma total es: " +suma);
	}

}
