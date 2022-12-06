// TCP

/*

Ejercicio 1 - Lectura remota de ficheros
Desarrolla un aplicacion en Java que permite leer un fichero de texto ubicado en 
otro ordenador a traves de sockets. Los pasos del proceso seran los siguientes:
- Programa cliente: solicita al usuario el nombre de un fichero, incluyendo su ruta
  completa dentro del sistema de archivos del servidor.
- Programa cliente: envia el nombre y la ruta del fichero al servidor
- Programa servidor: busca el fichero, lo abre, lee el contenido y se lo envia al
  cliente.
- Programa cliente: muestra el contenido por pantalla.
Utiliza el protocolo TCP o UDP para este ejercicio, pero piensa que el que utilices
aqui no lo podras repetir en el siguiente.

*/

package entregable1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class LecturaRemotaTCPClient {

	public static void main(String[] args) {

		try {
		
			// Host -> "localhost";
			//String Host = "192.168.56.1";
			String host = "localhost";
			
			// puerto remoto
			int numeroPuerto = 6069;
			
			Scanner sc = new Scanner(System.in);
			String rutaFichero;
			
			
			System.out.println("PROGRAMA CLIENTE INICIADO...");
			System.out.println("Hola soy el cliente y me inicio despues del servidor");
			System.out.println();
			Socket Cliente = new Socket(host, numeroPuerto);
	
			
			// CREO FLUJO DE SALIDA AL SERVIDOR
			DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
			
			// CREO FLUJO DE ENTRADA DEL SERVIDOR
			DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
			
			
			
			// Programa cliente: solicita al usuario el nombre de un fichero, incluyendo su ruta
			// completa dentro del sistema de archivos del servidor.
			System.out.println("Introduzca la ruta del fichero:");
			System.out.println("Ejemplo: /media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/txts/lecturaRemota.txt");
			System.out.print("Ruta: ");
			rutaFichero = sc.nextLine(); 
			
			// Programa cliente: envia el nombre y la ruta del fichero al servidor
			flujoSalida.writeUTF(rutaFichero);
	
			// El servidor me envia el contenido del fichero
			System.out.println();
			System.out.println("Contenido del fichero:");
			System.out.println("Recibiendo del SERVIDOR:");
			System.out.println();
			System.out.println(flujoEntrada.readUTF());		
			
			
			
			// CERRAR STREAMS Y SOCKETS
			flujoEntrada.close();
			flujoSalida.close();
			Cliente.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}