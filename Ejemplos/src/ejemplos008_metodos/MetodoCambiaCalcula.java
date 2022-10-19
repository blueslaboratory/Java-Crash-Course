package ejemplos008_metodos;

public class MetodoCambiaCalcula {
	public static void main(String[] args) {
		
		int n = 10;
		
		System.out.println(n);
		calcula(n);
		
		System.out.println(n);
		
		n = cambiaCalcula(n);
		System.out.println(n);
		
	}
	
	public static void calcula(int x) {
		x += 24;
		System.out.println(x);
	}
	
	public static int cambiaCalcula(int x) {
		x += 24;
		System.out.println(x);
		return x;
	}
}
