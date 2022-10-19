package ejemplos024_interface4;

public class Patin implements Conducible {
	public void girarDerecha(int grados) {
		System.out.println("Patin gira " + grados + " grados a la derecha");
	}

	public void girarIzquierda(int grados) {
		System.out.println("Patin gira " + grados + " grados a la izquierda");
	}
}
