//################################################################################
//Una persona se encuentra en el kilometro 70 de una carretera, otra se encuentra 
//en el km 150, los coches tienen sentido opuesto y tienen la misma velocidad. 
//Realizar un programa para determinar en que kilometro de esa carretera se 
//encontraran.


package ejercicios;

import java.util.Scanner;


public class Ej014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float v,h,x;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cual es la velocidad de uno de los coches: ");
		v = sc.nextFloat();
		
		//v*h + 70 = 150 -v*h
		//h = 80/2v
		
		h = 80/(2*v);
		x = 70 + v*h;
		
		System.out.println("Se encuentran en el km: " +x);
		//Siempre va a ser el 110
		
		
		//Se puede hacer con un MIENTRAS o con un REPETIR
		int km1,km2;
		
		km1 = 70;
		km2 = 150;
		
		while (km1!=km2) {
			km1 = km1+1;
			km2 = km2-1;
		}
			
		System.out.println("Se encuentran en el km: " +km1);
		
		sc.close();
	}

}

