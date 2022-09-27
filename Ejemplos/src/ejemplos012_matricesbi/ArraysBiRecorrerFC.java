package ejemplos012_matricesbi;

public class ArraysBiRecorrerFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][] = new int[4][5];
		
		M = rellenarMatriz(M);
		
		System.out.println("\nMatriz original: ");
		imprimirMatriz(M);
		System.out.println("\nEscribir por filas: ");
		escribirF(M);
		
		System.out.println("\nMatriz original: ");
		imprimirMatriz(M);
		System.out.println("\nEscribir por columnas: ");
		escribirC(M);
	}
	
	public static int aleatorio() {		
		return (int)(Math.random()*(9-0+1)+0); //(Math.random()*(M-N+1)+N)
	}

	public static int[][] rellenarMatriz(int M[][]) {
		int i,j;
		
		for(i=0; i<M.length; i++) {
			for(j=0; j<M[i].length; j++) {
				M[i][j] = aleatorio();
			}
		}	
		return M;
	}
	
	public static void imprimirMatriz(int M[][]) {
		int i,j;
		
		for(i=0; i<M.length; i++) {
			for(j=0; j<M[i].length; j++) {
				System.out.print(M[i][j] +"\t");
			}
			System.out.println();
		}	
	}
	
	/*
	 * Escribimos por columnas el contenido de la matriz 
	 */
	static void escribirC(int[][] matriz) {
		for(int j=0; j<matriz[0].length; j++) {
			for(int i=0; i<matriz.length; i++) {
				//System.out.println(i +" " +j +" ");
				System.out.println(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	

	/*
	 * Escribimos por filas el contenido de la matriz 
	 */
	static void escribirF(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				//System.out.println(i +" " +j +" ");
				System.out.println(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
