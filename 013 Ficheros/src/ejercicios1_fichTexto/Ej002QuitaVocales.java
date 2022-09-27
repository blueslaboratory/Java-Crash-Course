/*
2.- Con un programa en java lee el fichero de texto anterior parrafo.txt, 
y genera otro fichero que sea el inicial pero sin las vocales. Muestra por 
pantalla ambos ficheros.
*/

package ejercicios1_fichTexto;

import java.io.*;

public class Ej002QuitaVocales {
	public static void main(String[] args) {
		char c;
		int n;
		String line;
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		
		
		try {
			//texto original		
			//Abro el fichero para lectura
			fr = new FileReader("text.txt");
			br = new BufferedReader(fr);
			
			System.out.println("\nTexto original:");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			//texto sin vocales
			//Abro el fichero para lectura			
			fr = new FileReader("text.txt");
			
			//Creo fichero para escritura
			File f = new File("text1.txt");
			fw = new FileWriter(f);
			
			//Leo el primer caracter del fichero
			n = fr.read();
			
			System.out.println("\nTexto sin vocales:");
			//while(fr.ready()) {
			while(n != -1) {
				c = (char)n;
				if((c!='a') && (c!='e') && (c!='i') && (c!='o') && (c!='u')) {
					fw.write(c);
					System.out.print(c);
				}
				n = fr.read(); // Leo el resto de caracteres del fichero
			}
			System.out.println("\n_____________________");
			System.out.println("\nSe han quitado las vocales en el .txt");
			
		} catch (Exception e) {
			System.out.println("Error de Lectura");
			
		} finally {
			try {
				if(fr!=null)
					fr.close();
				if(fw!=null)
					fw.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar");
			}
		}
	}
}
