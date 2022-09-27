package ejemplos032_ficherosNIO;

// ; javac Cat1 . java
// ; java Cat1 /tmp/bla
// ERROR: java.nio.file. NoSuchFileException: /tmp/bla
// java Cat1 Cat1. java

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
//import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.IOException;
//JAVA NIO NO ENTRA EN EL EXAMEN
//prints the contents of a file using an array of bytes
public class Cat1 {
	private static void uso() {
		System.err.println(" java Cat1 <ruta >");
		System.err.println(" Un parametro <ruta> es obligatorio");
		System.exit(1);
	}
	//C:/Users/Public/Pictures/Sample Pictures/Hydrangeas.jpg
	public static void main(String args[]) {
		if (args.length != 1)
			uso();

		Path path = Paths.get(args[0]); // Devuelve un objeto Path
		System.out.println(" Default Charset = " + Charset.defaultCharset());
		try {
			byte[] content = Files.readAllBytes(path); // No es conveniente para ficheros muy grandes
						
			//for (int i = 0; i < content.length; i++)
				//System.out.print((char) content[i]);
			System.out.print(new String(content, StandardCharsets.UTF_8));

		} catch (IOException e) {
			System.err.println(" ERROR: " + e);
			System.exit(1);
		}
	}
}
