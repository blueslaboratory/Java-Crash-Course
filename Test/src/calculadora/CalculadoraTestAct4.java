package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class CalculadoraTestAct4 {

	@ParameterizedTest
	@CsvSource({ "20,10,30", "30,-2,28", "5,2,7" })
	public void testSuma(int a, int b, int valorEsperado) {
		Calculadora calcu = new Calculadora(a, b);
		int resultado = calcu.suma();
		assertEquals(valorEsperado, resultado);
	}

	@ParameterizedTest
	@CsvSource({ "20,10,10", "30,-2,32", "2,5,3" })
	public void testResta(int a, int b, int valorEsperado) {
		Calculadora calcu = new Calculadora(a, b);
		int resultado = calcu.resta();
		assertEquals(valorEsperado, resultado);
	}

	@ParameterizedTest
	@CsvSource({ "20,10,200", "30,-2,-60", "5,2,10" })
	public void testMultiplica(int a, int b, int valorEsperado) {
		Calculadora calcu = new Calculadora(a, b);
		int resultado = calcu.multiplica();
		assertEquals(valorEsperado, resultado);
	}

	@ParameterizedTest
	@CsvSource({ "20,10,2", "30,-2,-15", "5,2,2" })
	public void testDivide(int a, int b, int valorEsperado) {
		Calculadora calcu = new Calculadora(a, b);
		int resultado = calcu.divide();
		assertEquals(valorEsperado, resultado);
	}
	
	@ParameterizedTest
	@CsvSource({ "20,0", "30,0", "5,0" })
	public void testDivide0(int a, int b) {
		Calculadora calcu = new Calculadora(a, b); //si cambias el 0 por el 1 no te da la excep
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calcu.divide0();
		});
	}

}
