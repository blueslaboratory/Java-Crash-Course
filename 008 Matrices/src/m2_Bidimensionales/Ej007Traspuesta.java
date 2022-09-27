/*
7. Hacer un programa que transponga una matriz de 4x4.
    - Primero haciendo el cambio sobre la propia matriz.-> void
    - Segundo generando una nueva matriz.
*/    

package m2_Bidimensionales;

public class Ej007Traspuesta {

	public static void main(String[] args) {
		//original [filas][col]		
		int M[][] = new int[4][5];
		int T[][] = new int[M[0].length][M.length];
		
		System.out.println("\nMatriz original: ");
		M = rellenarMatriz(M);
		
		System.out.println("\nImprimir traspuesta: ");
		imprimirTraspuesta(M);
		
		System.out.println("\nGenerar traspuesta: ");
		T = generarTraspuesta(M);
	}
	
	public static int aleatorio() {		
		return (int)(Math.random()*(9-0+1)+0); //(Math.random()*(M-N+1)+N)
	}
	
	public static int[][] rellenarMatriz(int M[][]) {
		int i,j;
		
		for(i=0; i<M.length; i++) {
			for(j=0; j<M[i].length; j++) {
				M[i][j] = aleatorio();
				System.out.print(M[i][j] +"\t");
			}
			System.out.println();
		}	
		return M;
	}
	
	public static void imprimirTraspuesta(int M[][]) {
		int i,j;
		
		for(j=0; j<M[0].length; j++) {
			for(i=0; i<M.length; i++) {
				System.out.print(M[i][j] +"\t");
			}
			System.out.println();
		}
	}
	
	public static int[][] generarTraspuesta(int M[][]){
		//original [filas][col]
		//traspuesta [col][filas]
		int T[][] = new int[M[0].length][M.length];
		int i,j;
		
		for(j=0; j<M[0].length; j++) {
			for(i=0; i<M.length; i++) {
				T[j][i] = M[i][j];
				System.out.print(T[j][i] +"\t");
			}
			System.out.println();
		}
		
		return T;
	}
}
