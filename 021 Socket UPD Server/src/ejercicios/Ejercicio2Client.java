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
import java.util.Scanner;

public class Ejercicio2Client {
	
	static int portServer = 7777; // puerto al que envio el datagrama
	static int portClient = 6666; // puerto desde el que envio el datagrama
	static byte[] buffer = new byte[1024]; // buffer para recibir el datagrama
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		DatagramSocket socket = new DatagramSocket(portClient); // puerto local
		DatagramPacket paqueteRecibido = new DatagramPacket(buffer, buffer.length); // creo el buzon/paquete receptor
		Scanner sc = new Scanner(System.in);
		
		// envio el mensaje
		while(enviarMensaje(socket, portServer, sc)) {
			
			// reseteando el buffer a 0
			// https://stackoverflow.com/questions/44455987/resetting-byte-buffer-to-zeros
			Arrays.fill(buffer, (byte) 0);
			
			//espero a recibir los datos del servidor
			recibirMensaje(socket, paqueteRecibido);
			
			// convierto los datos y los muestro
			mostrarMensaje(socket, paqueteRecibido);
		}
		

		// conexion
		System.out.println();
		System.out.println("cerrando conexion del CLIENTE...");
		sc.close();
		socket.close();
	}

	
	public static boolean enviarMensaje(DatagramSocket socket, int portServer, Scanner sc) throws IOException {
		System.out.println("Introduce un mensaje para transformarlo en mayusculas: ");
		String text = sc.nextLine();
		byte[] mensaje = text.getBytes();
		boolean flag = false;
		
		// construyo el paquete y el puerto UDP
		DatagramPacket paquete = new DatagramPacket(mensaje, mensaje.length, InetAddress.getLocalHost(), portServer);
		// envio el paquete
		socket.send(paquete);
		
		if(!text.equalsIgnoreCase("*")) {
			flag = true;
		} 
		
		return flag;
		
	}
	
	
	public static void recibirMensaje(DatagramSocket socket, DatagramPacket paqueteRecibido) throws IOException {
		// ESPERANDO DATAGRAMA: creo el paquete receptor y lo recojo
		System.out.println("esperando datagrama del SERVIDOR...");
	}
	
	
	public static void mostrarMensaje(DatagramSocket socket, DatagramPacket paqueteRecibido) throws IOException {		
		socket.receive(paqueteRecibido);
		
		// esto no vale, da una direccion de memoria
		// String paquete = String.valueOf(entrada.getData());
		String paquete = new String(paqueteRecibido.getData());

		
		// mensaje
		System.out.println("Mensaje recibido del SERVIDOR:");
		System.out.println(paquete.trim());
		System.out.println();
	}
}
