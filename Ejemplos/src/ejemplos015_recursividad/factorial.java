package ejemplos015_recursividad;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" = " +factorial(5));
	}

	public static long factorial(long num) {
		long resultado;
		
		if (num==0) {
			System.out.print("0!");
			resultado = 1;
		}
		
		else {
			System.out.print(num +"*");
			resultado = num*factorial(num-1);
		}
			
		return resultado;
	}
}
