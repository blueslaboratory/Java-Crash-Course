package m3_Arraylist_Ej004FincaSol2;
public class Parcela {
	private int metros;
	private String tipoExplotacion;
	
	public Parcela (int _metros, int _tipoExplotacion) {
		metros = _metros;
		switch (_tipoExplotacion) {
		case 1:	tipoExplotacion = "Agrícola";
				break;
		case 2:	tipoExplotacion = "Ganadera";
				break;
		case 3:tipoExplotacion = "Agrícola y Ganadera";
				break;
		}	
	}	
	
	public int getMetros() {
		return metros;
	}
	
	public String getTipoExplotacion() {
		return tipoExplotacion;
	}
	
	public void setMetros(int _metros) {
		metros = _metros;
	}
	
	public void setTipoExplotacion(String _tipoExplotacion) {
		tipoExplotacion = _tipoExplotacion;
	}
	public String toString() {
		String aux;
		
		aux = "> PARCELA\n";
		aux += "Metros cuadrados: "+metros;
		aux += " *** Tipo de explotación: "+tipoExplotacion;
		
		return aux;
	}
}