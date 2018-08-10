import java.util.ArrayList;

/**
 * Clase en la cual se implementan los metodos del Taller de Clase #4
 * 
 * @author Mauricio Toro, Mateo Agudelo
 */
public class Taller4 {

    public static boolean hayCaminoDFS(Digraph g, int v, int w) {
        boolean[] visitados = new boolean[g.size()];
        return hayCaminoBFS(g, v, w, visitados);
    }

    private static boolean hayCaminoDFS(Digraph g, int v, int w, boolean[] visitados) {
       		// complete...
    }

	public static int costoMinimo(Digraph g, int inicio, int fin) {
		// complete...
	}

	public static int recorrido(Digraph g) {
		// complete...
	}

	// recomendacion
	private static int recorrido(Digraph g, int v, int[] unvisited) {
		// complete...
	}

	// recomendacion
	private static void dfs(Digraph g, int v, int[] costo) {
		// complete...
	}

}
