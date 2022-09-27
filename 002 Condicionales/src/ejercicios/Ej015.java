//El director de una escuela esta organizando un viaje de estudios, y requiere 
//determinar cuanto debe cobrar a cada alumno y cuanto debe pagar a la compañia de 
//viajes por el servicio. La forma de cobrar es la siguiente: 
//si son 100 alumnos o mas, el costo por cada alumno es de 65 euros; 
//de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, 
//y si son menos de 30, el costo de la renta del autobus es de 4000 euros, 
//sin importar el numero de alumnos. 
//Realice un algoritmo que permita determinar el pago a la compañia de autobuses 
//y lo que debe pagar cada alumno por el viaje.


package ejercicios;

import java.util.Scanner;


public class Ej015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num_alumnos;
		float coste_por_alumno, coste_autobus;
		
		Scanner sc = new Scanner(System.in);
		
		coste_por_alumno = 0;
		
		
		System.out.print("Numero de alumnos que participan en la actividad: ");
		num_alumnos = sc.nextInt();
		
		if (num_alumnos >= 100)
			coste_por_alumno = 65;
		if (num_alumnos >=50 && num_alumnos <=99)
			coste_por_alumno = 70;
		if (num_alumnos >=30 && num_alumnos <=49)
			coste_por_alumno = 95;
		if (num_alumnos >0 && num_alumnos <30)
			coste_por_alumno = (float)4000/num_alumnos;
		
		if (num_alumnos>0) {
			coste_autobus = num_alumnos*coste_por_alumno;
			System.out.println("El coste por alumno es " +coste_por_alumno +" euros.");
			System.out.println("El coste del autobus es " +coste_autobus +" euros.");
		}
		
		else {
			System.out.println("El numero de alumnos debe ser un valor positivo.");
		}
			
		sc.close();
	}

}
