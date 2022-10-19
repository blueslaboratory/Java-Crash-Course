package ejemplos030_ficherosSerializable2;

/*
 * Arreglamos el problema reescribiendo la clase ObjectOutputStream
 * Siempre tiene que existir el fichero antes de ejecutar este programa
 * 
 * */

import java.io.*;
import ejemplos030_ficherosSerializable1.Persona;
// hay que hacer este import de persona, si no da error de casting
// es para que todos los objetos Persona sean los mismos

public class PruebaPersona {
	final static String NOM_FICH = "datos.obj";

	public static void main(String[] args) {
		// ejemplos030_ficherosSerializable1.Persona p1;
		Persona p1;
		File f = new File(NOM_FICH);

		
		System.out.println("ESCRITURA");
		// ClaseOutput = ObjectOutputStream_mod
		try (ClaseOutput co = new ClaseOutput(new FileOutputStream(f, true))) {
			// Este programa funcionara
			// si ya existe el fichero

			p1 = new Persona("Pepi", 53);
			co.writeObject(p1);
			p1 = new Persona("Julia", 17);
			co.writeObject(p1);

		} catch (IOException ex) {
			System.out.println(ex);
		}

		
		System.out.println("LECTURA");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH))) {
			// Se lee el fichero con todos los datos

			try {
				while (true) {
					p1 = (Persona) ois.readObject();
					if (p1 instanceof Persona)
						System.out.println(p1);
				}
			} catch (EOFException e) {
			}

		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}