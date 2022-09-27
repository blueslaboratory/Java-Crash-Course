package herencia1_Ej002Viviendas;

import java.util.Scanner;

public class Ej002Lector {
	
	//1
	public static Ej002Vivienda crearVivienda(Scanner sc) {
		String calle;
		int n;
		double m2;
		
		System.out.print("Calle: ");
		calle = sc.nextLine();
		System.out.print("Numero: ");
		n = Integer.parseInt(sc.nextLine());
		System.out.print("Metros cuadrados: ");
		m2 = Double.parseDouble(sc.nextLine());
		
		return new Ej002Vivienda(calle, n, m2);
	}
	
	//2
	public static Ej002Chalet crearChalet(Scanner sc) {
		String calle;
		int n;
		boolean jardin;
		char respuesta;
		
		System.out.print("Calle: ");
		calle = sc.nextLine();
		System.out.print("Numero: ");
		n = Integer.parseInt(sc.nextLine());
		do {
			System.out.print("El chalet tiene jardin (s/n): ");
			respuesta = (sc.nextLine()).charAt(0);
			if (respuesta == 's')
				jardin = true;
			else
				jardin = false;
		} while(respuesta !='s' && respuesta !='n');
		
		
		return new Ej002Chalet(calle, n, jardin);
	}
	
	//3
	public static Ej002Palacio crearPalacio(Scanner sc) {
		String calle;
		int n;
		double m2;
		int nHab;
		
		System.out.print("Calle: ");
		calle = sc.nextLine();
		System.out.print("Numero: ");
		n = Integer.parseInt(sc.nextLine());
		System.out.print("Metros cuadrados: ");
		m2 = Double.parseDouble(sc.nextLine());
		System.out.print("Numero de habitaciones: ");
		nHab = Integer.parseInt(sc.nextLine());
		
		return new Ej002Palacio(calle, n, m2, nHab);
	}
}
