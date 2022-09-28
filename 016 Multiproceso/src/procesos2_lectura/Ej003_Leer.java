package procesos2_lectura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej003_Leer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nombre = br.readLine();
		
		// ojo que aqui se pasa el parametro a leer
		if (nombre.length() < 1) {
			System.exit(-1);
		}

		System.out.println("Mi nombre es " + nombre);
		System.exit(1);
	}

}
