package ejemplos030_ficherosSerializable5_pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertirArrayList {
	public static void main(String args[]) {		

        String[] myArray = new String[] { "1", "2", "3" };

		// Para no utilizar el add: ConvertirArrayEnLista.docx
		// Este metodo permite convertir un array en una lista, y tambien 
		// puede anadir elementos adicionales a la lista resultante
		List<String> myList = new ArrayList<>(Arrays.asList(myArray));
		
        System.out.println("After conversion from array to list: " + myList);
        myList.add("4");
        System.out.println("After adding a new element: " + myList );
    }
}