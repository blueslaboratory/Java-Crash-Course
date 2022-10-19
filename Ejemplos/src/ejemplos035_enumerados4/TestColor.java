package ejemplos035_enumerados4;

public class TestColor {
	public static void main(String[] args) {

		// System.out.println("Inicializando: " + Color.ROJO);

		// Se inicializan todas las instancias la primera vez que se usa el enum.
		// Al inicializar se asignan los 2, se hace el new de todos los objetos
		// si comentas c2, al imprimir c1 se imprimen los 2
		Color c1; 
		c1 = Color.AZUL;
		System.out.println("Inicializando: " + c1.toString());

		/*
		Color2 c2;
		c2 = Color2.ROJO;
		System.out.println("Inicializando: " + c2);
		*/
	}
}
