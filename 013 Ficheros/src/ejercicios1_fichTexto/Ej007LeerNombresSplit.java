/*
7.- Como el 6, pero ahora calcula la longitud media de los nombres 
y apellidos por separado (se leen juntos en una linea y se separan 
usando el metodo split()). 
*/

package ejercicios1_fichTexto;

import java.io.*;

public class Ej007LeerNombresSplit {
	public static void main(String[] args) {

		String linea = "";
		String[] aStr;
		float acum1=0, acum2=0, c=0;
		
		final String FICH = "nombres.txt";
		BufferedReader br = null;
		
		
		// LECTURA
		try {
			br = new BufferedReader(new FileReader(FICH));
			//linea = br.readLine();
			
			//while(linea!=null) {
			while((linea = br.readLine())!=null) {
				
				aStr = linea.split(" ", 0); 
				// el 0 del 2do parametro te permite separarlo tantas veces como
				// espacios, " ", existan
				acum1 += aStr[0].length();
				acum2 += aStr[1].length();
				c++;
				
				System.out.println(linea);
				//linea = br.readLine();
			}
			
			System.out.println();
			System.out.println("Media longitud nombres: " +acum1/c +" caracteres");
			System.out.println("Media longitud apellidos: " +acum2/c +" caracteres");
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
