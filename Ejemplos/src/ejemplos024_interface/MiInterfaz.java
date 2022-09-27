package ejemplos024_interface;

public interface MiInterfaz {
	
	public int CONSTANTE = 100; // No puede ser ni privada ni protected, siempre final y estatica

	int metodoAbstracto(int parametro); // No puede ser ni privada ni protected
}
