package ejemplos020_arraylist1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainCoche {

	public static void main(String args[]) {
		ArrayList<Coche> coches = new ArrayList<Coche>();

		Coche coche1;
		coche1 = new Coche("rojo", "Volvo", "1111-ABC", 5);
		coches.add(coche1);
		Coche coche2 = new Coche("negro", "Seat", "2222-DEFG", 4);
		coches.add(coche2);
		Coche coche3 = new Coche("blanco", "Nissan", "3333-HIJK", 5);
		coches.add(coche3);

		System.out.println("**********************************");
		System.out.println("Vamos a probar contains");
		System.out.println("**********************************");

		System.out.println("CONTAINS 1");
		if (coches.contains(coche3))
			System.out.println("El coche3 esta en la lista");
		else
			System.out.println("El coche3 no esta en la lista");

		Coche coche4 = new Coche("blanco", "Nissan", "3333-HIJK", 5); // Como el coche3

		System.out.println("CONTAINS 2");
		if (coches.contains(coche4))
			System.out.println("El coche4 esta en la lista");
		else
			System.out.println("El coche4 no esta en la lista");

		// Ponemos en la configuracion del programa en la opcion Argumentos/VM argumets:
		// -ea
		// Si queremos que salte la excepcion de assert. Se usa para depuracion
		// assert coche3 == coche4;

		System.out.println(coches);
		System.out.println("**********************************");
		System.out.println("REMOVE 1");
		if (borraElemento(coches, coche2))
			System.out.println("Encontrado y borrado");
		else
			System.out.println("No encontrado ni borrado");

		System.out.println(coches);
		System.out.println("**********************************");

		// borraTodo(coches);
		System.out.println("REMOVE ALL");
		System.out.println("Borra todo");
		coches.removeAll(coches);
		System.out.println(coches);
	}

	public static boolean borraTodo(ArrayList<Coche> c) {
		boolean modified = false;
		Iterator<Coche> e = c.iterator();

		while (e.hasNext()) {
			if (c.contains(e.next())) {
				e.remove();
				modified = true;
			}
		}

		return modified;
	}

	public static boolean borraElemento(ArrayList<Coche> lista, Coche c) {
		boolean borrado = false;
		Iterator<Coche> it = lista.iterator();

		while (it.hasNext()) {
			Coche coche_lista = it.next();
			if (coche_lista.equals(c)) {
				it.remove();
				borrado = true;
			}
		}

		return borrado;
	}

	public static boolean contiene(ArrayList<Coche> lista, Coche c) {
		boolean modified = false;
		Iterator<Coche> it = lista.iterator();

		while (it.hasNext()) {
			//Coche coche_lista = it.next();
			if (lista.contains(c)) {
				it.remove();
				modified = true;
			}
		}

		return modified;
	}

}
