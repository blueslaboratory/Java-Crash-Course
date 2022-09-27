package excepciones_Ej002BancoSol;
//import excepcionNoHayDinero.ExcepcionNohayDinero;

public class Cuenta{
	static int numCuentas=0;
	private double saldo=0.0;
	private int nCC;
    
	//OTROS METODOS
	public void ingresar(double cant){
		saldo = saldo + cant;
	}
	
	public void sacar(double cant){				
		try{			
			if (saldo<cant)
				throw new ExcepcionNohayDinero();
			saldo-=cant;
		}		
		catch(ExcepcionNohayDinero ex){
			System.out.println(ex.getMessage());
		}
	}
	
	public static int numeroDeCuentas(){
		return numCuentas;
	}
	
	
	//CONSTRUCTOR
	public Cuenta(double _saldo, int _nCC){
		saldo=_saldo;
		nCC=_nCC;
		numCuentas++;
	}
	
	//GETTERS
	public int devnCC(){
		return nCC;
	}
	public double devSaldo(){
		return saldo;
	}
	
	//SETTERS
	public void  ponnCC(int nCC){
		this.nCC = nCC;
	}
	public void ponSaldo(double saldo){
		this.saldo = saldo;
	}
		
	//TOSTRING
	@Override
	public String toString(){
		return("Numero de cuenta " + nCC + " Saldo " + saldo );
	}
}