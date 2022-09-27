//Un alumno desea saber cual sera su calificacion final en la materia de Algoritmos. 
//Dicha calificacion se compone de los siguientes porcentajes:
//55% del promedio de sus tres calificaciones parciales.
//30% de la calificacion del examen final.
//15% de la calificacion de un trabajo final.


package ejercicios;

import java.util.Scanner;


public class Ej010 {

	public static void main(String[] args) {
	
	float parcial1, parcial2, parcial3, examen, trabajo, nota;
	
	Scanner sc = new Scanner(System.in); //crear un objeto Scanner
	
	
	System.out.print("Nota del parcial 1: ");
	parcial1 = sc.nextFloat();
	System.out.print("Nota del parcial 2: ");
	parcial2 = sc.nextFloat();
	System.out.print("Nota del parcial 3: ");
	parcial3 = sc.nextFloat();
	
	System.out.print("Nota del examen: ");
	examen = sc.nextFloat();
	
	System.out.print("Nota del trabajo: ");
	trabajo = sc.nextFloat();
	
	
	nota = (float)((parcial1 + parcial2 + parcial3)*0.55/3 + examen*0.3 + trabajo*0.15);
	System.out.print("Nota final: " +nota);
	
	sc.close();	
	}
}