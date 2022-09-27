//################################################################################
// La asociación de vinicultores tiene como política fijar un precio inicial 
// al kilo de uva, la cual se clasifica en tipos A y B,  y además en tamaños 1 y 2. 
// Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, 
// se requiere determinar cuánto recibirá un productor por la uva que entrega en un 
// embarque, considerando lo siguiente: 
// si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es 
// de tamaño 1; y 30 céntimos si es de tamaño 2. 
// Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos 
// cuando es de tamaño 2. 
// Realice un algoritmo para determinar la ganancia obtenida.
//################################################################################
// Análisis
// El precio final de la uva se calcula multiplicando los kilos recogidos 
// por el precio de cada kilo. El precio por kilo se calcula a partir de un precio 
// inicial sumando o restando una cantidad determinada según el tamaño 
// y el tipo de la uva.
// Datos de entrada: tipo, tamaño (carácter), 
//					 precio inicial en céntimos y kilos (entero)
// Información de salida: Precio final en euros (real) o mensaje de error
// Variables: precio_inicial (entero), kilos (entero), tamano (carácter), 
//			  tipo (carácter), precio_final (real)
//################################################################################
// Diseño
// 1.Leer precio_inicial,kilos
// 2. Leer tipo
// 3. Si tipo no es "A" o "B" devolver mensaje de error.
// 4. Leer el tamaño
// 5. Si el tamaño no es "1" o "2" devolver mensaje d error.
// 6. Si tipo es "A" y tamaño es "1" sumo a precio_inical 20 céntimos.
// 7. Si tipo es "A" y tamaño es "2" sumo a precio_inical 30 céntimos.
// 8. Si tipo es "B" y tamaño es "1" resto a precio_inical 30 céntimos.
// 9. Si tipo es "B" y tamaño es "2" resto a precio_inical 50 céntimos.
// 10. El precio_final = precio_inicial * kilos
// 11. Muestro precio final/100 euros
//################################################################################


package repaso;

import java.util.Scanner;


public class Ej014Uva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tipo;
		float kilos, precio_inicial, precio_final;
		int tamano;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el precio inicial por kilos de la UVA (centimos): ");
		precio_inicial = Float.parseFloat(sc.nextLine());
		System.out.print("Introduce cuantos kilos has vendido: ");
		kilos = Float.parseFloat(sc.nextLine());
		System.out.print("Introduce el tipo de UVA (A/B): ");
		tipo = (sc.nextLine()).toUpperCase();
		
		
		if (tipo.equals("A") || tipo.equals("B")) {
			// TIPO A: V F V
			// TIPO B: F V V
			// TIPO J: F F F
			System.out.print("Introduce el tamano de la UVA (1/2): ");
			tamano = Integer.parseInt(sc.nextLine());
			
			if (tamano == 1 || tamano == 2) {
				
				if (tipo.equals("A")) {
					if (tamano == 1)
						precio_inicial = precio_inicial + 20;
					else // tamano == 2
						precio_inicial = precio_inicial + 30;
				}
				
				else { // tipo B
					if (tamano == 1)
						precio_inicial = precio_inicial - 30;
					else // tamano == 2
						precio_inicial = precio_inicial - 50;
				}
				
				precio_final = precio_inicial * kilos;
				System.out.println("La ganancia es " +precio_final/100 +" euros.");
			}
			
			else
				System.out.println("Tamano incorrecto");			
		}
		
		else
			System.out.println("Tipo incorrecto");
			
		
		
		sc.close();
	}

}
