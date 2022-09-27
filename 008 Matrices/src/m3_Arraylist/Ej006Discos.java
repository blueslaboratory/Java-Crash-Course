/*
6.- Ejercicio para guardar informacion sobre cantantes famosos. Crearemos 
una clase denominada ListaCantantes que disponga de un atributo de tipo 
ArrayList para guardar cantantes. La clase debe tener un metodo que permita 
anadir objetos de tipo CantanteFamoso  en la lista, otro metodo para eliminar 
un cantante y dos metodos para mostrar el disco mas vendido de cada cantante 
y todos los discos de cada cantante (todo son opciones del menu que se 
muestra mas abajo).

Cada objeto de tipo CantanteFamoso tendra como atributos:

•	nombre (String)
•	discos (lista con los discos)
•	y los metodos para obtener y establecer los atributos.

En el atributo discos, se guardara un listado de todos los discos editados 
por el cantante. Para cada uno de los discos se dispondra de su titulo y el 
numero de ejemplares vendidos.

Crea una clase principal que muestre un menu, con las siguientes opciones:
1. Introducir nuevo Cantante.
2. Borrar cantante.
3. Mostrar disco mas vendido de cada cantante.
4. Mostrar los cantantes y sus discos.
5. Salir.

Elija opcion:
*/

package m3_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Ej006Discos {
	
	private ArrayList <String[]> discos;
	private String[] datosDisco = new String[2];
	
	
	//OTROS METODOS
	public void add(String disco[]) {
		if(disco.length == 2)
			discos.add(disco);
		else
			System.out.println("El disco solo puede tener 2 parametros");
	}
	public String[] getDiscoPos(int index) {
		return discos.get(index);
	}
	public String printDiscos() {
		//source: stackoverflow
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<discos.size(); i++) {
			sb.append("\n\tDisco " +(i+1) +"\n"
					+ "\t" +Arrays.toString(discos.get(i)));
		}
		sb.append("\n");
		
		return sb.toString();
	}
	public void printDiscos2() {
		for(int i=0; i<discos.size(); i++) {
			System.out.println("\tDisco " +(i+1));
			System.out.println("\t" +Arrays.toString(discos.get(i)));
			//te imprime el address si haces:
			//System.out.println("\t" +getDiscoPos(i));
			//System.out.println("\t" +discos.get(i));
		}
	}
	public void discoFamoso(int index) {
		
		
		/*
		ArrayList <String[]> discos;
		String datosDisco[] = new String[3];
		String discoFamoso[] = new String[3];
		int nDiscos, d0;
		
		discos = listaCantantes.get(index).getDiscosObj().getDiscos();
		datosDisco = listaCantantes.get(index).getDiscosObj().getDatosDisco();
		discoFamoso = listaCantantes.get(index).getDiscosObj().getDiscoPos(0);
		nDiscos = listaCantantes.get(index).getDiscosObj().getDiscos().size();
		
		d0 = Integer.parseInt(discoFamoso[2]);
		
		
		for(int i=0; i<discos.size(); i++) {
			
			if(Integer.parseInt(discoFamoso[i]) > d0) {
				discoFamoso = listaCantantes.get(index).getDiscosObj().getDiscoPos(i);
				d0 = Integer.parseInt(discoFamoso[i]);
			}
		}
		
		System.out.println(discoFamoso);
		*/
	}
	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej006Discos() {
		discos = new ArrayList <String[]>();
	}
	
	
	//GETTERS
	public ArrayList<String[]> getDiscos() {
		return discos;
	}
	public String[] getDatosDisco() {
		return datosDisco;
	}
	
	
	//SETTERS
	public void setDiscos(ArrayList<String[]> discos) {
		this.discos = discos;
	}
	public void setDatosDisco(String[] datosDisco) {
		this.datosDisco = datosDisco;
	}
	
	
	//TOSTRING
	@Override
	public String toString() {
		
		return "\n\tNumero de discos: " + discos.size()
				+printDiscos();
		
		/*
		// da direcciones de memoria, he tenido que hacer un stringBuilder
		System.out.println("\tNumero de discos: " + discos.size());
		return "\n\tNumero de discos: " + discos.size() 
		   //+ "\n\tDatos Disco: " + discos.get();
		   //+ Arrays.toString(datosDisco);
		}
		*/
	}
}
