// Ejercicio 003
// Crea un programa que lee desde la entrada estandar hasta escribir un *. Por cada linea
// leida debe validar si es un numero, una cadena o un *.
// Si en alguna linea hay una cadena, el programa saldra con un error -1 (System.exit()).
// Si no hay cadenas, los numeros se sumaran hasta que aparezca un �*�.
// Cuando lea un *, dejara de leer la entrada estandar.El programa dejara en la salida 
// estandar la suma de los numeros recibidos y devolvera que todo ha ido correctamente.
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

public class Ej003_LlamadaAsterisco {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// creamos objeto File al directorio donde esta ejercicios_lectura.Ej003_ConsumoAsterisco
		// File directorioWindows = new File("E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin");
		File directorioLinux = new File("/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/016 Multiproceso/bin");
		Scanner sc = new Scanner(System.in);

		// El proceso a ejecutar es Ej003
		ProcessBuilder pb = new ProcessBuilder("java", "ejercicios_lectura.Ej003_ConsumoAsterisco");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorioLinux);

		System.out.printf("Directorio de trabajo: %s%n", pb.directory());

		// Logica
		String cadena = "";
		String r = "*";

		do {
			System.out.print("Introduce un numero: ");
			r = sc.nextLine();
			cadena = cadena +r + "\n";
		} while (r.equals("*") == false);

		System.out.println("Cadena: \n" +cadena);
		// se ejecuta el proceso
		Process p = pb.start();

		// nombre = nombre +"/n";
		OutputStream os = p.getOutputStream(); // get el OutputStream de Ej003_ConsumoAsterisco.java
		os.write(cadena.getBytes()); // escribir cadena en el OutputStream de Ej003_ConsumoAsterisco.java
		os.flush();
		os.close();

		// COMPROBACION DE ERROR
		// 99 bien
		// -1 mal
		int exitVal = -1;
		try {
			exitVal = p.waitFor(); // le pide el valor del otro proceso cuando sale
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// obtener la salida devuelta por el proceso si exitVal==99 o exitVal==-1 
		if (exitVal == 99 || exitVal == -1) {
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

	}

}
