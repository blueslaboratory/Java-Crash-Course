/*
1.- Crea una aplicacion que pida por teclado la cantidad de numeros aleatorios 
enteros positivos que se van a guardar en un fichero binario. El rango de los 
numeros aleatorios estara entre 0 y 100, incluyendo el 100.
Cada vez que se ejecute la aplicacion se anadiran numeros al fichero sin borrar 
los anteriores.
Muestra en pantalla el fichero creado, despues de realizar las operaciones de 
escritura sobre el.
*/

package ejercicios2_fichBinario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ej001Aleatorios {

	public static void main(String[] args) {
		int n;
		int nRandom;
		final String FICHERO = "ej001.txt";

		// Escritura
		try (Scanner sc = new Scanner(System.in);
			 DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO, true))) {
			
			// dos.writeUTF(""+LocalDateTime.now()); //log
			// si pones el log tienes que leerlo y saber cuando termina, sino: problems
			
			System.out.print("Cantidad de numeros a introducir: ");
			n = Integer.parseInt(sc.nextLine());
			while (n != 0) {
				nRandom = (int) (Math.random()*(100-0+1)); //(M-N)+1
				dos.writeInt(nRandom);
				
				System.out.println("Countdown escritos " +n +": " +nRandom);
				n--;
			}

		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		
		// Lectura
		try (DataInputStream dis = new DataInputStream(new FileInputStream(FICHERO))) {

			// .available es como el hasNext del iterator o como un ready
			while (dis.available() > 0) { // Aqui no leemos el eof (end of line)
				nRandom = dis.readInt();
				System.out.print((dis.available()) +": ");
				System.out.println(nRandom);
			}
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}