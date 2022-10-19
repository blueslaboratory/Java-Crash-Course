package accesoBBDD_Ej003EmpresaSolComplex;

public class Departamento {
	  private int numDep;
	  private String nombreDep;
	  private String localidad;
	    
	  public Departamento(int numDep, String nombreDep, String localidad){
	          this.numDep = numDep;
	          this.nombreDep = nombreDep;
	          this.localidad = localidad;
	  }
	  public Departamento(){}
	    
	  public void setNumDep(int n){
	     numDep = n;
	  }
	  public int getNumDep(){
	     return numDep;
	  }
	  public void setNombreDep(String n){
	     nombreDep = n;
	  }
	  public String getNombreDep(){
	     return nombreDep;
	  }
	  public void setLocalidad(String n){
	    localidad = n;
	  }
	  public String getLocalidad(){
	    return localidad;
	  }
	  public String toString(){
		    return "\n" + String.format("%30s", nombreDep) + "\t " + String.format("%30s", localidad) + "\t" + String.format("%30s", numDep);
	  }
	}

