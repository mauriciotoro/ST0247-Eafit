package Taller44;

import java.util.ArrayList;

/**
 * Implementacion de un grafo dirigido usando matrices de adyacencia
 *
 * @author Mauricio Toro, Mateo Agudelo, <su nombre>
 */
public class DigraphAM extends Digraph {
	
	int[][] matrix;

	public DigraphAM(int size) {
		super(size);
		
		matrix = new int[size][size];
	}

	public void addArc(int source, int destination, int weight) {
	
		matrix[source][destination] = weight;
	}

	public ArrayList<Integer> getSuccessors(int vertex) {
	
		ArrayList<Integer> s = new ArrayList<>();
		for (int i = 0; i < size; ++i)
			if (matrix[vertex][i] != 0)
				s.add(i);
		return s.size() == 0 ? null : s;
	}

	public int getWeight(int source, int destination) {
		
		return matrix[source][destination];
	}

}
