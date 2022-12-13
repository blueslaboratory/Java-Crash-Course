/*

Ejercicio 1. (2 puntos)
El objetivo del ejercicio es crear una aplicacion cliente/servidor que se comunique por el
puerto 2000 y realice lo siguiente:

El servidor debe generar un numero secreto de forma aleatoria entre el 0 al 100. El objetivo
del cliente es solicitarle al usuario un numero y enviarlo al servidor hasta que adivine el
numero secreto. Para ello, el servidor para cada numero que le envia el cliente le indicara si
es menor, mayor o es el numero secreto del servidor (y por tanto el cliente debe mostrarle al
usuario si el numero es mayor o menor que el que ha dicho).

Utiliza el protocolo TCP o UDP para este ejercicio.

OUTPUT:
Servidor esperando...
Numero a adivinar: 69

*/

package examenserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class AdivinarTCPServer {

	
	public static void main(String[] args) {
		// ASIGNO UN PUERTO A MI APLICACION E INSTANCIO UN SERVERSOCKET CON EL PUERTO
		// ASI COMO UN SOCKET PARA CUANDO SE CONECTA UN CLIENTE
		
		try {
			
			// Puerto
			int numeroPuerto = 2000;
			
			int numeroServidor = aleatorio();
			int numeroCliente;
			String feedback;
			boolean acertaste = false;
			
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
			
			
			System.out.println("Numero a adivinar: " +numeroServidor);
			
			
			while(!acertaste) {
				
				// Recibimos el numero del cliente
				numeroCliente = flujoEntrada.readInt();
				
				
				// Hacemos la comprobacion
				if(numeroCliente>numeroServidor) {
					feedback = "El numero es menor que el numero escrito";
				}
				else if(numeroCliente<numeroServidor) {
					feedback = "El numero es mayor que el numero escrito";
				}
				else {
					feedback = "Acertaste";
					acertaste = true;
				}
				
				// Envio el feedback al cliente
				flujoSalida.writeUTF(feedback);
				
				
				// Informo al cliente de si acerto o no
				flujoSalida.writeBoolean(acertaste);
				
			}
			
			
			
			// CERRAR STREAMS Y SOCKETS	
			System.out.println();
			System.out.println();
			System.out.println("Fin del juego");
			
			entrada.close();
			flujoEntrada.close();
			
			salida.close();
			flujoSalida.close();
			
			clienteConectado.close();
			servidor.close();
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
	}
	
	
	public static int aleatorio() {
		// En general, para conseguir un numero entero entre [N, M]
		// con N < M y ambos incluidos, debemos usar esta formula:
		// int valorEntero = Math.floor(Math.random()*(M-N+1)+N);
		// Valor entre M y N, ambos incluidos.

		int aleatorio = (int) Math.floor(Math.random()*(100-0+1)+0);
		
		return aleatorio;
	}
	
	
}
