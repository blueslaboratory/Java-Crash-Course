/*
1.- Realiza un programa que sirva para representar centros 
educativos de diferentes tipos. Los tipos que se puede tener 
son: publicos, concertados y privados. Para todos ellos se 
quiere tener su nombre y direccion. Para los publicos se 
tendra la asignacion anual publica recibida. Para los concertados 
la asignacion mensual publica recibida, asi como la cuota 
mensual que pagan los alumnos. Para los privados se tendra la 
cuota mensual que pagan los alumnos. Se pide crear tres centros, 
uno de cada tipo y guardarlos en un arrayList en el programa 
principal. Imprimir a continuacion los datos de cada centro 
educativo usando el arrayList donde estan guardados.

*/

package herencia1_Ej001_J;

import java.util.ArrayList;

public class Ej001CentroMain {
	public static void main(String [] args) {
		
		ArrayList<Ej001CentroEducativo> centros = new ArrayList<Ej001CentroEducativo>();
		Ej001Concertado concertado = new Ej001Concertado("Colegio el Pilar", "Goya", 500, 12000);
		Ej001Privado privado = new Ej001Privado("San Patricio", "La moraleja", 1300);
		Ej001Publico publico = new Ej001Publico("IES Clara del Rey", "Alfonso XIII", 16000);
		
		centros.add(concertado);
		centros.add(privado);
		centros.add(publico);
		
		for(Ej001CentroEducativo c:centros) {
			System.out.println(c.toString());
		}
	}
}
