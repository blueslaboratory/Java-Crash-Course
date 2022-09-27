//12. Haz un programa que calcule el total de una factura, partiendo de una 
//lista de parejas importe, IVA pertenecientes a la misma factura. La lista 
//finaliza cuando el importe sea 0. El IVA puede ser el 4%, el 10% o el 21%, 
//en cualquier otro caso se rechazan importe e IVA y se deben introducir de nuevo. 
//Finalmente, hay que realizar un descuento en funcion de la suma de los importes. 
//Dicho descuento es del 0% si es menor que 1000, del 5% si es menor que 10000 
//(y mayor o igual que 1000) y del 10% si es mayor o igual que 10000. El descuento 
//se debe aplicar al importe final. 
//
//El programa debe imprimir el importe total  sin descuento y el importe final al 
//aplicar el descuento que corresponda al importe total.


package basicos1repaso;

import java.util.Scanner;


public class Ej012IVA {
	
	public static void main(String[] args) {
	
		float importe, total, totalConIva, iva, descuento;
		Scanner sc = new Scanner(System.in);
		
		iva = 0;
		total = 0;
		totalConIva = 0;
		
		
		do {
			System.out.print("Importe del articulo en euros (0 para salir): ");
			importe = sc.nextFloat();
			
			if (importe != 0) {
				System.out.print("IVA(%) del articulo introducido (4, 10 o 21): ");
				iva = sc.nextFloat();
				if (iva == 4 || iva == 10 || iva == 21) {
					total += importe;
					totalConIva += importe*(1 + iva/100);
				}
					
				else
					System.out.println("IVA incorrecto. Vuelva a introducir el importe e IVA del ultimo articulo");
			}
			
		} while (importe != 0 && (iva != 4 || iva != 10 || iva != 21));	
		
		
		
		if (totalConIva < 1000) 
			descuento = 0;
		else if (totalConIva > 1000 && totalConIva < 10000)
			descuento = 0.05F;
		else 
			descuento = 0.1F;
			
		System.out.println("Importe sin IVA: " +total);
		System.out.println("Importe con IVA: " +totalConIva);
		System.out.println("Importe con IVA y descuento: " +(totalConIva*(1-descuento)));
		
		sc.close();
	}
}
