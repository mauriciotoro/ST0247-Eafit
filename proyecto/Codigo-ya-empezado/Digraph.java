package ruteovehiculoselectricos;
import java.util.ArrayList;

/**
 * Clase abstracta para la implementacion de grafos dirigidos
 *
 * @author Mauricio Toro, Mateo Agudelo
 */
public abstract class Digraph {
	protected int size;
        protected double speed;
	public Digraph(int vertices) {
		size = vertices;
	}

	public abstract void addArc(int source, int destination, double weight);

	public abstract ArrayList<Integer> getSuccessors(int vertex);

	public abstract double getWeight(int source, int destination);
	public int size() {
		return size;
	}
}
