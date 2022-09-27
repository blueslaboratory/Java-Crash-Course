package ejemplos031_ficherosRAF;

import java.io.*;

public class Aleatorios1 {
	public static void main(String args[]) {
		File f = new File("prueba.dat");
		// System.out.println(f.getAbsolutePath());
		
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(f, "rw");
			// "rw" Open for reading and writing. 
			// If the file does not alreadyexist then an attempt will be made to create it.
			
			for (int i=1; i<=100; i++)
				raf.writeInt(i);
			// un entero ocupa 4 bytes; total 400 bytes
			// total 400 bytes

			try {
				System.out.println("El fichero ocupa " + raf.length() + " bytes.");
				raf.seek(0); // La primera posicion empieza en 0
				System.out.print("En la posicion " + raf.getFilePointer());
				System.out.println(" esta el numero " + raf.readInt());
				
				//raf.skipBytes(9 * 4); // Salto 9 => Elemento 10 mas alla				
				raf.skipBytes(9 * (Integer.BYTES));
				
				// ya ha leido la 1era, asi que salto 10 en total
				System.out.print("10 elementos mas alla, esta el ");
				System.out.println(raf.readInt());
				raf.close();
				System.out.println("Tamano int: " +Integer.BYTES);
			} catch (IOException e) {
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println();
		} catch (IOException e) {
			System.out.println();
		}
	}
}
