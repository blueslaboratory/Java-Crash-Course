package ejemplos025_ordenArrayList2;

import java.util.ArrayList;
import java.util.Collections;

public class PersonasArrayList {
	public static void main(String[] args) {
		
		// Para ordenar un arrayList de objetos por uno de sus campos:
		
		 ArrayList<Persona> personas = new ArrayList<Persona>();
	
		 personas.add(new Persona("Pepe", 28));
		 personas.add(new Persona("Juan", 32));
		 personas.add(new Persona("Paco", 40));
		 personas.add(new Persona("Susi", 24));
		 personas.add(new Persona("Lola", 20));
		 personas.add(new Persona("Jose", 28));
		 personas.add(new Persona("Dani", 24));
		 personas.add(new Persona("Sara", 36));
		 	 
		 // Ahora si nos deja ordenar personas
		 Collections.sort(personas);
		 // Se reordenan realmente los elementos en las posiciones del ArrayList
		 
		 System.out.println("Presentamos las personas ordenadas alfabeticamente por nombre");
		 for (Persona p:personas) System.out.println(p);
		 
	}	

}
