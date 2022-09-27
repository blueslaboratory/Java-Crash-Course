//14. Hacer un diagrama de flujo para calcular el maximo comun divisor de dos 
//numeros enteros positivos N y M siguiendo el algoritmo de Euclides, que es el siguiente: 
//1. Se divide N por M, sea R el resto. 
//2. Si R=0, el maximo comun divisor es M y se acaba. 
//3. Si no, se asigna a N el valor de M y a M el valor de R y volvemos al paso 1. 

package basicos1;

import java.util.Scanner;


public class Ej014 {
	
	public static void main(String[] args) {
		
		int n, m, r, aux;
		Scanner sc = new Scanner(System.in);
		
		aux = 0;
		
		System.out.print("Introduce N: ");
		n = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce M: ");
		m = Integer.parseInt(sc.nextLine());
		
		if (m>n) {
			aux = m;
			m = n;
			n = aux;
			//System.out.println("M: " +m);
			//System.out.println("N: " +n);
			//System.out.println("aux: " +aux);
		}
		
		while (n%m != 0) {
			
			r = n%m;
			n = m;
			m = r;
			
			System.out.println("Resto: " +r);
			System.out.println("N: " +n);
			System.out.println("M: " +m);
		} 
		
		//1. Se divide N por M, sea R el resto. 
		//2. Si R=0, el maximo comun divisor es M y se acaba. 
		//3. Si no, se asigna a N el valor de M y a M el valor de R y volvemos al paso 1. 
		
		System.out.println("Maximo comun divisor: " +m);
	}
}
