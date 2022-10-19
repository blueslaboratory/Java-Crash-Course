//No hay que aprenderse estos algoritmos, solo entender, pero si como aplicar la recursividad
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html

/* Intercambio: consiste en comparar el primer valor con el resto 
 * de las posiciones posteriores, cambiando el valor
 * de las posiciones en caso de que el segundo sea menor que 
 * el primero comparado, después la segunda posición 
 * con el resto de posiciones posteriores lo mismo
 */

package ejemplos016_ordenbusqueda;

public class IntercambioApp {

	public static void main(String[] args) {

		final int SIZE = 10;
		int lista[] = new int[SIZE];

		rellenarArray(lista);

		String lista_String[] = { "americano", "Zagal", "pedro", "Tocado", "coz" };

		// *******************************************************************//

		System.out.println("Array de números sin ordenar:");
		imprimirArray(lista);

		// ordenamos el array
		intercambio(lista);

		System.out.println("Array de números ordenado:");
		imprimirArray(lista);

		// *******************************************************************//

		System.out.println("Array de String sin ordenar:");
		imprimirArray(lista_String);

		// ordenamos el array
		intercambio(lista_String);

		System.out.println("Array de String ordenado:");
		imprimirArray(lista_String);

	}

	//2 metodos con el mismo nombre: sobrecarga
	//int
	public static void imprimirArray(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	//string
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
		return ((int) Math.floor(Math.random() * 1000)); //0-999
	}

	//int
	public static void intercambio(int lista[]) {
		int variableauxiliar;

		// Usamos un bucle anidado hasta la penultima posicion
		for (int i = 0; i < (lista.length - 1); i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i] > lista[j]) {
					// Intercambiamos valores
					variableauxiliar = lista[i];
					lista[i] = lista[j];
					lista[j] = variableauxiliar;
				}
			}
		}
	}

	//string
	//2 metodos con el mismo nombre: sobrecarga
	public static void intercambio(String lista[]) {
		String variableauxiliar;

		// Usamos un bucle anidado hasta la penultima posicion
		for (int i = 0; i < (lista.length - 1); i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i].compareToIgnoreCase(lista[j]) > 0) {
					//las mayus van en el abecedario por delante de las minus
					// Intercambiamos valores
					variableauxiliar = lista[i];
					lista[i] = lista[j];
					lista[j] = variableauxiliar;
				}
			}
		}
	}
}