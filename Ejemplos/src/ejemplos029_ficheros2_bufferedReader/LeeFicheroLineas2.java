package ejemplos029_ficheros2_bufferedReader;

import java.io.*;

public class LeeFicheroLineas2{
    public static void main(String arg[]){
    String mensaje;
		try { 
			BufferedReader entradaEstandar = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println ("Introducir una linea de texto:");
			mensaje = entradaEstandar.readLine();
			System.out.println ("Introducido: " + mensaje);
		} catch (IOException e) {
			System.out.println(e);
		}
		// Lo que se hace en este ejemplo es similar a usar la clase Scanner
	}
}
