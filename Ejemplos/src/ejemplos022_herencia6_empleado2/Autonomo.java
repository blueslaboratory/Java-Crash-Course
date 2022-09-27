package ejemplos022_herencia6_empleado2;

public class Autonomo extends Empleado {
	String empresa;
	

	//CONSTRUCTORES
	public Autonomo() {
		// super(); lo hace implicitamente
	}
	public Autonomo(String n, int s) { 
		//n: nombre ; s: salario
		super(n, s);
	}
	public Autonomo(String n, int s, String empresa) {
		super(n, s); // Esta instruccion siempre va la primera
		this.empresa = empresa;
	}

	
	//GETTER
	public String getEmpresa() {
		return empresa;
	}
	
	//SETTER
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	//toString
	public String toString() {
		String s = super.toString();
		s = s + "\n" + " Nombre Empresa: " +empresa;

		return s;
	}
}
