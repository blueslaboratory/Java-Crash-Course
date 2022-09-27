package excepciones_Ej001Factorial;

//2 clases en 1 .java

class FactorialNegExc1 extends Exception {
	private static final long serialVersionUID = 1L;

	public FactorialNegExc1(String msg) {
		super(msg);
	}
}

public class Ej001SolFactorialAppNoEstatica {

	public static void main(String[] args) {

		double resultado = 0;

		Ej001SolFactorialAppNoEstatica f = new Ej001SolFactorialAppNoEstatica();

		try {
			resultado = f.factorial(-6);
		} catch (FactorialNegExc1 ex) {
			System.out.println("NumeroNegativoException " + ex.getMessage());
		} finally {
			if (resultado != 0)
				System.out.println("El resultado es " + resultado);
		}

	}
	
	double factorial(int n) throws FactorialNegExc1 {
		int f = 1;

		if (n<0)
			throw new FactorialNegExc1("No se puede calcular el factorial de un numero negativo");

		for (int i=1; i<=n; i++) {
			f *= i;
		}

		return f;
	}

}