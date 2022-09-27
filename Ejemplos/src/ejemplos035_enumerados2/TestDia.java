package ejemplos035_enumerados2;

public class TestDia {
	Dia dia;

	public static void main(String[] args) {
		String str = "LUNES";
		TestDia t1 = new TestDia(Dia.valueOf(str));
		t1.diaEs();
	}

	// Constructor
	public TestDia(Dia dia) {
		this.dia = dia;
	}

	// Metodo
	// Imprime una linea sobre el DIA usando switch
	public void diaEs() {
		switch (dia) {
		case LUNES:
			System.out.println("Los lunes son feos.");
			break;
		case VIERNES:
			System.out.println("Los viernes son mejores.");
			break;
		case SABADO:
		case DOMINGO:
			System.out.println("Los fines de semana son mejores.");
			break;
		default:
			System.out.println("Los días entre semana son regulares.");
			break;
		}
	}
}
