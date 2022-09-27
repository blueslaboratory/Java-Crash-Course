//################################################################################
//Una empresa tiene el registro de las horas que trabaja diariamente un empleado 
//durante la semana (seis dias) y requiere determinar el total de estas, asi como 
//el sueldo que recibira por las horas trabajadas.


package ejercicios;

import java.util.Scanner;


public class Ej013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float horas, sueldo_h;
		int dia;
		float acum;
		Scanner sc = new Scanner(System.in);
		
		acum = 0;
		
		for (dia=1; dia<=6; dia++) {
			System.out.print("Cuantas horas has trabado el dia " +dia +": ");
			horas = sc.nextFloat();
			acum += horas;
		}
		
		System.out.println("Horas trabajadas a la semana: " +acum);
		System.out.print("Sueldo por hora: ");
		sueldo_h = sc.nextFloat();
		
		System.out.print("Tu paga es de: " +acum*sueldo_h);
		
		sc.close();
	}

}

