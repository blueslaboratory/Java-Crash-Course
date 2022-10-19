package m2_Bidimensionales;

public class Ej002Pos {
	private int i=0;
	private int j=0;
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej002Pos(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	
	//SETTERS
	public void setI(int i) {
		this.i = i;
	}
	public void setJ(int j) {
		this.j = j;
	}	

	
	//GETTERS
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}
	
	
	//toString
	public String toString() {
		return "\nFila: " +i +" Columna: " +j;
	}
}