package m3_Arraylist_Ej004FincaSol2;
public class Casa {
	private int metros;
	private int plantas;
	private int habitaciones;
	
	public Casa (int _metros,int _plantas, int _habitaciones) {
		metros = _metros;
		plantas = _plantas;
		habitaciones = _habitaciones;		
	}
	
	public int getMetros() {
		return metros;
	}
	
	public int getPlantas() {
		return plantas;
	}
	
	public int getHabitaciones() {
		return habitaciones;
	}
	
	public void setMetros(int _metros) {
		metros = _metros;
	}
	
	public void setPlantas(int _plantas) {
		plantas = _plantas;
	}
	
	public void setHabitaciones(int _habitaciones) {
		habitaciones = _habitaciones;
	}
	
	public String toString() {
		String aux;
		
		aux = "> CASA\n";
		aux += "Metros cuadrados: "+metros;
		aux += " *** Número de plantas: "+plantas;
		aux += " *** Número de habitaciones: "+habitaciones;
		
		return aux;
	}
}