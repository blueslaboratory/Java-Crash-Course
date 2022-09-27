/*
1. Crear dos matrices de dimensi�n 4x4 de enteros (valores aleatorios de 0 a 9) 
y obtener una tercera matriz correspondiente a la suma de las dos.
*/

package m2_Bidimensionales;

public class Ej001SumaMat_J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = new int[4][4];
		int B[][] = new int[4][4];
		
		A = rellenarMatriz(A);
		System.out.println("Imprimir matriz A:");
		imprimirMatriz(A);
		
		B = rellenarMatriz(B);
		System.out.println("\nImprimir matriz B:");
		imprimirMatriz(B);
		
		System.out.println("\nSuma matrices A y B:");
		sumaMatrices(A, B);
		//imprimirMatriz(sumaMatrices(A, B));
	}

	public static int[][] rellenarMatriz(int A[][]) {
		int i,j;
		
		for(i=0; i<A.length; i++) {
			for(j=0; j<A[i].length; j++) 
				A[i][j] = (int)(Math.random()*(9+1));//(Math.random()*(M-N+1)+N)
		}
		
		return A;
	}
	
	public static void imprimirMatriz(int A[][]){
		int i, j;
		
		for(i=0; i<A.length; i++) {
			for(j=0; j<A[i].length; j++) 
				System.out.print(A[i][j] +"\t");
			System.out.println();
		}
	}
	
	public static int[][] sumaMatrices(int A[][], int B[][]){
		int C[][] = new int[A.length][A[0].length];
		int i, j;
		
		for(i=0; i<C.length; i++) {
			for(j=0; j<C[i].length; j++) {
				C[i][j] = A[i][j] + B[i][j];
				System.out.print(A[i][j] +"+" +B[i][j] +"=" +C[i][j] +"\t");
			}
			System.out.println();
		}
		
		return C;
	}
	
}
