package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest3 {
	private static Calculadora calcu;
	private double valorEsperado;
	private double resultado;
	
	
	
	@BeforeAll
	public static void creaCalculadora() {
		calcu = new Calculadora(20, 10);
	}
	@AfterAll
	public static void borraCalculadora() {
		calcu = null;
	}
	

	@Test
	void testSuma() {
		valorEsperado = 30;
		resultado = calcu.suma();
		assertEquals(valorEsperado, resultado, 0);
	}
	@Test
	void testResta() {
		valorEsperado = 10;
		resultado = calcu.resta();
		assertEquals(valorEsperado, resultado, 0);
	}
	@Test
	void testMultiplica() {
		valorEsperado = 200;
		resultado = calcu.multiplica();
		assertEquals(valorEsperado, resultado, 0, "Fallo en la multiplicacion: ");
	}
	@Test
	void testDivide() {
		valorEsperado = 2;
		resultado = calcu.divide();
		assertEquals(valorEsperado, resultado, 0);
	}
}
