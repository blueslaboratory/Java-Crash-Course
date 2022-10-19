/*
4.- Realiza un programa que, partiendo del fichero binario “datosbeca.bin”, 
calcule la cuantia de la beca (en caso de que la haya). 
El total de la beca se calcula como sigue:

-	Base fija de 1500€
-	Si los ingresos anuales de la familia son menores o iguales a la media (12.000€), 
	la beca se incrementa en 500€, en caso contrario no lleva complementos.
-	Si la edad de la persona es inferior a 23 años, 200€ de gratificacion, 
	si es mayor no hay gratificacion.
-	Si no hay suspensos en el curso anterior, hay una gratificacion de 500€, 
	1 suspenso 200€. Si hay 2 o mas suspensos no hay beca.
-	Si vive de alquiler (no residencia familiar), 1000€ mas de gratificacion.

Visualiza el nombre de cada uno de los becarios y su cuantia total (solo los que tienen beca).
*/

package ejercicios2_fichBinario;

import java.io.*;

public class Ej004CuantiaBeca {

	final static String FICHERO = "datosbeca.bin";

	public static void main(String[] args) {
		asignacionBeca();
	}

	public static void asignacionBeca() {
		try (DataInputStream dis = new DataInputStream(new FileInputStream(FICHERO))) {

			leerFichero(dis);

		} catch (EOFException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void leerFichero(DataInputStream dis) throws Exception {
		while (dis.available() > 0) {

			String nombre;
			String genero, resiFamiliar;
			int edad;
			int suspensos;
			int ingresos;
			int baseFija = 1500;
			int total = 0;

			// Mismo orden de lectura que de escritura en el fichero
			nombre = dis.readUTF();
			genero = dis.readUTF();
			edad = dis.readInt();
			suspensos = dis.readInt();
			resiFamiliar = dis.readUTF();
			ingresos = dis.readInt();

			
			System.out.println("Nombre: " +nombre);
			System.out.println("Genero: " +((genero.equalsIgnoreCase("m")? "Masculino" : "Femenino")));
			System.out.println("Edad: " + edad);
			System.out.println("Suspensos: " + suspensos);
			System.out.println("Vive en residencia familiar: " +((resiFamiliar.equalsIgnoreCase("s"))? "si":"no"));
			System.out.println("Ingresos: " +ingresos +" euros");

			total = baseFija;

			// cuantia edad
			if (edad < 23) {
				total = total + 200;
			}

			// cuantia suspensos
			if (suspensos == 0) {
				total += 500;
			}
			if (suspensos == 1) {
				total += 200;
			}

			// cuantia residencia Familiar
			if (resiFamiliar.equalsIgnoreCase("No")) {
				total += 1000;
			}

			// Ingresos anuales
			if (ingresos <= 12000) {
				total += 500;
			}

			System.out.println();
			if (suspensos >= 2)
				System.out.println("A " + nombre + " no le corresponde beca");
			else
				System.out.println("A " + nombre + " le corresponde una beca de " + total + " euros");
			System.out.println();
		}
	}

}
