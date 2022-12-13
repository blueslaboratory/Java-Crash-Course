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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import partida.Partida; 

public class ParesNonesReadObjectTCPCliente {


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Partida partida = new Partida ();
		System.out.println("Conectando con el servidor.....");
		
		// Creo todas las variable que necesito
		String host = "localhost"; //Tu direccion IP del servidor
		int puerto= 5099;
				
		//Creo el socket para conectarlo con el servidor
		Socket conexionServidor = new Socket(host, puerto);
		
		while (partida.partidaFinalizada == false) {
			lectura(sc, partida);
			enviar(partida, conexionServidor);
			partida = recibir(conexionServidor);
			mostrar(partida);
		}
		
		System.out.println();
		System.out.println("Partida finalizada");
		
		if (partida.ganadasServidor ==3) {
			System.out.println("Gano el Servidor");
		}else {
			System.out.println("Gano!!!!");
		}
		
		System.out.println("Marcador - Cliente: " + partida.ganadasCliente + " Servidor: " + partida.ganadasServidor);
		
		conexionServidor.close();
		sc.close();
	}

	public static void lectura(Scanner sc, Partida partida) {
		boolean respuesta = false;
		System.out.println();
		System.out.println("Quieres jugar a pares o nones?");
		String jugada = sc.nextLine().toLowerCase();
		while (respuesta == false) {
			if (!jugada.equals("pares") && !jugada.equals("nones")) {
				System.out.println("Respuesta incorrecta, tienes que jugar a pares o nones, repite tu respuesta");
				System.out.println("Quieres jugar a pares o nones?");
				jugada = sc.nextLine().toLowerCase();
			} else {
				respuesta = true;
			}
		}
		
		respuesta = false;

		System.out.print("Dime un numero: ");
		String numero = sc.nextLine();
		while (respuesta == false) {
			if (!numero.chars().allMatch(Character::isDigit) || numero == null || numero.equals("")) {
				System.out.println("Respuesta incorrecta, tiene que ser un numero entero");
				System.out.print("Dime un numero: ");
				numero = sc.nextLine();
			} else {
				respuesta = true;
			}
		}
		partida.setParImpar(jugada);
		partida.setNumCliente(Integer.parseInt(numero));
	}
	
	public static Partida mostrar(Partida partida) {
		System.out.println("El juega: " + partida.getNumServidor());
		int numResultado = partida.getNumServidor() + partida.getNumCliente();
		
		int parJugador = 1;
		if (partida.getParImpar().equalsIgnoreCase("par")) {
			parJugador = 0;
		} 
		
		if (numResultado%2 == parJugador) {
			System.out.println("He ganado. Vamos Cliente: " + partida.ganadasCliente + " Servidor: " + partida.ganadasServidor);
		} else {
			System.out.println("He perdido. Vamos Cliente: " + partida.ganadasCliente + " Servidor: " + partida.ganadasServidor);
		}
		
		return partida;
	}
	
	public static Partida recibir(Socket clienteConectado) {
		// CREO FLUJO DE ENTRADA AL CLIENTE
		Partida partidaRecibida = new Partida();
		try {
			ObjectInputStream flujoEntrada = new ObjectInputStream(clienteConectado.getInputStream());
			
			// EL SERVIDOR ME ENVIA UN MENSAJE
			partidaRecibida = (Partida) flujoEntrada.readObject();


		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return partidaRecibida;
	}
	
	public static void enviar(Partida partida, Socket conexionServidor) {
		// CREO FLUJO DE SALIDA AL SERVIDOR
		
		try {
			ObjectOutputStream flujoSalida = new ObjectOutputStream(conexionServidor.getOutputStream());		
			flujoSalida.writeObject(partida);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
