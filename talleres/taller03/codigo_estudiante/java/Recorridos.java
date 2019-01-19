import java.util.ArrayList;

/**
 * Clase que contiene los recorridos en profundidad (DFS) y anchura (BFS) para
 * la clase Digraph
 * 
 * @author Camilo Paez
 */
public class Recorridos {

	/**
	* Metodo que recorre un grafo por dfs
	* 
	* @param  g grafo ya implementado
	* @param  inicio numero de reinas
	* @param  fin numero de reinas
	* @return una lista con el camino encontrado
	*/	
	public static ArrayList<Integer> dfs(Digraph g, int start) {
		
	}

	/**
	* Metodo que implemeta un recorrido de un grafo por profundidad (dfs)
	* 
	* @param  g grafo ya implementado
	* @param  nodo nodo desde el cual se empezara hacer la busqueda
	* @param  objetivo hasta donde se quiere llegar
	* @param  visitados representa los nodos que ya se verificaron
	* @param  list la lista con el camino encontrados
	* @return  una lista con el camino
	*/	
	private static ArrayList dfs(Digraph g, int nodo, boolean[] visitados, ArrayList<Integer> list) {
	
	}

	public static ArrayList<Integer> bfs(Digraph g, int start) {
		// complete...
		// recuerde: null para nodos aislados!
	}

	public static boolean hayCaminoDFS(Digraph g, int i, int j) {
		// complete...
	}

	public static boolean hayCaminoBFS(Digraph g, int i, int j) {
		// complete...
	}

}
