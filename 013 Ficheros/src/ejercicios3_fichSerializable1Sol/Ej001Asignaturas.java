package ejercicios3_fichSerializable1Sol;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej001Asignaturas {

	ArrayList<Ej001Asignatura> curso;

	public Ej001Asignaturas() {
		curso = new ArrayList<Ej001Asignatura>();
	}

	public void anadirObjetosALista() {
		Scanner teclado = new Scanner(System.in);
		String respuesta = "no";
		do {
			curso.add(new Ej001Asignatura(leerNombre(teclado), leerNota(teclado)));

			System.out.println("Desea introducir otra asignatura?(SI/NO)");
			respuesta = teclado.nextLine();
		} while (respuesta.equalsIgnoreCase("Si"));

		System.out.println("***** Notas almacenadas en la lista *****");
		teclado.close();
	}

	public void crearFichero(String nomFich) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFich))) {
			escribirFichero(oos);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void escribirFichero(ObjectOutputStream oos) throws Exception {

		System.out.println(".................. Volcando la lista al fichero ................");

		for (int i = 0; i < curso.size(); i++) {
			oos.writeObject(curso.get(i));
		}

		System.out.println("***** Volcado finalizado con exito *****");

	}

	public void leerFichero(String nomFich) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFich))) {
			mostrarFichero(ois);
		} catch (EOFException e) {
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void mostrarFichero(ObjectInputStream ois) throws Exception {
		Ej001Asignatura asignatura;
		System.out.println("....Leyendo el fichero.....");
		while (true) {
			asignatura = (Ej001Asignatura) ois.readObject();
			System.out.println("Asignatura: " + asignatura.getNombre());
			System.out.println("Nota: " + asignatura.getNota());
		}
	}

	public void leerFicheroParaCalcular(String nomFich) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFich))) {
			calcularMedia(ois);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void calcularMedia(ObjectInputStream ois) {
		Ej001Asignatura asignatura;
		double media = 0, mediaFinal, nota;
		int contador = 0;

		System.out.println("..........Calculando media..........");
		try {
			while (true) {
				asignatura = (Ej001Asignatura) ois.readObject();
				System.out.println("Asignatura: " + asignatura.getNombre());
				System.out.println("Nota: " + (nota = asignatura.getNota()));
				media = media + nota;
				contador++;
			}
		} catch (EOFException e) {
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		mediaFinal = media / contador;
		System.out.println("Su nota media del curso es de: " + mediaFinal);

	}

	public static void calcularMedia2(ObjectInputStream ois) {
		Ej001Asignatura asignatura;
		double media = 0, mediaFinal, nota;
		int contador = 0;

		System.out.println("..........Calculando media..........");
		try {
			while ((asignatura = (Ej001Asignatura) ois.readObject()) != null) {
				System.out.println("Asignatura: " + asignatura.getNombre());
				System.out.println("Nota: " + (nota = asignatura.getNota()));
				media = media + nota;
				contador++;
			}
		} // Si llego a leer devolviendome null, salta el EOF }
		catch (EOFException e) {
			System.out.println("EOFException");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		mediaFinal = media / contador;
		System.out.println("Su nota media del curso es de: " + mediaFinal);

	}

	public static void calcularMedia3(ObjectInputStream ois) {
		Ej001Asignatura asignatura;
		double media = 0, mediaFinal, nota;
		int contador = 0;

		System.out.println("..........Calculando media..........");
		try {
			while (ois.available() > 0) { // No funciona con Serializacion
				asignatura = (Ej001Asignatura) ois.readObject();
				System.out.println("Asignatura: " + asignatura.getNombre());
				System.out.println("Nota: " + (nota = asignatura.getNota()));
				media = media + nota;
				contador++;
			}
		} catch (EOFException e) {
			System.out.println("EOFException");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		mediaFinal = media / contador;
		System.out.println("Su nota media del curso es de: " + mediaFinal);

	}

	public static String leerNombre(Scanner teclado) {
		String nombre;

		System.out.print("Por favor, introduzca el nombre de la asignatura:");
		nombre = teclado.nextLine();

		return nombre;
	}

	public static double leerNota(Scanner teclado) {
		double nota;

		do {
			System.out.println("Introduce la nota de la asignatura:");
			nota = Double.parseDouble(teclado.nextLine());
			if ((nota < 0) || (nota > 10)) {
				System.out.println("nota no valida");
			}
		} while ((nota < 0) || (nota > 10));

		return nota;
	}
}