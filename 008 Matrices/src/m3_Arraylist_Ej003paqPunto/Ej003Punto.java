package m3_Arraylist_Ej003paqPunto;

public class Ej003Punto {
	private double x;
    private double y;
    private int nPunto;
    private static int contPunto = 0;
    
    
    //OTROS METODOS
    //DISTANCIA AL ORIGEN
    public double distanciaAlOrigen() {
    	return Math.sqrt(Math.pow(x-0, 2) + Math.pow(y-0, 2));
    }
    //CALCULAR DISTANCIA
    public double calcularDistancia(Ej003Punto otroPunto) {
    	return Math.sqrt(Math.pow(x-otroPunto.getX(), 2) + Math.pow(y-otroPunto.getY(), 2));
    }
    //CALCULO CUADRANTE
    public int calcularCuadrante() {
    	if(x>0 && y>0)
    		return 1;
    	else if(x<0 && y>0)
    		return 2;
    	else if(x<0 && y<0)
    		return 3;
    	else if(x>0 && y<0)
    		return 4;
    	else  //(x==0 || y==0) 
			return 0;
    }
    //PUNTO MAS CERCANO
    public Ej003Punto calcularMasCercano(Ej003Punto[] otrosPuntos) {
    	Ej003Punto pMin = otrosPuntos[0];
    	
    	for(int i=0; i<otrosPuntos.length; i++) {
			if(this.calcularDistancia(otrosPuntos[i])<this.calcularDistancia(pMin) && this.calcularDistancia(otrosPuntos[i])>0)  
				pMin = otrosPuntos[i];
			else if(this.calcularDistancia(otrosPuntos[i]) == 0) 
				System.out.println(this +" y " +otrosPuntos[i] +" son el mismo punto");
		}
		return pMin;
    }
    
    
    //ALT+SHIFT+S
    //CONSTRUCTORES
    public Ej003Punto() {
    	nPunto = contPunto;
    	contPunto++;
    }
    public Ej003Punto(double x, double y) {
    	nPunto = contPunto;
    	contPunto++;
    	this.x = x;
    	this.y = y;
    }
	
    
    //GETTERS
    public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
    public int getnPunto() {
		return nPunto;
	}
	public static int getContPunto() {
		return contPunto;
	}
	
	
	//SETTERS
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
    public void setnPunto(int nPunto) {
		this.nPunto = nPunto;
	}
	public static void setContPunto(int contPunto) {
		Ej003Punto.contPunto = contPunto;
	}
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Punto " +nPunto +": (" + x + ", " + y + ")";
	}
}