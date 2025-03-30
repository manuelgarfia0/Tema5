package analisis.ejercicio2;

/**
 * Clase abstracta que representa una ficha en la biblioteca. Contiene atributos
 * comunes como el número de identificación y el título.
 */
public abstract class Ficha {
	private int numeroIdentificacion;
	private String titulo;

	/**
	 * Constructor para la clase Ficha.
	 *
	 * @param numeroIdentificacion Número único que identifica la ficha.
	 * @param titulo               Título del objeto en la biblioteca.
	 */
	public Ficha(int numeroIdentificacion, String titulo) {
		this.numeroIdentificacion = numeroIdentificacion;
		this.titulo = titulo;
	}

	/**
	 * Obtiene el número de identificación de la ficha.
	 *
	 * @return Número de identificación de la ficha.
	 */
	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * Establece un nuevo número de identificación para la ficha.
	 *
	 * @param numeroIdentificacion Número de identificación nuevo.
	 */
	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	/**
	 * Obtiene el título de la ficha.
	 *
	 * @return Título de la ficha.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Establece un nuevo título para la ficha.
	 *
	 * @param titulo Nuevo título de la ficha.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Método abstracto que devuelve el tiempo de préstamo del objeto.
	 *
	 * @return Tiempo de préstamo en días.
	 */
	public abstract int obtenerTiempoPrestamo();
}
