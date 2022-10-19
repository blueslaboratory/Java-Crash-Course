/*
2.- Crea una aplicacion que almacene los datos basicos de un vehiculo: 
matricula (String), marca (String), tamano de deposito (double) y 
modelo (String) en un fichero binario.
Los datos se pediran por teclado. Se iran anadiendo al fichero los datos 
de nuevos vehiculos cada vez que ejecutemos la aplicacion 
(no se sobrescriben los datos).

Cada vez que se modifica el fichero, se muestran por pantalla los datos 
de cada coche.

Utiliza la clase JOptionPane para leer los datos de entrada (showInputDialog) 
y mostrarlos (showMessageDialog).

*/
package ejercicios2_fichBinario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ej002Vehiculos {
	public static void main(String[] args) {
		
		String matricula, marca, modelo;
		double tDep;
		final String FICHERO = "ej002.txt";

		// Escritura
		try (Scanner sc = new Scanner(System.in);
			 DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO, true))) {

			// si pones el log tienes que leerlo y saber cuando termina, sino: problems
			// dos.writeUTF(""+LocalDateTime.now()); //log
			
			System.out.println("***********VEHICULO***********");
			System.out.print("Matricula: "); //0
			dos.writeUTF(matricula = sc.nextLine());
			System.out.print("Marca: "); //1
			dos.writeUTF(marca = sc.nextLine());
			System.out.print("Modelo: "); //2
			dos.writeUTF(modelo = sc.nextLine());
			System.out.print("Deposito (L): "); //3
			dos.writeDouble(tDep = Double.parseDouble(sc.nextLine()));

		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		// Lectura
		try (DataInputStream dis = new DataInputStream(new FileInputStream(FICHERO))) {
			String cad;
			double num;
			// .available es como el hasNext del iterator o como un ready
			while (dis.available() > 0) { // Aqui no leemos el eof (end of line)
				for(int i=0; i<3; i++) {
					System.out.print((dis.available()) +": ");
					System.out.println(dis.readUTF());
				}
				System.out.print((dis.available()) +": ");
				System.out.println(dis.readDouble());
				System.out.println();
			}
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
