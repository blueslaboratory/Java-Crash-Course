package ejemplos032_ficherosNIO;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;
import java.io.IOException;
//JAVA NIO NO ENTRA EN EL EXAMEN
// By default, Files.readAllLines() uses UTF-8 character encoding.
// But you can specify a different character encoding like below:

// List<String> lines = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_16);

// prints the contents of a file using a BufferedReader
public class Cat2 {
	private static void uso() {
		System.err.println(" java Cat2 <ruta >");
		System.err.println(" Un parametro <ruta> es obligatorio");
		System.exit(1);
	}

	public static void main(String args[]) {
		if (args.length != 1)
			uso();

		Path path = Paths.get(args[0]);
		try {
			// lee todas las lineas
		    List<String> lines = Files.readAllLines(path);
		    
		    // print all lines
		    for (String line : lines) {
		        System.out.println(line);
		    }
		} catch (IOException e) {
			System.err.println(" ERROR: " + e);
			System.exit(1);
		}
		
	}
}