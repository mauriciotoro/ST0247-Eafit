import java.util.ArrayList;

/**
 * Implementacion de un grafo dirigido usando listas de adyacencia
 *
 * @author Mauricio Toro, Mateo Agudelo, <su nombre>
 */
public class DigraphAL extends Digraph {
	// complete...

	public DigraphAL(int size) {
		super(size);
		// complete...
	}

	public void addArc(int source, int destination, int weight) {
		// complete...
		// recuerde: grafo dirigido!
	}

	public ArrayList<Integer> getSuccessors(int vertex) {
		// complete...
		// recuerde: null si no hay!
	}

	public int getWeight(int source, int destination) {
		// complete...
	}

}
