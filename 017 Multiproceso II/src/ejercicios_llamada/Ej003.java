// Ejercicio 003
// Crea un programa que lee desde la entrada estandar hasta escribir un *. Por cada linea
// leida debe validar si es un numero, una cadena o un *.
// Si en alguna linea hay una cadena, el programa saldra con un error -1 (System.exit()).
// Si no hay cadenas, los numeros se sumaran hasta que aparezca un “*”.
// Cuando lea un *, dejara de leer la entrada estandar.El programa dejara en la salida 
// estandar la suma de los numeros recibidos y devolvera que
// todo ha ido correctamente.
// Haz otro programa que le pida al usuario que vaya metiendo numeros por consola. El
// programa debe permitir meter numeros hasta que se introduzca un *. No debe validar si lo
// que se mete son numeros o no.
// Una vez se haya acabado de meter numeros, llamara al programa anterior pasando los
// datos que se han recogido de la consola y pintara la salida con la suma de los numeros
// introducidos.

package ejercicios_llamada;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Ej003 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// creamos objeto File al directorio donde esta Ejemplo2
		// File directorio = new
		File directorio = new File("E:\\DOCUMENTS\\DA2D1E - 2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin");
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce el numero: ");
			String numero = sc.nextLine();

			// El proceso a ejecutar es Ejemplo2
			ProcessBuilder pb = new ProcessBuilder("java", "ejercicios_lectura.Ej001");

			// se establece el directorio donde se encuentra el ejecutable
			pb.directory(directorio);

			System.out.printf("Directorio de trabajo: %s%n", pb.directory());

			// se ejecuta el proceso
			Process p = pb.start();

			// nombre = nombre +"/n";
			OutputStream os = p.getOutputStream();
			os.write(numero.getBytes());
			os.flush();
			os.close();

			// COMPROBACION DE ERROR
			// - 0 bien
			// - 1 mal
			int exitVal = -1;
			try {
				exitVal = p.waitFor(); // le pide el valor del otro proceso cuando sale
				System.out.println("Valor de Salida: " + exitVal);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (exitVal == 1) {
				// obtener la salida devuelta por el proceso si exitVal==1
				try {
					InputStream is = p.getInputStream();
					int c;

					while ((c = is.read()) != -1)
						System.out.print((char) c);

					is.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} while (sc.nextLine() != null);
	}

}
