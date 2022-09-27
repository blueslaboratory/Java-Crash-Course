package excepciones_Ej001Factorial;

// 2 clases en 1 .java

class FactorialNegExc extends Exception {
	private static final long serialVersionUID = 1L;

	public FactorialNegExc(String msg) {
		super(msg);
	}
}

public class Ej001SolFactorialApp {

	public static void main(String[] args) {

		double resultado = 0;

		try {
			resultado = factorial(-4);
		} catch (FactorialNegExc ex) {
			System.out.println("NumeroNegativoException " + ex.getMessage());
		} finally {
			if (resultado != 0)
				System.out.println("El resultado es " + resultado);
		}

	}
	
	public static double factorial(int numero) throws FactorialNegExc {
		System.out.println("Empezamos factorial de " + numero);
		if (numero < 0)
			throw new FactorialNegExc("No se puede calcular el factorial de un numero negativo");
		else if (numero == 0) {
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}
	}

}