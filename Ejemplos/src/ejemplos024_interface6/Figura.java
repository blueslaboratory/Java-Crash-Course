package ejemplos024_interface6;
// Declaracion de la interfaz Figura.

public interface Figura {
	public double obtenerArea(); // calcular el area

	public double obtenerVolumen(); // calcular el volumen
	// En esta solucion suponemos que si la figura es plana
	// el volumen sera cero

	public String obtenerNombre(); // devolver el nombre de la figura
} 
