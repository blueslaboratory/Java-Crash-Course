package ejemplos029_ficheros5_binarios;

import java.io.*;

public class Binarios2_0 {
	public static void main(String args[]) {
		int nm;
		double nota;
		FileInputStream fis = null;
		DataInputStream dis = null;
		final String FICHERO = "notas.dat";

		try {
			fis = new FileInputStream(FICHERO);
			dis = new DataInputStream(fis);

			System.out.println("  NMAT   Nota");
			try {
				while (true) {
					nm = dis.readInt();
					nota = dis.readDouble();
					// System.out.printf("%6d %5.1f \n", nm, nota);
					System.out.println(String.format("%6d  %5.1f", nm, nota));
					// nº matricula ocupa: 6, nota: 5 enteros y 1 decimal
				}
			} catch (EOFException ex) {
				System.out.println("FINAL DE FICHERO " + ex.getMessage());
				// Este error no se debe mostrar
			}

		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			// como estoy haciendo un try sin recursos tengo que hacer esto:
			if (dis != null)
				try {
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
