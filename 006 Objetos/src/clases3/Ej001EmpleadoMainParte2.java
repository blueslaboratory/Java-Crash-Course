package clases3;

import java.util.Scanner;
import javax.swing.*;

public class Ej001EmpleadoMainParte2 {

	static int nEmple=0;
	//static boolean checkPlus = false;
	//checkPlus solo te permite aplicar el plus 1 vez
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.3
		final int SIZE = 3;
		Ej001Empleado [] empleado = new Ej001Empleado[SIZE];
		int opcion;
		
		do {
			opcion = menu();
			switch (opcion) {
				case 1:
					if(nEmple<SIZE) {
						empleado[nEmple] = rellenaEmpleado();
						JOptionPane.showMessageDialog(null, empleado[nEmple], "Datos Empleado", 
								JOptionPane.INFORMATION_MESSAGE);
						nEmple++;
					}
					else
						JOptionPane.showMessageDialog(null, "Se ha alcanzado el limite de empleados");
					
					break;
				case 2:
					mostrarEmpleados(empleado);
					break;
				case 3:
					plusEmpleados(empleado);
					break;
				case 4:
					mostrarSalarioTotal(empleado);
					break;
				case 5:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Introduzca una opcion valida");
					break;
			}
			
		} while(opcion!=5);
			
		
	}
	
	public static int menu() {
		int opcion;
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
				"Elija opcion: " 
				+"\n1. Nuevo empleado"
				+"\n2. Mostrar empleados"
				+"\n3. Aplicar plus a empleados"
				+"\n4. Mostrar salario total"
				+"\n5. Salir"));
		} while(opcion<1 || opcion>5);
		
		return opcion;
	}

	//1. Nuevo Empleado
	public static Ej001Empleado rellenaEmpleado() {
		
		String nombre, apellido, salarioS,  texto;
		int edad;
		float salario;
		
		JOptionPane.showMessageDialog(null, "Empleado numero " +(nEmple+1));
		
		nombre = JOptionPane.showInputDialog("Nombre del empleado");
		apellido = JOptionPane.showInputDialog("Apellido del empleado");
		
		salarioS = JOptionPane.showInputDialog("Introduzca el salario del empleado:");
		salario = Float.parseFloat(salarioS);
		//salario = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el salario del empleado:"));
		
		do {
			texto = JOptionPane.showInputDialog("Introduzca la edad del empleado:");
		} while(!esEntero(texto));
		edad = Integer.parseInt(texto);
		//edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del empleado:"));
		
		
		JOptionPane.showMessageDialog(null, "Gracias por su colaboracion");
		
		
		return new Ej001Empleado(nombre, apellido, edad, salario);
	}
	
	//capturando una excepcion
	//esEntero: pide al usuario un entero y devuelve true si es verdad
	public static boolean esEntero(String cadena) {
		boolean resultado;
		
		try {
			Integer.parseInt(cadena);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			resultado = false;
		} /*catch(Exception excepcion) {
			
		}
		//se puede poner mas de un catch en un solo try*/
		return resultado;
	}
	
	//2. Mostrar empleados
	public static void mostrarEmpleados(Ej001Empleado [] emple) {
		for(Ej001Empleado e : emple) {
			if(e!=null) {
				JOptionPane.showMessageDialog(null, e);
				System.out.println(e);
			}
		}
	}
	
	//3. Aplicar Plus a empleados
	public static void plusEmpleados(Ej001Empleado [] emple) {
		float plus = 300;
		
		for(int i=0; i<emple.length; i++) {
			//if(!checkPlus)
			if(emple[i]!=null)
				emple[i].comprobarPlus(plus);
		}
		JOptionPane.showMessageDialog(null, "Plus aplicado");
		//checkPlus = true;
	}
	
	//4. Mostrar salario total;
	public static void mostrarSalarioTotal(Ej001Empleado [] emple) {
		float sumaSalario = 0;

		//for(int i=0; i<emple.length; i++) {
		for(Ej001Empleado e : emple) {
			//if(emple[i]!=null)
			if(e!=null)
				//sumaSalario += emple[i].getSalario();
				sumaSalario += e.getSalario();
		}
		
		JOptionPane.showMessageDialog(null, "Suma Salario: " +sumaSalario);
		System.out.println("Suma Salario: " +sumaSalario);
		
	}
	
}
