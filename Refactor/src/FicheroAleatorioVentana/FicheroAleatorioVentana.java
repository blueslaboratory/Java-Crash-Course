package FicheroAleatorioVentana;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JFrame;



public class FicheroAleatorioVentana {

	public static void main(String[] args) throws IOException {
		
		JFrame f = new JFrame("DEPARTAMENTOS.");
		// Nos aseguramos que el fichero exista para evitar posibles errores
		File fichero = new File("AleatorioDep.dat");
		RandomAccessFile file;
		file = new RandomAccessFile(fichero, "rw");	
		file.close();
		
		SuperclaseDepart v = new VentanaDepart(f);
		v.setVisible(true);
		
		
		
		
	   
	}//fin main

	
	// boton derecho en ClaseAnidada -> Refactor -> Move Type to New File
	// te mueve la clase a una nueva clase
	public class ClaseAnidada {
		// ClaseAnidada
		
		void verporconsola() {
			ClaseAnidada ej = new ClaseAnidada();
			ej.entrada();
			System.out.println("Llamo a salida: " +ej.salida(10));
		}
		
		
		void entrada() {
			System.out.println("Metodo entrada.");
		}

		String salida(int d) {
			System.out.println("Salida.");
			return "Salida el " + d;
		}
	}
}//fin class