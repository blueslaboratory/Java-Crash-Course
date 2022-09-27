package m1_unidimensionales;

public class Ej001 {
	public static void main(String[] args) {
		
		
		//ejercicio 1a
		double[] A = new double[3];
		double x;
			for (int i=0; i<A.length; i++) {
				A[i] = i*3;
				System.out.println("A[" +i + "] = " +A[i]);
			}
				
		x = A[0]+A[1]+A[2];
		System.out.println("x = " +x);
		System.out.println();
			
			
		//ejercicio 1b
		int[] B = new int[5];
		B[4]=1;
		B[B[4]]=2;
		B[B[B[4]]]=0;
		B[B[B[B[4]]]]=3;
		B[B[B[B[B[4]]]]]=4;
		
		for(int i=0; i<B.length; i++) {
			System.out.println("B[" +i +"]" +"=" +B[i]);
		}
		System.out.println();
		
		
		//ejercicio 1c
		int[] C = new int[4]; //C.length = 4
		int y;
		for (int i=C.length-1; i>=0; i--) {
			C[i] = i/2;
			System.out.println("C[" +i +"]" +"=" +C[i]);
		}
			
		y = C[0]+C[1]+C[2]+C[3];
		System.out.println("y = " +y);
	}
}
