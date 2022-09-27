// Project -> Properties -> Run/Debug settings -> Nombre (class Name) -> edit -> arguments ->
// "G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\Ejemplos\Desierto.jpg"

package ejemplos032_ficherosNIO;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

public class CopiarFichero2 {
	private static void usage() {
		System.err.println(" java CopiarFichero2 <input file > <output file >");
		System.exit(1);
	}

	public static void main(String args[]) {
		if (args.length != 2)
			usage();

		Path input = Paths.get(args[0]);
		Path output = Paths.get(args[1]);

		try (
			BufferedReader inputReader = Files.newBufferedReader(input,
					Charset.defaultCharset());
			BufferedWriter outputWriter = Files.newBufferedWriter(output,
					Charset.defaultCharset(), StandardOpenOption.WRITE,
					StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING)) {

			String linea; // Este ejemplo es valido para ficheros de texto
			while ((linea = inputReader.readLine()) != null) {
				outputWriter.write(linea, 0, linea.length());
				outputWriter.newLine();
			}
		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		} catch (Exception e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		}
	}
}
