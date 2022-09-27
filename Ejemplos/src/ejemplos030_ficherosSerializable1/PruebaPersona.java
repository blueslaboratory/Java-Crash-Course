package ejemplos030_ficherosSerializable1;

/*
 * Primer metodo para arreglar el problema visto: FicherosSerializableError
 * Usamos un fichero auxiliar: sol chapuza
 * 
 * */

import java.io.*;

public class PruebaPersona {
	final static String NOM_FICH = "datos.obj", NOM_FICH_AUX = "auxiliar.obj";
	// nunca llamar a un fichero "aux." porque aux es un fichero reservado del sistema
	public static void main(String[] args) {

		Persona p1 = new Persona("Pablo", 20);
		Persona p2 = new Persona("Rosa", 35);

		
		// Insertamos las dos personas que acabamos de crear
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOM_FICH))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
		} catch (IOException ex) {
			System.out.println(ex);
		}

		
		// Se anaden dos registros mas usando el primer metodo.
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH));
 			 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOM_FICH_AUX))) {

			try {// Si no capturo aqui la excepcion de EOF no pasa a escribir los objetos nuevos
				 // Vuelco en un fichero auxiliar todo el contenido del original
				while ((p1 = (Persona) ois.readObject()) != null)
					oos.writeObject(p1);
			} catch (EOFException ex) {
				System.out.println(ex.getMessage());
			}

			// Hemos leido los objetos del fichero datos.obj y los hemos pasado
			// al nuevo fichero temporal
			
			// Anadimos dos nuevos objetos
			p1 = new Persona("Juan", 50);
			oos.writeObject(p1);
			p1 = new Persona("Maria", 35);
			oos.writeObject(p1);

			oos.close();
			ois.close();

			File f = new File(NOM_FICH_AUX); // esto no crea archivos
			File f1 = new File(NOM_FICH);
			if (f1.delete()) // Borro el fichero original
				f.renameTo(f1); // auxiliar pasa a ser el fichero datos.obj

		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		
		// Ahora leemos el fichero con todos los datos
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH))) {

			while ((p1 = (Persona) ois.readObject()) != null)
				System.out.println(p1);

		} catch (EOFException e) {
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}