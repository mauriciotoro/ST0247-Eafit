import java.util.ArrayList;
import java.util.Arrays;

/**
 * Prueba la implementacion de los metodos en la clase Taller3.
 * 
 * Ejecute esta clase para hacerse una idea de si su implementacion de los
 * ejercicios propuestos en el Taller de Clase #3 son correctos.
 * 
 * @author Mateo Agudelo
 */
public class Test {
	
	public static void main(String[] args) {
		System.out.println("N-Reinas -> " + convert(testNQueens()));
		System.out.println("Camino backtracking -> " + convert(testCamino()));
	}
	
	static boolean testNQueens() {
		// tomado de
		// https://math.stackexchange.com/questions/1872444/how-many-solutions-are-there-to-an-n-by-n-queens-problem
		int[] soluciones = { -1, 1, 0, 0, 2, 10, 4, 40, 92 };
		for (int i = 1; i <= 8; ++i)
			if (soluciones[i] != Taller3.nReinas(i)) {
				System.out.println(i + " -> " + Taller3.nReinas(i) + " (expected " + soluciones[i] + ")");
				return false;
			}
		return true;
	}

	static boolean testCamino() {
		int[] nodes = { 2, 3, 5, 7, 8, 9, 10, 11 };
		int n = nodes.length;
		DigraphAL g = new DigraphAL(12);
		g.addArc(7, 11, 1);
		g.addArc(7, 8, 1);
		g.addArc(5, 11, 1);
		g.addArc(3, 8, 1);
		g.addArc(3, 10, 1);
		g.addArc(11, 2, 1);
		g.addArc(11, 9, 1);
		g.addArc(11, 10, 1);
		g.addArc(8, 9, 1);
		int a, b;
		for (int i = 0; i < n; ++i)
			for (int j = 0; j < n; ++j) {
				a = nodes[i];
				b = nodes[j];
				ArrayList<Integer> path = Taller3.camino(g, a, b);
				if (a == 3) {
					if (b == 8) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(3, 8))))
							return false;
					} else if (b == 9) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(3, 8, 9))))
							return false;
					} else if (b == 10) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(3, 10))))
							return false;
					} else {
						if (path != null)
							return false;
					}
				} else if (a == 5) {
					if (b == 2) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(5, 11, 2))))
							return false;
					} else if (b == 9) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(5, 11, 9))))
							return false;
					} else if (b == 10) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(5, 11, 10))))
							return false;
					} else if (b == 11) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(5, 11))))
							return false;
					} else {
						if (path != null)
							return false;
					}
				} else if (a == 7) {
					if (b == 2) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(7, 11, 2))))
							return false;
					} else if (b == 8) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(7, 8))))
							return false;
					} else if (b == 9) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(7, 8, 9)))
								&& !path.equals(new ArrayList<Integer>(Arrays.asList(7, 11, 9))))
							return false;
					} else if (b == 10) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(7, 11, 10))))
							return false;
					} else if (b == 11) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(7, 11))))
							return false;
					} else {
						if (path != null)
							return false;
					}
				} else if (a == 8) {
					if (b == 9) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(8, 9))))
							return false;
					} else {
						if (path != null)
							return false;
					}
				} else if (a == 11) {
					if (b == 2) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(11, 2))))
							return false;
					} else if (b == 9) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(11, 9))))
							return false;
					} else if (b == 10) {
						if (!path.equals(new ArrayList<Integer>(Arrays.asList(11, 10))))
							return false;
					} else {
						if (path != null)
							return false;
					}
				} else {
					if (path != null)
						return false;
				}
			}
		return true;
	}
	
	static String convert(boolean b) {
		return b ? "correcta" : "incorrecta";
	}

}
