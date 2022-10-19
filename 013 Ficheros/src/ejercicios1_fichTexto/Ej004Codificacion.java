/*
4.- Haz programa en java que lea el fichero parrafo.txt y lo codifique 
sumandole a cada letra un valor que se pedira por teclado, guardarlo en 
otro fichero denominado codificado.txt. 
Sacar por pantalla el nuevo fichero creado.
*/

package ejercicios1_fichTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej004Codificacion {
	public static void main(String[] args) {
		char ct;
		int c, cant;
		final String FICHERO1 = "text.txt", FICHERO2 = "codificado.txt";
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor a sumar: ");
		cant = Integer.parseInt(sc.nextLine());
		System.out.println("cant: " +cant);
		sc.close();
		
		// Podria crear un valor al azar
		// cant = (int)(Math.random()*10);
		
		
		try {
			// Creo el fichero de salida
			fw = new FileWriter(FICHERO2);
			
			// Abro el fichero de entrada
			fr = new FileReader(FICHERO1);
			
			// Comenzamos a leer
			c = fr.read();
			while(c!=-1) {
				// if(c!=32 && c!=10 && c!=13) 
				if(c!=' ' && c!='\n' && c!='\r') // espacio o salto de linea
					c= c+cant;
				ct = (char)c;
				fw.write(ct);
				c = fr.read();
			}
		} catch(Exception e) {
			System.out.println("ERROR DE LECTURA");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(fr!=null) fr.close();
				if(fw!=null) fw.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		
		//Leyendo el codificado:
		String frase;
		
		System.out.println("Leyendo codificado: ");
		
		try {
			br = new BufferedReader(new FileReader(FICHERO2));
			frase = br.readLine();
			while(frase!=null) {
				System.out.println(frase);
				frase = br.readLine();
			}
			System.out.println();
			
		} catch(Exception e) {
			System.out.println("ERROR DE LECTURA " +e);
		} finally {
			try {
				if(br!=null) br.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		//Leyendo y descodificando el codificado
		// Abro el fichero de entrada
		System.out.println("Leyendo y descodificando el codificado: ");
		
		try {
			fr = new FileReader(FICHERO2);
			
			// Comenzamos a leer
			c = fr.read();
			while(c!=-1) {
				// if(c!=32 && c!=10 && c!=13) 
				if(c!=' ' && c!='\n' && c!='\r') // espacio o salto de linea
					c= c-cant;
				ct = (char)c;
				System.out.print(ct);
				c = fr.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null) fr.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}