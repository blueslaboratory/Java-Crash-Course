package ejemplos026_excepciones5;

public class Animal {
	private String nombre;

	//CONSTRUCTORES Y BLOQUES TRY-CATCH
	public Animal(String nombre) {
		try {
			if (nombre.compareTo("algo") == 0) //nombre.equals("algo")
				throw new Exception("No me gustan los algo");

			//nunca llega aqui
			this.nombre = nombre;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//si haces el try-catch aqui, se crea el objeto
		//si haces un throws no
	}
	public Animal(){
		this.nombre = "unNombre";
	}
	
	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
}