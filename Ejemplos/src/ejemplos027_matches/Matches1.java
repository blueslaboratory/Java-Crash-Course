package ejemplos027_matches;

import javax.swing.JOptionPane;

public class Matches1 {

	public static void main(String[] args) {

		String palabra;
		boolean palabraCorrecta;
		do {
			palabra = JOptionPane.showInputDialog("Introduce un numero");
			palabraCorrecta = palabra.matches("\\d"); 
			//palabraCorrecta = palabra.matches("[0-9]"); //es lo mismo
		} while (!palabraCorrecta);

		System.out.println("Es un numero");
		
		do {
			palabra = JOptionPane.showInputDialog("Introduce una letra que sea letra (may o min) o numero");
			//palabraCorrecta = palabra.matches("[a-zA-Z0-9]");
			palabraCorrecta = palabra.matches("\\w");
		} while (!palabraCorrecta);

		System.out.println("Es letra o numero");
		
		do {
			palabra = JOptionPane.showInputDialog("Introduce una letra que no sea letra ni numero");
			palabraCorrecta = palabra.matches("[^a-zA-Z0-9]");
			//palabraCorrecta = palabra.matches("\\W");
		} while (!palabraCorrecta);
		
		System.out.println("No es letra ni numero");
		
	}
}
