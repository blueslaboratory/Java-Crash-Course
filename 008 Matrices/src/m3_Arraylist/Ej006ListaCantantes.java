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
import java.util.*;


public class Ej006ListaCantantes {

	private ArrayList <Ej006CantanteFamoso> listaCantantes;

	//OTROS METODOS
	
	public void add(Ej006CantanteFamoso c) {
		listaCantantes.add(c);
	}
	public void remove(int index) {
		listaCantantes.remove(index);
	}
	public void todosDiscos(int index) {
		System.out.println(listaCantantes.get(index).getDiscosObj());
	}
	public void discoFamoso(int index) {
		ArrayList <String[]> discos;
		//String datosDisco[] = new String[2];
		String discoFamoso[] = new String[2];
		int nDiscos, d0;
		
		discos = listaCantantes.get(index).getDiscosObj().getDiscos();
		//datosDisco = listaCantantes.get(index).getDiscosObj().getDatosDisco();
		discoFamoso = listaCantantes.get(index).getDiscosObj().getDiscoPos(0);
		nDiscos = listaCantantes.get(index).getDiscosObj().getDiscos().size();
		
		d0 = Integer.parseInt(discoFamoso[1]);
		
		
		for(int i=0; i<discos.size(); i++) {
			discoFamoso = listaCantantes.get(index).getDiscosObj().getDiscoPos(i);
			if(Integer.parseInt(discoFamoso[1]) > d0) {
				discoFamoso = listaCantantes.get(index).getDiscosObj().getDiscoPos(i);
				d0 = Integer.parseInt(discoFamoso[1]);
			}
		}
		
		System.out.println("Cantante: " +listaCantantes.get(index).getArtista());
		System.out.println("Disco mas vendido: " +Arrays.toString(discoFamoso));
	}
	public void print() {
		System.out.println(listaCantantes);
	}
	
	
	//ALT+SHIFT+S
	//CONSTRUCTOR
	public Ej006ListaCantantes() {
		listaCantantes = new ArrayList <Ej006CantanteFamoso>();
	}
	
	//GETTERS
	public ArrayList<Ej006CantanteFamoso> getListaCantantes() {
		return listaCantantes;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return "\nLista Cantantes:" + listaCantantes;
	}

	
}
