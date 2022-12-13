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

PARES O NONES: PARES
Dime un numero: 34
El juega: 25
Resultado: 59 - NONES
He perdido.
Cliente: 0 Servidor: 1 

PARES O NONES: NONES
Dime un numero: 23
El juega: 75
Resultado: 98 - PARES
He perdido.
Cliente: 0 Servidor: 2

PARES O NONES: PARES
Dime un numero: 56
El juega: 34
Resultado: 90 - PARES
He ganado.
Cliente: 1 Servidor: 2

PARES O NONES: PARES
Dime un numero: 2
El juega: 54
Resultado: 56 - PARES
He ganado.
Cliente: 2 Servidor: 2

PARES O NONES: NONES
Dime un numero: 7
El juega: 14
Resultado: 21 - NONES
He ganado.
Cliente: 3 Servidor: 2
*/


package entregable1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ParesNonesTCPClient {
	
	public static int SCORECLIENTE = 0;
	public static int SCORESERVIDOR = 0;
	
	
	
	public static void main(String[] args) {
		
		try {
			
			// host -> "localhost";
			//String host = "192.168.56.1";
			String host = "localhost";
			
			// puerto remoto
			int numeroPuerto = 6069;
			
			Scanner sc = new Scanner(System.in);
			String paresNones;
			// int numeroPartidas;
			int counter = 1;
			String numeroCliente;
			String numeroServidor;
			boolean ganaCliente;
			
			
			System.out.println("PROGRAMA CLIENTE INICIADO...");
			System.out.println("Hola soy el cliente y me inicio despues del servidor");
			System.out.println();
			Socket Cliente = new Socket(host, numeroPuerto);
			
			
			// CREO FLUJO DE SALIDA AL SERVIDOR
			DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
			
			// CREO FLUJO DE ENTRADA DEL SERVIDOR
			DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
			
			
			
			/*
			System.out.print("Numero de partidas a jugar: ");
			numeroPartidas = Integer.parseInt(sc.nextLine());
			flujoSalida.writeInt(numeroPartidas);
			*/
			// Programa cliente:
			// Una de las aplicaciones le pedira al usuario por pantalla el juego a jugar 
			// y el numero que quiere jugar. Se lo enviara a la otra que actua de servidor.
						
			
			//while(numeroPartidas>0) {
			
			while(SCORECLIENTE<3 && SCORESERVIDOR<3) {
				
				System.out.println();
				System.out.println("*** PARTIDA " +counter +" ***");
				
				do {
					System.out.print("PARES O NONES: ");
					paresNones = sc.nextLine();
				} while(!(paresNones.equalsIgnoreCase("PARES") || 
						  paresNones.equalsIgnoreCase("NONES")));
				
				System.out.print("nº: ");
				numeroCliente = sc.nextLine();

				// Programa cliente: envia PARES o NONES
				flujoSalida.writeUTF(paresNones);
				// Programa cliente: envia el numero
				flujoSalida.writeUTF(numeroCliente);
				
				// El servidor me envia el numero que juega
				System.out.print("El juega: ");
				numeroServidor = flujoEntrada.readUTF();
				System.out.println(numeroServidor);		
				
				
				// calculo resultadoJuego
				ganaCliente = resultadoJuego(paresNones, numeroCliente, numeroServidor);
				
				if(ganaCliente) {
					System.out.println("He ganado");
				}
				else {
					System.out.println("He perdido");
				}
				
				System.out.println("Cliente: " +SCORECLIENTE +" Servidor: " +SCORESERVIDOR);
				System.out.println();
				
				//numeroPartidas--;
				counter++;
			} 
			
			
			
			
			// CERRAR STREAMS Y SOCKETS	
			System.out.println();
			System.out.println();
			System.out.println("Fin del juego");
			
			flujoEntrada.close();
			flujoSalida.close();
			Cliente.close();
			sc.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	public static boolean resultadoJuego(String paresNones, String numClient, String numServer) {
		boolean ganaCliente = true;
		String resultado = "NONES";
		
		int nClient = Integer.parseInt(numClient);
		int nServer = Integer.parseInt(numServer);
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