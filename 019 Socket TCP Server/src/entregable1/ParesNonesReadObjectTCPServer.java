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

