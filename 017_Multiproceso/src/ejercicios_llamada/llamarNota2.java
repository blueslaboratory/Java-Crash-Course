import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class llamarNota2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		System.out.println("Escribe el nombre de la asignatura:");
		Scanner sc = new Scanner(System.in);
	        // entrada de una cadena
        	String nombreAsignatura = sc.nextLine();
        	
        	System.out.println("Escribe el nombre del archivo:");	
        	
        	String nombreArchivo = sc.nextLine();
        	
        	
		//creamos objeto File al directorio donde esta Ejemplo2
		File directorio = new File("C:\\Users\\Tony\\eclipse-workspace2023\\PracticaMultiprocesoIII\\bin");
				
		//El proceso a ejecutar es Ejemplo2			
		ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio7Bis.notas", nombreAsignatura, nombreArchivo);
		
		
	    //se establece el directorio donde se encuentra el ejecutable
	    pb.directory(directorio);
	    
	    //se ejecuta el proceso
		Process p = pb.start();
		
		// COMPROBACION DE ERROR - 0 bien - 1 mal
		int exitVal = -1;
		try {

			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		if (exitVal == 0 || exitVal == -1) {
			try {

				InputStream is = p.getInputStream();
				// mostramos en pantalla caracter a caracter
				int c;
				while ((c = is.read()) != -1)
					System.out.print((char) c);
				// is.close();
				System.exit(0);

			} catch (Exception e) {
				System.exit(-1);
				e.printStackTrace();
			}
//		}
		
		sc.close();

	}	
}