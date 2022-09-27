package ejemplos025_ordenArrayListCoches;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		Coche coche4 = new Coche("blanco", "Nissan", "4444-HIJK", 5);
		coches.add(coche4);

		System.out.println("**********************************");
		System.out.println("Vamos a probar compareTo");
		System.out.println("**********************************");

		System.out.println("\nCOMPARABLE COMPARETO 1 - MARCA ASC - MATRICULA ASC");
		Collections.sort(coches);
		for (Coche c : coches) {
			System.out.println(c);
		}

		System.out.println("\nCOMPARABLE COMPARETO 2 - MARCA DESC - MATRICULA DESC");
		Collections.sort(coches, Collections.reverseOrder());
		Iterator<Coche> it = coches.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("\nCOMPARATOR COMPARE 3 - COLOR");
		Comparator<Coche> comp = new CochesPorColor();
		Collections.sort(coches, comp);
		for(Coche c: coches) {
			System.out.println(c);
		}
	}

}
