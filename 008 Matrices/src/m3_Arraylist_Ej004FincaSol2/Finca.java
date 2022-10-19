package m3_Arraylist_Ej004FincaSol2;
public class Finca {
	private String nombre;
	private int metros;
	private Casa casa;
	private Parcela parcela;
	
	public Finca (String _nombre, Casa _miCasa, Parcela _miParcela){// ya no recibe los metros, lo calcula dentro
		nombre = _nombre;
		metros = _miCasa.getMetros() + _miParcela.getMetros();
		casa = _miCasa;
		parcela = _miParcela;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Casa getCasa() {
		return casa;
	}
	
	public Parcela getParcela() {
		return parcela;
	}
	
	public void setNombre(String _nombre) {
		nombre = _nombre;
	}
	
	public void setParcela(Parcela _parcela) {
		parcela = _parcela;
	}
	
	public String toString() {
		String aux;
		
		aux = "> FINCA\n";
		aux += "Nombre: " + nombre;
		aux += " *** Metros: " + metros;
		
		return aux + "\n" + casa + "\n" + parcela ;
	}
}