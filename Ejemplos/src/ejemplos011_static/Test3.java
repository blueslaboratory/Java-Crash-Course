package ejemplos011_static;

public class Test3 {
	static int atributo1 = 3;

	Test3(int atrib) {
		atributo1 = 0;
	}

	public static void main(String[] Args) {
		System.out.println("Mensaje 1");
		System.out.println("Atributo 1 vale: " + getAtrib1());

	} // Cierre del main

	public static int getAtrib1() {
		return atributo1;
	}
} // ZCierre de la clase