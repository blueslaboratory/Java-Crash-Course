// TCP - Transmission Control Protocol
/*

Ejercicio 2 - ¿PARES o NONES?

El objetivo del ejercicio es crear una aplicacion cliente/servidor permita 
jugar a PARES o NONES entre 2 aplicaciones o programas.
Una de las aplicaciones le pedira al usuario por pantalla el juego a jugar y 
el numero que quiere jugar. Se lo enviara a la otra que actua de servidor.
El servidor generara un aleatorio y se lo enviara al cliente.
Ambos calculan el resultado.
El juego acaba cuando uno gana 3 partidas y ambos sockets se detienen.
Utiliza el protocolo TCP o UDP para este ejercicio, el que no hayas utilizado 
antes.


EJEMPLO DE SALIDA:

El jugador juega: PARES
Nº: 34
Se ha generado un numero aleatorio: 25
Resultado: 59 - NONES
He ganado.
Servidor: 1 Cliente: 0

El jugador juega: NONES
Nº: 23
Se ha generado un numero aleatorio: 75
Resultado: 98 - PARES
He ganado.
Servidor: 2 Cliente: 0

El jugador juega: PARES
Nº: 56
Se ha generado un numero aleatorio: 34
Resultado: 90 - PARES
He perdido.
Servidor: 2 Cliente: 1

El jugador juega: PARES
Nº: 2
Se ha generado un numero aleatorio: 54
Resultado: 56 - PARES
He perdido.
Servidor: 2 Cliente: 2

El jugador juega: NONES
Nº: 7
Se ha generado un numero aleatorio: 14
Resultado: 21 - NONES
He ganado.
Servidor: 2 Cliente: 3
*/

package entregable1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ParesNonesTCPServer {

	public static int SCORECLIENTE = 0;
	public static int SCORESERVIDOR = 0;
	
	public static void main(String[] args) {
		// ASIGNO UN PUERTO A MI APLICACION E INSTANCIO UN SERVERSOCKET CON EL PUERTO
		// ASI COMO UN SOCKET PARA CUANDO SE CONECTA UN CLIENTE
		
		try {
			
			// Puerto
			int numeroPuerto = 6069;
			
			String paresNones;
			// int numeroPartidas;
			int counter = 1;
			int numeroCliente;
			int numeroServidor;
			boolean ganaServidor;
			
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
			
			
			/*
			numeroPartidas = flujoEntrada.readInt();
			System.out.println("Numero de partidas a jugar: " +numeroPartidas);
			*/
			//while(numeroPartidas>0) {
				
			while(SCORECLIENTE<3 && SCORESERVIDOR<3) {
				
				System.out.println();
				System.out.println("*** PARTIDA " +counter +" ***");
				
				
				// Programa servidor: El servidor generara un aleatorio y se lo enviara al cliente.
				// El cliente me envia pares o nones y el numero que juega
				paresNones = flujoEntrada.readUTF();
				System.out.println("El jugador juega " +paresNones.toUpperCase());
				numeroCliente = Integer.parseInt(flujoEntrada.readUTF());
				System.out.println("nº: " +numeroCliente);
				numeroServidor = aleatorio();
				System.out.println("Se ha generado un numero aleatorio: " +numeroServidor); 
				
				// Envio el mensaje al cliente
				flujoSalida.writeUTF(String.valueOf(numeroServidor));
				
				
				// calculo resultadoJuego
				ganaServidor = !resultadoJuego(paresNones, numeroCliente, numeroServidor);
				
				if(ganaServidor) {
					System.out.println("He ganado");
				}
				else {
					System.out.println("He perdido");
				}
				
				System.out.println("Servidor: " +SCORESERVIDOR +" Cliente: " +SCORECLIENTE);
				System.out.println();
				
				//numeroPartidas--;
				counter++;
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
	
	
	public static boolean resultadoJuego(String paresNones, int nClient, int nServer) {
		boolean ganaCliente = true;
		String resultado = "NONES";
		
		int nResultado = nClient + nServer;
		
		
		if(paresNones.equalsIgnoreCase("NONES")) {
			if(nResultado%2==0) {
				ganaCliente = false;
				resultado = "PARES";
				SCORESERVIDOR++;
			}
			else {
				SCORECLIENTE++;
			}
		}
		if(paresNones.equalsIgnoreCase("PARES")) {
			if(nResultado%2==0) {
				resultado = "PARES";
				SCORECLIENTE++;
			}
			else {
				ganaCliente = false;
				SCORESERVIDOR++;
			}
		}
		
		
		System.out.println("Resultado: " +nResultado +" - " +resultado);
		
		
		return ganaCliente;
	}
}