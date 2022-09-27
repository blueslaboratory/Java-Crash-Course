/*
3. Dada una matriz de 8x8, hacer un programa que cree una matriz identica 
y la escriba en pantalla. (con metodos ha dicho)
*/

package m2_Bidimensionales;

public class Ej003Identica {
	public static void main(String[] args) {
		final int SIZE = 8;
		int M[][] = new int[SIZE][SIZE];
		int mCopy[][] = new int[SIZE][SIZE];

		
		System.out.println("\nMatriz original: ");
		M = rellenarMatriz(M);
		System.out.println("\nMatriz copia: ");
		mCopy = copiarMatriz(M);
		
		
		//Para una matriz irregular
		int I[][] = {{1,2,3},{1},{1,2,3,4,5}};
		int mCopy2[][] = new int[I.length][];
		for(int i=0; i<I.length; i++) {
			mCopy2[i] = new int[I[i].length];
		}
		System.out.println("\nMatriz irregular copia: ");
		mCopy2 = copiarMatrizI(I);
	}
	
	public static int aleatorio() {		
		return (int)(Math.random()*(9+1)); //(Math.random()*(M-N+1)+N)
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
	
	public static int[][] copiarMatriz(int M[][]) {
		int i,j;
		int mCopy[][] = new int[M.length][M[0].length];
		
		for(i=0; i<M.length; i++) {
			for(j=0; j<M[i].length; j++) {
				mCopy[i][j] = M[i][j];
				System.out.print(mCopy[i][j] +"\t");
			}
			System.out.println();
		}	
		return mCopy;
	}
	
	
	public static int[][] copiarMatrizI(int M[][]) {
		int i,j;
		
		//irregular
		int [][] mCopy2 = new int[M.length][];
		for(i=0; i<M.length; i++) {
			mCopy2[i] = new int[M[i].length];
		}
		
		for(i=0; i<M.length; i++) {
			for(j=0; j<M[i].length; j++) {
				mCopy2[i][j] = M[i][j];
				System.out.print(mCopy2[i][j] +"\t");
			}
			System.out.println();
		}	
		return mCopy2;
	}
}
