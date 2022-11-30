/*

Ejercicio 1
Haz un programa servidor de socket UDP que reciba un texto de un cliente, cuente el
numero de letras “a” que contiene y se lo devuelva al cliente.
Haz un programa cliente UDP que pida por consola un texto, se lo envie al servidor y la
respuesta la pinte por pantalla.


Ejemplo de output:
Introduce un mensaje: Mi mensaje
esperando datagrama...
nº de caracteres que son 'a': 5a
*/


package ejercicios;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Ejercicio1Client {
	
	public static void main(String[] args) throws IOException {
		
		String mensaje;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un mensaje: ");
		mensaje = sc.nextLine();
		
		
		// conexion con el servidor
		InetAddress destino = InetAddress.getLocalHost();
		int portNumber = 7777;
		byte[] enviar0 = new byte[1024];
		byte[] enviar1 = new byte[1024];
		
		enviar0 = mensaje.getBytes();
		DatagramSocket socket = new DatagramSocket(6666);
		
		
		// 1º paquete
		DatagramPacket salida = new DatagramPacket(enviar0, enviar0.length, destino, portNumber);
		System.out.println();
		System.out.println("esperando datagrama...");
		socket.send(salida);
		
		
		// 2º paquete
		DatagramPacket entrada = new DatagramPacket(enviar1, enviar1.length);
		socket.receive(entrada);
		// esto no vale, da una direccion de memoria
		// String paquete = String.valueOf(entrada.getData());
		String paquete = new String(entrada.getData());

		
		// mensaje
		System.out.println(paquete.trim());
		
		
		// conexion
		System.out.println();
		System.out.println("cerrando conexion...");
		socket.close();
	}
}
