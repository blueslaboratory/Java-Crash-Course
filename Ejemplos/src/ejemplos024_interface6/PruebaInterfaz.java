package ejemplos024_interface6;

// Prueba de la jerarquía Punto, Circulo, Cilindro con la interfaz Figura.
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class PruebaInterfaz {

	public static void main(String args[]) {
		// Nuevo: establecer formato de número de punto flotante
		DecimalFormat dosDigitos = new DecimalFormat("0.00");

		// crear los objetos Punto, Circulo y Cilindro
		Punto punto = new Punto(7, 11);
		Circulo circulo = new Circulo(22, 8, 3.5);
		Cilindro cilindro = new Cilindro(20, 30, 3.3, 10.75);

		// obtener nombre y representación de cadena de cada objeto
		String salida = punto.obtenerNombre() + ": " + punto + "\n" 
				+ circulo.obtenerNombre() + ": " + circulo + "\n"
				+ cilindro.obtenerNombre() + ": " + cilindro + "\n";

		Figura arrayDeFiguras[] = new Figura[2]; // crear array tipo Figura

		// apuntar arrayDeFiguras[ 0 ] al objeto de la subclase Circulo
		arrayDeFiguras[0] = circulo;

		// apuntar arrayDeFiguras[ 1 ] al objeto de la subclase Cilindro
		arrayDeFiguras[1] = cilindro;

		// Fuerzo a que el radio del circulo sea 20
		if (arrayDeFiguras[0] instanceof Circulo)
			// (Circulo)arrayDeFiguras[ 0 ].establecerRadio(20);
			((Circulo) arrayDeFiguras[0]).establecerRadio(20);
		
		// iterar a través de arrayDeFiguras para obtener nombre, representación
		// de cadena, área y volumen para todos los objetos Figura en el array
		for (int i = 0; i < arrayDeFiguras.length; i++) {
			salida += "\n\n" + arrayDeFiguras[i].obtenerNombre() + ": " + arrayDeFiguras[i].toString() 
					+ "\nArea = " + dosDigitos.format(arrayDeFiguras[i].obtenerArea()) 
					+ "\nVolumen = " + dosDigitos.format(arrayDeFiguras[i].obtenerVolumen());
		}

		JOptionPane.showMessageDialog(null, salida); // mostrar resultados

	} // fin de main

} // fin de la clase PruebaInterfaz