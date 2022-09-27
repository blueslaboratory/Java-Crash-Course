package ejemplos026_excepciones4;

// Uso de excepciones ya implementadas en java
// En este caso el compilador no nos obliga al tratamiento de la excepcion
// En el caso de las excepciones de parseInt y valueOf no es necesario 
// capturarlas, solo si queremos mejorar la presentacion.
// Son las de tipo RuntimeException, como NumberFormatException.

// Sin embargo, System.in.read() obligatoriamente hay que capturarla,
// nos obliga el compilador.

import java.io.*;

public class ExcepcionApp {
	public static void main(String[] args) {

		String str1 = "4";
		String str2 = "a";
		String respuesta = "";
		int numerador, denominador, cociente;

		numerador = Integer.parseInt(str1);
		denominador = Integer.parseInt(str2);

		/*
		 * parseInt: public static int parseInt(String s) throws NumberFormatException
		 */

		cociente = numerador / denominador;

		respuesta = String.valueOf(cociente);
		// valueOf obtiene la representacion como String del parametro entero
		/* public static String valueOf(int i) */

		System.out.println("El resultado es " + respuesta);

		/*
		 * System.in.read(); read public abstract int read() throws IOException
		 */
		try {
			// espera la pulsacion de una tecla y luego RETORNO (enter)
			System.in.read();
		} catch (IOException e) {
			System.out.println("Error " + e);
		} // Obligatorio recoger la excepcion

		// System.in.read();

	}
}