package ejemplos030_ficherosSerializable5_pruebas;

import java.io.*;

public class AppTransient {
	final static String FICH = "cliente.obj";

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Angel", "xyz");

		try {
			// Escribir
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(FICH));
			salida.writeObject("Datos del cliente\n");
			salida.writeObject(cliente);
			salida.close();

			// Leer
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(FICH));
			String str = (String) entrada.readObject();
			Cliente obj = (Cliente) entrada.readObject();
			System.out.println("------------------------------");
			System.out.println("Desde el archivo:");
			System.out.println(str + obj);
			System.out.println();
			System.out.println("------------------------------");
			System.out.println("Sin escribir, desde java:");
			entrada.close();
			System.out.println(cliente);
			
			//se puede fundir en una catch Exception
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}

		try {
			//espera la pulsacion de una tecla y luego RETORNO
			System.in.read();
		} catch (Exception e) {
		}
	}
}
