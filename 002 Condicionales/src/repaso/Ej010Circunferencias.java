//Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
//circunferencias y las clasifique en uno de estos estados:
//exteriores
//tangentes exteriores
//secantes
//tangentes interiores
//interiores
//concentricas


package repaso;

import java.util.Scanner;


public class Ej010Circunferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x1,y1,x2,y2,r1,r2,distancia;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime x1: ");
		x1 = sc.nextFloat();
		System.out.print("Dime y1: ");
		y1 = sc.nextFloat();
		System.out.print("Dime r1: ");
		r1 = sc.nextFloat();
		
		System.out.print("Dime x2: ");
		x2 = sc.nextFloat();
		System.out.print("Dime y2: ");
		y2 = sc.nextFloat();
		System.out.print("Dime r2: ");
		r2 = sc.nextFloat();
		
		
		//Distancia entre los centros
		distancia = (float) Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		
		if (distancia > (r1 + r2))
			System.out.println("Las circunferencias son exteriores");
		
		if (distancia == (r1 + r2))
			System.out.println("Las circunferencias son tangentes exteriores");
		
		if (distancia < (r1 + r2) && distancia > Math.abs(r1-r2))
			System.out.println("Las circunferencias son secantes");
			//La distancia  es menor que la suma de los radios y mayor que su diferencia.
			//Es el intervalo entre tangentes exteriores y tangentes interiores
		
		if (r1 == (r2 + distancia) || r2 == (r1 + distancia))
			System.out.println("Las circunferencias son tangentes interiores");
			//distancia = abs(r1-r2);
		
		if (distancia > 0 && distancia < Math.abs(r1-r2))
			System.out.println("Las circunferencias son interiores");
			//La distancia entre los centros es mayor que cero y menor que la diferencia entre los radios. 
			//Es facil de ver si te das cuenta que es el intervalo  de 0 hasta tangentes interiores
			// r1 > r2 + distancia O r2 > r1 + distancia
		
		if (x1 == x2 && y1 == y2)
			System.out.println("Las circunferencias son concentricas");
		
		
		
		
		//En el del pseint puse errores comunes, mejor no lo mires a no ser que 
		//vuelvas a cometer errores y quieras comprobar si son los mismos
		
		sc.close();
	}

}
