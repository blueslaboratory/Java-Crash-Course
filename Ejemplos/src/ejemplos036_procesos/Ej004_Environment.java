/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos036_procesos;

/**
 *
 * @author jhorn
 */

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ej004_Environment {

	public static void main(String[] args) throws IOException, InterruptedException {
		ProcessBuilder pb = new ProcessBuilder("C:\\windows\\notepad.exe");

		/*
		Map<K,V>  --> Map<Key, Value>
		
		Es parecido a introducir datos en una BBDD de 2 columnas, la 1ra es un campo clave
		Podemos dejar la clave vacia pero no podemos repetir valores 
		
		Mas info:
		https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html
		PildorasInformaticas: Curso Java. Colecciones XI Mapas. Vídeo 189
		*/
		
		java.util.Map<String, String> env = pb.environment();
		System.out.println("Nº procesadores: " + env.get("NUMBER_OF_PROCESSORS"));
	}

}