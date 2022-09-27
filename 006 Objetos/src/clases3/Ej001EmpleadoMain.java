package clases3;

import java.util.Scanner;
import javax.swing.*;

public class Ej001EmpleadoMain {

	static int nEmple=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej001Empleado empleado0 = new Ej001Empleado();
		Ej001Empleado empleado1;
		//empleado1 = leerEmpleado();
		//System.out.println(empleado1);
		
		
		//1.2
		Ej001Empleado [] empleado = new Ej001Empleado[3];
		float sumaSalario = 0;
		float sumaSalarioPlus = 0;
		
		for(nEmple=0; nEmple<empleado.length; nEmple++) {
		//for(Ej001Empleado e : empleado) {
			empleado[nEmple] = leerEmpleado();
			sumaSalario += empleado[nEmple].getSalario();
			
			JOptionPane.showMessageDialog(null, "Plus: " +(empleado[nEmple].comprobarPlus(300)? "si" : "no"));
			sumaSalarioPlus += empleado[nEmple].getSalario();
		}
		
		for(Ej001Empleado e : empleado) {
			JOptionPane.showMessageDialog(null, e);
			System.out.println(e);
		}
		
		JOptionPane.showMessageDialog(null, "Suma Salario antes del plus: " +sumaSalario);
		JOptionPane.showMessageDialog(null, "Suma Salario despues del plus: " +sumaSalarioPlus);
		System.out.println("Suma Salario antes del plus: " +sumaSalario);
		System.out.println("Suma Salario despues del plus: " +sumaSalarioPlus);
		
	}
	

	public static Ej001Empleado leerEmpleado() {
		
		String nombre, apellido, salarioS,  edadS;
		int edad;
		float salario;
		
		JOptionPane.showMessageDialog(null, "Empleado numero " +nEmple);
		
		nombre = JOptionPane.showInputDialog("Nombre del empleado");
		apellido = JOptionPane.showInputDialog("Apellido del empleado");
		
		salarioS = JOptionPane.showInputDialog("Introduzca el salario del empleado:");
		salario = Float.parseFloat(salarioS);
		//salario = Float.parseFloat(JOptionPane.showInputDialog("Introduzca un numero:"));
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del empleado:"));
		
		
		JOptionPane.showMessageDialog(null, "Gracias por su colaboracion");
		
		
		return new Ej001Empleado(nombre, apellido, edad, salario);
	}
}
