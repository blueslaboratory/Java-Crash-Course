package year_2022_prenavidades;

import java.util.*;

public class D_BuscandoNivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input[] = sc.nextLine().split(" ");		
		int cNiveles = Integer.parseInt(input[0]);
		int subconsultas = Integer.parseInt(sc.nextLine());
		int arrayAcum[] = new int[subconsultas];
		
		for(int i=0; i<subconsultas; i++) {
			String aNivel[] = sc.nextLine().split(" ");
			int a = Integer.parseInt(aNivel[0]);
			int b = Integer.parseInt(aNivel[1]);
			
			int acum = 0;
			
			if((b-a)==1) {
				arrayAcum[i]=0;
			}
			else if((b-a)>1){
				for(int j=(a+1); j<b; j++) {
					acum += Integer.parseInt(input[j]);
				}
				arrayAcum[i]=acum;
			}
			else if((b-a)<1){
				for(int j=(a); j>=b; j--) {
					acum += -Integer.parseInt(input[j]);
				}
				arrayAcum[i]=acum;

			}
		}
		
		for(int i=0; i<arrayAcum.length; i++) {
			System.out.println(arrayAcum[i]);
		}
		System.out.println("---");
	}

}
