package procesos2_lectura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej003_Leer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Leemos el buffer de Ej003_LlamadaLeer
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nombre = br.readLine();
		
		// si el buffer que leemos tiene una longitud de <=0
		if (nombre.length() < 1) {
			System.exit(-1); // exitVal
		}

		System.out.println("Mi nombre es " + nombre);
		System.exit(99); // exitVal
	}

}