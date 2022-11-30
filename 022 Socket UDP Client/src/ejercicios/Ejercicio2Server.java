/*
Crea un programa cliente usando sockets UDP que envie el texto
escrito desde la entrada estandar al servidor. El servidor le devolvera
la cadena en mayusculas. El proceso de entradad de datos finalizara
cuando el cliente introduzca un asterisco. Crea un programa servidor
que reciba cadenas de caracteres, las muestre en pantalla y se las envie
al emisor en mayusculas. El proceso servidor finalizara cuando reciba 
un asterisco.
*/

package ejercicios;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

public class Ejercicio2Server {

	static byte[] buffer = new byte[1024];
	static int portServer = 7777;
	static int portClient = 6666;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String mensaje;
		boolean next;
		
		DatagramSocket socket = new DatagramSocket(portServer);
		DatagramPacket paqueteRecibido = new DatagramPacket(buffer, buffer.length);
		
		do {
			// reseteando el buffer a 0
			// https://stackoverflow.com/questions/44455987/resetting-byte-buffer-to-zeros
			Arrays.fill(buffer, (byte) 0);
			
			// tecibir texto
			recibirTexto(socket, paqueteRecibido);
			
			// transformar texto
			mensaje = transformar(paqueteRecibido);
			
			// enviar textos 
			if( !(next = mensaje.equalsIgnoreCase("*")) ) {
				enviarDatos(socket, mensaje, portClient);
			}
			
			System.out.println();
		} while (!next);
		
		System.out.println();
		System.out.println("Cerrando la conexion del SERVIDOR");
		socket.close();
	}

	
	public static void recibirTexto(DatagramSocket socket, DatagramPacket paqueteRecibido) throws IOException{
		// ESPERANDO DATAGRAMA, creo el paquete receptor y lo recojo
		System.out.println("Esperando datagrama del CLIENTE...");
		socket.receive(paqueteRecibido);
	}
	
	
	public static String transformar(DatagramPacket paqueteRecibido) throws IOException {
		// https://stackoverflow.com/questions/17549195/clear-datagram-buffer-in-java
		String textToLower = new String(paqueteRecibido.getData(),
										paqueteRecibido.getOffset(),
										paqueteRecibido.getLength());
		
		System.out.println("Se ha recibido por parte del CLIENTE el texto: ");
		System.out.println(textToLower);
		
		String textToUpper = textToLower.toUpperCase(); 
		System.out.println("Output funcion transformar: " + textToUpper);
		
		return textToUpper;
	}
	
	
	public static void enviarDatos(DatagramSocket socket, String texto, int portClient) throws IOException {
		byte[] resultado = texto.getBytes();
		DatagramPacket paquete = new DatagramPacket(resultado, resultado.length, InetAddress.getLocalHost(), portClient);
		
		socket.send(paquete);
	}
}
