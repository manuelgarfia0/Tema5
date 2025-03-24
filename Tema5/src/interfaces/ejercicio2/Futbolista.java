package interfaces.ejercicio2;

/**
 * En esta clase estamos indicando distintos datos de un futbolista, incluyendo
 * un método equals, toString y compareTo.
 * 
 * @author manuel.garfia
 */
public class Futbolista implements Comparable<Futbolista> {
	/**
	 * Dorsal que lleva el jugador en su camiseta.
	 */
	int numeroCamiseta = 0;
	/**
	 * Nombre del jugador.
	 */
	String nombre = "";
	/**
	 * Edad del jugador.
	 */
	int edad = 0;
	/**
	 * Número de goles que lleva el jugador a lo largo de su carrera.
	 */
	int numeroGoles = 0;

	/**
	 * 
	 * Constructor de futbolista
	 * 
	 * @param numeroCamiseta Dorsal que porta el jugador en su camiseta.
	 * @param nombre         Nombre del jugador.
	 * @param edad           Edad del jugador.
	 * @param numeroGoles    Número de goles que lleva el jugador a lo largo de su
	 *                       carrera.
	 */
	public Futbolista(int numeroCamiseta, String nombre, int edad, int numeroGoles) {
		if (numeroCamiseta > 0) {
			this.numeroCamiseta = numeroCamiseta;
		}
		if (nombre != null || !nombre.isEmpty() || !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
		if (numeroGoles >= 0) {
			this.numeroGoles = numeroGoles;
		}

	}

	/**
	 * 
	 * @return
	 */
	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	/**
	 * 
	 * @param numeroCamiseta
	 */
	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * 
	 * @return
	 */
	public int getNumeroGoles() {
		return numeroGoles;
	}

	/**
	 * 
	 * @param numeroGoles
	 */
	public void setNumeroGoles(int numeroGoles) {
		this.numeroGoles = numeroGoles;
	}

	/**
	 * Método equals
	 * 
	 * @param res
	 * @return Boolean que devuelve false si el nombre y el dorsal de dos jugadores
	 *         no coinciden, devolverá true si algún jugador coincide su nombre y
	 *         dorsal con el de otro.
	 */
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		Futbolista otroFutbolista = (Futbolista) obj;
		if (this.nombre.equals(otroFutbolista.nombre) && this.numeroCamiseta == otroFutbolista.numeroCamiseta) {
			res = true;
		}
		return res;
	}

	/**
	 * Método toString
	 * 
	 * @return Cadena de texto con la información del jugador
	 */
	@Override
	public String toString() {
		return this.nombre + "--> Edad: " + this.edad + ", Dorsal: " + this.numeroCamiseta + ", Goles: " + numeroGoles;
	}

	/**
	 * 
	 */
	@Override
	public int compareTo(Futbolista f) {
		int res = 0;

		return res;
	}

}
