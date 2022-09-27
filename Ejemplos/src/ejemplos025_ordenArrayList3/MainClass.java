package ejemplos025_ordenArrayList3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class MainClass {
final static int TAM=5;

	public static void main(String[] args) {
		MainClass p = new MainClass();
		
		Persona[] arrayPersonas = new Persona[TAM];

		arrayPersonas[0] = new Persona("Mario", 22, 187);
		arrayPersonas[1] = new Persona("Pepe", 52, 173);
		arrayPersonas[2] = new Persona("Manuel", 27, 158);
		arrayPersonas[3] = new Persona("David", 25, 164);
		arrayPersonas[4] = new Persona("Alberto", 80, 184);

		System.out.println("\nArray sin ordenar\n");
		p.imprimeArrayPersonas(arrayPersonas);

		
		
		//Esto es para arrays
		Arrays.sort(arrayPersonas, Collections.reverseOrder());
		
		System.out.println("\nArray ordenado descendente por altura\n");
		p.imprimeArrayPersonas(arrayPersonas);
		
		
		
		//Esto es para ArrayList
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		for(int i=0; i<arrayPersonas.length; i++)
			personas.add(arrayPersonas[i]);
		
		System.out.println("\nArrayList ordenado ascendente por altura\n");
		Collections.sort(personas);
		Iterator<Persona> it = personas.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

	public void imprimeArrayPersonas(Persona[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + ". " + array[i]);
		}
	}
}
