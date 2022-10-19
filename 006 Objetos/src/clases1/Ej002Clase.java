package clases1;

public class Ej002Clase {
	int p1,p2; 
	
	public Ej002Clase(int i, int j){ 
		p1=i; 
		p2=j; 
	}
	
	public int modificar(int i){ 
		p1=p1+i; 
		p2=p2+i; 
		
		System.out.println(p2 +" = p2"); 
		
		return p1; 
	} 


}
