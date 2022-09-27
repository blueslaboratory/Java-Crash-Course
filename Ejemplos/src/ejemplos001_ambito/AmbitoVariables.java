package ejemplos001_ambito; 

public class AmbitoVariables { 
	
	static int variableGlobal; 
	
	public static void main(String[] args) { 
		
		int variableDelMain = 10; 
		
		/*Aqui se pueden usar variableGlobal y 
		variableDelMain. No se puede usar 
		variableDeOtroMetodo */ 
		
		System.out.println("*** Dentro del metodo main ***");
		System.out.println("variableGlobal " + variableGlobal);
		System.out.println("variableDelMain " + variableDelMain);
		
		otroMetodo();
	} 
	
	static void otroMetodo() { 
		
		int variableDeOtroMetodo=90; 
		
		/* Aqui se pueden usar variableGlobal y 
		variableDeOtroMetodo. No se puede usar 
		variableDelMain */	
		
		System.out.println("*** Dentro del metodo otroMetodo ***");
		
		System.out.println("variableGlobal " + variableGlobal);
		
		//System.out.println("variableDelMain " + variableDelMain);
		//No se puede utilizar variableDelMain porque es local al main
		
		System.out.println("variableDeOtroMetodo " + variableDeOtroMetodo);
		} 
}


