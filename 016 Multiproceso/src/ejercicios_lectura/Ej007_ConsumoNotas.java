/*
Realiza un programa Java que reciba por parametros 2 argumentos, uno sera el nombre de
la asignatura y otro sera el nombre del fichero con las notas en esa asignatura (cada nota
estara en una linea).

Recorrera este fichero y calculara por un lado la media de notas en la asignatura y el
numero de aprobados en esa asignatura. Dejara en la salida estandar del programa algo
como esto:

“En la asignatura PSP
Han aprobado 3 alumnos
La media es 5.3”

Haz otro programa que le pida al usuario que vaya metiendo nombres de asignaturas y
nombres del fichero por consola. Por cada asignatura y fichero debe llamar al programa
anterior y decirnos alumnos aprobados y nota media.

Por cada iteraccion mostrara por pantalla la salida que devuelve el programa anterior.
El programa debe seguir pidiendo asignaturas y ficheros hasta que se introduzca un *.
*/

package ejercicios_lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej007_ConsumoNotas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Para recibir los args del ProcessBuilder: nombreAsignatura, nombreArchivo
		// no vale solo con llamar, hay que coger el telefono
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		String nombreAsignatura = args[0];
		//String nombreAsignatura = "bbdd";
		String nombreArchivo = args[1];
		//String nombreArchivo = "notas";

		String ruta = "E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\txts\\" +nombreArchivo +".txt";

		// Lectura
		float suma = 0; 
		float contador = 0; 
		float nota = 0;
		int aprobados = 0;
		
		File file = new File(ruta);
		FileReader fr = new FileReader(file);
		BufferedReader br2 = new BufferedReader(fr);
		
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine()) {
			nota = Float.parseFloat(sc.nextLine());
			suma = suma + nota;
			contador++;
			
			if (nota > 5) {
				aprobados++;
			}
		}
		
		float media = suma/contador;

		System.out.println("Asignatura:" + nombreAsignatura 
						  +"\nAprobados: " + aprobados
						  +"\nMedia: " + media);
	}

}
