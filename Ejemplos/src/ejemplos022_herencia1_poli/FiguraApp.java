package ejemplos022_herencia1_poli;

public class FiguraApp {
	public static void main(String args[]) {
		Triangulo t = new Triangulo();
		// Llama tambien al constructor de padre y abuelo, empezando por el mas viejo
		t.Dibujar(); // Triangulo no dispone de metodo Dibujar, el padre si

		System.out.println();

		Poligono p = new Poligono();
		// Llama tambien al constructor del padre
		p.Dibujar();

		System.out.println();

		Figura f = new Figura();
		f.Dibujar();
	}
}
