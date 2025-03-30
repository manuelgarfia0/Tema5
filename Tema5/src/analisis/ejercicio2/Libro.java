package analisis.ejercicio2;

/**
 * Clase que representa un libro en la biblioteca. Hereda de Ficha y añade
 * atributos específicos como autor y editorial.
 */
public class Libro extends Ficha {
	private String autor;
	private String editorial;

	/**
	 * Constructor para la clase Libro.
	 *
	 * @param numeroIdentificacion Número único que identifica el libro.
	 * @param titulo               Título del libro.
	 * @param autor                Autor del libro.
	 * @param editorial            Editorial del libro.
	 */
	public Libro(int numeroIdentificacion, String titulo, String autor, String editorial) {
		super(numeroIdentificacion, titulo);
		this.autor = autor;
		this.editorial = editorial;
	}

	/**
	 * Obtiene el autor del libro.
	 *
	 * @return Autor del libro.
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Establece un nuevo autor para el libro.
	 *
	 * @param autor Nuevo autor del libro.
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Obtiene la editorial del libro.
	 *
	 * @return Editorial del libro.
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * Establece una nueva editorial para el libro.
	 *
	 * @param editorial Nueva editorial del libro.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Devuelve el tiempo de préstamo para los libros.
	 *
	 * @return Tiempo de préstamo en días (15 días para libros).
	 */
	@Override
	public int obtenerTiempoPrestamo() {
		return 15;
	}
}
