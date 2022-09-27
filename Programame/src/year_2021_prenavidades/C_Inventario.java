package year_2021_prenavidades;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C_Inventario {
	// ruta base en nuestro sistema operativo donde dejaremos los ficheros de datos
	// de entrada
	static final String RUTA_BASE = "";

	// ruta base con el objeto de la clase Scanner que usaremos para leer los datos
	// de entrada
	static Scanner lector;

	public static void main(String[] args) {
		Scanner lector = null;
		/*
		 * comentar las siguientes líneas hasta el fin del bloque catch en el juez en
		 * línea
		 */

		/*
		File fichero;
		try {

			String ruta = RUTA_BASE + "c_inventario.in";
			fichero = new File(ruta);
			lector = new Scanner(fichero);

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1); // abandonamos la aplicación si se producen erores }
		}
		*/
		
		/* */
		// Fin del comentario multilínea

		lector = new Scanner(System.in); // descomentar esta línea en el Juez en
		// Línea

		// CASO 3: Hemos de procesar todas las entradas hasta llegar al fin del flujo de
		// entrada
		ArrayList<String> inventario;

		// CASO 1: La primera entrada nos indica el número de casos que tenemos que
		// procesar
		int repeticiones;

		// CASO 2: Hemos de procesar todas las entradas hasta llegar a un caso especial,
		// que ignoraremos
		boolean terminar = false;

		while (!terminar && lector.hasNext()) {

			// la primera entrada es el número de repeticiones
			repeticiones = Integer.parseInt(lector.nextLine());
			int nProductos = 0;
			inventario = new ArrayList<String>();

			if (repeticiones > 0) {

				for (int i = 0; i < repeticiones; i++) {
					// lectura de entradas
					String producto = lector.nextLine();
					inventario.add(producto.toLowerCase());

					// procesamiento

					// salida de resultados, en el formato que nos pida el enunciado

				} // fin del for

				Collections.sort(inventario);
/*
				System.out.println("size" +inventario.size());
				
				for (String p : inventario) {
					System.out.println(p);
				}
*/
				nProductos = 1;

				String pAuxiliar = inventario.get(0);

				for (int i = 1; i < inventario.size(); i++) {

					if (pAuxiliar.equals(inventario.get(i))) {
						//i++;
					} else {
						nProductos++;
						pAuxiliar = inventario.get(i);

					}
				}
				
				
				
				
				
				
				/*
				
				if(inventario.size()>1) {
					if(!inventario.get(inventario.size()-1).equals(inventario.get(inventario.size()-2)))
						nProductos++;
				}
				*/

				/*
				 * for(int j=0; j<inventario.size();j++) { for(int i=j; i<inventario.size();
				 * i++) {
				 * 
				 * 
				 * if(pAuxiliar.equals(inventario.get(i))) { i++; } else { nProductos++;
				 * pAuxiliar = inventario.get(i);
				 * 
				 * } } }
				 */

				
				System.out.println(nProductos);
			} else {
				// activamos la condición de terminación
				terminar = true;
			}

		}

	} // fin del main

}
