//17. Se dice que un numero N es perfecto si la suma de sus divisores, 
//excluido el propio numero es N. Por ejemplo, 28 es perfecto, pues sus divisores 
//son: 1, 2, 4, 7 y 14 y su suma es 1+2+4+7+14=28. 
//Haz un programa que dado un numero N nos diga si es o no perfecto. Cambia el 
//programa para que siga pidiendo numeros mientras el numero introducido sea distinto 
//de cero, que sera la signal para parar el programa.


package basicos1;

import java.util.Scanner;


public class Ej017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, suma, i;
		Scanner sc = new Scanner(System.in);
		
		
		 do {
			System.out.print("Dime un numero (0 para salir): ");
			n = Integer.parseInt(sc.nextLine());
			 
			suma = 0;
			
			for (i=1; i<n; i++) {
				if (n%i == 0) {
					suma += i;
					System.out.println("Suma " +i +": " +suma);
				}	
			}
			
			if (n!=0) {
				if (suma == n)
					System.out.println(n +" es perfecto");
				else
					System.out.println(n +" no es perfecto");
			}
			
		} while (n!=0);
		
		
		sc.close();
	}

}
