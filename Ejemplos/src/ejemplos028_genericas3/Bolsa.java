package ejemplos028_genericas3;
import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa implements Iterable {
	private ArrayList lista; //si te fijas no es: ArrayList<Object> lista;
	private int tope;

	//CONSTRUCTOR
	public Bolsa(int tope) {
		lista = new ArrayList(); //si te fijas no es: new ArrayList<Object>();
		this.tope = tope;
	}

	public void add(Object objeto) {
		if (lista.size() < tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("no caben mas");
		}
	}

	@Override 
	public Iterator iterator() {
		return lista.iterator();
	}
}
