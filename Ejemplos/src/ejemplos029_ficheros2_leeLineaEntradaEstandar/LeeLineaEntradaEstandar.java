// NOTA:
// Salto de linea en MAC y LINUX \n
// Salto de linea en WINDOWS \r\n

package ejemplos029_ficheros2_leeLineaEntradaEstandar;

import java.io.IOException;

// Ejemplo de lectura de lineas entrada estandar CARACTER A CARACTER
// hasta completar una linea.  

public class LeeLineaEntradaEstandar {
	public static void main(String args[]) {
		int c;
		int contador = 0;
		try {

//		 	while ((c = System.in.read()) != '\n') {
//			    // Se lee de la entrada estandar hasta encontrar el caracter de fin de linea
//			    // En ese momento termina el programa
//
//			 	contador++;
//			 	System.out.print((char) c);
//			}

			
			
			while ((c = System.in.read()) != -1) {
				// Asi leemos hasta introducir el caracter de fin de fichero (Ctrl+Z)
				// A veces no funciona, hay que cambiar al depurador y pinchar en el proceso, 
				// un poco raro lo de System.in.read()) != -1, mejor con '\n'
				contador++;
				System.out.print(" " + contador + " ");
				System.out.println((char) c);
			}

			System.out.println(); // Se escribe el fin de linea
			System.err.println("Contados " + contador + " bytes en total.");
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}