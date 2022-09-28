package procesos2_lectura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej004_LeerFichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String leer = br.readLine();
		
		if (leer.length() < 1) {
			System.exit(-1);
		}

		System.out.println(leer);
		System.exit(1);
	}

}
