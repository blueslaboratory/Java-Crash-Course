package excepciones_Ej007DGTSolMod;

public class ExcepcionCodigo extends Exception {
	//asi es como vamos a trabajar, excepciones en clases aparte y en su paquete
	private static final long serialVersionUID = 1L;
	
	//CONSTRUCTORES
	public ExcepcionCodigo(String str) {
		super(str);
	}
	public ExcepcionCodigo() {
		super();
	}
}
