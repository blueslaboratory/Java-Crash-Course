package ejemplos012_matrices;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {9,4};
		
		modificarA1(array);
		System.out.println("Valor de array tras modificarA1 " +array);
		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		escribirArray(array);
		
		
		//creando un array en un metodo;
		int [] aDoble, aTriple;
		aDoble = crearArrayDoble(array);
		System.out.println("Valor de array original " +array);
		System.out.println("Valor de array nuevo tras duplicarlo " +aDoble);
		escribirArray(aDoble);
		
		
		//sin el return no iria
		aTriple = crearArrayDoble(array);
		crearArrayTriple(array, aTriple);
		
	}
	
	public static void modificarA1(int [] v) {
		System.out.println("Valor de v dentro del metodo modificarA1 antes " +v);
		for (int i = 0; i < v.length; i++) 
			v[i] += 100; 
		//no cambias v; cambias el contenido de la memoria, PERO NO V
		
		System.out.println("Valor de v dentro del metodo modificarA1 despues " +v);
	}

	public static void escribirArray(int [] a) {
		for (int i = 0; i < a.length; i++) 
			System.out.println(a[i] +" "); 
	}
	
	public static int[] crearArrayDoble(int [] v) {
		int[] doble = new int[v.length];
		
		System.out.println("Valor de v dentro del metodo crearArrayDoble " +v);
		for (int i = 0; i < v.length; i++) {
			doble[i] = v[i]*2;
		}
		System.out.println("Valor de doble dentro del metodo crearArrayDoble " +doble);
		
		return doble;
	}
	
	public static int[] crearArrayTriple(int [] v, int [] v2) {
		int[] triple = new int[v.length];
		
		System.out.println("Valor de v dentro del metodo crearArrayTriple " +v);
		for (int i = 0; i < v.length; i++) {
			triple[i] = v[i]*3;
		}
		System.out.println("Valor de triple dentro del metodo crearArrayTriple " +triple);
		
		return triple; //sin el return no va
	}
}
