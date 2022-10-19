package ejemplos025_ordenArrayList1;
import java.util.*;
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
		 
		 System.out.println((personas.get(0).getNombre()).compareTo((personas.get(0).getNombre())));
		 System.out.println((personas.get(0).getNombre()).compareTo((personas.get(1).getNombre())));
		 System.out.println((personas.get(1).getNombre()).compareTo((personas.get(0).getNombre())));
		 
		 //No nos deja ordenar personas
		 //Collections.sort(personas);
		 
		 for(Persona p:personas) 
			 System.out.println(p);
	}	

}