package ejemplos011_static;

public class Test2 {
	int atributo1;

	Test2(int atrib) {
		atributo1 = 0;
	}

	public static void main(String[] Args) {
		System.out.println("Mensaje 1");
		// System.out.println ("Atributo 1 vale" + this.getAtrib1());
		// Error, no se puede utilizar this en un estatico
		Test2 t = new Test2(5);
		System.out.println("Atributo 1 vale: " + t.getAtrib1());
	} // Cierre del main

	public int getAtrib1() {
		return atributo1;
	}
} // Cierre de la clase