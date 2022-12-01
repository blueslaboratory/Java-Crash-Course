/*
Ejercicio 2
Haz un programa servidor de socket TCP que reciba un numero de un cliente, 
haga su cuadrado y se lo devuelva al cliente.
Haz un programa cliente TCP que pida por consola un numero, 
se lo envie al servidor y la respuesta la pinte por pantalla.
*/
package ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ejercicio2Server {

	public static void main(String[] args) {
		// Asigno un puerto a mi aplicacion e instancio un ServerSocket con el puerto
		// asi como un Socket para cuando se conecta un cliente		
		
		try {
			
			int numeroPuerto = 6069;
			
			ServerSocket servidor = new ServerSocket(numeroPuerto);
			Socket clienteConectado = null;
			
			
			System.out.println("Hola soy el servidor y me tengo que iniciar antes que el cliente");
			System.out.println("Esperando al cliente...");
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
			System.out.println();
			System.out.println("Recibiendo el numero del CLIENTE");
			
			String numero = flujoEntrada.readUTF();			
			System.out.println("Numero introducido en el SERVIDOR: " +numero);
			
			
			
			// ENVIO EL MENSAJE AL CLIENTE
			double numCuadrado = Math.pow(Integer.parseInt(numero), 2);
			// flujoSalida.writeUTF(""+numCuadrado);
			flujoSalida.writeUTF(String.valueOf(numCuadrado));
			
			
			
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
