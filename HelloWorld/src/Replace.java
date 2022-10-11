/*
Instrucciones de uso:
	1. Copiar al paquete HelloWorld la clase a la que quieres quitar caracteres especiales
	2. Cambiar el nombre del String FICH incluyendo el nombre de la clase copiada
	3. Correr el archivo y voilá
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Replace {
	
	public static void main(String[] args) {
		
		final String FICH = "src/aleatorios.java"; //en la carpeta src busca un archivo llamado *.java
		final String FICH2 = "Temporal.java";
		
		File f = new File(FICH);
		File f2 = new File(FICH2);
		
		String contenido = "", linea;
		
		// LECTURA/ESCRITURA
		// try (BufferedReader br = new BufferedReader(new FileReader(FICH))){
		// con esto a partir de la v8 te puedes saltar el close del finally 
		// close automatico asi
		
		if(f.exists()) {
			try (BufferedReader br = new BufferedReader(new FileReader(FICH));
				 BufferedWriter bw = new BufferedWriter(new FileWriter(FICH2));){
				// le he quitado el true al bw para que cree un archivo nuevo 
				// y no haga un append
				
				// Mas elegante
				while((linea = br.readLine())!=null) {
					contenido += reemplazar(linea) +"\n";
					bw.write(reemplazar(linea));
					bw.newLine();
					//System.out.println(reemplazar(linea));
				}
				
				//bw.write(contenido);
				
			} catch(Exception e) {
				System.out.println("ERROR DE R/W" +e);
			}
		}
		
		if(f.delete())
			f2.renameTo(f);
		
		System.out.println(contenido);
	}	
	
	
	public static String reemplazar(String linea) {
		
		linea = linea.replaceAll("á", "a");
		linea = linea.replaceAll("é", "e");
		linea = linea.replaceAll("í", "i");
		linea = linea.replaceAll("ó", "o");
		linea = linea.replaceAll("ú", "u");
		linea = linea.replaceAll("ñ", "n");
		
		return linea;
	}
	
}
