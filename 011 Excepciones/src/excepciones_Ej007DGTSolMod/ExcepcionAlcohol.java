package excepciones_Ej007DGTSolMod;

public class ExcepcionAlcohol extends Exception {
	//asi es como vamos a trabajar, excepciones en clases aparte y en su paquete
	private static final long serialVersionUID = 1L;
	
	//CONSTRUCTORES
	public ExcepcionAlcohol(String str) {
		super(str);
	}
	public ExcepcionAlcohol() {
		super();
	}
}
