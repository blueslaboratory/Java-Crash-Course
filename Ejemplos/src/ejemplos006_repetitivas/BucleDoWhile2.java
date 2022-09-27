package ejemplos006_repetitivas;

public class BucleDoWhile2 {

	public static void main(String[] args) {
		
		int i = 0;
		String s = ""; //esto es una cadena vacia, no un espacio en blanco

		do {
		    s +=  i + " "; //concatena y acumula un string: 
		    //s = s + i + " ";
		    i++;
		} while (i < 10);

		System.out.println(s);
		// Output: 0 1 2 3 4 5 6 7 8 9

	}

}