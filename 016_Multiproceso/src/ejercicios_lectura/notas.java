package ejercicios_lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class notas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Para recibir los args del ProcessBuilder: nombreAsignatura, nombreArchivo
		// no vale solo con llamar, hay que coger el telefono
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String nombreAsignatura = args[0];
		// String nombreAsignatura = "bbdd";
		//String nombreArchivo = args[1];
		String nombreArchivo = "notas";
		String archivo = "E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016_Multiproceso\\bin\\" +nombreArchivo +".txt";

		// Ahora que ya se donde esta el archivo, leo el archivo de donde esta
		File doc = new File(archivo);
		BufferedReader obj = new BufferedReader(new FileReader(doc));
		Scanner obj1 = new Scanner(doc);
		
		float suma = 0;
		float contador = 0;
		float nota = 0;
		int aprobados = 0;		
		
		while (obj1.hasNextLine()) {
			nota = Float.parseFloat(obj1.nextLine());
			suma += nota;
			contador++;
			if (nota > 5) {
				aprobados++;
			}
		}
		float media = suma / contador;

		System.out.println("La asignatura es: " + nombreAsignatura + "\nHan aprobado la asignatura: " + aprobados
				+ " alumnos." + "\nLa media es: " + media);

	}

}
