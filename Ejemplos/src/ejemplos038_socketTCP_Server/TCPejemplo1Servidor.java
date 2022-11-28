package ejemplos038_socketTCP_Server;

import java.io.*;
import java.net.*;

public class TCPejemplo1Servidor {
	
	public static void main(String[] arg) throws IOException {
		// ASIGNO UN PUERTO A MI APLICACION E INSTANCIO UN SERVERSOCKET CON EL PUERT0
		// ASI COMO UN SOCKET PARA CUANDO SE CONECTA UN CLIENTE
		
		// Puerto
		int numeroPuerto = 6069;
		
		ServerSocket servidor = new ServerSocket(numeroPuerto);
		Socket clienteConectado = null;
		
		
		System.out.println("PROGRAMA SERVIDOR INICIADO...");
		System.out.println("Hola soy el servidor y me tengo que iniciar antes que el cliente");
		System.out.println("Esperando al cliente...");
		System.out.println();
		clienteConectado = servidor.accept();
		
		
		// CREO FLUJO DE ENTRADA DEL CLIENTE
		InputStream entrada = null;
		entrada = clienteConectado.getInputStream();
		DataInputStream flujoEntrada = new DataInputStream(entrada);
		
		// CREO FLUJO DE SALIDA AL CLIENTE
		OutputStream salida = null;
		salida = clienteConectado.getOutputStream();
		DataOutputStream flujoSalida = new DataOutputStream(salida);
		
		
		for (int i=0; i<=5; i++) {
			
			// EL CLIENTE ME ENVIA UN MENSAJE
			System.out.println("Recibiendo del CLIENTE: \n\t" + flujoEntrada.readUTF());
			
			// ENVIO UN SALUDO AL CLIENTE
			flujoSalida.writeUTF("Saludos SERVIDOR --> CLIENTE. Paso: " + i);
		}
		
		
		// CERRAR STREAMS Y SOCKETS
		entrada.close();
		flujoEntrada.close();
		
		salida.close();
		flujoSalida.close();
		
		clienteConectado.close();
		servidor.close();
	}
}