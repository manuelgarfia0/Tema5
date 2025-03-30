package analisis.ejercicio2;

/**
 * Clase que representa una revista en la biblioteca. Hereda de Ficha y añade
 * atributos específicos como número de revista y año de publicación.
 */
public class Revista extends Ficha {
	private int numeroRevista;
	private int añoPublicacion;

	/**
	 * Constructor para la clase Revista.
	 *
	 * @param numeroIdentificacion Número único que identifica la revista.
	 * @param titulo               Título de la revista.
	 * @param numeroRevista        Número específico de la revista.
	 * @param añoPublicacion       Año de publicación de la revista.
	 */
	public Revista(int numeroIdentificacion, String titulo, int numeroRevista, int añoPublicacion) {
		super(numeroIdentificacion, titulo);
		this.numeroRevista = numeroRevista;
		this.añoPublicacion = añoPublicacion;
	}

	/**
	 * Obtiene el número de la revista.
	 *
	 * @return Número de la revista.
	 */
	public int getNumeroRevista() {
		return numeroRevista;
	}

	/**
	 * Establece un nuevo número para la revista.
	 *
	 * @param numeroRevista Nuevo número de la revista.
	 */
	public void setNumeroRevista(int numeroRevista) {
		this.numeroRevista = numeroRevista;
	}

	/**
	 * Obtiene el año de publicación de la revista.
	 *
	 * @return Año de publicación de la revista.
	 */
	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	/**
	 * Establece un nuevo año de publicación para la revista.
	 *
	 * @param añoPublicacion Nuevo año de publicación de la revista.
	 */
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	/**
	 * Devuelve el tiempo de préstamo para las revistas.
	 *
	 * @return Tiempo de préstamo en días (10 días para revistas).
	 */
	@Override
	public int obtenerTiempoPrestamo() {
		return 10;
	}
}
