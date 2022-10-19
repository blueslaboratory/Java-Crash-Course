package ejemplos024_interface;

public class ImplementaInterfaz implements MiInterfaz {

	int multiplicando = MiInterfaz.CONSTANTE;

	@Override 
	//no hace falta el override porque los metodos abstractos te obligan a reescribir el codigo
	public int metodoAbstracto(int parametro) {
		return (parametro * multiplicando);
	}

}

//PASAR DE LOS PAQUETES DE INTERFACE 24
//IR DIRECTAMENTE A ejemplos025_comparator1 PARA ESTA 2DA EVA 