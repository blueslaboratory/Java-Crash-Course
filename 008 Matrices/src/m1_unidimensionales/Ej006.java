//6.- Haz un programa en Java para leer la altura de N 
//personas y calcular la altura media. Calcular cuántas 
//personas tienen una altura superior a la media y 
//cuántas tienen una altura inferior a la media. El valor 
//de N se pide por teclado y debe ser entero positivo. 


package m1_unidimensionales;

import java.util.Scanner;

public class Ej006 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		double acum = 0;
		
		do {
			System.out.print("Introduce el numero de personas: ");
			size = Integer.parseInt(sc.nextLine());
		} while(size<0);
		
		
		
		double [] alturas = new double[size];
		
		for(int i=0; i<alturas.length; i++) {
			System.out.print("Dime la altura " +(i+1) +" : ");
			alturas[i] = Double.parseDouble(sc.nextLine());
			acum += alturas[i]; 
		}
		
		System.out.println();
		System.out.println("La altura media es: " +(acum/alturas.length));
		
		sc.close();
	}
}
