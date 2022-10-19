package ejemplos030_ficherosSerializable3;

/**
 * Solucion que contempla todos los casos y es la mas optima
 */
import java.io.*;
import ejemplos030_ficherosSerializable1.Persona;
//hay que hacer este import de persona, si no da error de casting
//es para que todos los objetos Persona sean los mismos

public class PruebaPersona {
	final static String NOM_FICH = "datos.obj";

	public static void main(String[] args) {
		Persona p1;

		// mejor no hacer un try con recursos en este caso
		// si haces las 2 creaciones dentro del try: 1 sobreescribe el fichero
		// otro lo abre para anadir, es contradictorio; es mejor hacer uno cada vez;
		// Se podria hacer 1 solo en el try con recursos

		try {
			// Este programa funcionara
			// tanto si ya existe el fichero, como si se crea de nuevo
			// Para ello pregunta si existe el fichero y si existe
			// usa la clase que no anade cabecera (ClaseOutput)
			// Si no existe usara la otra clase (ObjectOutputStream)
			File f = new File(NOM_FICH);

			if (f.exists() && f.length() > 0) {// si existe y tiene algo
				ClaseOutput co = new ClaseOutput(new FileOutputStream(f, true));
				p1 = new Persona("Pepi", 53);
				co.writeObject(p1);
				p1 = new Persona("Julia", 17);
				co.writeObject(p1);
				co.close();
			} else {
				// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectOutputStream.html
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				p1 = new Persona("Lola", 53);
				oos.writeObject(p1);
				p1 = new Persona("Juana", 17);
				oos.writeObject(p1);
				oos.close();
			}
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}

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