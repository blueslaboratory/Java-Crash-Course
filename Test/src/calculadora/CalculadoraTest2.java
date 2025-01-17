/*
 * 4/02/2021
 */

package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest2 {

	private Calculadora calcu;

	
	@BeforeEach
	public void creaCalculadora() {
		calcu = new Calculadora(20, 10);
	}
	@AfterEach
	public void borraCalculadora() {
		calcu = null;
	}

	
	@Test
	void testSuma() {
		double valorEsperado = 30;
		double resultado = calcu.suma();
		assertEquals(valorEsperado, resultado, 0);
	}
	@Test
	void testResta() {
		double valorEsperado = 10;
		double resultado = calcu.resta();
		assertEquals(valorEsperado, resultado, 0);
	}
	@Test
	void testMultiplica() {
		double valorEsperado = 200;
		double resultado = calcu.multiplica();
		assertEquals(valorEsperado, resultado, 0, "Fallo en la multiplicacion: ");
	}
	@Test
	void testDivide() {
		double valorEsperado = 2;
		double resultado = calcu.divide();
		assertEquals(valorEsperado, resultado, 0);
	}
}
