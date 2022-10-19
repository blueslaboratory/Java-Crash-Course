package ejemplos028_genericas;
public class Main {
	public static void main(String args[]) {
		
		// Creamos una instancia de ClaseGenerica para Integer.
		ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(88);
		intObj.classType();
		System.out.println(intObj.getClass().getSimpleName());
		System.out.println(intObj);
		System.out.println();

		// Creamos una instancia de ClaseGenerica para String.
		ClaseGenerica<String> strObj = new ClaseGenerica<String>("Test");
		strObj.classType();
		System.out.println(strObj.getClass().getSimpleName());
		System.out.println(strObj);
		System.out.println();
	}
}