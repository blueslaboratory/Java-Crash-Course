package ejemplos020_arraylist;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList<String> listaPaises = new ArrayList<String>();
		
		listaPaises.add("Spain"); //Ocupa la posicion 0 
		listaPaises.add("Francia"); //Ocupa la posicion 1 
		listaPaises.add("Portugal"); //Ocupa la posicion 2
		
		System.out.println(listaPaises);
		System.out.println("******************************");
		
		
		//ADD
		System.out.println("ADD");
		listaPaises.add(1, "Italia"); //Ahora es: Spain, Italia, Francia, Portugal
		System.out.println(listaPaises);
		//listaPaises.add(5, "Alemania"); //IndexOutOfBoundsException
		listaPaises.add(4, "Alemania"); //IndexOutOfBoundsException
		System.out.println(listaPaises);
		System.out.println("******************************");
		
		
		//REMOVE
		System.out.println("REMOVE");
		listaPaises.remove(2);
		System.out.println(listaPaises);
		listaPaises.remove("Portugal"); //Solo borra 1 Portugal, para borrar mas: bucle
		System.out.println(listaPaises);
		System.out.println("******************************");
		
		
		//SET Y GET
		System.out.println("SET AND GET");
		System.out.println(listaPaises.get(2));
		listaPaises.set(0, "EEUU");
		System.out.println(listaPaises);
		System.out.println("******************************");
		
		
		//INDEXOF
		System.out.println("INDEXOF");
		String paisBuscado = "Francia"; 
		int pos = listaPaises.indexOf(paisBuscado); 
		if(pos!=-1) 
			System.out.println(paisBuscado + " encontrado en la posicion: "+pos); 
		else 
			System.out.println(paisBuscado + " no se ha encontrado");
		System.out.println("******************************");
		
		
		//RECORRER ARRAYLIST
		System.out.println("RECORRER");
		System.out.println("Size " +listaPaises.size());
		for (int i=0; i<listaPaises.size(); i++) 
			System.out.print(listaPaises.get(i) +"   "); 
		System.out.println();
		
		for(String pais:listaPaises)
			System.out.print(pais +"   ");
		System.out.println();
		System.out.println("******************************");
		
		
		//OTROS METODOS
		System.out.println("OTROS METODOS");
		//Object clone(): Retorna una copia de la lista. 
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html#clone()
		//Returns a shallow copy of this ArrayList instance. (The elements themselves are not copied.)
		ArrayList<String> listaPaisesClone = new ArrayList<String>();
		listaPaisesClone = (ArrayList<String>)listaPaises.clone();//Casting
		System.out.println(listaPaisesClone);
		System.out.println("listaPaises == listaPaisesClone: " +(listaPaises == listaPaisesClone));
		
		ArrayList<String> listaPaisesClone2 = new ArrayList<String>(listaPaises);
		System.out.println(listaPaisesClone2);
		System.out.println("listaPaises == listaPaisesClone2: " +(listaPaises == listaPaisesClone2));
		
		//boolean contains(Object elemento): Retorna true si se encuentra 
		//el elemento indicado en la lista, y false en caso contrario.
		System.out.println("Alemania: " +((listaPaises.contains("Alemania"))? "true":"false"));
		
		//void clear(): Borra todo el contenido de la lista. 
		listaPaisesClone.clear();
		System.out.println(listaPaisesClone);
		
		//boolean isEmpty(): Retorna true si la lista esta vacia.		
		System.out.println("listaPaises empty: " +(listaPaises.isEmpty()? "true":"false"));
		System.out.println("listaPaisesClone empty: " +(listaPaisesClone.isEmpty()? "true":"false"));

	}
}