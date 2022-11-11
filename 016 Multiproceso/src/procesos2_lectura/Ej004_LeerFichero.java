package procesos2_lectura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej004_LeerFichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Leemos el buffer de Ej004_LlamadaLeerFichero
		try (InputStreamReader isr = new InputStreamReader(System.in);
			 BufferedReader br = new BufferedReader(isr);) {
			
			String leer = br.readLine();
			
			if (leer.length() < 1) {
				System.exit(-1);
			}

			// no lo va imprimir porque entra en System.exit(-1);
			System.out.println(leer);
			System.exit(777);
		} catch (Exception e) {
			System.exit(88);
		}

	}

}