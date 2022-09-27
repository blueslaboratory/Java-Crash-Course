package ejemplos024_interface4;

public class TestInterface {
	public static void main(String[] args) {
		Globo zepelin = new Globo();

		zepelin.setDireccion('N');
		zepelin.girarDerecha(90);
		System.out.println("Zepelin nueva direccion " + zepelin.getDireccion());

		Patin patin = new Patin();

		patin.girarDerecha(90);
		patin.girarIzquierda(90);
	}
}