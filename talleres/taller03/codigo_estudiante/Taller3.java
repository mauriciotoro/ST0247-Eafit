import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase en la cual se implementan los metodos del Taller de Clase #3
 * 
 * @author Mauricio Toro, Mateo Agudelo
 */
public class Taller3 {
	
	private static boolean puedoPonerReina(int r, int c, int[] tablero) {
		// complete...
	}
	
	public static int nReinas(int n) {
		// complete...
	}
	
	private static int nReinas(int r, int n, int[] tablero) {
		// complete...
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
	
	public static ArrayList<Integer> camino(Digraph g, int inicio, int fin) {
		// complete...
	}

	// recomendacion
	private static boolean dfs(Digraph g, int nodo, int objetivo, boolean[] visitados, ArrayList<Integer> list) {
		// complete...
	}

}
