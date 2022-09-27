package ejemplos020_arraylist;
import java.util.*;

public class ArrayListIteratorBorrar{
	public static void main(String[] args) {
		String removeElem = "Perl";
		
		ArrayList<String> myList = new ArrayList<String>();
		
		
		myList.add("Java");
		myList.add("Kotlin");
		myList.add("Kotlin");
		myList.add("Perl");
		myList.add("Perl");
		//si pones 2 Perl seguidos no funciona, necesitas un iterator
		myList.add("Unix");
		myList.add("Oracle");
		myList.add("Perl");
		myList.add("Perl");
		myList.add("Perl");
		myList.add("Perl");
		myList.add("Kotlin");
		myList.add("Kotlin");
		myList.add("C++");		
		myList.add("Perl");
		
		
		//errorBorrar1(myList, removeElem);
		
		
		borrar2(myList, removeElem);
		
		
		//ITERATOR
		ArrayList<Integer> nros = new ArrayList<Integer>(); 
		//se insertan elementos 
		Iterator<Integer> it = nros.iterator(); 
		//se crea el iterador it para el ArrayList nros 
		while(it.hasNext()) //mientras queden elementos 
			System.out.println(it.next()); //se obtienen y se muestran
		
		
		removeElem = "Kotlin";
		borrar3(myList, removeElem);
		
		
		//SUSTITUIR CON ITERATOR
		sustituir(myList, removeElem);
		
	}
	
	//enganchar objetos coche en un arraylist,
	//hacer el arraylistinv por metodos
	
	
	public static void errorBorrar1(ArrayList<String> myList, String removeElem) {
		//ERROR
		System.out.println("Antes de borrar Perl 1");
		System.out.println(myList);
		
		//el for each da problemas, habria que hacerlo con un size()
		for(String it:myList) {
			if(removeElem.equals(it))
				myList.remove(it);
		}
		
		System.out.println("Despues de borrar Perl 1");
		System.out.println(myList);
		
	}
	
	
	public static void borrar2(ArrayList<String> myList, String removeElem) {
		System.out.println("\nAntes de borrar Perl 2");
		System.out.println(myList);
		
		//el size() se come 1 de los elementos cuando >2 elementos iguales estan seguidos
		for(int i=0; i<myList.size(); i++) {
			if(removeElem.equals(myList.get(i)))
				myList.remove(i);
		}
		
		System.out.println("Despues de borrar Perl 2");
		System.out.println(myList);
	}
	
	
	public static void borrar3(ArrayList<String> myList, String removeElem) {
		System.out.println("\nAntes de borrar Kotlin con Iterator");
		System.out.println(myList);
		
		Iterator<String> it2 = myList.iterator();
		while(it2.hasNext()) {
			if(removeElem.equals(it2.next()))
				it2.remove();
		}
		
		System.out.println("Despues de borrar Kotlin con Iterator");
		System.out.println(myList);
	}
	
	public static void sustituir(ArrayList<String> myList, String removeElem) {
		//SUSTITUIR CON ITERATOR
		Iterator <String> it3 = myList.iterator();
		removeElem = "Perl";
		System.out.println("\nAntes de sustituir Perl 1");
		myList.add(1, "Perl");
		System.out.println(myList);
		System.out.println();

		it3 = myList.iterator();
		while(it3.hasNext())
			System.out.print(it3.next() +" ");
		
		//hay que crearlo cada vez que lo quieras usar
		it3 = myList.iterator(); 
		System.out.println();
		while(it3.hasNext()) {
			String pString = it3.next();
			if(pString.equalsIgnoreCase(removeElem)) {
				myList.set(myList.indexOf(pString), "Java");
			}
		}
		
		
		System.out.println("\nDespues de sustituir Perl 1");
		System.out.println(myList);
	}
}
