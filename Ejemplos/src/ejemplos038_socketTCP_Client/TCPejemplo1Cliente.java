package ejemplos038_socketTCP_Client;

import java.io.*;
import java.net.*;

public class TCPejemplo1Cliente {
	
	public static void main(String[] args) throws Exception {
		
		// Host -> "localhost";
		//String Host = "192.168.56.1";
		String Host = "localhost";
		
		// puerto remoto
		int numeroPuerto = 6069;
		
		
		System.out.println("PROGRAMA CLIENTE INICIADO...");
		System.out.println("Hola soy el cliente y me inicio despues del servidor");
		System.out.println();
		Socket Cliente = new Socket(Host, numeroPuerto);

		
		// CREO FLUJO DE SALIDA AL SERVIDOR
		DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());

		// CREO FLUJO DE ENTRADA DEL SERVIDOR
		DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
		
		
		for (int i=0; i<=5; i++) {
			
			// ENVIO UN SALUDO AL SERVIDOR
			flujoSalida.writeUTF("Saludos CLIENTE --> SERVIDOR. Paso: " + i);

			// EL SERVIDOR ME ENVIA UN MENSAJE
			System.out.println("Recibiendo del SERVIDOR: \n\t" + flujoEntrada.readUTF());
			Thread.sleep(1000);
		}

		
		// CERRAR STREAMS Y SOCKETS
		flujoEntrada.close();
		flujoSalida.close();
		Cliente.close();
	}
}