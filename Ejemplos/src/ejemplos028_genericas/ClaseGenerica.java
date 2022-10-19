package ejemplos028_genericas;

public class ClaseGenerica<T> {
	T obj;

	
	//CONSTRUCTOR
	public ClaseGenerica(T o) {
		obj = o;
	}
	
	
	//SETTERS Y GETTERS
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}

	
	public void classType() {
		System.out.println("El tipo de T es " + obj.getClass().getName());
	}

	
	//TOSTRING
	@Override
	public String toString() {
		return "ClaseGenerica1 [obj=" + obj + ", getObj()=" + getObj() + "]";
	}

}