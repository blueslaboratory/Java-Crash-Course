package ejemplos025_ordenArrayListCoches;

public class Coche implements Comparable<Coche> {
	private String color, marca, matricula;
	private int numPuertas;
	
	
	//OTROS METODOS
	@Override
	public int compareTo(Coche x) {
		//ordenando por marca y despues matricula
		if (marca.compareTo(x.marca)<0)
			return -1;
		else if(marca.compareTo(x.marca)>0)
			return 1;
		else if(matricula.compareTo(x.matricula)<0)
			return -1;
		else if(matricula.compareTo(x.matricula)>0)
			return 1;
		else
			return 0;
		
		//ordenando solo por marca
		//return (marca.compareTo(x.marca));
	}
	
	
	//CONSTRUCTORES
	public Coche(){}
	public Coche(String color, String marca, String matricula, int numPuertas){
		this.color=color;
		this.marca=marca;
		this.matricula=matricula;
		this.numPuertas=numPuertas;
	}
	
	//GETTERS
	public String devColor(){
		return color;
	}
	public String devMarca(){
		return marca;
	}
	public String devMatricula(){
		return matricula;
	}
	public int devNumPuertas(){
		return numPuertas;
	}
	
	//SETTERS
	public void pintaCoche(String color){
		this.color = color;
	}
	public void ponMarca(String marca){
		this.marca = marca;
	}
	public void ponMatricula(String matricula){
		this.matricula = matricula;
	}
	public void ponNumPuertas(int numPuertas){
		this.numPuertas = numPuertas;
	}
	
	
	@Override
	public String toString(){
		return "El color del coche es "+color+", la marca es "+marca+", la matricula es "+matricula+
				" y "+numPuertas+" puertas";
	}
}