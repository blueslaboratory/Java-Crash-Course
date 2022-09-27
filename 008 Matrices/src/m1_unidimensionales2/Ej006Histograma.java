//6. Haz un programa que genere 100 números aleatorios entre 0 y 10 
//y cree un histograma con las frecuencias de cada número. Para 
//representar las barras del histograma se utilizará secuencias ‘*’.
//Por ejemplo, la secuencia: 1, 1, 3, 4, 1, 3, 1, 2,   generaría la 
//siguiente salida: 
//1: ****
//2: *
//3: **
//4: *

package m1_unidimensionales2;

public class Ej006Histograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = new int[100];
		int c [] = new int[10];
		int num [] = new int[10];
		
		int i,j;
		
		for(i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*(10-1+1)+1);	//(M-N+1)+N
		}
		
		for(i=0; i<c.length; i++) {
			c[i] = 0;
			num[i] = i;
		}
		
		for(i=0; i<a.length; i++) {
			for(j=0; j<num.length; j++)
				if(a[i]==num[j])
					c[j]++;
		}
		
		System.out.println("Histogramas arrays: ");
		for(j=1; j<c.length; j++) {
			System.out.print(j +": ");
			while(c[j]>0) {
				System.out.print("*");
				c[j]--;
				
				if(c[j]==0) {
					System.out.println();
				}
			}
		}	
		System.out.println();
		
		
		
		//MODO LARGO
		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		int c6 = 0;
		int c7 = 0;
		int c8 = 0;
		int c9 = 0;
		
		for(i=0; i<a.length; i++) {
			switch(a[i]) {
				case 1:
					c1++;
					break;
				case 2:
					c2++;
					break;
				case 3:
					c3++;
					break;
				case 4:
					c4++;
					break;
				case 5:
					c5++;
					break;
				case 6:
					c6++;
					break;
				case 7:
					c7++;
					break;
				case 8:
					c8++;
					break;
				case 9:
					c9++;
					break;
				default:
					break;
			}
		}
		
		System.out.println("Histogramas largo:");
		System.out.print("1: ");
		while(c1>0) {
			System.out.print("*");
			c1--;
		}
		
		System.out.println();
		System.out.print("2: ");
		while(c2>0) {
			System.out.print("*");
			c2--;
		}
		
		System.out.println();
		System.out.print("3: ");
		while(c3>0) {
			System.out.print("*");
			c3--;
		}
		
		System.out.println();
		System.out.print("4: ");
		while(c4>0) {
			System.out.print("*");
			c4--;
		}
		
		System.out.println();
		System.out.print("5: ");
		while(c5>0) {
			System.out.print("*");
			c5--;
		}
		
		System.out.println();
		System.out.print("6: ");
		while(c6>0) {
			System.out.print("*");
			c6--;
		}
		
		System.out.println();
		System.out.print("7: ");
		while(c7>0) {
			System.out.print("*");
			c7--;
		}
		
		System.out.println();
		System.out.print("8: ");
		while(c8>0) {
			System.out.print("*");
			c8--;
		}
		
		System.out.println();
		System.out.print("9: ");
		while(c9>0) {
			System.out.print("*");
			c9--;
		}
		System.out.println();
		
	}

}
