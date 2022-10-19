package ejemplos029_ficheros5_binarios;
import java.io.*;
import java.util.*;

public class BinariosNombre1 {
	public static void main(String args[]) {
		String nombre;
		double nota;
		final String FICHERO = "notasNombres.dat";

		try (Scanner teclado = new Scanner(System.in);
			 DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO, true))) {

			System.out.print("Introduzca un nombre (FIN para acabar): ");
			nombre = teclado.nextLine();
			while (!(nombre.equalsIgnoreCase("FIN"))) {
				dos.writeUTF(nombre);
				System.out.print("Introduzca una nota: ");
				nota = Double.parseDouble(teclado.nextLine());
				dos.writeDouble(nota);
				System.out.print("Introduzca un nombre (FIN para acabar): ");
				nombre = teclado.nextLine();
			}

		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

}