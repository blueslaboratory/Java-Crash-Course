package fecha;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class FechaTestAct6 {
	
	private static Fecha fecha;
	private SimpleDateFormat formato;
	private Date hoy = new Date();
	
	private String cadEsperado = "";
	private String cadResultado = "";
	
	
	@BeforeAll
	public static void creaFecha() {
		fecha = new Fecha();
	}
	@AfterAll
	public static void borraFecha() {
		fecha = null;
	}
	
	
	@ParameterizedTest
	@CsvSource({"5", "0", "-9"})
	public void testFechaDefault(int a) {
		cadEsperado = "ERROR";
		cadResultado = fecha.DevuelveFecha(a);
		assertEquals(cadEsperado, cadResultado, "Test Fail");
	}
	
	@Test
	void testFechaCase1() {
		formato = new SimpleDateFormat("yyyy/MM");
		cadEsperado = formato.format(hoy);
		cadResultado = fecha.DevuelveFecha(1);
		assertEquals(cadEsperado, cadResultado, "Test Case1 Fail");
	}
	@Test
	void testFechaCase2() {
		formato = new SimpleDateFormat("MM/yyyy");
		cadEsperado = formato.format(hoy);
		cadResultado = fecha.DevuelveFecha(2);
		assertEquals(cadEsperado, cadResultado, "Test Case2 Fail");
	}
	@Test
	void testFechaCase3() {
		formato = new SimpleDateFormat("MM/yy");
		cadEsperado = formato.format(hoy);
		cadResultado = fecha.DevuelveFecha(3);
		assertEquals(cadEsperado, cadResultado, "Test Case3 Fail");
	}
	
	
	@ParameterizedTest
	@CsvSource({"1, yyyy/MM", "2, MM/yyyy", "3, MM/yy"})
	void testFechaParam (int a, String formatoStr) {
		formato = new SimpleDateFormat(formatoStr);
		cadEsperado = formato.format(hoy);
		cadResultado = fecha.DevuelveFecha(a);
		assertEquals(cadEsperado, cadResultado, "Parameterized Test Fail");
	}
	@ParameterizedTest
	@CsvSource({"1, yyyy/MM, 2021/02", "2, MM/yyyy, 02/2021", "3, MM/yy, 02/21"})
	void testFechaParam (int a, String formatoStr, String cadResultado) {
		formato = new SimpleDateFormat(formatoStr);
		cadEsperado = formato.format(hoy);
		assertEquals(cadEsperado, cadResultado, "Parameterized Test-2 Fail");
	}
}