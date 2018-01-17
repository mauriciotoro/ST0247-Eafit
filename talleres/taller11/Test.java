
/**
 * Prueba la implementacion de los metodos en la clase Taller11.
 * 
 * Ejecute esta clase para hacerse una idea de si su implementacion de los
 * ejercicios propuestos en el Taller de Clase #11 son correctos.
 * 
 * @author Mateo Agudelo
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("Held-Karp -> " + convert(testLevenshtein()));
	}

	static boolean testLevenshtein() {
		DigraphAL g1 = new DigraphAL(5);
		g1.addArc(0, 1, 2);
		g1.addArc(0, 2, 2);
		g1.addArc(0, 3, 1);
		g1.addArc(0, 4, 4);
		g1.addArc(1, 0, 2);
		g1.addArc(1, 2, 3);
		g1.addArc(1, 3, 2);
		g1.addArc(1, 4, 3);
		g1.addArc(2, 0, 2);
		g1.addArc(2, 1, 3);
		g1.addArc(2, 3, 2);
		g1.addArc(2, 4, 2);
		g1.addArc(3, 0, 1);
		g1.addArc(3, 1, 2);
		g1.addArc(3, 2, 2);
		g1.addArc(3, 4, 4);
		g1.addArc(4, 0, 4);
		g1.addArc(4, 1, 3);
		g1.addArc(4, 2, 2);
		g1.addArc(4, 3, 4);
		if (Taller11.heldKarp(g1) != 10)
			return false;

		DigraphAL g2 = new DigraphAL(4);
		g2.addArc(0, 2, 15);
		g2.addArc(2, 0, 15);
		g2.addArc(0, 3, 20);
		g2.addArc(3, 0, 20);
		g2.addArc(0, 1, 10);
		g2.addArc(1, 0, 10);
		g2.addArc(3, 1, 25);
		g2.addArc(1, 3, 25);
		g2.addArc(3, 2, 30);
		g2.addArc(2, 3, 30);
		g2.addArc(1, 2, 35);
		g2.addArc(2, 1, 35);
		g2.addArc(0, 0, 0);
		g2.addArc(1, 1, 0);
		g2.addArc(2, 2, 0);
		g2.addArc(3, 3, 0);
		if (Taller11.heldKarp(g2) != 80)
			return false;

		DigraphAL g3 = new DigraphAL(4);
		g3.addArc(0, 0, 0);
		g3.addArc(0, 1, 7);
		g3.addArc(0, 2, 15);
		g3.addArc(0, 3, 6);
		g3.addArc(1, 0, 2);
		g3.addArc(1, 1, 0);
		g3.addArc(1, 2, 7);
		g3.addArc(1, 3, 3);
		g3.addArc(2, 0, 9);
		g3.addArc(2, 1, 6);
		g3.addArc(2, 2, 0);
		g3.addArc(2, 3, 12);
		g3.addArc(3, 0, 10);
		g3.addArc(3, 1, 4);
		g3.addArc(3, 2, 8);
		g3.addArc(3, 3, 0);
		if (Taller11.heldKarp(g3) != 22)
			return false;

		return true;
	}

	static String convert(boolean b) {
		return b ? "correcta" : "incorrecta";
	}
}
