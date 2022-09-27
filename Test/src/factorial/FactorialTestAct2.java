package factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTestAct2 {
	
	@Test
	public void testCalculo1() {
		Factorial f = new Factorial(); 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			f.calculo(-1);
		}, "Numero n no puede ser < 0");
	}
	
	@Test
	public void testCalculo2() {
		Factorial f = new Factorial(); 
		Assertions.assertThrows(ArithmeticException.class, () -> {
			f.calculo(999999);
		}, "Overflow, numero n demasiado grande");
	}
	
	@Test
	public void testCalculo3() {
		double valorEsperado = 5*4*3*2*1;
		Factorial f = new Factorial();
		double resultado = f.calculo(5);
		assertEquals(valorEsperado, resultado, 0);
	}
}
