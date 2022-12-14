package ejemplos038_socketTCPHilos_TicTacServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TictacServer {
	
	public static void main(String args[]) throws IOException {
		
		ServerSocket servidor;
		servidor = new ServerSocket(6000);
		
		System.out.println("Servidor iniciado...");

		while (true) {
			
			Socket cliente = new Socket();
			// esperando cliente
			cliente = servidor.accept();
			
			TictacServer_Hilo hilo = new TictacServer_Hilo(cliente);
			hilo.start();
		}
	}
}