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

public class Ej003InstalacionElecMain_J {
	public static void main(String[] args) {
		
		Ej003InstalacionElec_J inst = new Ej003InstalacionElec_J();
		
		inst.encenderBombilla();
		inst.encenderPlancha();
		inst.apagarPlancha();
		inst.apagarPlancha();
		System.out.println(inst);
	}
}
