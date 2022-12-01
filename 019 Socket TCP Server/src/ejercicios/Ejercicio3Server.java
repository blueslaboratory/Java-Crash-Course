/*

Ejercicio 3
Modifica el servidor del ejercicio 1 para que admita 2 sockets en lugar de 1.
Al primer cliente conectado, recogera el texto que le envie y se devolvera en mayusculas.
Al segundo cliente conectado, recogera el texto que le envie y se lo devolvera en
minusculas.
Haz 2 programas cliente TCP que pidan por consola un texto, se lo envien al servidor y la
respuesta la pinten por pantalla.

Nota:
El cliente 0 y el cliente 1 se pueden arrancar a la vez, pero transforma en mayus
las del primero que se conecta y en minus el segundo que se conecta
*/

package ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ejercicio3Server {

	public static void main(String[] args) {
		// ASIGNO UN PUERTO A MI APLICACION E INSTANCIO UN SERVERSOCKET CON EL PUERT0
		// ASI COMO UN SOCKET PARA CUANDO SE CONECTA UN CLIENTE
		
		try {
			int portNumber0 = 6069;
			
			ServerSocket server0 = new ServerSocket(portNumber0);
			Socket clienteConectado0 = null;
			Socket clienteConectado1 = null;
			
			
			
			// SERVER 0
			System.out.println("Hola soy el servidor y me tengo que iniciar antes que el cliente");
			System.out.println("Esperando al cliente 0");
			clienteConectado0 = server0.accept();
			
			
			// CREO FLUJO DE ENTRADA DEL CLIENTE
			InputStream entrada0 = null;
			entrada0 = clienteConectado0.getInputStream();
			DataInputStream flujoEntrada0 = new DataInputStream(entrada0);
			
			
			// CREO FLUJO DE SALIDA AL CLIENTE
			OutputStream salida0 = null;
			salida0 = clienteConectado0.getOutputStream();
			DataOutputStream flujoSalida0 = new DataOutputStream(salida0);

			
			// EL CLIENTE ME ENVIA UN MENSAJE
			System.out.println("Transformar a mayusculas el mensaje del CLIENTE 0:");
			String mensajeCliente0 = flujoEntrada0.readUTF();			
			
			// ENVIO EL MENSAJE AL CLIENTE
			flujoSalida0.writeUTF(mensajeCliente0.toUpperCase());


			
			
			// SERVER 1	
			System.out.println();
			System.out.println();
			System.out.println("Hola soy el servidor y me tengo que iniciar antes que el cliente");
			System.out.println("Esperando al cliente 1");
			clienteConectado1 = server0.accept();
			
			
			// CREO FLUJO DE ENTRADA DEL CLIENTE
			InputStream entrada1 = null;
			entrada1 = clienteConectado1.getInputStream();
			DataInputStream flujoEntrada1 = new DataInputStream(entrada1);
			
			
			// CREO FLUJO DE SALIDA AL CLIENTE
			OutputStream salida1 = null;
			salida1 = clienteConectado1.getOutputStream();
			DataOutputStream flujoSalida1 = new DataOutputStream(salida1);
	
			
			// EL CLIENTE ME ENVIA UN MENSAJE
			System.out.println("Transformar a minusculas el mensaje del CLIENTE 1:");
			String mensajeCliente1 = flujoEntrada1.readUTF();			
			
			
			// ENVIO EL MENSAJE AL CLIENTE
			flujoSalida1.writeUTF(mensajeCliente1.toLowerCase());
			
			
			
			
			// CERRAR STREAMS Y SOCKETS
			System.out.println();
			System.out.println("Cerrando las conexiones...");
			
			// Server 0
			entrada0.close();
			flujoEntrada0.close();

			salida0.close();
			flujoSalida0.close();
						
			clienteConectado0.close();
			server0.close();
			
			// Server 1
			entrada1.close();
			flujoEntrada1.close();
					
			salida1.close();
			flujoSalida1.close();
						
			clienteConectado1.close();
			server0.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}