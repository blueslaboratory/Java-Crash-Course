package calculadora;

public class Calculadora {
	private int num1;
	private int num2;

	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public int suma() {
		int resul = num1 + num2;
		return resul;
	}
	
	public int resta() {
		int resul;
		if (resta2())
			resul = num1 - num2;
		else
			resul = num2 - num1;
		return resul;
		// int resul = num1 - num2;
		// return resul;
	}
	
	public boolean resta2() {
		if (num1 >= num2)
			return true;
		else
			return false;
	}

	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}

	public int divide() {
		int resul = 0;
		try {
			resul = num1 / num2;
		} catch (ArithmeticException e) {
			resul = 0;
		}
		return resul;
	}
	
	public Integer divide2() {
		if (num2 == 0)
			return null;
		else {
			int resul = num1 / num2;
			return resul;
		}
	}

	// Lanzando una excepcion
	public int divide0() {
		if (num2 == 0)
			throw new java.lang.ArithmeticException("Division por 0");
		else {
			int resul = num1 / num2;
			return resul;
		}
	}
}
