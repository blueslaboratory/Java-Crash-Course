/*

Ejercicio 1
Haz un programa servidor de socket TCP que reciba un texto de un cliente, 
lo convierta a mayusculas y se lo devuelva al cliente.
Haz un programa cliente TCP que pida por consola un texto, se lo envie al 
servidor y la respuesta la pinte por pantalla.

*/

package ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ejercicio1Server {

	public static void main(String[] args) {
		// Asigno un puerto a mi aplicacion e instancio un ServerSocket con el puerto
		// asi como un Socket para cuando se conecta un cliente		
				
		
		try {
			int numeroPuerto = 6069;
			
			ServerSocket servidor = new ServerSocket(numeroPuerto);
			Socket clienteConectado = null;
			
			
			System.out.println("Hola soy el servidor y me tengo que iniciar antes que el cliente");
			System.out.println("Esperando al cliente.....");
			clienteConectado = servidor.accept();
			
			
			
			// CREO FLUJO DE ENTRADA DEL CLIENTE
			InputStream entrada = null;
			entrada = clienteConectado.getInputStream();
			DataInputStream flujoEntrada = new DataInputStream(entrada);
			
			// CREO FLUJO DE SALIDA AL CLIENTE
			OutputStream salida = null;
			salida = clienteConectado.getOutputStream();
			DataOutputStream flujoSalida = new DataOutputStream(salida);
	
			
			
			// EL CLIENTE ME ENVIA UN MENSAJE
			String mensajeCliente = flujoEntrada.readUTF();			
			System.out.println();
			System.out.println("Recibiendo del CLIENTE");
			System.out.println(mensajeCliente);
			
			
			// ENVIO EL MENSAJE AL CLIENTE
			flujoSalida.writeUTF(mensajeCliente.toUpperCase());
			
			
			
			// CERRAR STREAMS Y SOCKETS
			entrada.close();
			flujoEntrada.close();
					
			salida.close();
			flujoSalida.close();
						
			clienteConectado.close();
			servidor.close();
					
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} 
		
	}

}
