import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase en la cual se implementan los metodos del Taller 3
 * 
 * @author Mauricio Toro, Camilo Paez
 */
public class Taller3 {
	
	/**
	* Metodo que verifica si es posible poner la reina en la posicion (r,c)
	* dado un tablero
	* 
	* @param  r fila
	* @param  c columna
	* @param  tablero el tablero
	* @return true si es posible, false de lo contrario
	*/	
	private static boolean puedoPonerReina(int r, int c, int[] tablero) {
		
	}
	
	/**
	* Metodo auxiliar para llamar el metodo posterior
	* 
	* @param  n numero de reinas
	* @return numero de soluciones
	*/	
	public static int nReinas(int n) {
		
	}

	/**
	* Metodo devuelve el numero de soluciones que tiene el problema
	* 
	* @param  r fila
	* @param  n numero de reinas
	* @return numero de soluciones
	*/	
	private static int nReinas(int r, int n, int[] tablero) {
	
	}
	
	public static void imprimirTablero(int[] tablero) {
		int n = tablero.length;
		System.out.print("    ");
		for (int i = 0; i < n; ++i)
			System.out.print(i + " ");
		System.out.println("\n");
		for (int i = 0; i < n; ++i) {
			System.out.print(i + "   ");
			for (int j = 0; j < n; ++j)
				System.out.print((tablero[i] == j ? "Q" : "#") + " ");
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	* Metodo que recorre un grafo por dfs
	* 
	* @param  g grafo ya implementado
	* @param  inicio nodo inicial
	* @param  fin nodo final
	* @return una lista con el camino encontrado
	*/	
	public static ArrayList<Integer> camino(Digraph g, int inicio, int fin) {
	
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
	private static ArrayList dfs(Digraph g, int nodo, int objetivo, boolean[] visitados, ArrayList<Integer> list) {
		
	}

}
