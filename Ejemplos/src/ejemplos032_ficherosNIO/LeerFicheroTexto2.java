package ejemplos032_ficherosNIO;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class LeerFicheroTexto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "origen.txt";
		
		FileSystem sistemaFicheros = FileSystems.getDefault();
		
		Path rutaFichero = sistemaFicheros.getPath(fileName);
		int cont = 0;
		
		try {
			List<String> texto = Files.readAllLines(rutaFichero);
			for(String cadena : texto) {
				System.out.println(cadena);
				cont++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\nLineas en el fichero: " +cont);
	}

}
