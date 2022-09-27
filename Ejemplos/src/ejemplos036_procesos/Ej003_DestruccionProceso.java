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

public class Ej003_DestruccionProceso {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime entorno = Runtime.getRuntime();

		try {
			Process p1;
			p1 = entorno.exec("C:\\Windows\\notepad.exe");
			boolean b = p1.waitFor(5000, TimeUnit.MILLISECONDS);
			p1.destroy();
			System.out.println(p1.exitValue());
		} catch (IOException ex) {
			System.err.println("Excepción de E/S!!");
			System.exit(-1);
		}
	}

}
