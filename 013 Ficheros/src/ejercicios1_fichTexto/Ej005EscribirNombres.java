/*
5.- Genera un fichero llamado nombres.txt en el que hay una lista de personas, 
con su nombre y  apellidos (datos de cada persona en una linea diferente). 
Poner fin para terminar.
*/

package ejercicios1_fichTexto;

import java.io.*;
import java.util.Scanner;

public class Ej005EscribirNombres {

	public static void main(String[] args) {
		final String FICH = "nombres.txt";

		String linea = "";
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		BufferedWriter bw = null;
		// BufferedWriter: cuando estima que es el momento o se hace un
		// flush o se cierra el fichero y lo pasa a disco
		
		
		// ESCRITURA
		try {
			bw = new BufferedWriter(new FileWriter(FICH, true)); //true -> continua donde estaba
			
			while (!linea.equals("fin")) {
				System.out.print("Nombre completo: ");
				linea = sc.nextLine();
				if(!linea.equals("fin")) {
					bw.write(linea);
					bw.newLine();
				}
			}
		} catch (Exception e) {
			System.out.println("ERROR DE ESCRITURA " +e);
		} finally {
			try {
				if (bw != null) bw.close();
				if (sc != null) sc.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		// LECTURA
		try {
			br = new BufferedReader(new FileReader(FICH));
			linea = br.readLine();
			
			while(linea!=null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch(Exception e) {
			System.out.println("ERROR DE LECTURA" +e);
		} finally {
			try {
				if (br != null)	br.close();
				if (sc != null) sc.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
