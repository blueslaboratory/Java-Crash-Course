/*
1.- Con un programa en java crea un fichero denominado parrafo.txt. 
Escribe en el las lineas que vaya introduciendo el usuario, terminando 
cuando escriba FIN.
*/

package ejercicios1_fichTexto;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Ej001EscribirEnFichero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = null;
		
		LocalDate today = LocalDate.now();
		String cad = "Update: " +today +"\n";
		
		//con el FileWriter es menos optimo, es mas optimo con el BufferedWriter 
		//fWriter(sc);
		bWriter(sc,bw);
		
	}
	
	public static void fWriter(Scanner sc) {
		LocalDate today = LocalDate.now();
		String cad = "Update FileWriter: " +today +"\n";
		String cad2;
		
		try {
			do {
				cad2 = "";
				
				System.out.print("> ");
				cad2 = sc.nextLine();
				cad += cad2 +"\r\n" ;
			} while(!cad2.equals("FIN"));
			
			// G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\013 Ficheros
			FileWriter escribir = new FileWriter("parrafo.txt", true); // Para anadir
			// true: si ya existe el fichero no lo machaco, continuo escribiendo donde lo deje
			// Se escribe en el archivo con el metodo write
			escribir.write(cad);
			escribir.write("\n");
			// Se cierra la conexion
			escribir.close();
		} catch (Exception e) {
			// si lo tienes abierto te salta esta excepcion
			System.out.println("Error al escribir");
		} 
	}
	
	public static void bWriter(Scanner sc, BufferedWriter bw) {
		LocalDate today = LocalDate.now();
		String cad = "Update BufferedWriter: " +today +"\n";
		
		try {
			File f = new File("parrafo.txt");
			bw = new BufferedWriter(new FileWriter(f, true));
			// new FileWriter(f): conexion entre nuestro programa-parrafo.txt
			// cuando el buffer llega a un determinado tamanio lo escribe en disco,
			// nada se escribe inmediatamente en disco porque el acceso es costoso
			System.out.print("> ");
			cad += sc.nextLine();
			
			while(!cad.equalsIgnoreCase("FIN")) {
				bw.write(cad);
				bw.newLine();
				System.out.print("> ");
				cad = sc.nextLine();
			}
		} catch(IOException e) {
			System.out.println("Error de creacion " +e);
		} catch(Exception e) {
			System.out.println("Otro error" +e);
		} finally {
			try {
				if(bw!=null)
					bw.close();
				if(sc!=null)
					sc.close();
			} catch(Exception e) {
				e.getMessage();
			}
		}
	}
}