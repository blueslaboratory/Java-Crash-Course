//5. Haz un programa que lea un numero entero N y calcule el resultado 
//de la siguiente serie: 1-1/2+1/3-1/4+1/5-...+1/N.

package basicos2;

import java.util.Scanner;


public class Ej006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		double suma;		
		Scanner sc = new Scanner(System.in);
		
		suma = 0;
		
		System.out.print("Dime N: ");
		n = Integer.parseInt(sc.nextLine());
		
		for (i=1; i<=n; i++) {
			if (i%2 != 0) {
				suma += (1D/i); //Casting a double
				System.out.print("+1/" +i);
			}
				
			if (i%2 == 0) {
				suma -= (1D/i); //Casting a double
				System.out.print("-1/" +i);
			}
		}
		
		System.out.print(" = " +suma);
		
		System.out.println("\nSuma: " +suma);
		
		sc.close();
	}

}
