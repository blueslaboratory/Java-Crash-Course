package ejemplos026_excepciones6;

public class Animal {
	private String nombre;

	//CONSTRUCTORES Y RELANZAR LA EXCEPCION
	public Animal(String nombre) throws Exception {
		//cuando hago una excepcion tengo o bien que tratarla o relanzarla
		if (nombre.compareTo("algo") == 0) 
			throw new Exception("No me gustan los algo");		
		
		//nunca llega aqui
		this.nombre = nombre;
	}
	//si haces el try-catch aqui, se crea el objeto
	//si haces un throws no
	
	public Animal() throws Exception {	
		this.nombre = "Random Name";
	}
	
	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
}