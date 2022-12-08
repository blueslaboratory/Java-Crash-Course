// UDP - User Datagram Protocol

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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class LecturaRemotaUDPServer {

	public static void main(String[] args) {
		try {
			
			// buffer para recibir el datagrama
			byte[] buffer = new byte[1024];
			byte[] bufferMensaje = new byte[1024];
			
			// ASOCIO EL SOCKET AL PUERTO 12345
			int port = 12345;
			DatagramSocket socket = new DatagramSocket(port);
			
			// ESPERANDO DATAGRAMA
			System.out.println("ESPERANDO DATAGRAMA...");
			System.out.println();
			DatagramPacket recibo = new DatagramPacket(buffer, buffer.length);
			
			// recibo datagrama:
			socket.receive(recibo);
			
			// obtengo numero de bytes:
			int bytesRec = recibo.getLength();
			
			// obtengo la ruta:
			String ruta = new String(recibo.getData());
			
			// VISUALIZO INFORMACION
			System.out.println("Numero de Bytes recibidos : " + bytesRec);
			System.out.println("Contenido del Paquete     : " + ruta.trim());
			System.out.println("Puerto origen del mensaje : " + recibo.getPort());
			System.out.println("IP de origen              : " + recibo.getAddress().getHostAddress());
			System.out.println("Puerto destino del mensaje: " + socket.getLocalPort());
			
			
			
			// ENVIO EL MENSAJE AL CLIENTE
			String mensaje = lecturaFichero(ruta.trim());
			bufferMensaje = mensaje.getBytes();
			
			DatagramPacket envio = new DatagramPacket(bufferMensaje, bufferMensaje.length, recibo.getAddress(), recibo.getPort());
			socket.send(envio);
			
			
			
			// cierro el socket
			System.out.println();
			System.out.println("cerrando conexion...");
			socket.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	public static String lecturaFichero(String ruta) throws IOException {
		
		FileReader fr = new FileReader(ruta);
		BufferedReader br = new BufferedReader(fr);
		
		String linea ="";
		String mensaje = "";
		
		// quitando el null del final del archivo leido:
		while ((linea = br.readLine()) != null) {
			mensaje += linea +"\n";
		}
		
		System.out.println();
		System.out.println();
		System.out.println("MENSAJE (leido por el server):\n");
		System.out.println(mensaje);
		
		br.close();
		
		return mensaje;
	}

	
}