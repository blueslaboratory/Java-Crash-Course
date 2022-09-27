//13. Hacer un programa que lea N numeros (se piden al usuario), 
//calcule la suma de los pares y el producto de los impares y escriba ambos resultados. 


package basicos1;

import java.util.Scanner;


public class Ej013 {
	
	public static void main(String[] args) {
		
		int n, num, suma, producto, i;
		Scanner sc = new Scanner(System.in);
		
		suma = 0;
		producto = 1;
		
		System.out.print("Numero de numeros que quieres introducir: ");
		n = Integer.parseInt(sc.nextLine());
	
		
		if (n<1) 
			producto = 0;
		
		for(i=1; i<=n; i++) {
			System.out.print("Numero " +i +": ");
			num = Integer.parseInt(sc.nextLine());
			
			if(num%2 == 0)
				suma += num;
			else
				producto = producto*num;
		}	
		
		
		System.out.println("Resultado suma pares: " +suma);
		System.out.println("Resultado producto impares: " +producto);
		
		sc.close();
	}
}
