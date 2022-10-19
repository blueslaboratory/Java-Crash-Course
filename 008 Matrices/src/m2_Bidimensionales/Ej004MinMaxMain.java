/*
4. Escribir un programa que cree una matriz entera de tama�o 6x8 
(valores aleatorios de 1 a 100) y obtenga y escriba en pantalla el 
valor maximo y minimo de toda la matriz.
*/

package m2_Bidimensionales;

public class Ej004MinMaxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][] = new int[6][8];
		
		
		System.out.println("\nMatriz: ");
		M = rellenarMatriz(M);
		
		Ej004MinMax data = mayorMenor(M); 
		System.out.println(data);
	}
	
	public static int aleatorio() {		
		return (int)(Math.random()*(100-1+1)+1); //(Math.random()*(M-N+1)+N)
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
	
	public static Ej004MinMax mayorMenor(int M[][]) {
		int i, j, mayor, menor;
		int filaMayor, filaMenor, colMayor, colMenor;
		
		mayor = menor = M[0][0]; //se toma el primero como mayor y menor
		filaMayor = filaMenor = colMayor = colMenor = 0;
		
		for (i=0; i<M.length; i++) {
			for (j=0; j<M[i].length; j++) {
				if (M[i][j]>mayor) {
					mayor = M[i][j];
					filaMayor = i;
					colMayor = j;
				} 
				else if (M[i][j]<menor) {
					menor = M[i][j];
					filaMenor = i;
					colMenor = j;
				}
			}
		}
		
		return new Ej004MinMax(mayor, menor, filaMayor, colMayor, filaMenor, colMenor);
	}
}
