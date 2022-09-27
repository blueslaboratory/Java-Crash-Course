//11. La sucesion de Fibonacci se define de la siguiente forma: 
//a1=1
//a2=1
//…
//an=an-1+an-2 para n>2,
//
//Es decir, los dos primeros son 1 y el resto cada uno es la suma 
//de los dos anteriores, los primeros son: 1, 1, 2, 3, 5, 8, 13, 21,... 
//Haz un programa que calcule e imprima N terminos de la sucesion, 
//N se pedira por teclado. 

//SOLUCION DE INTERNET

package basicos1;

import java.util.Scanner;


public class Ej011 {
	
	public static void main(String [] args) {
		
		int n, i; 
		int previo, resultado, suma;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime cuantos terminos quieres: ");
		n = sc.nextInt();
		
		previo = -1;
		resultado = 1;
		
		for (i=1; i<=n; i++) {
			
			suma = resultado + previo;
			previo = resultado;
			resultado = suma;
			
			System.out.println("Termino " +i +": " +resultado );
		}
		
		sc.close();
	}
}
