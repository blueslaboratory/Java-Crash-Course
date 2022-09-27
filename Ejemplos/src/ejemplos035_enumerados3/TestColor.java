package ejemplos035_enumerados3;
 
//Programa Java para demostrar el funcionamiento de values(),
//ordinal() y valueOf()


enum Color {
	ROJO, VERDE, AZUL;
}

public class TestColor {
	public static void main(String[] args) {
		// Llamando a values()
		Color arr[] = Color.values();

		// enum con bucle
		for (Color col : arr) {
			// Llamando a ordinal() para encontrar el �ndice
			// de color.
			System.out.println(col + " en el indice " + col.ordinal());
		}

		// Usando valueOf(). Devuelve un objeto de
		// Color con la constante dada.
		// La segunda l�nea comentada causa la excepci�n
		// IllegalArgumentException
		System.out.println(Color.valueOf("ROJO"));
		// System.out.println(Color.valueOf("BLANCO"));
	}
}
