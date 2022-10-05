// Ejercicio 002
// Partiendo del ejercicio anterior, realiza los cambios necesarios para que la entrada
// al primer programa se haga a partir de un fichero llamado dato.txt en lugar de 
// recibirlo por argumento.

package ejercicios_lectura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej002 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Leyendo numero del buffer");
		String numero = br.readLine();
		
		if (numero == null) {
			System.exit(-1);
		}
		else {
			try {
				Integer n = Integer.parseInt(numero);
				
				if(n<0)
					System.exit(-3);
				else
					System.exit(0);
				
			} catch (Exception e) {
				System.out.println("No has escrito un entero");
				System.exit(-2);
			}
		}

	}

}
