package dunkerke;

public class Libreria {

	// OTROS METODOS
	public static int random(int min, int max) {

		// En general, para conseguir un numero entero entre [N, M]
		// con N < M y ambos incluidos, debemos usar esta formula:
		// int valorEntero = Math.floor(Math.random()*(M-N+1)+N);
		// Valor entre M y N, ambos incluidos.

		int nRandom = (int) (Math.random() * (max - min + 1) + min);
		return nRandom;
	}

}
