package ejemplos029_ficheros4_ficheroTextoBuffered;

import java.io.*; //Importamos todas las clases de java.io.

public class FicheroTextoBufferedMetodos1 {

	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			// es mas recomendable poner el try y el catch aqui que dentro del
			// metodo y quien llame al metodo decida que mensaje se le pone
			// al usuario
			// G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\Ejemplos
			
			// Escribimos en el fichero
			bw = new BufferedWriter(new FileWriter("fichero1.txt"));
			escribeFichero(bw);

			// Guardamos los cambios del fichero
			bw.flush();

			// Leemos el fichero y lo mostramos por pantalla
			br = new BufferedReader(new FileReader("fichero1.txt"));
			leeFichero(br);
			
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		} finally {
			try {
				if (br != null)	br.close();
				if (bw != null)	bw.close();
			} catch (IOException e) {
				System.out.println("Error E/S: " + e);
			}
		}
	}

	/**
	 * escribeFichero
	 */
	public static void escribeFichero(BufferedWriter bw) throws IOException {
		// Escribimos en el fichero
		bw.write("Esto es una prueba usando Buffered");
		bw.newLine();
		bw.write("Seguimos usando Buffered");
		// Modificar para que se lean líneas de la consola
	}

	/**
	 * leeFichero
	 */
	public static void leeFichero(BufferedReader br) throws IOException {
		// Leemos el fichero y lo mostramos por pantalla
		String linea = br.readLine();
		while (linea != null) {
			System.out.println(linea);
			linea = br.readLine();
		}
	}

}