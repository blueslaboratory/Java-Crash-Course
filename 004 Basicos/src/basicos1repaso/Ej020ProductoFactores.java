//20. Hacer un programa en el que se pida por teclado un numero mayor que 2 
//(el programa controlara que cumpla esto), y lo imprima de todas las formas posibles 
//como producto de dos factores (no se tiene en cuenta la multiplicacion por 1). 
//Ej: Con el numero 36, tendría que visualizarse: 18*2, 12*3, 9*4, 6*6, 3*12, 4*9, 2*18


package basicos1repaso;

import java.util.Scanner;


public class Ej020ProductoFactores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, j, producto;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Numero (>2): ");
			n = Integer.parseInt(sc.nextLine());
		} while (n<2);
		
		
		for (i=2; i<=n; i++) {
			for (j=2; j<=n; j++) {
				producto = i*j;
				if (producto == n)
					System.out.println(i +"*" +j +" = " +n);
			}
		}
	}

}
