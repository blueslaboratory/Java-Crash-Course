package ejemplos025_ordenArrayList4;

import java.util.ArrayList;
import java.util.Collections;

public class MainClassLista {
	public static void main(String[] args) {

		// Para ordenar un arrayList de objetos por uno de sus campos:

		ArrayList<Persona> personas = new ArrayList<Persona>();

		personas.add(new Persona(74999999, 35));
		personas.add(new Persona(99999999, 35));
		personas.add(new Persona(72759474, 30));
		personas.add(new Persona(11111111, 41));
		personas.add(new Persona(22222222, 41));
		personas.add(new Persona(33333333, 41));
		personas.add(new Persona(22222222, 50));
		personas.add(new Persona(33333333, 60));
		personas.add(new Persona(44444444, 21));
		personas.add(new Persona(55555555, 15));
		personas.add(new Persona(11111111, 15));
		personas.add(new Persona(66666666, 65));

		
		// Ahora si nos deja ordenar personas
		Collections.sort(personas);
		// Se reordenan realmente los elementos en las posiciones del ArrayList

		System.out.println("Presentamos las personas ordenadas por dni asc ");
		for (Persona p : personas)
			System.out.println(p);

		
		Collections.sort(personas, Collections.reverseOrder());

		System.out.println("Presentamos las personas ordenadas por dni desc");
		for (Persona p : personas)
			System.out.println(p);
	}

}
