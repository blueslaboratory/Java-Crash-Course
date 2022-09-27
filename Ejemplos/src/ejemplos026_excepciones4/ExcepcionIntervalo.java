package ejemplos026_excepciones4;

public class ExcepcionIntervalo extends Exception {

	private static final long serialVersionUID = 1L;

	//CONSTRUCTORES
	public ExcepcionIntervalo(String msg) {
        super(msg);
    }
	public ExcepcionIntervalo() {
        super();
    }
}