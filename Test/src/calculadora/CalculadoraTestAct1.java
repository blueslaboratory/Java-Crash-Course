package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTestAct1 {

	//Metodos asserTrue(), assertFalse(), assertNull(), assertNotNull() o assertEquals()
	@Test
	public void testResta2() {
		Calculadora calcu = new Calculadora(20, 10);
		boolean resultado = calcu.resta2();
		assertTrue(resultado, "True");
		
		Calculadora calcu2 = new Calculadora(10, 20);
		resultado = calcu2.resta2();
		assertFalse(resultado, "False");
	}
	
	@Test
	public void testDivide2() {
		Calculadora calcu = new Calculadora(20, 0);
		assertNull(calcu.divide2(), "Null");
		
		Calculadora calcu2 = new Calculadora(10, 1);
		int resultado = calcu2.divide2();
		assertNotNull(resultado, "Not Null");
		
	}
	
	@Test
	public void testRestaEquals() {
		double valorEsperado = 10;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu.resta();
		assertEquals(valorEsperado, resultado, 0, "Equals ok");
		
		valorEsperado = 10;
		Calculadora calcu2 = new Calculadora(10, 20);
		resultado = calcu.resta();
		assertEquals(valorEsperado, resultado, 0, "Equals ok");
	}

}
