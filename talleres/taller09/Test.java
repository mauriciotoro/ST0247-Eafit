
/**
 * Prueba la implementacion de los metodos en la clase Taller9.
 * 
 * Ejecute esta clase para hacerse una idea de si su implementacion de los
 * ejercicios propuestos en el Taller de Clase #9 son correctos.
 * 
 * @author Mateo Agudelo
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("Levenshtein -> " + convert(testLevenshtein()));
	}

	static boolean testLevenshtein() {
		String[] wordlist = { "hash", "quantum", "fever", "bench", "long", "blade", "object", "orphanage", "flophouse",
				"fathead" };
		int[][] answers = { { 0, 6, 5, 4, 4, 4, 6, 7, 7, 5 }, { 6, 0, 7, 6, 6, 6, 7, 7, 8, 7 },
				{ 5, 7, 0, 4, 5, 5, 5, 9, 8, 5 }, { 4, 6, 4, 0, 4, 4, 4, 8, 8, 7 }, { 4, 6, 5, 4, 0, 4, 6, 7, 7, 7 },
				{ 4, 6, 5, 4, 4, 0, 5, 7, 7, 6 }, { 6, 7, 5, 4, 6, 5, 0, 8, 8, 6 }, { 7, 7, 9, 8, 7, 7, 8, 0, 7, 7 },
				{ 7, 8, 8, 8, 7, 7, 8, 7, 0, 7 }, { 5, 7, 5, 7, 7, 6, 6, 7, 7, 0 } };
		int n = wordlist.length;
		for (int i = 0; i < n; ++i)
			for (int j = 1; j < n; ++j)
				if (Taller9.levenshtein(wordlist[i], wordlist[j]) != answers[i][j])
					return false;
		return true;
	}

	static String convert(boolean b) {
		return b ? "correcta" : "incorrecta";
	}
}
