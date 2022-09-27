package ejemplos029_ficheros5_binarios;
import java.io.*;
import java.util.*;

public class Binarios1 {
	public static void main(String args[]) {
		int nm;
		double nota;
		final String FICHERO = "notas.dat";

		try (Scanner sc = new Scanner(System.in);
			 DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO, true))) {

			System.out.print("Introduzca un NMat (0 para acabar): ");
			nm = Integer.parseInt(sc.nextLine());
			while (nm != 0) {
				dos.writeInt(nm);
				System.out.print("Introduzca una nota: ");
				nota = Double.parseDouble(sc.nextLine());
				dos.writeDouble(nota);
				System.out.print("Introduzca un NMat (0 para acabar): ");
				nm = Integer.parseInt(sc.nextLine());
			}

		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

}