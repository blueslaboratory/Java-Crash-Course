//Un vendedor recibe un sueldo base mas un 10% extra por comision de sus ventas, 
//el vendedor desea saber cuanto dinero obtendra por concepto de comisiones por 
//las tres ventas que realiza en el mes y el total que recibira en el mes tomando 
//en cuenta su sueldo base y comisiones.


package ejercicios;

import java.util.Scanner;


public class Ej008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sueldo_base, venta1, venta2, venta3, comision;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca su sueldo base: ");
		sueldo_base = sc.nextFloat();
		
		System.out.print("Introduzca el importe de la venta 1: ");
		venta1 = sc.nextFloat();
		System.out.print("Introduzca el importe de la venta 2: ");
		venta2 = sc.nextFloat();
		System.out.print("Introduzca el importe de la venta 3: ");
		venta3 = sc.nextFloat();
		
		comision = (float) 0.1*(venta1 + venta2 + venta3);
		
		System.out.println("Comision por ventas: " +comision);
		System.out.println("Sueldo total: " +(sueldo_base + comision));
		
		sc.close();
		
	}

}
