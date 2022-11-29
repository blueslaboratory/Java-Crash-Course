/*

Ejercicio 3
Modifica el servidor del ejercicio 1 para que admita 2 sockets en lugar de 1.
Al primer cliente conectado, recogera el texto que le envie y se devolvera en mayusculas.
Al segundo cliente conectado, recogera el texto que le envie y se lo devolvera en
minusculas.
Haz 2 programas cliente TCP que pidan por consola un texto, se lo envien al servidor y la
respuesta la pinten por pantalla.

*/

package ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ejercicio3Client0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// Host -> "localhost";
			//String Host = "192.168.56.1";
			String Host = "localhost";
			
			// puerto remoto
			int portNumber0 = 6069;

			
			System.out.println("Hola soy el cliente 0 y me inicio despues del servidor");
			System.out.println("PROGRAMA CLIENTE 0 INICIADO...");
			Socket Cliente0 = new Socket(Host, portNumber0);

			
			
			// CREO FLUJO DE SALIDA AL SERVIDOR
			DataOutputStream flujoSalida0 = new DataOutputStream(Cliente0.getOutputStream());

			// CREO FLUJO DE ENTRADA AL SERVIDOR
			DataInputStream flujoEntrada = new DataInputStream(Cliente0.getInputStream());

			
			
			Scanner sc = new Scanner(System.in);
			String mensajeCliente0;
			System.out.println();
			System.out.println("Introduce un mensaje para el servidor:");
			mensajeCliente0 = sc.nextLine();
			
			
			
			// ENVIO EL MENSAJE AL SERVIDOR
			flujoSalida0.writeUTF(mensajeCliente0);

			// EL SERVIDOR ME ENVIA UN MENSAJE
			System.out.println();
			System.out.println("Recibiendo del SERVIDOR:");
			System.out.println(flujoEntrada.readUTF());
			Thread.sleep(1000);
			
			
			
			// CERRAR STREAMS Y SOCKETS
			flujoEntrada.close();
			flujoSalida0.close();
			Cliente0.close();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}