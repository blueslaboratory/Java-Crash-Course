package ejemplos029_ficheros2_leeLineaEntradaEstandar;

import java.io.*;

public class Eco {
	public static void main(String[] args) {
		
		// Antes de tener Scanner: 
		
		/*
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		String cadena = teclado.readLine();
		*/
		
		BufferedReader entradaEstandar = new BufferedReader(new InputStreamReader(System.in));
		String mensaje = "";
		
		System.out.println("Introducir una linea de texto:");
		System.out.print("> ");
		
		try {
			mensaje = entradaEstandar.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Introducido: " + mensaje);
	}
}