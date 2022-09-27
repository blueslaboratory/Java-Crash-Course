/*
3.- Vamos a escribir un programa para representar el consumo 
de energia de una instalacion electrica. Para ello, se hara 
una clase que representa los aparatos conectados en la instalacion.
Cada aparato tiene un consumo electrico determinado. Al 
encender un aparato electrico, el consumo de energia se 
incrementa en la potencia de dicho aparato. Al apagarlo, 
se disminuye el consumo en dicha potencia.
Inicialmente, los aparatos estan todos apagados.
Ademas, se desea consultar el consumo total de la instalacion.
Haz un programa que declare dos aparatos electricos, una bombilla 
de 150 watios y una plancha de 2000 watios. El programa debera 
imprimir el consumo nada mas crear los objetos. Despues, se enciende 
la bombilla y la plancha, y el programa imprime el consumo. Luego 
se apaga la bombilla, y se vuelve a imprimir el consumo.

Ejemplo de salida:
Inicialmente el consumo electrico es 0.0
Encendemos la bombilla Potencia 150.0
Encendemos la plancha Potencia 2000.0
El consumo electrico es 2150.0
Apagamos la plancha Potencia 2000.0
El consumo electrico es 150.0
*/

package clases4;

public class Ej003InstalacionElec_J {
	static int contInstalacion = 0;
	private int nInstalacion = 0;
	
	private int bombilla;
	private int plancha;
	private float consumo;
	
	//METODOS
	//Bombilla
	public void encenderBombilla() {
		bombilla++;
		consumo += 150;
		System.out.println("El consumo electrico es: " +consumo);
	}
	public void apagarBombilla() {
		if(bombilla>0) {
			bombilla--;
			consumo -= 150;
		}
		else
			System.out.println("Bombillas encendidas: " +bombilla);
		
		System.out.println("El consumo electrico es: " +consumo);
	}
	
	//Plancha
	public void encenderPlancha() {
		plancha++;
		consumo += 2000;
		System.out.println("El consumo electrico es: " +consumo);
	}
	public void apagarPlancha() {
		if(plancha > 0) {
			plancha--;
			consumo -= 2000;
		}
		else
			System.out.println("Planchas encendidas: " +plancha);
		
		System.out.println("El consumo electrico es: " +consumo);
	}
	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej003InstalacionElec_J() {
		nInstalacion = contInstalacion;
		contInstalacion++;
		
		bombilla = 0;
		plancha = 0;
		consumo = 0;
		System.out.println("Inicialmente el consumo es " +consumo);
	}
	public Ej003InstalacionElec_J(int bombilla, int plancha) {
		nInstalacion = contInstalacion;
		contInstalacion++;
		
		this.bombilla = bombilla;
		this.plancha = plancha;
		consumo = 0;
		System.out.println("Inicialmente el consumo es " +consumo);
	}
	
	
	//GETTERS
	public int getBombilla() {
		return bombilla;
	}
	public int getPlancha() {
		return plancha;
	}
	public float getConsumo() {
		return consumo;
	}
	public static int getContInstalacion() {
		return contInstalacion;
	}
	public int getnInstalacion() {
		return nInstalacion;
	}
	
	
	//SETTERS
	public void setBombilla(int bombilla) {
		this.bombilla = bombilla;
	}
	public void setPlancha(int plancha) {
		this.plancha = plancha;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	public static void setContInstalacion(int contInstalacion) {
		Ej003InstalacionElec_J.contInstalacion = contInstalacion;
	}
	public void setnInstalacion(int nInstalacion) {
		this.nInstalacion = nInstalacion;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "\nInstalacion " +nInstalacion +":"
			  +"\nBombillas encendidas: " +bombilla 
			  +"\nPlanchas encendidas: " +plancha
			  +"\nConsumo electrico: " +consumo;
	}
}
