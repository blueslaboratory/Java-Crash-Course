//18. Hacer un programa que sea capaz de calcular el impuesto sobre la renta 
//y lo escriba por pantalla hasta que se introduzca un salario igual a cero. 
//El impuesto de la renta es el 15% del salario anual de cada persona, al que 
//previamente se debe realizar una deduccion en funcion del numero de hijos, 
//que es del 0% si tiene 0, del 5% si tiene 1 o 2 y del 15% si tiene mas de 2. 
//Tanto el salario como el numero de hijos se pediran por teclado. 



package basicos1;

import java.util.Scanner;

public class Ej018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float impuesto, salario, deduccion;
		int hijos;
		Scanner sc = new Scanner(System.in);
		
		do {
			do {
				System.out.print("Salario (euros): ");
				salario = Float.parseFloat(sc.nextLine());
			} while (salario<0);
			
			if (salario!=0) {
				do {
					System.out.print("Hijos: ");
					hijos = Integer.parseInt(sc.nextLine()); 
				} while (hijos<0);
				
				if (hijos == 0)
					deduccion = 0;
				else if (hijos>0 && hijos<3) 
					deduccion = 0.05F;
				else //(hijos>3)
					deduccion = 0.15F;
				
				impuesto = (salario*0.15F*(1 - deduccion));
				System.out.println("Tu impuesto es de: " +impuesto);
			}
			
		} while (salario!=0);
		
		sc.close();
		
	}

}
