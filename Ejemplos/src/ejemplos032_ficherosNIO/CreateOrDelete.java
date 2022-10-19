// JAVA NIO NO ENTRA EN EL EXAMEN

// Project -> Properties -> Run/Debug settings -> Nombre (class Name) -> edit -> arguments -> 
// "C:\Users\W10Alex\Desktop\Borrar"

package ejemplos032_ficherosNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateOrDelete {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=1)
			uso();
		
		Path path = Paths.get(args[0]);
		try {
			if(Files.exists(path)) {
				Files.delete(path);
				System.out.println("Borrado");
			}
			else {
				Files.createFile(path); //Esto si crea un fichero
				System.out.println("Creado");
			}
		} catch(IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}

	private static void uso() {
		System.err.println(" java CreateOrDelete <ruta>");
		System.err.println(" El parametro ruta es obligatorio");
		System.exit(1);
		
	}
}
