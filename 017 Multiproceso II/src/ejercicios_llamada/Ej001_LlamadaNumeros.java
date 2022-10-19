/*
Escribe un programa que reciba un argumento y que retorne (System.exit()) los siguientes
valores:
	- Devolvera -1 si el argumento viene vacio
	- Devolvera -2 si el argumento no es un entero
	- Devolvera -3 si el argumento es un entero negativo
	- Devolvera  0 si el argumento es un entero positivo
Escribe otro programa que pida por consola que se introduzca un numero entero positivo.
Con el dato introducido llamara al programa anterior y le confirmara al usuario si el dato
introducido es correcto.
Prueba y documenta todas las posibles respuestas.
*/

package ejercicios_llamada;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Ej001_LlamadaNumeros {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// creamos objeto File al directorio donde esta Ejemplo2
		// File directorio = new
		File directorio = new File("E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin");
		// File directorio = new File("/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/016 Multiproceso/bin");
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce el numero: ");
			String numero = sc.nextLine();

			// El proceso a ejecutar es ejercicios_lectura.Ej001_Numeros
			ProcessBuilder pb = new ProcessBuilder("java", "ejercicios_lectura.Ej001_ConsumoNumeros");

			// se establece el directorio donde se encuentra el ejecutable
			pb.directory(directorio);

			// System.out.printf("Directorio de trabajo: %s%n", pb.directory());

			// se ejecuta el proceso
			Process p = pb.start();

			// nombre = nombre +"/n";
			OutputStream os = p.getOutputStream();
			os.write(numero.getBytes());
			os.flush();
			os.close();

			// COMPROBACION DE ERROR
			// System.exit -> exitVal
			int exitVal = -1;
			try {
				exitVal = p.waitFor(); // le pide el valor del otro proceso cuando sale
				System.out.println("Valor de Salida: " + exitVal);
				System.out.print("Argumento: ");
				
				switch (exitVal) {
				case 0:
					System.out.println(" entero positivo");
					break;
				case -1:
					System.out.println(" vacio");
					break;
				case -2:
					System.out.println(" no es un entero");
					break;
				case -3:
					System.out.println(" entero negativo");
					break;
				}
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// obtener la salida devuelta por el proceso si exitVal==1
			if (exitVal == 1) {
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