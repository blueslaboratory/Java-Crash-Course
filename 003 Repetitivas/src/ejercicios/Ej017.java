//################################################################################
//Una empresa les paga a sus empleados con base en las horas trabajadas en la semana
//Para esto, se registran los dias que trabajo y las horas de cada dia. 
//Realice un algoritmo para determinar el sueldo semanal de N trabajadores 
//y ademas calcule cuanto pago la empresa por los N empleados.

package ejercicios;

import java.util.Scanner;


public class Ej017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia, horas_por_semana, horas_dia, horas_acum;
		int trabajadores, trabajador;
		float sueldo_por_hora, acu_sueldo;
		
		Scanner sc = new Scanner(System.in);
		
		horas_acum = 0;
		acu_sueldo = 0;
		
		
		System.out.print("Trabajadores en la empresa: ");
		trabajadores = sc.nextInt();
		
		for (trabajador=1; trabajador<=trabajadores; trabajador++){
			for (dia=1; dia<=7; dia++) {
				System.out.print("Horas trabajadas por el trabajador " +trabajador +" el dia " +dia +": ");
				horas_dia = sc.nextInt();
				horas_acum += horas_dia;
			}
			
			horas_por_semana = horas_acum;
			System.out.println("El trabajador " +trabajador +" ha trabajado " +horas_por_semana +" horas a la semana");
			
			System.out.print("Sueldo por hora del trabajador " +trabajador +": ");
			sueldo_por_hora = sc.nextFloat();
			
			System.out.println("El trabajador " +trabajador +" tiene de sueldo " +horas_por_semana*sueldo_por_hora); 
			acu_sueldo += horas_por_semana*sueldo_por_hora;
			
			horas_acum = 0;
		}
		
		System.out.println("El pago a los " +trabajadores +" trabajadores es: " +acu_sueldo);
		
		
		
		sc.close();
	}

}

