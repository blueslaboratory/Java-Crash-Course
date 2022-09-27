//4. Haz un programa que calcule la letra de un DNI. 
//Se pedirá el DNI por teclado y devolverá la letra correspondiente 
//al DNI. Para buscar la letra, se calcula el resto de dividir el 
//número de dni entre 23, y con el resultado que estará entre 0 y 22, 
//se busca en el array de caracteres la letra correspondiente en esa 
//posición.
//El orden de los caracteres es: T, R, W, A, G, M, Y, F, P, D, X, B, 
//N, J, Z, S, Q, V, H, L, C, K, E


package m1_unidimensionales2;

import java.util.Scanner;

public class Ej004DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int DNI, resto;
		char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 
						  'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 
						  'H', 'L', 'C', 'K', 'E'};
		
		System.out.print("Dime el numero de DNI: ");
		DNI = Integer.parseInt(sc.nextLine());
		
		resto = DNI%23;
		
		System.out.println("Tu letra es: " +letras[resto]);
		sc.close();
	}

}
