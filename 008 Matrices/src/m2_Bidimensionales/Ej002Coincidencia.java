/*
2. Escribir un programa que cree una matriz entera de tama�o 4x5 
(valores aleatorios de 0 a 9)  y un valor entero (tambien aleatorio), 
y muestre en pantalla la  posici�n de la primera coincidencia del 
valor en la matriz. 
*/

package m2_Bidimensionales;

public class Ej002Coincidencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = new int[4][5];
		int numCoin = aleatorio();
		
		A = rellenarMatriz(A);
		
		System.out.println("\nNumero aleatorio: " +numCoin);
		coincidencia(numCoin, A);
	}
	
	public static int aleatorio() {		
		return (int)(Math.random()*(9+1)); //(Math.random()*(M-N+1)+N)
	}
	
	public static int[][] rellenarMatriz(int A[][]) {
		int i,j;
		
		for(i=0; i<A.length; i++) {
			for(j=0; j<A[i].length; j++) {
				A[i][j] = aleatorio();
				System.out.print(A[i][j] +"\t");
			}
			System.out.println();
		}	
		return A;
	}
	
	public static boolean coincidencia(int num, int A[][]) {
		int i,j;
		boolean flag = false;
		
		for(i=0; i<A.length  && !flag; i++) {
			for(j=0; j<A[i].length  && !flag; j++) {
				if (num == A[i][j] && !flag) {
					System.out.print("Primera coincidencia: " 
							        +"A[" +(i+1) +"][" +(j+1) +"]" +" = " +A[i][j]);
					flag = true;
				}
			}
		}
		
		return flag;
	}
	
	
}
