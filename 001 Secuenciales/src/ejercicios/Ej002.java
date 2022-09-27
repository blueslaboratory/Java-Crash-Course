//Calcular el perimetro y area de un rectangulo dada su base y su altura.

package ejercicios;

import java.util.Scanner;


public class Ej002 {
	
	public static void main(String args[]) {
		
		
		String sbase, saltura; 
		float base, altura, perimetro, area;
		
		Scanner sc = new Scanner(System.in); //crear un objeto Scanner
		
		
		System.out.print("Introduzca la base: ");
		sbase = sc.nextLine();
		//sbase es base en string
		base = Integer.parseInt(sbase);
		
		System.out.print("Introduzca la altura: ");
		//todo en una linea
		altura = Integer.parseInt(sc.nextLine());
		
		
		perimetro = base*2 + altura*2;
		area = base*altura;
		
		System.out.println("Perimetro: " +(perimetro) +"m");
		System.out.println("Area: " +(area)  +"m²");
		
		sc.close();
	}

}
