// Una compañia de transporte internacional tiene servicio en algunos paises de 
// America del Norte, America Central, America del Sur, Europa y Asia.
// El costo por el servicio de transporte se basa en el peso del paquete 
// y la zona a la que va dirigido.
//Zona 		Ubicacion 			Costo/gramo
//  1 		America del Norte 	24.00 euros
//  2 		America Central 	20.00 euros
//  3 		America del Sur 	21.00 euros
//  4 		Europa 				10.00 euros
//  5 		Asia 				18.00 euros
//Los paquetes con un peso superior a 5 kg no son transportados.
//Realice un algoritmo para determinar el cobro por la entrega de un paquete o, 
//en su caso, el rechazo de la entrega.

package ejercicios;

import java.util.Scanner;


public class Ej020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int zona;
		double peso, costo;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indica el peso (g) del paquete: ");
		peso = sc.nextDouble();
		
		if (peso > 0 && peso <= 5000) {
			System.out.println("Seleccione la zona:");
			System.out.println("1.	America del Norte");
			System.out.println("2.	America Central");
			System.out.println("3.	America del Sur");
			System.out.println("4.	Europa");
			System.out.println("5.	Asia");
			
			System.out.print("Zona (1-5): ");
			zona = sc.nextInt();
			
			switch(zona) {
				case 1: costo = peso*24;
						break;
				case 2: costo = peso*20;
						break;
				case 3: costo = peso*21;
						break;				
				case 4: costo = peso*10;
						break;
				case 5: costo = peso*18;
						break;
				default:System.out.println("Zona incorrecta.");
						costo = 0;
						break;
			}
			
			if (zona >=1 && zona <=5)
				System.out.println("El coste del envio del paquete es " +costo +" euros");
			else
				System.out.println("El paquete no puede ser entregado");
		}
		
		else
			System.out.println("El paquete no puede ser entregado");
		
		
		sc.close();
	}

}
