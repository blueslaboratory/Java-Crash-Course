package ejemplos026_excepciones3;

public class Limites extends Exception {
	//asi es como vamos a trabajar, excepciones en clases aparte y en su paquete
	
	//CONSTRUCTORES
	public Limites(String str){
		super(str);	
	}
	public Limites(){
		super();	
	}		
}