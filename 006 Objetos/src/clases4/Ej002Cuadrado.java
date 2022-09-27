/*
2.-  Implementa una clase en Java que permita representar cuadrados. 
Cada objeto Cuadrado vendra representado por sus cuatro vertices, 
que seran los atributos de la clase. Ademas de los metodos para modificar 
y devolver los valores de los vertices, se piden los siguientes metodos:

Cada cuadrado tendra un metodo (dibujar) para representarse por medio de 
asteriscos. Por ejemplo, el cuadrado con vertices (0, 0) (0, 10) (10, 10) 
y (10, 0) se representaria:

* * * * * * * * * * 
*                 * 
*                 * 
*                 * 
*                 * 
*                 * 
*                 * 
*                 * 
*                 * 
* * * * * * * * * * 



Tambien queremos un metodo (dibRellenando) que represente el cuadrado 
relleno de asteriscos.
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 




Otro metodo (dibujarVertices) para escribir los 4 vertices del cuadrado 
de la forma siguiente para el ejemplo anterior:
(0, 10)                    (10, 10)
                    
                    
                    
                    
                    
                    
                    
                    
(0, 0)                    (10, 0)


Un metodo (esCuadrado) que devuelva true si se trata de los vertices 
de un cuadrado y false si no lo es.

La distancia entre dos puntos P1: (x1, y1) y P2: (x2, y2) viene dada 
por la formula:

D = SQROOT((X1-X2)^2+(Y1-Y2)^2) 

Cada cuadrado tendra un metodo (lado) que devuelve el valor del lado 
del cuadrado creado.

Escribe un metodo (compara) en la clase Cuadrado para poder comparar 
el area de dos cuadrados. Este metodo recibe un cuadrado y lo compara 
con el cuadrado que invoca el metodo, actuando igual que el metodo 
compare de la clase String.

Implementa luego una clase de prueba que permita crear objetos de la 
clase Cuadrado y probar todos sus metodos.

Otro ejemplo:

...


Observa que para dibujar los cuadrados vamos a ignorar la distancia al 
eje de las x y de las y, los pintamos siempre desde el punto P1(x1, y1), 
teniendo unicamente en cuenta la longitud del lado.
*/

package clases4;

public class Ej002Cuadrado {
	private int vx1, vy1; //p1
	private int vx2, vy2; //p2
	private int vx3, vy3; //p3
	private int vx4, vy4; //p4
	
	private static int contCuadrado = 0;
	private int nCuadrado = 0;
	
	
	//METODOS
	/*
	Observa que para dibujar los cuadrados vamos a ignorar la distancia al 
	eje de las x y de las y, los pintamos siempre desde el punto P1(x1, y1), 
	teniendo unicamente en cuenta la longitud del lado.
	*/
	
	public boolean esCuadrado() {
		boolean flag = false;
		double l1, l2, l3, l4;
		
		l1 = Math.sqrt(Math.pow((vx1-vx2), 2) +Math.pow((vy1-vy2), 2)); //p1p2
		l2 = Math.sqrt(Math.pow((vx2-vx3), 2) +Math.pow((vy2-vy3), 2));	//p2p3
		l3 = Math.sqrt(Math.pow((vx3-vx4), 2) +Math.pow((vy3-vy4), 2));	//p3p4
		l4 = Math.sqrt(Math.pow((vx4-vx1), 2) +Math.pow((vy4-vy1), 2));	//p4p1
		
		if(l1==l2 && l2==l3 && l3==l4 && l4==l1)
			flag = true;
		
		return flag;
	}
	
	public int lado() {
		if (esCuadrado()) {
			return (int)Math.sqrt(Math.pow((vx1-vx2), 2) +Math.pow((vy1-vy2), 2));
		}
		else {
			System.out.println("No es un cuadrado.");
			return 0;
		}
	}
	
	public int compara(Ej002Cuadrado cuadrado) {
		if (esCuadrado() && cuadrado.esCuadrado()) {
			int area0, area1;
			
			area0 = lado()*lado();
			area1 = cuadrado.lado()*cuadrado.lado();
			
			return area0-area1;
		}
		else {
			System.out.println("Uno de los objetos no es un cuadrado.");
			return 0;
		}
	}
	
