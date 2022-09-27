package ejemplos030_ficherosSerializable5_pruebas;
import java.io.*;

public class AppLista {
	final static String FICH = "media.obj";
	
	public static void main(String[] args) {
		Lista lista = new Lista(new int[] { 12, 15, 11, 4, 32 });
		try {
			// Escribir un objeto que tiene un array
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(FICH));
			salida.writeObject("guardar este string y un objeto\n");
			salida.writeObject(lista);
			salida.close();

			// Leer
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(FICH));
			String str = (String) entrada.readObject();
			Lista obj = (Lista) entrada.readObject();
			System.out.println("Valor medio " + obj.valorMedio());
			System.out.println("-----------------------------");
			System.out.println(str + obj);
			System.out.println("-----------------------------");
			entrada.close();
			// se puede fundir en una catch Exception con | 
			// | (tuberia): es un or pero no es un or logico
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