//################################################################################
//Escribir un programa que imprima todos los numeros pares entre dos numeros que 
//se le pidan al usuario.
//################################################################################


package ejercicios;

import java.util.Scanner;


public class Ej006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime n1: ");
		n1 = sc.nextInt();
		System.out.print("Dime n2: ");
		n2 = sc.nextInt();
		
		
		
		//FOR
		if (n1<n2) {
			for (num=n1; num<=n2; num++) {
				if (num%2==0) 
					System.out.print(num +" ");
			}
		}
		
		else if (n2<n1) {
			for (num=n2; num<=n1; num++) {
				if (num%2==0) 
					System.out.print(num +" ");
			}
		}

		
		
		//ELEGANTE - var auxiliar
		System.out.print("\nDime n1: ");
		n1 = sc.nextInt();
		System.out.print("Dime n2: ");
		n2 = sc.nextInt();
		
		if (n1>n2) {
			int aux;
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		
		if (n1%2==1) {
			n1 += 1;
		}
		
		while (n1<=n2) {
			if (n1%2==0) 
				System.out.print(n1 +" ");
			n1+=2;
		}
		
		
		
		//WHILE
		System.out.print("\nDime n1: ");
		n1 = sc.nextInt();
		System.out.print("Dime n2: ");
		n2 = sc.nextInt();
		
		if (n1<n2) {
			while (n1<=n2) {
				if (n1%2==0) 
					System.out.print(n1 +" ");
				n1++;
			}
		}
		
		else if (n2<n1) {
			while (n2<=n1) {
				if (n2%2==0) 
					System.out.print(n2 +" ");
				n2++;
			}
		}
		
		
		
		sc.close();
	}
}
