//Realiza un programa que pida el dia de la semana (del 1 al 7) y escriba el dia 
//correspondiente. Si introducimos otro numero nos da un error.


package ejercicios;

import java.util.Scanner;


public class Ej018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el dia de la semana (1-7): ");
		dia = sc.nextInt();
		
		switch(dia) {
		
			case 1: System.out.println("Lunes");
					break;
			case 2: System.out.println("Martes");
					break;
			case 3: System.out.println("Miercoles");
					break;				
			case 4: System.out.println("Jueves");
					break;
			case 5: System.out.println("Viernes");
					break;
			case 6: System.out.println("Sabado");
					break;
			case 7: System.out.println("Domingo");
					break;
			default: System.out.print("ERROR: dia no valido.");
					break;
		}
		
		
		sc.close();
	}

}
