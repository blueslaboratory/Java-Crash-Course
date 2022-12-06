// UDP

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

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

// Recuerda que el servidor siempre se inicia antes que el cliente

public class LecturaRemotaUDPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InetAddress destino = InetAddress.getLocalHost();
			// puerto al que envio el datagrama
			int serverPort = 12345;
			int localPort = 6789;
			byte[] mensaje = new byte[1024];
			byte[] bufferEntrada = new byte[1024];
			
			Scanner sc = new Scanner(System.in);
			String rutaFichero;
			
			System.out.println("PROGRAMA CLIENTE INICIADO...");
			System.out.println("Hola soy el cliente y me inicio despues del servidor");
			System.out.println();
			
			
			// Programa cliente: solicita al usuario el nombre de un fichero, incluyendo su ruta
			// completa dentro del sistema de archivos del servidor.
			System.out.println("Introduzca la ruta del fichero:");
			System.out.println("Ejemplo: /media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/txts/lecturaRemota.txt");
			System.out.print("Ruta: ");
			rutaFichero = sc.nextLine();
			
			// codifico String a bytes
			mensaje = rutaFichero.getBytes(); 
			
			
			
			// CONSTRUYO EL DATAGRAMA A ENVIAR
			// 1º paquete
			DatagramPacket salida = new DatagramPacket(mensaje, mensaje.length, destino, serverPort);
			DatagramSocket socket = new DatagramSocket(localPort);// Puerto local
			
			System.out.println();
			System.out.println("Enviando Datagrama de longitud: " + mensaje.length);
			System.out.println("Host destino                  : " + destino.getHostName());
			System.out.println("IP Destino                    : " + destino.getHostAddress());
			System.out.println("Puerto local del socket       : " + socket.getLocalPort());
			System.out.println("Puerto al que envio           : " + salida.getPort());
			
			// ENVIO DATAGRAMA
			socket.send(salida);
			
			
			
			// 2º paquete
			DatagramPacket entrada = new DatagramPacket(bufferEntrada, bufferEntrada.length);
			socket.receive(entrada);
			String paquete = new String(entrada.getData());
			
			// mensaje
			System.out.println();
			System.out.println(paquete.trim());
			
			
			
			// cierro el socket
			System.out.println();
			System.out.println("cerrando conexion...");
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}