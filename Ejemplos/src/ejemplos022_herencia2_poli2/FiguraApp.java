package ejemplos022_herencia2_poli2;

public class FiguraApp {
	public static void main(String args[]) {
		System.out.println("Nuevo objeto triangulo: ");
		Triangulo t = new Triangulo("Hola");
		// Llama tambi�n al constructor de padre y abuelo
		t.Dibujar();

		System.out.println();
		System.out.println("Nuevo objeto poligono: ");
		Poligono p = new Poligono();
		// Llama tambi�n al constructor del padre
		p.Dibujar();

		System.out.println();
		System.out.println("Nuevo objeto figura: ");
		Figura f = new Figura();
		f.Dibujar();

	}
}
