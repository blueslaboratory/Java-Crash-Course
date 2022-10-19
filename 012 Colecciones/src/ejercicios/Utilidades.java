package ejercicios;


public class Utilidades {
//public class Utilidades<T> { //se pone aqui el <T> cuando los metodos no son estaticos
	
	public static <T> void alReves(T[] elementos){
		for(int i=elementos.length-1; i>=0; i--) {
			System.out.println(elementos[i]);
		}
		System.out.println();
	}
	public static <T> void muestraArray(T[] elementos){
		for(T elemento: elementos) {
			System.out.println(elemento);
		}
		System.out.println();
	}
	public static <T> void sustituyeArray(T[] elementos, T elemento){
		// sustituyeArray reemplaza los elementos por el que se manda
		for(int i=elementos.length-1; i>=0; i--) {
			elementos[i] = elemento;
		}
		System.out.println();
	}
	
}
