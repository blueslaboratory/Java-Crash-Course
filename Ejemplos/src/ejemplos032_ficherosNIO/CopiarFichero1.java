// Project -> Properties -> Run/Debug settings -> Nombre (class Name) -> edit -> arguments ->
// "G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\Ejemplos\Desierto.jpg"

package ejemplos032_ficherosNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CopiarFichero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2)
			uso();
		// "G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\Ejemplos\Desierto.jpg"
		Path inputFile = Paths.get(args[0]);
		// Se copia en el mismo y aumenta el tamano del archivo
		Path outputFile = Paths.get(args[0]);
		
		try {
			byte[] contents = Files.readAllBytes(inputFile);
//			Files.write(outputFile, contents, StandardOpenOption.WRITE, StandardOpenOption.CREATE,
//					StandardOpenOption.TRUNCATE_EXISTING);
			Files.write(outputFile, contents, StandardOpenOption.WRITE, StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
		} catch(IOException e) {
			System.err.println("ERROR: " +e);
			System.exit(1);
		} catch(Exception e) {
			System.err.println("ERROR: " +e);
			System.exit(1);
		}
	}

	private static void uso() {
		System.err.println(" java CopiarFichero <ruta entrada> <ruta salida>");
		System.exit(1);
	}
	
	
}