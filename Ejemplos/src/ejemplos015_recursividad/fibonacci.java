package ejemplos015_recursividad;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numTerm = 10;
		for (int i=0; i<numTerm; i++) {
			System.out.print(fibonacci(i) +" ");
		}
		
	}

	public static int fibonacci(int t) {
		if ((t==0) || (t==1))
			return 1;
		else
			return fibonacci(t-1) + fibonacci(t-2);
		 
		
	}
}
