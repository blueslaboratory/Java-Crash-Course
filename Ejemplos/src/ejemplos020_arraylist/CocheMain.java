package ejemplos020_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class CocheMain {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Parking p = new Parking();

		// ARRAYLIST DE COCHES
		ArrayList<Coche> misCoches = new ArrayList<Coche>();
		Coche coche1 = null;
		char op;

		// Metiendo coches en el parking
		do {
			System.out.print("Agregar otro coche (y/n): ");
			op = sc.nextLine().charAt(0);
			if (op == 'y') {
				coche1 = rellenarCoches(sc);
				misCoches.add(coche1);
				p.agregar(coche1);
			}
		} while (op == 'y');

		// Me puedo ahorrar el coche1:
		misCoches.add(1, new Coche("azul", "Nissan", "1234-DEF", 3));
		p.agregar(new Coche("azul", "Nissan", "1234-DEF", 3));

		System.out.println(coche1);
		System.out.println(misCoches.get(0));

		System.out.println();
		for (Coche c : misCoches) {
			if (c != null)
				System.out.println(c);
		}

		System.out.println();
		for (int j = 0; j < misCoches.size(); j++)
			System.out.println(j + ": " + misCoches.get(j));

		// metodo rellenar coches 2
		System.out.println("\nRellenar coches:");
		rellenarCoches2(misCoches, sc);
		// metodo imprimir coches
		System.out.println("\nImprimir coches:");
		imprimirCoches(misCoches);
		// metodo imprimir coches determinado color
		System.out.println("\nImprimir coches de un color:");
		imprimirCocheColor(misCoches, "rojo");
	}

	public static Coche rellenarCoches(Scanner teclado) {
		String color, marca, matricula;
		int numPuertas;

		System.out.print("Color: ");
		color = teclado.nextLine();
		System.out.print("Marca: ");
		marca = teclado.nextLine();
		System.out.print("Matricula: ");
		matricula = teclado.nextLine();
		System.out.print("Puertas: ");
		numPuertas = Integer.parseInt(teclado.nextLine());

		return new Coche(color, marca, matricula, numPuertas);
	}

	public static void rellenarCoches2(ArrayList<Coche> coches, Scanner teclado) {
	
		for (int j = 0; j < coches.size(); j++) {
			System.out.println("Coche " + j);

			System.out.print("Color: ");
			coches.get(j).pintaCoche(teclado.nextLine());
			System.out.print("Marca: ");
			coches.get(j).ponMarca(teclado.nextLine());
			System.out.print("Matricula: ");
			coches.get(j).ponMatricula(teclado.nextLine());
			System.out.print("Puertas: ");
			coches.get(j).ponNumPuertas(Integer.parseInt(teclado.nextLine()));
		}
	}

	public static void imprimirCoches(ArrayList<Coche> coches) {
		for (Coche c : coches) {
			if (c != null)
				System.out.println(c);
		}
	}

	public static void imprimirCocheColor(ArrayList<Coche> coches, String color) {
		for (int j = 0; j < coches.size(); j++) {
			if ((coches.get(j).devColor()).equalsIgnoreCase(color))
				System.out.println(coches.get(j));
		}
	}

}