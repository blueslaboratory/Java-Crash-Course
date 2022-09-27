package ejemplos025_ordenArrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenArrayListStrings {
	public static void main(String[] args) {

		ArrayList<String> arrayListString = new ArrayList<String>();
		// Guardo datos en el ArrayList
		arrayListString.add("Pepe"); 
		arrayListString.add("Paco");
		arrayListString.add("Juan");
		arrayListString.add("Susi");
		arrayListString.add("Lola");
		arrayListString.add("Jose");
		arrayListString.add("Dani");
		arrayListString.add("Sara");

		System.out.println("\nOrden ascendente\n");
		
		// Ordenamos en orden ascendente
		Collections.sort(arrayListString);
		
		// Imprimir el arrayList
		for(String s : arrayListString)
			System.out.println(s);
		
		// Podemos ver que no se ha ordenado nada...
		
		System.out.println("\nOrden descendente\n");
		
		// Ordenamos en orden descendente
		Collections.sort(arrayListString, Collections.reverseOrder());
		
		// Imprimir el arrayList
		for(String s : arrayListString)
			System.out.println(s);
		
		// Otra forma, usando la interfaz Comparator:
			
		Comparator<String> comparador = Collections.reverseOrder();
		Collections.sort(arrayListString, comparador);
		
	}	
}
