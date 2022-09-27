package ejemplos020_arraylist1;

public class Coche {
	private String color, marca, matricula;
	private int numPuertas;
	
	public Coche(){}	
	public Coche(String color, String marca, String matricula, int numPuertas){
		this.color=color;
		this.marca=marca;
		this.matricula=matricula;
		this.numPuertas=numPuertas;
	}
	
	public String devColor(){
		return color;
	}
	
	public void pintaCoche(String color){
		this.color=color;
	}
	
	public String devMarca(){
		return marca;
	}
	
	public void ponMarca(String marca){
		this.marca = marca;
	}
	
	public String devMatricula(){
		return matricula;
	}
	
	public void ponMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public int devNumPuertas(){
		return numPuertas;
	}
	
	public void ponNumPuertas(int numPuertas){
		this.numPuertas = numPuertas;
	}
	
	public String toString(){
		return "El color del coche es "+color+", la marca es "+marca+", la matricula es "+matricula+
				" y "+numPuertas+" puertas";
	}
}