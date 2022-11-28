package almacen;

public class Cliente extends Thread {
	
	int idCliente;
	int intentosEntrada;
	boolean compra;
	Almacen almacen;	
	
	
	// CONSTRUCTORES
	public Cliente(int id, Almacen almacen) {
		super();
		this.idCliente = id;
		this.intentosEntrada = 100;
		this.almacen = almacen;
	}
	
	
	// GETTERS Y SETTERS: ALT + SHIFT + S
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int id) {
		this.idCliente = id;
	}
	public int getIntentosEntrada() {
		return intentosEntrada;
	}
	public void setIntentosEntrada(int intentos) {
		this.intentosEntrada = intentos;
	}
	public boolean isCompra() {
		return compra;
	}
	public void setCompra(boolean compra) {
		this.compra = compra;
	}
	
	
	// OTROS METODOS
	public void menos1Intento() {
		this.intentosEntrada--;
	}
	
	public void intentoEntrarCliente () {
		
		// da igual si coge el producto o no, lo va a seguir intentando 10 veces
		for(int i=1; i<=10; i++ ) {
			almacen.entrada(this);
			this.menos1Intento();
			
			try {
				int num = (int)(Math.random()*(100) +1); //(M-N+1)+N
				Thread.sleep(num);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}	
		}
		
		System.out.println("El  cliente " + this.idCliente + " no ha conseguido entrar comprar y se va");
	}
	
	public void run(){
		intentoEntrarCliente ();
	}	

}