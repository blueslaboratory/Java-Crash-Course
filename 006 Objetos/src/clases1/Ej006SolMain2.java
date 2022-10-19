package clases1;
public class Ej006SolMain2 {
	static private int numeroCuentas=0;
	private int numcuenta;
	private double saldo;
	public Ej006SolMain2(){}
	public Ej006SolMain2 (double saldo){
		this.saldo=saldo;		
		numeroCuentas++;
		numcuenta=numeroCuentas;
	}
	public double getSaldo(){
		return saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	// Podriamos usar this. para identificar que se trata de un atributo del objeto, pero no es necesario
	/*public void ingresar(double ingreso){
		this.saldo=this.saldo+ingreso;
		System.out.println("Ha ingresado "+ingreso+" y ahora tiene un total de "+this.saldo+" euros en la cuenta");
	}*/
	public double ingresar(double ingreso){
		saldo += ingreso;
		
		return saldo;
	}
	// Podriamos usar this. para identificar que se trata de un atributo del objeto, pero no es necesario
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
	
	public static int numCuentasCreadas(){
		return numeroCuentas;
	}
	
	public int getnumCuenta(){
		return numcuenta;
	}

	public String toString() {
		String cad = "Cuenta numero " + numcuenta + " con saldo " + saldo;
		return cad;
	}
}
