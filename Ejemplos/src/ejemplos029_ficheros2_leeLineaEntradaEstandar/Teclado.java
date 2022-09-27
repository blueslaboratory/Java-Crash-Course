// Esto es lo que viene a hacer la clase Scanner

package ejemplos029_ficheros2_leeLineaEntradaEstandar;

import java.io.*;

public class Teclado {

	/** variable de clase asignada a la entrada estandar del sistema */
	public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad;
		int num;
		
		System.out.print("Nombre: ");
		cad = Teclado.leerString();
		System.out.println("Return leerString(): " +cad);
		
		System.out.print("Numero favorito: ");
		num = Teclado.leerInt();
		System.out.println("Return leerInt(): " +num);
	}

	
	/**
	 * lee una cadena desde la entrada estandar
	 * 
	 * @return cadena de tipo String
	 */
	public static String leerString() {
		String cadena = "";

		try {
			cadena = new String(entrada.readLine());
			//antes la clase String no estaba en Java implicitamente
		} catch (IOException e) {
			System.out.println("Error de E/S");
		}
		return cadena;
	}

	/**
	 * lee un numero entero desde la entrada estandar
	 * 
	 * @return numero entero de tipo int
	 */
	public static int leerInt() {
		int entero = 0;
		boolean error = false;

		do {
			try {
				error = false;
				entero = Integer.valueOf(entrada.readLine());
			} catch (NumberFormatException e1) {
				error = true;
				System.out.println("Error en el formato del numero, intentelo de nuevo.");
			} catch (IOException e) {
				System.out.println("Error de E/S");
			}
		} while (error);

		return entero;
	}
} 

// final de la clase Teclado