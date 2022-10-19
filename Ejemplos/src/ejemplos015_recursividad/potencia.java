package ejemplos015_recursividad;

public class potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 9, e = 3;
		
		System.out.println("La potencia de " +b +" elevado a " +e +" es " +potencia(b,e));
	}

	public static long potencia(int base, int exp) {
				
		if (exp==0) {
			return 1;
		}
		
		else {
			return base*potencia(base,exp-1); //llamada recursiva
		}
			
	}
}