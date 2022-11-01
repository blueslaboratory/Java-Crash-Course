/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos036_procesos;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class Ej003_DestruccionProceso {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime entorno = Runtime.getRuntime();

		try {
			Process p;
			
			
			
			// WINDOWS
			// p = entorno.exec("C:\\Windows\\notepad.exe");
			
			
			
			
			// LINUX
			p = entorno.exec("ls /home/alejandro");
			p = entorno.exec("/bin/bash -c ls /home/alejandro");
			
			// Abriendo la terminal en Linux Mint
			ProcessBuilder pbTerminal = new ProcessBuilder("gnome-terminal");
			Process pTerminal = pbTerminal.start();
			
			
			
			
			boolean b = p.waitFor(5000, TimeUnit.MILLISECONDS);
			p.destroy();
			System.out.println(p.exitValue());
			
		} catch (IOException ex) {
			System.err.println("Excepcion de E/S!!");
			System.exit(-1);
		}
	}

}
