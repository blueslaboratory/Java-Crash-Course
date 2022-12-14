package ejemplos038_socketTCPHilos_TicTacServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TictacServer_Hilo extends Thread{
	
	BufferedReader fentrada;
	Socket socket = null;

	public TictacServer_Hilo(Socket s) throws IOException {// CONSTRUCTOR
		socket = s;
		// se crean flujos de entrada
		fentrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}
	
	// tarea a realizar con el cliente
	public void run() {
		String cadena = "";
		
		while (!cadena.trim().equals("*")) {

			try {
				cadena = fentrada.readLine();
				System.out.println(cadena);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 

		System.out.println("FIN CON: " + socket.toString());
		
		try {
			fentrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}