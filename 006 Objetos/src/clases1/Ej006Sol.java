package clases1;

public class Ej006Sol {
	static private int numeroCuentas=0;
	private int numcuenta;
	private double saldo;
	
	public Ej006Sol(){}
	public Ej006Sol (double saldo){
		this.saldo=saldo;
		numcuenta=numeroCuentas;
		numeroCuentas++;
	}
	public double getSaldo(){
		return saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	// Podr�amos usar this. para identificar que se trata de un atributo del objeto, pero no es necesario
	/*public void ingresar(double ingreso){
		this.saldo=this.saldo+ingreso;
		System.out.println("Ha ingresado "+ingreso+" y ahora tiene un total de "+this.saldo+" euros en la cuenta");
	}*/
	public void ingresar(double ingreso){
		saldo=saldo+ingreso;
	}
	// Podr�amos usar this. para identificar que se trata de un atributo del objeto, pero no es necesario
	/*public void sacar(double retiro){
		if(this.saldo>=retiro){
			this.saldo=this.saldo-retiro;
			System.out.println("Ha retirado "+retiro+" euros y le quedan "+saldo+" en la cuenta");
		}
		else{
			System.out.println("No tiene suficiente saldo disponible para hacer ese retiro");
		}
	}*/
	public double sacar(double retiro){
		if(saldo>=retiro){
			saldo=saldo-retiro;
			return saldo;
		}
		else
			return -1;
	}
	
	public int numCuentasCreadas(){
		return numeroCuentas;
	}
	
	public int getnumCuenta(){
		return numcuenta;
	}

	@Override
	public String toString() {
		return "La cuenta de numero " + numcuenta + " tiene un saldo de " + saldo ;
	}

}
