package almacen;

public class Cliente extends Thread {
	
	int idCliente;
	int intentosEntrada;
	boolean compra;
	Almacen almacen;
	
	
	// CONSTRUCTORES
	public Cliente(int id, int intentosEntrada, Almacen almacen) {
		super();
		this.idCliente = id;
		this.intentosEntrada = intentosEntrada;
		this.almacen = almacen;
		
		// TODO Auto-generated constructor stub
	}
	public Cliente(int id, Almacen almacen) {
		super();
		this.idCliente = id;
		this.intentosEntrada = 100;
		this.almacen = almacen;
		
		// TODO Auto-generated constructor stub
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
	public void setIntentosEntrada() {
		this.intentosEntrada--;
	}
	public boolean isCompra() {
		return compra;
	}
	public void setCompra(boolean compra) {
		this.compra = compra;
	}
	
	
	// OTROS METODOS
	public void intentoEntrarCliente () {
		
		for(int i=1; i<=10; i++ ) {
			almacen.entrada(this);
			this.setIntentosEntrada();
			
			try {
				int num = (int)(Math.random()*(100) +1); //(M-N+1)+N
				Thread.sleep(num);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}	
		}
		
		// da igual si coge el producto o no, lo va a seguir intentando 10 veces
		System.out.println("El  cliente " + this.idCliente + " no ha conseguido entrar comprar y se va");
	}
	
	
	public void run(){
		this.intentoEntrarCliente ();
	}	

}