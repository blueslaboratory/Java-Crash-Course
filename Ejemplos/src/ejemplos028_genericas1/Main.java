package ejemplos028_genericas1;

public class Main {
	public static void main(String[] args) {
		ClaseGenerica<Integer> claseGenericaInteger = new ClaseGenerica<Integer>(1, 2);
		System.out.println("Valor del atributo A:" + claseGenericaInteger.getA());
		System.out.println("Valor del atributo B:" + claseGenericaInteger.getB());
		claseGenericaInteger.intercambiaAB();
		System.out.println("Valor del atributo A:" + claseGenericaInteger.getA());
		System.out.println("Valor del atributo B:" + claseGenericaInteger.getB());

		ClaseGenerica<String> claseGenericaString = new ClaseGenerica<String>("uno", "dos");
		System.out.println("Valor del atributo A:" + claseGenericaString.getA());
		System.out.println("Valor del atributo B:" + claseGenericaString.getB());
		claseGenericaString.intercambiaAB();
		System.out.println("Valor del atributo A:" + claseGenericaString.getA());
		System.out.println("Valor del atributo B:" + claseGenericaString.getB());

	}

}
