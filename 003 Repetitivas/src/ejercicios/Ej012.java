//################################################################################
//Realizar un algoritmo para determinar cuanto ahorrara una persona en un año, 
//si al final de cada mes deposita cantidades variables de dinero; 
//ademas, se quiere saber cuanto lleva ahorrado cada mes.


package ejercicios;

import java.util.Scanner;


public class Ej012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mes;
		float a, acum;
		Scanner sc = new Scanner(System.in);
		
		acum = 0;
		
		for (mes=1; mes<=12; mes++) {
			System.out.print("Cuanto has ahorrado en el mes " +mes +": ");
			a = sc.nextFloat();
			
			acum += a;
			//System.out.println("En el mes " +mes +" llevas ahorrado " +acum);
		}
			
		System.out.println("Al año has ahorrado: " +acum);
		
		sc.close();
	}

}

