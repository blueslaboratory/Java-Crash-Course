package ejemplos032_ficherosNIO;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
// Eclipse en Windows -> Preferences -> General -> Workspace -> Text file encoding y Content Types -> Text -> Default encoding
public class Grep1 {
	// Busca un texto en un fichero y devuelve el numero de la linea donde esta
	// Si no esta...
	private static void usage() {
		System.err.println(" java Grep <input file> <texto>");
		System.exit(1);
	}

	public static void main(String args[]) {
		if (args.length != 2)
			usage();

		Path input = Paths.get(args[0]);

		try (BufferedReader inputReader = Files.newBufferedReader(input, StandardCharsets.ISO_8859_1)) {
			//  Charset.defaultCharset()		

			String linea;
			long numLinea = 1;
			while ((linea = inputReader.readLine()) != null) {
				if (linea.contains(args[1]))
					System.out.println(numLinea + ": " + linea);
				numLinea++;
			}

			
		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		}
	}

}
