package almacen;

public class Almacen {
	
	int unidadesProductos;

	
	// CONSTRUCTOR
	public Almacen(int unidadesProductos) {
		super();
		this.unidadesProductos = unidadesProductos;
	}

	
	// GETTERS Y SETTERS: ALT + SHIFT + S
	public int getUnidadesProductos() {
		return unidadesProductos;
	}

	
	// OTROS METODOS
	public synchronized void entrada(Cliente cli) {
		System.out.println("El cliente " + cli.idCliente + " ha conseguido entrar en la tienda");
		
		if (this.unidadesProductos>0) {
			unidadesProductos--;
			System.out.println("Quedan " + this.unidadesProductos);
			System.out.println("El cliente " + cli.idCliente + " ha conseguido comprar su producto");
		} 
		else {
			System.out.println("El producto esta agotado, el cliente " + cli.idCliente + " no ha conseguido comprar su producto");
		}
		
	}
	
}