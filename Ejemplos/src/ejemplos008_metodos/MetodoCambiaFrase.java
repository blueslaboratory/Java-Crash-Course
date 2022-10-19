package ejemplos008_metodos;

public class MetodoCambiaFrase {
	public static void main(String[] args) {
		
		String frase = "hola";
		
		System.out.println(frase);
		cambia(frase);
		System.out.println(frase);
		
		frase = cambiaReturn(frase);
	}
	
	public static void cambia(String frase) {
		frase = "adios";
		System.out.println(frase);
	}
	
	public static String cambiaReturn(String frase) {
		frase = "adios";
		System.out.println(frase);
		return frase;
	}
}
