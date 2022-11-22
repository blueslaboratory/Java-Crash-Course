package almacen;

public class Almacen {
	int unidadesProductos;

	public Almacen(int unidadesProductos) {
		super();
		this.unidadesProductos = unidadesProductos;
		// TODO Auto-generated constructor stub
	}

	public int getUnidadesProductos() {
		return unidadesProductos;
	}

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