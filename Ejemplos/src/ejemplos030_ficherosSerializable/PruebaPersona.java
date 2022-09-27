package ejemplos030_ficherosSerializable;

/*
 * Escribimos dos objetos en un fichero y a continuacion los leemos.
 * No se vuelve a abrir para anadir mas objetos
 * */
import java.io.*;

public class PruebaPersona {
	final static String NOM_FICH = "datos.obj";

	public static void main(String[] args) {
		Persona p1 = new Persona("Pablo", 20);
		Persona p2 = new Persona("Rosa", 35);

		// Escritura del objeto en un fichero
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOM_FICH))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
		} catch (IOException ex) {
			System.out.println(ex);
		}

		// Lectura del objeto en un fichero
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH))) {
			/*
			p1 = (Persona) ois.readObject();
			while (p1 != null) {
				System.out.println(p1);
				p1 = (Persona) ois.readObject();
			}
			*/
			while ((p1 = (Persona) ois.readObject()) != null) {
				System.out.println(p1);
			}
		} catch (EOFException ex) {
			// System.out.println(ex);
			// La captura siempre cuando termina de leer
			// pero no se suele mostrar
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
