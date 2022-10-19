package ejemplos020_arraylist1;
import java.util.*;

public class BorrarGrupo{
	public static void main(String[] args) {
      
    //Creamos un ArrayList vacio
    ArrayList<String> lista1 = new ArrayList<String>();

    //Anadimos valores
    lista1.add("Blanco");
    lista1.add("Negro");
    lista1.add("Rojo");
	
    //Creamos otro ArrayList vacio
	ArrayList<String> lista2 = new ArrayList<String>();
	
    //use add() method to add values in the list 
	lista2.add("Verde"); 
	lista2.add("Rojo"); 
	lista2.add("Blanco");
	
	System.out.println("Lista primera: "+ lista1);
	System.out.println("Lista segunda sin borrar: "+ lista2);
	
    //borramos todos los elementos de la segunda lista que esten en la primera
	//quedaria el negro
	lista2.removeAll(lista1);
	System.out.println("Se borran de la lista segunda los que están en la lista primera");
	
    System.out.println("Lista primera: "+ lista1);
	System.out.println("Lista segunda: "+ lista2);

  }
} 
