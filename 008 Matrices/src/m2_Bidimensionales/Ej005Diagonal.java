/*
5. Dada una matriz de dimension 5x5:
- Elevar al cuadrado los elementos situados por encima de la diagonal principal.
- Sumar los elementos situados por debajo de la diagonal principal.
- Sumar 1 a elementos de la diagonal principal.
- Multiplicar por 2 los elementos de la diagonal inversa.
*/

package m2_Bidimensionales;

public class Ej005Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][] = new int[5][5];
		int suma = 0;
		
		System.out.println("\nMatriz original: ");
		M = rellenarMatriz(M);
		
		System.out.println("\n1.Elevar al cuadrado los elementos situados por encima de la diagonal principal: ");
		M = encimaDiagonal(M);
		
		System.out.println("\n2.Sumar los elementos situados por debajo de la diagonal principal: ");
		suma = debajoDiagonal(M);
		System.out.println("Suma: " +suma);
		
		System.out.println("\n3.Sumar 1 a elementos de la diagonal principal: ");
		M = diagonalPrincipal(M);
		
		System.out.println("\n4.Multiplicar por 2 los elementos de la diagonal inversa: ");
		M = diagonalInversa(M);
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
	
	public static int[][] encimaDiagonal(int M[][]){
		int i,j;
		
		for(i=0; i<M.length; i++) {
			for(j=0; j<M[i].length; j++) {
				if(i<j) 
					M[i][j] = (int)Math.pow(M[i][j], 2);
				System.out.print(M[i][j] +"\t");
			}
			System.out.println();
		}	
		return M;
	}
	
	public static int debajoDiagonal(int M[][]){
		int i,j;
		int acum = 0;
		
		for(i=0; i<M.length; i++) {
			for(j=0; j<M[i].length; j++) {
				if(i>j) 
					acum += M[i][j];
				System.out.print(M[i][j] +"\t");
			}
			System.out.println();
		}	
		return acum;
	}
	
	public static int[][] diagonalPrincipal(int M[][]){
		int i,j;
		
		for(i=0; i<M.length; i++) {
			for(j=0; j<M[i].length; j++) {
				if(i==j) 
					M[i][j]++;
				System.out.print(M[i][j] +"\t");
			}
			System.out.println();
		}	
		return M;
	}
	
	public static int[][] diagonalInversa(int M[][]){
		int i,j;
		
		for(i=0; i<M.length; i++) {
			for(j=0; j<M[i].length; j++) {
				if(i+j+1==(M.length)) //el +1 es porque i y j empiezan en 0
					M[i][j]*=2;
				System.out.print(M[i][j] +"\t");
			}
			System.out.println();
		}	
		return M;
	}
}
