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
Introduce un numero: 80
El numero es menor que el numero escrito
Introduce un numero: 40
El numero es mayor que el numero escrito
Introduce un numero: 60
El numero es mayor que el numero escrito
Introduce un numero: 69
Acertaste
*/

package examencliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class AdivinarTCPClient {
	
	
	public static void main(String[] args) {
		
		try {
			
			// host -> "localhost";
			//String host = "192.168.56.1";
			String host = "localhost";
			
			// puerto remoto
			int numeroPuerto = 2000;
			
			Scanner sc = new Scanner(System.in);
			
			int numeroCliente = -1;
			String feedback;
			boolean acertaste = false;
			boolean esNumero = false;
			
			
			System.out.println("PROGRAMA CLIENTE INICIADO...");
			System.out.println("Hola soy el cliente y me inicio despues del servidor");
			System.out.println();
			Socket Cliente = new Socket(host, numeroPuerto);
			
			
			// CREO FLUJO DE SALIDA AL SERVIDOR
			DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
			
			// CREO FLUJO DE ENTRADA DEL SERVIDOR
			DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
			
			
			
			while(!acertaste) {
				
				System.out.println();
				
				do {
					try {
						System.out.print("Introduce un numero: ");
						numeroCliente = Integer.parseInt(sc.nextLine());
						esNumero = true;
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				} while(!esNumero);
				
				
				// Programa cliente: envia el numero al servidor
				flujoSalida.writeInt(numeroCliente);
				
				// El servidor me envia feedback
				feedback = flujoEntrada.readUTF();
				System.out.println(feedback);		
				
				acertaste = flujoEntrada.readBoolean();
				
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
	
	
}