package ejemplos022_herencia4_musica;

// Un tipo de Guitarra 
class Guzla extends Guitarra {
	public void tocar() {
		System.out.println("Guzla.tocar()");
	}

	public void afinar() {
		System.out.println("Guzla.afinar()");
	}
	
	//reescribe tocar() y afinar()
	//no reescribe tipo(), hereda el tipo() de guitarra
}
