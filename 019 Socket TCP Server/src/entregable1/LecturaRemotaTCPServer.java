// TCP

/*

Ejercicio 1 - Lectura remota de ficheros
Desarrolla un aplicacion en Java que permite leer un fichero de texto ubicado en 
otro ordenador a traves de sockets. Los pasos del proceso seran los siguientes:
- Programa cliente: solicita al usuario el nombre de un fichero, incluyendo su ruta
  completa dentro del sistema de archivos del servidor.
- Programa cliente: envia el nombre y la ruta del fichero al servidor
- Programa servidor: busca el fichero, lo abre, lee el contenido y se lo envia al
  cliente.
- Programa cliente: muestra el contenido por pantalla.
Utiliza el protocolo TCP o UDP para este ejercicio, pero piensa que el que utilices
aqui no lo podras repetir en el siguiente.

*/

package entregable1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LecturaRemotaTCPServer {

	public static void main(String[] args) {
		// ASIGNO UN PUERTO A MI APLICACION E INSTANCIO UN SERVERSOCKET CON EL PUERTO
		// ASI COMO UN SOCKET PARA CUANDO SE CONECTA UN CLIENTE
		
		try {
			
			// Puerto
			int numeroPuerto = 6069;
			
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
			
			
			
			// Programa servidor: busca el fichero, lo abre, lee el contenido
			// y se lo envia al cliente.
			
			// EL CLIENTE ME ENVIA LA RUTA ABSOLUTA
			String ruta = flujoEntrada.readUTF();
			System.out.println("Ruta recibida del CLIENTE:");
			System.out.println(ruta);
		
			// ENVIO EL MENSAJE AL CLIENTE
			String mensaje = lecturaFichero(ruta);
			flujoSalida.writeUTF("SERVIDOR --> CLIENTE: \n" +mensaje);
			
			
			
			// CERRAR STREAMS Y SOCKETS
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
	
	
	public static String lecturaFichero(String ruta) throws IOException {
		
		FileReader fr = new FileReader(ruta);
		BufferedReader br = new BufferedReader(fr);
		
		String linea ="";
		String mensaje = "";
		
		// quitando el null del final del archivo leido:
		while ((linea = br.readLine()) != null) {
				mensaje += linea +"\n";
		}
		
		System.out.println();
		System.out.println();
		System.out.println("MENSAJE (leido por el server):\n");
		System.out.println(mensaje);
		
		br.close();
		
		return mensaje;
	}
	
	
}