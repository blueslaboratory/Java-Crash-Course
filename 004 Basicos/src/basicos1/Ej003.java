//3. Haz un programa que solicite una medida en pies y realice la conversion a 
//pulgadas, yardas, cm y metros. Ten en cuenta que un pie tiene 12 pulgadas, 
//una pulgada equivale a 2.54 cm y 1 yarda son 0.9144 metros. 


package basicos1;

import java.util.Scanner;

public class Ej003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pies, pulgadas, yarda, cm, metro; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Pies: ");
		pies = sc.nextDouble();
		
		pulgadas = 12*pies;
		cm = 2.54*pulgadas;
		metro = cm/100;
		yarda = 0.9144*metro;
		
		
		System.out.println("pulgadas: " +pulgadas);
		System.out.println("cm: " +cm);
		System.out.println("metros: " +metro);
		System.out.println("yardas: " +yarda);
		
		sc.close();
	}

}
