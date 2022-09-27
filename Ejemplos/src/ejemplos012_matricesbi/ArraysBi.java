package ejemplos012_matricesbi;
import java.util.Scanner;

public class ArraysBi {
	public static void main(String[] args) {
		final int FILAS = 5, COLUMNAS = 4;
		Scanner teclado = new Scanner(System.in);
		
		int[][] A = new int[FILAS][COLUMNAS];
		
		System.out.println("Lectura de elementos de la matriz: ");
		A = rellenarMatriz(teclado, FILAS, COLUMNAS);
		
		System.out.println("\nSumamos un 1 a cada uno de los elementos");
		A = sumaUno(A);
		
		System.out.println("Valores introducidos matriz A: ");
		imprimirMatriz(A, FILAS, COLUMNAS);
		
		int[][] B = {{1,2,3}, {4,5}, {6,7,8,9}};
		System.out.println("\nValores matriz B: ");
		imprimirMatriz2(B);
		
		
		teclado.close();
	}
	
	
	public static int[][] rellenarMatriz(Scanner sc, int FILAS, int COLUMNAS){
		int[][] A = new int[FILAS][COLUMNAS];
		int i, j, cont = 0;
		
		for (i=0; i<FILAS; i++) {
		//la i va desde 0 hasta 4: 5
			for(j=0; j<COLUMNAS; j++) {
			//la j va desde 0 hasta 3: 4
				//System.out.println("A[" +i +"][" +j +"]");
				//A[i][j] = sc.nextInt();
				
				System.out.print("A[" +i +"][" +j +"]" +" = " +cont +"\t");
				A[i][j] = cont;
				cont++;
			}
			System.out.println();
		}
		
		return A;
	}
	
	
	public static int[][] sumaUno(int A[][]){
		int i, j;
		for (i=0; i<A.length; i++) {
			for(j=0; j<A[i].length; j++) {
				
				A[i][j]++;
				//A[i][j]+=1;
				
				
//				solo para la 1era fila
//				if(i==0) {
//					A[i][j]+=1;
//				}
//				
//				para el elemento A[1][1]
//				if(i==1 && j==1) {
//					A[i][j]+=1;
//				}				
			}
		}
		return A;
	}
	
	
	public static void imprimirMatriz(int A[][], int FILAS, int COLUMNAS){
		int i, j;
		for(i=0; i<FILAS; i++) {
			for(j=0; j<COLUMNAS; j++) 
				System.out.print(A[i][j] +"\t");
			System.out.println();
		}
	}
	
	
	public static void imprimirMatriz2(int B[][]){
		int i, j;
		for(i=0; i<B.length; i++) {
			for(j=0; j<B[i].length; j++) 
				System.out.print(B[i][j] +"\t");
			System.out.println();
		}
		
	}
}
