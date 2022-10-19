package relacionable_sol;

//Interface que define relaciones de orden entre objetos.
public interface Relacionable {
	boolean esMayorQue(Object a);
	boolean esMenorQue(Object a);
	boolean esIgualQue(Object a);
}