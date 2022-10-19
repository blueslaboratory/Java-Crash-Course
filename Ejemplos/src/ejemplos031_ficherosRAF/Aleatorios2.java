package ejemplos031_ficherosRAF;

import java.io.*;

public class Aleatorios2 {
	public static void main(String args[]) {
		
		File f = new File("prueba.dat");
		RandomAccessFile raf = null;
		
		try {
			
			System.out.println("\n****Escribir en el archivo****");
			
			raf = new RandomAccessFile(f, "rw");			
			for (int i=1; i<=10; i++) {
				raf.writeInt(i);
				System.out.println("Pos " +(i-1) +":\t" +i);
			}
			
			
			System.out.println("\n\n****Reescribir en el archivo****");
			
			try {
				raf.seek(0); // La primera posicion empieza en 0
				System.out.println("FilePointer Inicial: " +raf.getFilePointer()); 
				while (true) {
					int valor = raf.readInt();
					System.out.println("Numero: " +valor);
					System.out.println("Read: +4 al FilePointer");
					System.out.println("FilePointer Inicial: " +raf.getFilePointer());
					
					if (valor % 2 == 0) {
						
						System.out.println("\nraf.seek(" +(raf.getFilePointer()-Integer.BYTES) +"): -4 al FilePointer");
						//raf.seek(raf.getFilePointer()-4);// me posiciono 4 bytes atras
						raf.seek(raf.getFilePointer()-Integer.BYTES); //-4
						//restamos lo que ocupa un int: 4
						//Me posiciono 4 bytes atras
						valor = valor * 2;
						
						//Forma 1
						/*
						System.out.println("FilePointer Medio: " +raf.getFilePointer()); 
						System.out.println("Escribo " + valor + " en la posicion " +((raf.getFilePointer()-4)/4 + 1)
						+" = (" +raf.getFilePointer() +"-4)/4 + 1" ); //esta linea es aesthetics
						raf.writeInt(valor);
						System.out.println("Write: +4 al FilePointer");
						System.out.println("FilePointer Final: " +raf.getFilePointer() +"\n"); 
						*/
						
						//Forma 2
						//A partir de la version 8:
						
						int i = Integer.BYTES;
						System.out.println("FilePointer Medio: " +raf.getFilePointer());
						System.out.println("Escribo " + valor + " en la posicion " + ((raf.getFilePointer()-i)/i + 1)
						+" = (" +raf.getFilePointer() +"-" +i +")/" +i + " + 1"); //esta linea es aesthetics
						//sumo 1 porque empieza en 0
						raf.writeInt(valor);
						System.out.println("Write: +4 al FilePointer");
						System.out.println("FilePointer Final: " +raf.getFilePointer() +"\n"); 
						
						
					}
				}
			} catch (EOFException e) {
				System.out.println(e.getMessage());
			}
			
			
			System.out.println("\n\n****Lectura del archivo****");
			
			try {
				int cont = 0;
				raf.seek(0);
				while(true) {
					System.out.println("Pos " +cont +":\t" +raf.readInt());
					cont++;
				}	
			} catch (EOFException e) {
				System.out.println(e.getMessage());
			}

		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (raf != null) {
					raf.close();
				}
				f.delete();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
