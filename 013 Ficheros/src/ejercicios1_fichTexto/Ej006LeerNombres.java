/*
6.- Lee el fichero nombres.txt, generado en el ejercicio anterior, 
y calcula la longitud media de los nombres completos (nombre + apellido). 
Muestra el contenido de dicho fichero por pantalla de forma que para 
cada pareja de nombre y apellido se muestre su longitud y al final la 
media de las longitudes de los nombres+apellido.
*/

package ejercicios1_fichTexto;

import java.io.*;

public class Ej006LeerNombres {
	public static void main(String[] args) {

		String linea = "", length = "";
		float l=0, acum=0, c=0;
		
		final String FICH = "nombres.txt";
		BufferedReader br = null;
				
		// LECTURA
		// try (BufferedReader br = new BufferedReader(new FileReader(FICH))){
		// con esto a partir de la v8 te puedes saltar el close del finally 
		// close automatico asi
		
		try {
			br = new BufferedReader(new FileReader(FICH));
			
			/*
			linea = br.readLine();
			
			while(linea!=null) {
				length = String.valueOf((linea.length()-1));
				System.out.println(linea +" -> longitud: " +(length));
				linea = br.readLine();
				acum += (linea.length()-1);
			}
			*/
			
			// Mas elegante
			System.out.println("Elegante: \n");
			while((linea = br.readLine())!=null) {
				acum+=linea.length();
				System.out.println(linea +" -> longitud: " +(linea.length()-1));
				c++;
			}
			
			System.out.println("\nLa media es: " +acum/c);
			
		} catch(Exception e) {
			System.out.println("ERROR DE LECTURA" +e);
		} finally {
			try {
				if (br != null)	br.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
