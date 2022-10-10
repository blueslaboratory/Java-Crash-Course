/*
Realiza un programa Java que reciba por parametros 2 argumentos, uno sera el nombre de
la asignatura y otro sera el nombre del fichero con las notas en esa asignatura (cada nota
estara en una linea).

Recorrera este fichero y calculara por un lado la media de notas en la asignatura y el
numero de aprobados en esa asignatura. Dejara en la salida estandar del programa algo
como esto:

�En la asignatura PSP
Han aprobado 3 alumnos
La media es 5.3�

Haz otro programa que le pida al usuario que vaya metiendo nombres de asignaturas y
nombres del fichero por consola. Por cada asignatura y fichero debe llamar al programa
anterior y decirnos alumnos aprobados y nota media.

Por cada interaccion mostrara por pantalla la salida que devuelve el programa anterior.
El programa debe seguir pidiendo asignaturas y ficheros hasta que se introduzca un *.
*/

package ejercicios_llamada;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ej007 {

	// TIENE QUE ESTAR EN LA RUTA DEL QUE CONSUME NO DEL QUE LLAMA
	public static final String RUTA = "E:\\DOCUMENTS\\DA2D1E - 2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin";

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String asignatura = null, nomArchivo = "";

		System.out.println("Nombre de la asignatura: ");
		asignatura = sc.nextLine();

		System.out.println("Nombre del fichero de notas: ");
		nomArchivo = sc.nextLine();

		// creamos los objetos File
		// entrada datos consumo
		File notasFile = new File(RUTA, nomArchivo + ".txt");
		// entrada datos salida
		File resumenNotas = new File(RUTA, "ResumenNotas.txt");
		// entrada datos errores
		File error = new File(RUTA, "error.txt");
		// dato.txt -> hay que tenerlo creado en E:\DOCUMENTS\DA2D1E -
		// 2\Programacion\Eclipse-workspace\016 Multiproceso\bin
		File directorio = new File(RUTA);

		// El proceso a ejecutar
		ProcessBuilder pb = new ProcessBuilder("java", "ejercicios_lectura.Ej007", asignatura, nomArchivo);

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);
		System.out.printf("Directorio de trabajo: %s%n", pb.directory());

		// redirigiendo el flujo a los ficheros
		
		pb.redirectInput(notasFile);
		pb.redirectOutput(resumenNotas);
		pb.redirectError(error);
		

		// se ejecuta el proceso
		Process p = pb.start();

		// COMPROBACION DE ERROR
		// 0 bien
		// -1 mal
		int exitVal = -1;
		try {
			exitVal = p.waitFor(); // System.exit(estadoProceso);
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Imprimiendo por la consola
		if (exitVal == 0 || exitVal == -1) {
			try {
				InputStream is = p.getInputStream();
				// mostramos en pantalla caracter a caracter
				int c;
				while ((c = is.read()) != -1)
					System.out.print((char) c);
				// is.close();
				System.exit(0);

			} catch (Exception e) {
				System.exit(-1);
				e.printStackTrace();
			}
		}

		sc.close();
	}

}