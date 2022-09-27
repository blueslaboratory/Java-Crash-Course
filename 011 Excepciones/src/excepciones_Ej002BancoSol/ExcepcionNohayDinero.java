package excepciones_Ej002BancoSol;
public class ExcepcionNohayDinero extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionNohayDinero(){
		super("No hay suficientes fondos para retirar esa cantidad");
	}
}