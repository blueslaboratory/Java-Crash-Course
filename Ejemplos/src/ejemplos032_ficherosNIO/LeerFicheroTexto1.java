// Project -> Properties -> Run/Debug settings -> Nombre (class Name) -> edit -> arguments -> 
// "C:\Users\W10Alex\Desktop\Borrar"

package ejemplos032_ficherosNIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeerFicheroTexto1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=1)
			uso();
		
		String linea;
		Path path = Paths.get(args[0]);
		//https://stackoverflow.com/questions/5729806/encode-string-to-utf-8
		System.setProperty("file.encoding", "UTF-8"); // "ISO-8859-1" "UTF-8"
		Charset utf = Charset.forName("UTF-8");
//		try (BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset())){
		try (BufferedReader reader = Files.newBufferedReader(path, utf)){
			while((linea = reader.readLine()) != null)
				System.out.println(linea);
		} catch(IOException e) {
			System.err.println("ERROR: " +e);
			System.exit(1);
		} catch(Exception e) {
			System.err.println("ERROR: " +e);
			System.exit(1);
		}
	}

	private static void uso() {
		System.err.println(" java LeerFichTexto <ruta>");
		System.err.println(" El parametro ruta es obligatorio");
		System.exit(1);
	}
	
	
}
