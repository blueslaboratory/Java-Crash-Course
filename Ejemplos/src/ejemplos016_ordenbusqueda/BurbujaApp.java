//No hay que aprenderse estos algoritmos, solo entender, pero si como aplicar la recursividad
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html

package ejemplos016_ordenbusqueda;

public class BurbujaApp {

	public static void main(String[] args) {

		final int TAMANIO = 10;
		int lista[] = new int[TAMANIO];
		rellenarArray(lista);

		String lista_String[] = { "americano", "Zagal", "pedro", "Tocado", "coz" };

		System.out.println("Array de n�meros sin ordenar:");
		imprimirArray(lista);

		// ordenamos el array
		burbuja(lista);

		System.out.println("Array de n�meros ordenado:");
		imprimirArray(lista);

		System.out.println("Array de String sin ordenar:");
		imprimirArray(lista_String);

		// ordenamos el array
		burbuja(lista_String);

		System.out.println("Array de String ordenado:");
		imprimirArray(lista_String);
	}

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
		return ((int) Math.floor(Math.random() * 1000));
	}

	//int
	public static void burbuja(int lista[]) {
		int cuentaintercambios;
		int variableauxiliar;
		boolean ordenado = false;

		// Usamos un bucle anidado, saldra cuando este ordenado el array
		while (!ordenado) {
			// Inicializamos la variable de nuevo para que empiece a contar de nuevo
			cuentaintercambios = 0;
			
			for (int i = 0; i < lista.length - 1; i++) {
				if (lista[i] > lista[i + 1]) {
					// Intercambiamos valores
					variableauxiliar = lista[i];
					lista[i] = lista[i + 1];
					lista[i + 1] = variableauxiliar;
					// indicamos que hay un cambio
					cuentaintercambios++;
				}
			}
			// Si no hay intercambios, es que esta ordenado.
			if (cuentaintercambios == 0) {
				ordenado = true;
			}
			
		}
	}

	//string
	public static void burbuja(String lista_palabras[]) {
		boolean ordenado = false;
		int cuentaIntercambios;
		String aux;

		// Usamos un bucle anidado, saldra cuando este ordenado el array
		while (!ordenado) {
			// Inicializamos la variable de nuevo para que empiece a contar de nuevo
			cuentaIntercambios = 0;
			
			for (int i = 0; i < lista_palabras.length - 1; i++) {
				if (lista_palabras[i].compareToIgnoreCase(lista_palabras[i + 1]) > 0) {
					// Intercambiamos valores
					aux = lista_palabras[i];
					lista_palabras[i] = lista_palabras[i + 1];
					lista_palabras[i + 1] = aux;
					// indicamos que hay un cambio
					cuentaIntercambios++;
				}
			}
			// Si no hay intercambios, es que esta ordenado.
			if (cuentaIntercambios == 0) {
				ordenado = true;
			}
			
		}

	}
}