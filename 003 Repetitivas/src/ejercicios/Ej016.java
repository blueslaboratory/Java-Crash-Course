//################################################################################
//Una empresa les paga a sus empleados con base a las horas trabajadas en la semana. 
//Realice un algoritmo para determinar el sueldo semanal de N trabajadores 
//y, además, calcule cuánto pagó la empresa por los N empleados.
//################################################################################
//Análisis
//Hay que calcular el sueldo de un número de trabajadores, por lo tanto 
//necesitamos el número de trabajadores que tiene la empresa. También
//necesitamos saber el sueldo por hora,y por cada trabajador hay que pedir
//las horas que ha trabajado en la semana.
//Por cada trabajador hay que mostrar el sueldo semanal y al finalizar el programa
//mostramos el total de sueldos pagados.
// Datos de entrada: Número de trabajadores, sueldo por hora, horas trabajadas por 
//cada trabajador.
// Información de salida: Sueldo de cada trabajador, total pagado.
// Variables:horas_por_semana, horas_acum (entero), sueldo_por_hora (real)
//           trabajadores,trabajador(entero)
//################################################################################
//Diseño
//1.- Inicializo el acumulador de horas
//2.- Leer el número de trabajadores
//3.- Leer sueldo por hora
//4.- Por cada trabajador
//		5.- Leer horas trabajadas por semana
//		6.- Mostrar sueldo (horas_por_semana*sueldo_por_hora
//		7.- Acumular horas trabajadas
//8.- Mostrar total de pago (horas_acum*sueldo_por_hora)
//################################################################################



package ejercicios;

import java.util.Scanner;


public class Ej016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int trabajadores, trabajador;
		int horas_por_semana, horas_acum;
		float sueldo_por_hora, acu_sueldo;
		
		Scanner sc = new Scanner(System.in);
		
		horas_acum = 0;
		acu_sueldo = 0;
		
		
		System.out.print("Trabajadores en la empresa: ");
		trabajadores = sc.nextInt();
		
		for (trabajador=1; trabajador<=trabajadores; trabajador++) {
			System.out.print("Horas trabajadas por el trabajador " +trabajador +" a la semana: ");
			horas_por_semana = sc.nextInt();
			//horas_acum = horas_acum + horas_por_semana;
			//se utilizaria si todos los trabajadores tuviesen el mismo sueldo_por_hora
			
			System.out.print("Sueldo por hora del trabajador " +trabajador +": ");
			sueldo_por_hora = sc.nextFloat();
			
			System.out.println("El trabajador " +trabajador +" tiene de sueldo " +horas_por_semana*sueldo_por_hora); 
			acu_sueldo = acu_sueldo + horas_por_semana*sueldo_por_hora;
		}
		
		System.out.println("El pago a los " +trabajadores +" trabajadores es: " +acu_sueldo);
		
		
		
		sc.close();
	}

}

