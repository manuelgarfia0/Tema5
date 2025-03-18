package ejercicio5;

/**
 * @author manuel.garfia
 */
public abstract class Polígono {
	/**
	 * Atributo para el número de lados del polígono
	 */
	int numeroLados = 1;

	/**
	 * Método abstracto para el área del polígono
	 * 
	 * @return
	 */
	public abstract double área();

	/**
	 * Constructor de Polígono con sus parametros
	 * 
	 * @param numeroLados
	 */
	public Polígono(int numeroLados) {
		if (numeroLados > 0) {
			this.numeroLados = numeroLados;
		}
	}

	/**
	 * Método get para el número de lados
	 * 
	 * @return número de lados del polígono
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Método toString que devuelve una cadena
	 */
	@Override
	public String toString() {
		return "Polígono: Número de lados = " + numeroLados;
	}
}
