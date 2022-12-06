/*

Ejercicio 1
Haz un programa servidor de socket UDP que reciba un texto de un cliente, cuente el
numero de letras “a” que contiene y se lo devuelva al cliente.
Haz un programa cliente UDP que pida por consola un texto, se lo envie al servidor y la
respuesta la pinte por pantalla.

Ejemplo de output:
SERVIDOR esperando datagrama...

Mensaje recibido: *****************
Numero de apariciones del caracter 'a': 5a

Cerrando conexion
*/


package ejercicios;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Ejercicio1Server {

	public static void main(String[] args) throws IOException {
		
		int portNumber = 7777;
		
		byte[] buffer0 = new byte[1024];
		byte[] buffer1 = new byte[1024];
		DatagramSocket socket = new DatagramSocket(portNumber);
		
		
		System.out.println("SERVIDOR esperando datagrama...");
		System.out.println();
		
		
		// 1er paquete
		DatagramPacket recibo = new DatagramPacket(buffer0, buffer0.length);
		socket.receive(recibo);

		
		// se guarda en un String
		String paquete = new String(recibo.getData()), mensaje=paquete.trim();
		System.out.println("String 'paquete': " +paquete);
		System.out.println("Mensaje recibido: " +mensaje);
		System.out.println();
		
		// contando un caracter 'a'
		/*
		Scanner sc = new Scanner(System.in);
		String input;
		*/
		char caracter = 'a';
		/*
		do {
			System.out.print("Introduce el caracter a contar: ");
			input = sc.nextLine();
		} while(input.length()==0 || input.length()>1);
		
		caracter = input.charAt(0);
		*/
		int contador=0;
		for (int i=0; i<mensaje.length(); i++) {
			if(mensaje.charAt(i) == caracter) {
				contador++;
			}	
		}
		
		System.out.println("Numero de apariciones del caracter '" + caracter +"': " +contador +caracter);
		
		String enviarmensaje = "nº de caracteres que son '" +caracter +"': " +contador +caracter;
		buffer1 = enviarmensaje.getBytes();
		
		
		// 2do paquete
		DatagramPacket envio = new DatagramPacket(buffer1, buffer1.length, recibo.getAddress(), recibo.getPort());
		socket.send(envio);
		
		
		// conexion
		System.out.println();
		System.out.println("Cerrando conexion");
		socket.close();
		
	}

}
