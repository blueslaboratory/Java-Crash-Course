package ejemplos032_ficherosNIO;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

// Copia linea a linea solo las lineas que estan en mayusculas de un fichero en otro
public class CopiaMayusculas {
	private static void usage() {
		System.err.println(" java CopiaMayusculas <input file > <output file >");
		System.exit(1);
	}

	public static void main(String args[]) {
		if (args.length != 2)
			usage();

		Path input = Paths.get(args[0]);
		Path output = Paths.get(args[1]);

		try {
			BufferedReader inputReader = Files.newBufferedReader(input, Charset.defaultCharset());
			BufferedWriter outputWriter = Files.newBufferedWriter(output, Charset.defaultCharset(),
					StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

			String line;
			while ((line = inputReader.readLine()) != null) {
				if (line.equals(line.toUpperCase())) {
					outputWriter.write(line, 0, line.length());
					outputWriter.newLine();
				}
			}

			inputReader.close();
			outputWriter.close();
		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		}
	}
}
