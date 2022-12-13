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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import partida.Partida;



public class ParesNonesReadObjectTCPServer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Partida partida = new Partida ();
		
		int numeroPuerto = 5099;// Puerto
		ServerSocket servidor = new ServerSocket(numeroPuerto);
		
		System.out.println("Esperando Jugador.....");
		Socket clienteConectado = servidor.accept();
		
		while (partida.partidaFinalizada == false) {
			partida = recibir(clienteConectado);
			jugada(partida);
			enviar(partida, clienteConectado);
		}
		
		System.out.println();
		System.out.println("Partida finalizada");
		
		if (partida.ganadasCliente ==3) {
			System.out.println("Gano el cliente");
			
		} else {
			System.out.println("Gano!!!");
		}
		
		System.out.println("Marcador - Servidor: " + partida.ganadasServidor + " Cliente: " + partida.ganadasCliente);
		
		clienteConectado.close();
	}

	
	public static Partida jugada(Partida partida) {
		int numServidor = (int) ((Math.random() * ((100-1)+1))+1); // (M-N+1)+N
		partida.setNumServidor(numServidor);
		int numResultado = numServidor + partida.getNumCliente();
		
		int parJugador = 1;
		
		System.out.println();
		if (partida.getParImpar().equalsIgnoreCase("pares")) {
			parJugador = 0;
			System.out.println("El juega: Pares");
		} else {
			System.out.println("El juega: Nones");
		}
		
		System.out.println("Nº: " + partida.getNumCliente());
		
		System.out.println("Se ha generado el numero aleatorio ");

		
		if (numResultado%2 == parJugador) {
			partida.setGanadasCliente();
			System.out.println("He perdido. Vamos Servidor: " + partida.ganadasServidor + " Cliente: " + partida.ganadasCliente);
			if (partida.ganadasCliente==3) {
				partida.setPartidaFinalizada(true);
			}
		} else {
			partida.setGanadasServidor();
			System.out.println("He ganado. Vamos Servidor: " + partida.ganadasServidor + " Cliente: " + partida.ganadasCliente);
			if (partida.ganadasServidor==3) {
				partida.setPartidaFinalizada(true);
			}
		}
		
		return partida;
	}
	
	public static Partida recibir(Socket clienteConectado) {
		// CREO FLUJO DE ENTRADA AL CLIENTE
		Partida partidaRecibida = new Partida();
		try {			
			ObjectInputStream flujoEntrada = new ObjectInputStream(clienteConectado.getInputStream());
						
			// EL CLIENTE ME ENVIA UN MENSAJE
			partidaRecibida = (Partida) flujoEntrada.readObject();
		
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return partidaRecibida;
	}
	
	public static void enviar(Partida partida, Socket clienteConectado) {
		// CREO FLUJO DE SALIDA AL CLIENTE		
		try {
			ObjectOutputStream flujoSalida = new ObjectOutputStream(clienteConectado.getOutputStream());			
			flujoSalida.writeObject(partida);		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
}

