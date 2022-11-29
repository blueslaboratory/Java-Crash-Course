/*
Ejercicio 2
Haz un programa servidor de socket TCP que reciba un numero de un cliente, 
haga su cuadrado y se lo devuelva al cliente.
Haz un programa cliente TCP que pida por consola un numero, 
se lo envie al servidor y la respuesta la pinte por pantalla.
*/

package ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ejercicio2Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// Host -> "localhost";
			//String Host = "192.168.56.1";
			String Host = "localhost";
			
			// puerto remoto
			int numeroPuerto = 6069;

			
			System.out.println("Hola soy el cliente y me inicio despues del servidor");
			System.out.println("PROGRAMA CLIENTE INICIADO...");
			Socket Cliente = new Socket(Host, numeroPuerto);

			
			
			// CREO FLUJO DE SALIDA AL SERVIDOR
			DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());

			// CREO FLUJO DE ENTRADA AL SERVIDOR
			DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());

			
			
			Scanner sc = new Scanner(System.in);
			String numero;
			System.out.println();
			System.out.println("Introduce un numero: ");
			numero = sc.nextLine();
			
			
			
			// ENVIO EL MENSAJE AL SERVIDOR
			flujoSalida.writeUTF(numero);

			// EL SERVIDOR ME ENVIA UN MENSAJE
			System.out.println("Recibiendo el cuadrado del SERVIDOR:");
			System.out.println(flujoEntrada.readUTF());
			Thread.sleep(1000);
			
			
			
			// CERRAR STREAMS Y SOCKETS
			flujoEntrada.close();
			flujoSalida.close();
			Cliente.close();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
