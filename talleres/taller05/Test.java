
/**
 * Prueba la implementacion de los metodos en la clase Taller5.
 * 
 * Ejecute esta clase para hacerse una idea de si su implementacion de los
 * ejercicios propuestos en el Taller de Clase #5 son correctos.
 * 
 * @author Mateo Agudelo
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("M Coloring -> " + convert(testMColoring()));
	}
	
	static boolean testMColoring() {
		DigraphAL g = new DigraphAL(10);
		add(g, 0, 1);
		add(g, 0, 2);
		add(g, 0, 5);
		add(g, 2, 3);
		add(g, 2, 8);
		add(g, 8, 6);
		add(g, 8, 9);
		add(g, 9, 7);
		add(g, 9, 5);
		add(g, 5, 4);
		add(g, 3, 4);
		add(g, 3, 7);
		add(g, 4, 6);
		add(g, 1, 6);
		add(g, 1, 7);
		if (Taller5.mColoring(g, 3) != true)
			return false;
		return true;
	}
	
	static void add(Digraph g, int a, int b) {
		g.addArc(a, b, 1);
		g.addArc(b, a, 1);
	}
	
	static String convert(boolean b) {
		return b ? "correcta" : "incorrecta";
	}

}
