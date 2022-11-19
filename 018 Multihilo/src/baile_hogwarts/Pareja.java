package baile_hogwarts;

public class Pareja {
	
	Boolean parejaLibre[] = {true, true, true, true};
	String parejasBaile[];
	Integer parejasCasas[];
	
	public Pareja(String parejasBaile[], Integer parejasCasas[]) {
		this.parejasBaile = parejasBaile;
		this.parejasCasas = parejasCasas;
	}

	public void liberarPareja(int posicion) {
		this.parejaLibre[posicion] = true;
	}
	
	public synchronized Integer getPareja(int posAnterior, Integer CasaIncompatible) {
		
		Boolean posicionDistintaAnterior = false, casaCompatible=true;
		Integer posicion = posAnterior;
		Integer posicionValida = -1;
		// Damos 4 vueltas que corresponden con las 4 posibles parejas, la anterior no vale
		// puede que la ultima vez no bailara, en ese caso empezamos por 0 y mantenemos en 
		// posición anterior el -1		
		for(int i= 0; i < 4; i++) {
			// en cada vuelta inicializamos estas variables
			posicionDistintaAnterior = false; 
			casaCompatible=false;
			posicionValida = -1;
			// si estamos al final del array, vamos al 0, sino sumamos uno a la ultima posición
           if (posicion == (this.parejasBaile.length - 1)) {
        	   posicion = 0;
           }else {
        	   posicion++;
           }
                              
           // Lo primero es asegurarnos de que no bailamos con el mismo que la última vez
           if (posicion!=posAnterior){
        	   // 2º: que la casa es compatible
        	   if (this.parejasCasas[posicion]!=CasaIncompatible){
            	   // Miramos si el baliarín está libre
            	   if (this.parejaLibre[posicion]) {
                	   posicionValida = posicion;
                	   this.parejaLibre[posicion] = false;
                	   break;        		   
            	   }        	           		  
        	   }
           }                                                  
        } ;		     
		return posicionValida;
	}
}
