package clases1;

public class Ej002Main {
	public static void main(String[] args) {	
		Ej002Clase obj1=new Ej002Clase(5,4); 
		//p1=5
		//p2=4
		System.out.println(obj1.modificar(4)+" "); 
		//p1=9
		//p2=8
		
		Ej002Clase obj2=new Ej002Clase(5,4); 
		//p1=5
		//p2=4
		System.out.println(obj2.modificar(5)+" "); 
		//p1=10
		//p2=9
		
		obj2=obj1;
		//p1=9
		//p2=8
		System.out.println(obj2.modificar(5)+" "); 
		//p1=14
		//p2=13
		
	}
}
