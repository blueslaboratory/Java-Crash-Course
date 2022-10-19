package ejemplos025_ordenArrayList2;

import java.util.ArrayList;
import java.util.Collections;

public class PersonasOrden2 {
	public static void main(String[] args) {	
		 Persona p1 = new Persona("Alfonso", 28); //Pepe
		 Persona p2 = new Persona("Carlos", 32); //Juan
		 Persona p3 = new Persona("Carlos", 32); //Juan
		 
		 System.out.println(p1.compareTo(p2));
		 System.out.println(p2.compareTo(p1));
		 System.out.println(p2.compareTo(p3));		
	}	
}
