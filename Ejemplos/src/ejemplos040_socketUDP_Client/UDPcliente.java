package ejemplos040_socketUDP_Client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// Recuerda que el servidor siempre se inicia antes que el cliente

public class UDPcliente {
	
	public static void main(String[] argv) throws Exception {
		
		InetAddress destino = InetAddress.getLocalHost();
		// puerto al que envio el datagrama
		int serverPort = 12345;
		int localPort = 6789;
		byte[] mensaje = new byte[1024];

		
		String saludo = "enviando saludos!";
		// codifico String a bytes
		mensaje = saludo.getBytes(); 

		
		// CONSTRUYO EL DATAGRAMA A ENVIAR
		DatagramPacket envio = new DatagramPacket(mensaje, mensaje.length, destino, serverPort);
		DatagramSocket socket = new DatagramSocket(localPort);// Puerto local

		
		System.out.println("Enviando Datagrama de longitud: " + mensaje.length);
		System.out.println("Host destino                  : " + destino.getHostName());
		System.out.println("IP Destino                    : " + destino.getHostAddress());
		System.out.println("Puerto local del socket       : " + socket.getLocalPort());
		System.out.println("Puerto al que envio           : " + envio.getPort());

		
		// ENVIO DATAGRAMA
		socket.send(envio);
		socket.close(); // cierro el socket
	}
}
