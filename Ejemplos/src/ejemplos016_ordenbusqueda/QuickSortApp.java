//No hay que aprenderse estos algoritmos, solo entender, pero si como aplicar la recursividad
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html

package ejemplos016_ordenbusqueda;

public class QuickSortApp {

	public static void main(String[] args) {

		// final int TAMANIO=10;
		// int lista[]=new int [TAMANIO];

		// rellenarArray(lista);

		// Para probar:
		int lista[] = { 10, 2, 5, 8, 13 };

		String lista_String[] = { "americano", "Zagal", "pedro", "Tocado", "coz" };

		System.out.println("Array de números sin ordenar:");
		imprimirArray(lista);

		// ordenamos el array
		quicksort(lista, 0, lista.length - 1); //mandamos la lista y los extremos de la lista

		System.out.println("Array de números ordenado:");
		imprimirArray(lista);

		int numBuscar = numeroAleatorio();

		int resultado = buscar(lista, numBuscar);

		if (resultado != -1) {
			System.out.println("Encontrado " + numBuscar + " en posición: " + resultado);
		} else {
			System.out.println("El dato " + numBuscar + " no se encuentra en el array.");
		}

		System.out.println("Array de String sin ordenar:");
		imprimirArray(lista_String);

		// ordenamos el array
		quicksort(lista_String, 0, lista_String.length - 1);

		System.out.println("Array de String ordenado:");
		imprimirArray(lista_String);

	}

	public static void imprimirArray(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	public static void imprimirArray(String lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	public static void rellenarArray(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = numeroAleatorio();
		}
	}

	private static int numeroAleatorio() {
		return ((int) Math.floor(Math.random() * 1000));
	}

	public static void quicksort(int lista1[], int izq, int der) {
		int i = izq;
		int j = der;
		int pivote = lista1[(i + j) / 2];
		do {

			while (lista1[i] < pivote) {
				i++;
			}

			while (lista1[j] > pivote) {
				j--;
			}
			// Si no se han cruzado intercambiamos
			
			if (i <= j) {
				System.out.println("Intercambiamos i " + i + " " + lista1[i] + " con j " + j + " " + lista1[j]);
				int aux = lista1[i];
				lista1[i] = lista1[j];
				lista1[j] = aux;
				i++;
				j--;
			}

		} while (i <= j);

		System.out.println(" i " + i + " j " + j);
		
		imprimirArray(lista1);
		System.out.println();
		
		if (izq < j) {
			quicksort(lista1, izq, j);
		}
		
		if (i < der) {
			quicksort(lista1, i, der);
		}
	}

	public static void quicksort(String lista1[], int izq, int der) {
		int i = izq;
		int j = der;
		int pivote = (i + j) / 2;
		do {
			while (lista1[i].compareToIgnoreCase(lista1[pivote]) < 0) {
				i++;
			}
			while (lista1[j].compareToIgnoreCase(lista1[pivote]) > 0) {
				j--;
			}
			if (i <= j) {
				String aux = lista1[i];
				lista1[i] = lista1[j];
				lista1[j] = aux;
				i++;
				j--;
			}
		} while (i <= j);
		if (izq < j) {
			quicksort(lista1, izq, j);
		}
		if (i < der) {
			quicksort(lista1, i, der);
		}
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