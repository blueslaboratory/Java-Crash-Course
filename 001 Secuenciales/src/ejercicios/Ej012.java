//Pide al usuario dos pares de numeros x1,y1 y x2,y2, que representen dos puntos 
//en el plano. Calcula y muestra la distancia entre ellos.

package ejercicios;

import java.util.Scanner;


public class Ej012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x1,y1,x2,y2, distancia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime x1: ");
		x1 = sc.nextFloat();
		System.out.print("Dime y1: ");
		y1 = sc.nextFloat();
		
		System.out.print("Dime x2: ");
		x2 = sc.nextFloat();
		System.out.print("Dime y2: ");
		y2 = sc.nextFloat();
		
		distancia = (float)Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		//Math devuelve un double, asi que hay que hacer un casting
		
		System.out.print("Distancia: "  +distancia);
		
		sc.close();
	}

}
