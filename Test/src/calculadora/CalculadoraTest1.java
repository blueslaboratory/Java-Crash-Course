/*
Para hacer un test:
1. Click derecho sobre la clase que quieres testear
2. New JUnit Test Case y seleccionas los metodos que quieres probar
*/

package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest1 {

	@Test
	void testSuma() {
		double valorEsperado = 30;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu.suma();
		assertEquals(valorEsperado, resultado, 0);
	}
	@Test
	public void testResta() {
		double valorEsperado = 10;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu.resta();
		assertEquals(valorEsperado, resultado, 0);
	}
	@Test
	public void testMultiplica() {
		double valorEsperado = 200;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu.multiplica();
		assertEquals(valorEsperado, resultado, 0);
	}
	@Test
	public void testDivide() {
		double valorEsperado = 2;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu.divide();
		assertEquals(valorEsperado, resultado, 0);
	}

	/*
	// PROBANDO ERRORES
	@Test
	public void testMultiplica2() {
		double valorEsperado = 200;
		Calculadora calcu = new Calculadora(20, 50);
		double resultado = calcu.multiplica();
		assertEquals(valorEsperado, resultado, 0, "Fallo en la multiplicacion: ");
	}
	@Test
	public void testDivide2() {
		double valorEsperado = 2;
		Calculadora calcu = new Calculadora(20, 0);
		double resultado = calcu.divide();
		assertEquals(valorEsperado, resultado, 0);
	}
	*/
	
	// Probando una excepcion
	@Test
	public void testDivide0() {
		Calculadora calcu = new Calculadora(20, 0); //si cambias el 0 por el 1 no te da la excep
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calcu.divide0();
		});
	}

}