	public void dibujar() {
		if (esCuadrado()) {
			int l = lado();
			String asterisco, base, alturas;
			
			asterisco = "* ";
			base = alturas = "";
			
			for(int i=l; i>=1; i--) {
				base += asterisco;
				
				if(i==l || i==1)
					alturas += asterisco;
				else
					alturas += "  ";
						  //= "* ";
			}
			
			for(int i=1; i<=l; i++) {
				if(i==1 || i==l)
					System.out.println(base);
				else
					System.out.println(alturas);
			}
		}
		else 
			System.out.println("No es un cuadrado.");
		
	}
	
	public void dibRellenando() {
		if (esCuadrado()) {
			int l = lado();
			String asterisco, base;
			
			asterisco = "* ";
			base = "";
			
			for(int i=1; i<=l; i++) 
				base += asterisco;
			
			for(int i=1; i<=l; i++) 
				System.out.println(base);
		}
		else 
			System.out.println("No es un cuadrado.");
	}
	
	public void dibujarVertices() {
		if (esCuadrado()) {
			int l = lado();
			int i,j;
			String espacio, base;
			String v1, v2, v3, v4;
			
			espacio = "  ";
			base = "";
			boolean iBase = true;
			
			
			v1 = "(" +vx1 +", " +vy1 +")";
			v2 = "(" +vx2 +", " +vy2 +")";
			v3 = "(" +vx3 +", " +vy3 +")";
			v4 = "(" +vx4 +", " +vy4 +")";
			
			
			for(i=1; i<=l; i++) 
				base += espacio;
			
			for(i=1; i<=l; i++) {
				for(j=1; j<=l; j++) {
					if(j==1 && i==1)
						System.out.print(v2 +base);
					else if(j==l && i==1) {
						System.out.print(v3 +"\n");
						iBase = false;
					}
					else if(j==1 && i==l)
						System.out.print(v1 +base);
					else if(j==l && i==l) {
						System.out.print(v4);
						iBase = false;
					}
						
				}
				if(iBase)
					System.out.println(base);
				if(!iBase)
					iBase = true;
			}
		}
		else 
			System.out.println("No es un cuadrado.");
	}
	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej002Cuadrado() {
		nCuadrado = contCuadrado;
		contCuadrado++;
	};
	public Ej002Cuadrado(int vx1, int vy1, int vx2, int vy2, int vx3, int vy3, int vx4, int vy4) {
		nCuadrado = contCuadrado;
		contCuadrado++;
		
		this.vx1 = vx1;
		this.vy1 = vy1;
		this.vx2 = vx2;
		this.vy2 = vy2;
		this.vx3 = vx3;
		this.vy3 = vy3;
		this.vx4 = vx4;
		this.vy4 = vy4;
	}
	
	
	//GETTERS
	public int getVx1() {
		return vx1;
	}
	public int getVy1() {
		return vy1;
	}
	public int getVx2() {
		return vx2;
	}
	public int getVy2() {
		return vy2;
	}
	public int getVx3() {
		return vx3;
	}
	public int getVy3() {
		return vy3;
	}
	public int getVx4() {
		return vx4;
	}
	public int getVy4() {
		return vy4;
	}
	public static int getContCuadrado() {
		return contCuadrado;
	}
	public int getnCuadrado() {
		return nCuadrado;
	}
	
	
	//SETTERS
	public void setVx1(int vx1) {
		this.vx1 = vx1;
	}
	public void setVy1(int vy1) {
		this.vy1 = vy1;
	}
	public void setVx2(int vx2) {
		this.vx2 = vx2;
	}
	public void setVy2(int vy2) {
		this.vy2 = vy2;
	}
	public void setVx3(int vx3) {
		this.vx3 = vx3;
	}
	public void setVy3(int vy3) {
		this.vy3 = vy3;
	}
	public void setVx4(int vx4) {
		this.vx4 = vx4;
	}
	public void setVy4(int vy4) {
		this.vy4 = vy4;
	}
	public static void setContCuadrado(int contCuadrado) {
		Ej002Cuadrado.contCuadrado = contCuadrado;
	}
	public void setnCuadrado(int nCuadrado) {
		this.nCuadrado = nCuadrado;
	}
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Cuadrado " +nCuadrado +": "
			  +"(" +vx1 +", " +vy1 +")"
			  +"(" +vx2 +", " +vy2 +")"
			  +"(" +vx3 +", " +vy3 +")"
			  +"(" +vx4 +", " +vy4 +")";
	}
}
