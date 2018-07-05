import java.util.concurrent.ThreadLocalRandom;

/**
 * Prueba la implementacion de los metodos en la clase Taller8.
 * 
 * Ejecute esta clase para hacerse una idea de si su implementacion de los
 * ejercicios propuestos en el Taller de Clase #8 son correctos.
 * 
 * @author Mateo Agudelo
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("Mergesort -> " + convert(testMergesort()));
		System.out.println("Quicksort -> " + convert(testQuicksort()));
	}

	static boolean testMergesort() {
		int[] t = { 110, 10, 1, 4, 60, 1 };
		Taller8.mergesort(t);
		if (!isSorted(t))
			return false;
		for (int i = 0; i < 100; ++i) {
			int n = ThreadLocalRandom.current().nextInt(1000, 1500);
			int[] a = randomIntArray(n);
			Taller8.mergesort(a);
			if (!isSorted(a))
				return false;
		}
		return true;
	}

	static boolean testQuicksort() {
		int[] t = { 110, 10, 1, 4, 60, 1 };
		Taller8.quicksort(t);
		if (!isSorted(t))
			return false;
		for (int i = 0; i < 100; ++i) {
			int n = ThreadLocalRandom.current().nextInt(1000, 1500);
			int[] a = randomIntArray(n);
			Taller8.quicksort(a);
			if (!isSorted(a))
				return false;
		}
		return true;
	}

	static int[] randomIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
		return a;
	}

	static boolean isSorted(int[] a) {
		for (int i = 1; i < a.length; ++i)
			if (a[i] < a[i - 1])
				return false;
		return true;
	}

	static String convert(boolean b) {
		return b ? "correcta" : "incorrecta";
	}

}
