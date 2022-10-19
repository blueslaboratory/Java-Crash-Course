/*
6. Escribir un programa que lea una matriz de 4x5 de numeros enteros 
(valores aleatorios de 0 a 9), calcule la suma de cada fila y de cada 
columna y muestre por pantalla la nueva tabla, incluyendo las sumas 
de las filas como una sexta columna y de las columnas como una quinta 
fila. No se crea una nueva matriz mas grande, solo se imprime.
*/

package m2_Bidimensionales;

public class Ej006FilasCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][] = new int[4][5];
		
		System.out.println("\nMatriz original: ");
		M = rellenarMatriz(M);
		
		System.out.println("\nSumar las filas: ");
		sumaFilas(M);
		
		System.out.println("\nSumar las columnas: ");
		sumaColumnas(M);
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
	
	public static void sumaFilas(int M[][]) {
		int i,j;
		int acumFila = 0;
		
		for(i=0; i<M.length; i++) {
			for(j=0; j<M[i].length; j++) {
				System.out.print(M[i][j] +"\t");
				acumFila += M[i][j];
			}
			System.out.print("Suma F" +(i+1) +": " +acumFila +"\t");
			acumFila = 0;
			System.out.println();
		}	
	}
	

	public static void sumaColumnas(int M[][]) {
		int i,j;
		int acumColumna = 0;
		
		sumaFilas(M);
		//System.out.println();
		
		for(j=0; j<M[0].length; j++) {
			for(i=0; i<M.length; i++) {
				acumColumna += M[i][j];
			}
			System.out.print("C" +(j+1) +": " +acumColumna +"\t");
			acumColumna = 0;
		}	
	}
	
	
	
	//RAROS NO MIRAR
	public static void sumaFilas2(int M[][]) {
		int i,j;
		int acumFila = 0;
		
		for(i=0; i<M.length; i++) {
			for(j=0; j<=M[i].length; j++) {
				if(j == M[i].length) {
					System.out.print("Suma F" +(i+1) +": " +acumFila +"\t");
					acumFila = 0;
				}
					
				else {
					System.out.print(M[i][j] +"\t");
					acumFila += M[i][j];
				}
					
			}
			System.out.println();
		}	
	}
	
	public static void sumaColumnas2(int M[][]) {
		int i,j;
		int acumColumna = 0;
		
		sumaFilas(M);
		//System.out.println();
		
		for(j=0; j<M[0].length; j++) {
			for(i=0; i<M.length; i++) {
				acumColumna += M[i][j];
				//System.out.print(M[i][j] +"\t");
				if(i == M.length-1) {
					//System.out.print(acumColumna +"\t");
					System.out.print("C" +(j+1) +": " +acumColumna +"\t");
					acumColumna = 0;
				}
			}
			//System.out.println();
		}	
	}
}
