package ejemplos022_herencia3_milpies;

public class MilpiesEsquiador extends Milpies {
	protected int piesRotos = 10;
	//protected es que puedes acceder a el desde las clases hijo y tambien dentro del mismo paquete
	
	public MilpiesEsquiador(){ //poner pto de ruptura aqui y pulsar F5
		piesRotos = 100;
		escribePies();
		// Adem�s de llamar aqu� a su propio constructor, llamar� al constructor de MilPies
		// que a su vez llama a su escribePies() propio
		// Se est� llamando con un objeto de tipo MilPiesEsquiador, que tiene el m�todo reescrito
		// aunque sea el constructor de Milpies, se invoca el m�todo escribePies de MilpiesEsquiador
		// Como se ejecuta como primer m�todo del constructor, piesRotos no tiene el valor 100, sino 0
	}
	
	public void escribePies(){
		System.out.println("A un Milpies esquiador le quedan " + (numeroDePies-piesRotos)+" pies");
	}
} 