//Este es el que hay que mirar, lo vamos a utilizar mucho
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html

package ejemplos016_ordenbusqueda;
import java.util.Arrays;
import java.util.Collections; 

public class SortApp {

	public static void main(String[] args) {

		final int SIZE = 10;
		int lista[] = new int [SIZE];
		rellenarArray(lista);

		String lista_String[] = {"americano", "Zagal", "pedro", "Tocado", "coz"};

		
		System.out.println("Array de numeros sin ordenar:");
		imprimirArray(lista);

		//ordenamos el array
		Arrays.sort(lista);
		System.out.println("Array de numeros ordenado:");
		imprimirArray(lista);

		
		
		System.out.println("Array de String sin ordenar:");
		imprimirArray(lista_String);

		//ordenamos el array, ordenara primero las mayusculas y luego las minusculas
		Arrays.sort(lista_String);
		System.out.println("Array de String ordenado:");
		imprimirArray(lista_String);
		
		
		
		/*****************************************/
		/*  Para imprimir en orden descendente:  */
		/*****************************************/
		
		System.out.println("Ahora ordenando descendentemente:");
		Integer [] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
		Arrays.sort(numeros, Collections.reverseOrder());
		for (int n : numeros) {
			System.out.println(n);
		}
		
		// Tened en cuenta que primero van las mayúsculas y luego las minúsculas 		
		Arrays.sort(lista_String, Collections.reverseOrder());
		for(String s : lista_String)
	     	System.out.println(s);
		
		
		//BUSCAR
		int numBuscar = numeroAleatorio();
		int resultado = buscar(lista, numBuscar);
		
		if (resultado != -1) {
			System.out.println("Encontrado " + numBuscar + " en posición: " + resultado);
		} else {
			System.out.println("El dato " + numBuscar + " no se encuentra en el array.");
		}
		
	}

	//int
	public static void imprimirArray (int lista[]){
		for(int i=0;i<lista.length;i++){
			System.out.println(lista[i]);
		}
		
		/*
		for(int i : lista)
			System.out.println(lista[i]);
		*/
	}
	
	//string
	public static void imprimirArray (String lista[]){
		for(int i=0;i<lista.length;i++){
			System.out.println(lista[i]);
		}
		
		/*
		for(String s : lista)
			System.out.println(lista[i]);
		*/
	}

	public static void rellenarArray (int lista[]){
		for(int i=0;i<lista.length;i++){
			lista[i]=numeroAleatorio();
		}
	}

	private static int numeroAleatorio (){
		return ((int)Math.floor(Math.random()*1000));
	}
	
	// El algortimo de busqueda se ha simplificado al estar ordenado el array
	public static int buscar(int[] lista, int dato) {
		int inicio = 0;
		int fin = lista.length - 1;
		int pos;
		while (inicio <= fin) {
			pos = (inicio + fin) / 2;
			if (lista[pos] == dato)
				return pos;
			else if (lista[pos] < dato)
				inicio = pos + 1;
			else
				fin = pos - 1;
		}
		return -1;
	}
}

