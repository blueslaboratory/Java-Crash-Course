package almacen;

public class Cliente extends Thread {
	int idCliente;
	int intentosEntrada;
	boolean compra;
	Almacen al;
	
	public Cliente(int id, int intentosEntrada, Almacen al) {
		super();
		this.idCliente = id;
		this.intentosEntrada = intentosEntrada;
		this.al = al;
		
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(int id, Almacen al) {
		super();
		this.idCliente = id;
		this.intentosEntrada = 100;
		this.al = al;
		
		// TODO Auto-generated constructor stub
	}
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
	
	public void intentoEntrarCliente () {
		for(int i=1; i<=10; i++ ) {
			al.entrada(this);
			this.setIntentosEntrada();
			try {
				int num = (int)(Math.random()*(100)+1	);
				Thread.sleep(num);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
			
		}
		System.out.println("El  cliente " + this.idCliente + " no ha conseguido entrar comprar y se va");
	}
	public void run(){
		this.intentoEntrarCliente ();
	}
	

}
