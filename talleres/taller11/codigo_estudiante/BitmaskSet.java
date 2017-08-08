
/**
 * Esta clase permite almacenar de forma eficiente un conjunto de hasta 30
 * enteros. Tenga en cuenta que solo puede almacenar enteros contenidos en [0,
 * size], siendo 30 el valor maximo de size (que es fijo una vez se crea el
 * objeto).
 * 
 * Es un reemplazo eficiente a un Set<Integer> en casos especiales,
 * especialmente para implementar el algoritmo de Held-Karp.
 * 
 * Funciona con una mascara de bits, por lo que ocupa la misma memoria que dos
 * ints (32 bits cada uno): uno para la mascara y otro para llevar cuenta del
 * tamaño.
 * 
 * @author Mateo Agudelo
 *
 */
public class BitmaskSet {
	// members
	private int mask, size;

	// constructors

	/**
	 * Crea un nuevo conjunto vacio con tamanio maximo 30 elementos.
	 */
	public BitmaskSet() {
		this.size = 30;
		this.mask = 0;
	}

	/**
	 * Crea un nuevo conjunto con un tamanio maximo determinado.
	 * 
	 * @param size
	 *            numero maximo de elementos que almacenara este conjunto. Para que
	 *            funcione correctamente este debe estar contenido en [0, 30].
	 */
	public BitmaskSet(int size) {
		this.size = size;
		this.mask = 0;
	}

	/**
	 * Crea una copia del conjunto o.
	 * 
	 * @param o
	 *            conjunto a ser copiado.
	 */
	public BitmaskSet(BitmaskSet o) {
		this.size = o.size();
		this.mask = o.mask();
	}

	// methods
	/**
	 * Determina si el conjunto esta lleno en base al tamanio maximo especificado al
	 * momento de crear el objeto.
	 * 
	 * @return true si el conjunto esta lleno, false de lo contrario.
	 */
	public boolean isFull() {
		return mask == (1 << size) - 1;
	}

	/**
	 * Determina si un elemento esta contenido en el conjunto.
	 * 
	 * @param k
	 *            elemento que buscamos. Para que funcione correctamente este debe
	 *            estar contenido en [0, size].
	 * @return true si k esta contenido en el conjunto, false de lo contrario.
	 */
	public boolean contains(int k) {
		return (mask & (1 << k)) != 0;
	}

	/**
	 * Agrega el elemento k al conjunto.
	 * 
	 * @param k
	 *            elemento a ser agregado al conjunto. Para que funcione
	 *            correctamente este debe estar contenido en [0, size].
	 */
	public void add(int k) {
		mask |= 1 << k;
	}

	// getters

	/**
	 * 
	 * @return entero que representa al conjunto - la mascara de bits
	 */
	public int mask() {
		return mask;
	}

	/**
	 * 
	 * @return tamanio maximo del elementos que almacena este conjunto.
	 */
	public int size() {
		return size;
	}
}
