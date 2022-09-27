package ejemplos009_objetos;

public class Coche {
	private String marca;
	private String modelo;
	private String color;
	private int numeroDePuertas;
	private int cuentaKilometros;
	private int velocidad;
	private boolean arrancado;
	
	//COMO SON PRIVATE NO LAS PUEDO CAMBIAR DESDE EL MAIN
	//TENGO QUE CAMBIAR DESDE LOS METODOS QUE SON PUBLIC: SET
	
	
	//CONSTRUCTORES DE COCHES
	/*
	<modificador deVisibilidad> NombredelaClase ( <argumentos> ) {
		<declaraciones>
	}
	 */

	public Coche(String marca, String modelo, String color, boolean arrancado) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.arrancado = arrancado;
	}
	
	//CONSTRUCTOR POR DEFECTO
	public Coche() {}
	//Si no se define ning�n constructor el compilador crea uno por defecto 
	//sin par�metros que, al ejecutarse, inicializa el valor de cada atributo 
	//de la nueva instancia a 0, false o null, dependiendo de si el atributo 
	//es num�rico, alfanum�rico o una referencia a otro objeto respectivamente, 
	//pero dicho constructor desaparece en el mismo momento en que se defina 
	//otro constructor, por lo que si se quiere tener el de por defecto habr� 
	//que definirlo.
	
	//coche1 = new Coche();
	//sin esto me daria error
	
	
	//PARA VER PUEDO VERLOS DESDE LA PROPIA CLASE COCHE
	//(todo esto esta dentro de la clase coche)
	//SET IT
	//Para crearlos automaticamente ALT + SHIFT + S
	
	public void setMarca(String _marca) {
		this.marca = _marca;
		//marca = _marca;
	}
	public void setMarca2(String marca) {
		this.marca = marca;
		//this se utiliza para cuando son iguales las vars
		//this es un objeto que se corresponde con el objeto
		//que en el futuro va a instanciar la clase
	}
	public void setModelo(String _modelo) {
		modelo = _modelo;
	}
	public void setColor(String _color) {
		color = _color;
	}
	public void setNumeroDePuertas(int _numeroDePuertas) {
		numeroDePuertas = _numeroDePuertas;
	}
	public void setCuentaKilometros(int _cuentaKilometros) {
		cuentaKilometros = _cuentaKilometros;
	}
	public void setVelocidad(int _velocidad) {
		velocidad = _velocidad;
	}
	
	
	
	//PARA VER PUEDO VERLOS DESDE LA PROPIA CLASE COCHE
	//(todo esto esta dentro de la clase coche)
	//GET IT
	//Para crearlos automaticamente ALT + SHIFT + S
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getColor() {
		return color;
	}
	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}
	public int getCuentaKilometros() {
		return cuentaKilometros;
	}
	public int getVelocidad() {
		return velocidad;
	}
	
	
	
	//DEMAS METODOS
	/*
	<modificador-acceso> <modificador (static o no)> tipoR (void, int...) nombre-metodo(<parametros>){ 
		<cuerpodelmetodo> 
	}
		- <modificador-acceso> public, private o protected
		- <modificador > indica si es estatica o no o final o ambas.
		- <tipoR> es el tipo de dato que retorna el metodo. Es obligatorio indicar un tipo. 
		  Para los metodos que no devuelven nada se utiliza la palabra reservada void. 
		- Nombre-metodo es como el programador quiere llamar a su metodo y <parametros> 
		  son los datos que se van a enviar al metodo para trabajar con ellos, no son obligatorios. 
	*/
	
	public void arrancar() {
		arrancado = true;
		//this: objeto que esta ejecutando en este momento en 
		//		este metodo (en el debug)
	}
	
	public void parar() {
		arrancado = false;
	}
	
	public void acelerar() {
		velocidad += 1;
	}

	public void frenar() {
		velocidad -= 1;
	}
	
	public void pitar() {
		System.out.println("*car fart*");
	}
	
	public int consultarCuentaKm() {
		return cuentaKilometros;
	}
	
	
	
	//IMPRIMIR COCHE
	public void imprimirCoche() {
		System.out.println("");
		System.out.println("Marca: " +getMarca());
		System.out.println("Modelo: " +getModelo());
		System.out.println("Color: " +getColor());
		System.out.println("Puertas: " +getNumeroDePuertas());
		System.out.println("Cuenta Km: " +getCuentaKilometros());
		System.out.println("Velocidad: " +getVelocidad());
		System.out.println("");
	}
	
	public void imprimir() {
		System.out.println( "\n" +marca
						   +"\n" +modelo
						   +"\n" +color
						   +"\n" +(arrancado ? "READY":"PRESS START"));
	}
	
	
	//	WARNING: Multiple markers at this line
	//	- overrides java.lang.Object.
	//	 toString
	//	- This method must return a result 
	//	 of type String
	//	Sobreescribiendo
	
	public String toString(){
		return "\n" +marca
			  +"\n" +modelo
			  +"\n" +color
			  +"\n" +(arrancado ? "READY":"PRESS START");
	}
	
}