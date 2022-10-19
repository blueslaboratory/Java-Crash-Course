package ejemplos025_ordenArrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenArrayListInteger {
	public static void main(String[] args) {

		ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
		// Guardo datos en el ArrayList
		arrayListInt.add(3); 	arrayListInt.add(4);
		arrayListInt.add(2);	arrayListInt.add(6);
		arrayListInt.add(5);	arrayListInt.add(1);
		arrayListInt.add(7);
		
		System.out.println("\nOrden ascendente\n");
		
		// Ordenamos en orden ascendente
		Collections.sort(arrayListInt); //criterio por defecto
		
		// Imprimir el arrayList
		for(Integer i : arrayListInt)
			System.out.println(i);
		
		System.out.println("\nOrden descendente\n");
		
		// Ordenamos en orden descendente
		Collections.sort(arrayListInt, Collections.reverseOrder()); //2do parametro objeto comparator
		
		// Imprimir el arrayList
		for(Integer i : arrayListInt)
	     	System.out.println(i);
		
		// Otra forma, usando la interfaz Comparator:
		
//		public static <T> Comparator<T> reverseOrder()
//		
//		Returns a comparator that imposes the reverse of the natural ordering 
//		on a collection of objects that implement the Comparable interface. 
//		(The natural ordering is the ordering imposed by the objects' own compareTo method.)
//		This enables a simple idiom for sorting (or maintaining) collections
//		(or arrays) of objects that implement the Comparable interface
//		in reverse-natural-order. For example, suppose a is an array of strings. Then:
//
//		Arrays.sort(a, Collections.reverseOrder());	 
//		sorts the array in reverse-lexicographic (alphabetical) order.
//		
//		Comparator<Integer> comparador = Collections.reverseOrder();
//		Collections.sort(arrayListInt, comparador);
		
	}	
}
