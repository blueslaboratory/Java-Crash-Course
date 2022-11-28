package ejemplos040_socketUDP_Server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//Recuerda que el servidor siempre se inicia antes que el cliente

public class UDPservidor {
	
	public static void main(String[] argv) throws Exception {

		// buffer para recibir el datagrama
		byte[] buffer = new byte[1024];
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
		// obtengo String:
		String paquete = new String(recibo.getData());

		
		// VISUALIZO INFORMACION
		System.out.println("Numero de Bytes recibidos : " + bytesRec);
		System.out.println("Contenido del Paquete     : " + paquete.trim());
		System.out.println("Puerto origen del mensaje : " + recibo.getPort());
		System.out.println("IP de origen              : " + recibo.getAddress().getHostAddress());
		System.out.println("Puerto destino del mensaje: " + socket.getLocalPort());
		
		
		// cierro el socket:
		socket.close(); 
	}
}
