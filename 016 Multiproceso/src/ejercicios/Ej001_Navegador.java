// A partir del proyecto 016 Multiproceso se corresponde a la asignatura de Programacion de Servicios y Procesos

package ejercicios;

import java.io.IOException;
// import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej001_Navegador {

	// En caso de que se haya ejecutado correctamente devolvera 0
	static int retorno = -2;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		// Con JOptionPane:
		String cadena = "https://www.google.com";
		cadena = JOptionPane.showInputDialog("Introduce una Url");
		
		// Con Scanner:
		// Scanner entrada = new Scanner(System.in);
		// System.out.println("Introduce una Url ");
		// String cadena = entrada.nextLine();
		
		
		
		// WINDOWS
		// ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Mozilla Firefox\\firefox.exe", cadena); // "notas.txt"
		
		
		// LINUX
		// https://www.coingecko.com/
		ProcessBuilder pb = new ProcessBuilder("/usr/bin/firefox"); 
		
		
		
		Process p = null;
		p = pb.start();
		
		retorno = p.waitFor();
		System.out.println("Llegamos aqui cuando la ejecucion del proceso finaliza");
		System.out.println("Cadena: " +cadena);
		System.out.println("La ejecucion devuelve: " + retorno);
	}

}
