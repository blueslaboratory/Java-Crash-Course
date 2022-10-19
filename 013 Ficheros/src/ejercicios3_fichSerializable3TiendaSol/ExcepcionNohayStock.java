package ejercicios3_fichSerializable3TiendaSol;
public class ExcepcionNohayStock extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionNohayStock(){
		super("No hay suficiente stock para retirar esa cantidad.");
	}
}