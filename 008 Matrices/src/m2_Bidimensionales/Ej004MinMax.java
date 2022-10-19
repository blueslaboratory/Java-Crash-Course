package m2_Bidimensionales;

public class Ej004MinMax {
	private int mayor;
	private int menor;
	private int filaMayor, colMayor, filaMenor, colMenor;
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej004MinMax() {};
	public Ej004MinMax(int mayor, int menor, int filaMayor, int colMayor, int filaMenor, int colMenor) {
		this.mayor = mayor;
		this.menor = menor;
		this.filaMayor = filaMayor;
		this.colMayor = colMayor;
		this.filaMenor = filaMenor;
		this.colMenor = colMenor;
	}
	
	
	//SETTERS
	public void setMayor(int mayor) {
		this.mayor = mayor;
	}
	public void setMenor(int menor) {
		this.menor = menor;
	}
	public void setFilaMayor(int filaMayor) {
		this.filaMayor = filaMayor;
	}
	public void setColMayor(int colMayor) {
		this.colMayor = colMayor;
	}
	public void setFilaMenor(int filaMenor) {
		this.filaMenor = filaMenor;
	}
	public void setColMenor(int colMenor) {
		this.colMenor = colMenor;
	}
	
	
	//GETTERS
	public int getMayor() {
		return mayor;
	}
	public int getMenor() {
		return menor;
	}
	public int getFilaMayor() {
		return filaMayor;
	}
	public int getColMayor() {
		return colMayor;
	}
	public int getFilaMenor() {
		return filaMenor;
	}
	public int getColMenor() {
		return colMenor;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "\nElemento Mayor = " +mayor
			  +"\nElemento Menor = " + menor
			  +"\nFila Mayor = " +(filaMayor+1)
			  +"\tColumna Mayor = " +(colMayor+1)
			  +"\nFila Menor = " +(filaMenor+1)
			  +"\tColumna Menor = " +(colMenor+1)
			  ;
	}
}
