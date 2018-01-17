import java.util.Arrays;

/**
 * Prueba la implementacion de los metodos en la clase Taller6.
 * 
 * Ejecute esta clase para hacerse una idea de si su implementacion de los
 * ejercicios propuestos en el Taller de Clase #6 son correctos.
 * 
 * @author Mateo Agudelo
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("Cambio monedas greedy -> " + convert(testMonedas()));
		System.out.println("Recorrido greedy -> " + convert(testRecorrido()));
	}

	static boolean testMonedas() {
		if (!Arrays.equals(Taller6.cambioGreedy(400, new int[] { 500, 300, 200, 50 }), new int[] { 0, 1, 0, 2 }))
			return false;

		if (!Arrays.equals(Taller6.cambioGreedy(600, new int[] { 500, 300, 200, 50 }), new int[] { 1, 0, 0, 2 }))
			return false;

		if (!Arrays.equals(Taller6.cambioGreedy(900, new int[] { 500, 300, 200, 50 }), new int[] { 1, 1, 0, 2 }))
			return false;

		if (!Arrays.equals(Taller6.cambioGreedy(1400, new int[] { 500, 300, 200, 50 }), new int[] { 2, 1, 0, 2 }))
			return false;

		if (!Arrays.equals(Taller6.cambioGreedy(1600, new int[] { 500, 300, 200, 50 }), new int[] { 3, 0, 0, 2 }))
			return false;

		if (Taller6.cambioGreedy(1, new int[] { 5, 3 }) != null)
			return false;

		if (Taller6.cambioGreedy(2, new int[] { 5, 3 }) != null)
			return false;

		if (Taller6.cambioGreedy(11, new int[] { 8, 5 }) != null)
			return false;

		if (Taller6.cambioGreedy(12, new int[] { 10, 5 }) != null)
			return false;

		if (Taller6.cambioGreedy(13, new int[] { 10, 5 }) != null)
			return false;

		return true;
	}

	static boolean testRecorrido() {
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
		if (Taller6.recorrido(g1) != 12)
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
		if (Taller6.recorrido(g2) != 80)
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
		if (Taller6.recorrido(g3) != 26)
			return false;

		return true;
	}

	static String convert(boolean b) {
		return b ? "correcta" : "incorrecta";
	}

}
