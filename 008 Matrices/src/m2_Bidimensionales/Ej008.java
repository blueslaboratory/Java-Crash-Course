/*
8. Se dispone de tres matrices unidimensionales. 
La primera de ellas contiene los nombres de pila de un grupo de N personas. 
La segunda matriz contiene los primeros apellidos 
y la tercera los segundos apellidos.
Crear una nueva matriz unidimensional que contenga  para cada persona, 
en cada celda el nombre junto con los dos apellidos.
Crea otra matriz (bidimensional ahora) en la que en la primera fila 
tengamos los nombres, en la segunda fila los primeros apellidos 
y en la tercera los segundos apellidos.
*/

package m2_Bidimensionales;

public class Ej008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombres[] = {"Gregory", "Rick", "Elon", "Calvin", "Bill"};
		String apellidos1[] = {"House", "Sanchez", "Reeve", "Harris", "Gates"};
		String apellidos2[] = {"Gonzalez", "Garcia", "Musk", "Harrison", "Watson"};
		String nomApe[] = new String[nombres.length];
		
		for(int i=0; i<nomApe.length; i++) {
			nomApe[i] = nombres[i] + apellidos1[i] + apellidos2[i];
			System.out.println(nomApe[i]);
		}
		System.out.println();
		
		
		final int TAM = 3; 
		String nomApeBi[][] = new String[TAM][nombres.length];
		
		for(int i=0; i<TAM; i++) {
			for(int j=0; j<nombres.length; j++) {
				if(i==0)
					nomApeBi[i][j] = nombres[j];
				else if(i==1)
					nomApeBi[i][j] = apellidos1[j];
				else if(i==2)
					nomApeBi[i][j] = apellidos2[j];
				
				System.out.print(nomApeBi[i][j] +"     \t");
			}
			System.out.println();
		}
		
	}
}
