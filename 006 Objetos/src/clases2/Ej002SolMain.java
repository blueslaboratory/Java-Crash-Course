package clases2;

import java.util.*;

public class Ej002SolMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre, apellido;
		int edad;
		double salario, cantidad=50;
		
		System.out.println("Introduzca numero de empleados");
		int numEmp = sc.nextInt();
		
		Ej002Sol empleados[] = new Ej002Sol[numEmp];
	    // En esta version relleno todo el array
		for (int i=0; i<numEmp; i++) {
			nombre = sc.nextLine();
			System.out.println("Introduzca nombre para empleado" + (i+1));
			nombre = sc.nextLine();
			System.out.println("Introduzca apellido para empleado" + (i+1));
			apellido = sc.nextLine();
			System.out.println("Introduzca edad para empleado" + (i+1));
			edad = sc.nextInt();
			System.out.println("Introduzca salario para empleado" + (i+1));
			salario = sc.nextDouble();
		
			empleados[i] = new Ej002Sol(nombre, apellido, edad, salario);
		}
		
		for (Ej002Sol emp:empleados) {
			System.out.println(emp);
			if (emp.plus(cantidad)){
				System.out.println("Se le ha subido el sueldo.");
				System.out.println("Sueldo tras la subida " + emp.getSalario());
				System.out.println();
			}
			else
				System.out.println("No se le ha subido el sueldo.");
			
		}
		sc.close();		
	}
}