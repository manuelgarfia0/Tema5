package analisis.ejercicio2;

/**
 * Clase que representa un DVD en la biblioteca. Hereda de Ficha y añade
 * atributos específicos como director, año y tipo de DVD.
 */
public class DVD extends Ficha {
	private String director;
	private int año;
	private String tipo; // Puede ser: "película", "documental" o "serie"

	/**
	 * Constructor para la clase DVD.
	 *
	 * @param numeroIdentificacion Número único que identifica el DVD.
	 * @param titulo               Título del DVD.
	 * @param director             Director del DVD.
	 * @param año                  Año de lanzamiento del DVD.
	 * @param tipo                 Tipo de DVD ("película", "documental", "serie").
	 */
	public DVD(int numeroIdentificacion, String titulo, String director, int año, String tipo) {
		super(numeroIdentificacion, titulo);
		this.director = director;
		this.año = año;
		this.tipo = tipo;
	}

	/**
	 * Obtiene el director del DVD.
	 *
	 * @return Director del DVD.
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * Establece un nuevo director para el DVD.
	 *
	 * @param director Nuevo director del DVD.
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * Obtiene el año de lanzamiento del DVD.
	 *
	 * @return Año de lanzamiento del DVD.
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Establece un nuevo año para el DVD.
	 *
	 * @param año Nuevo año de lanzamiento del DVD.
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * Obtiene el tipo del DVD.
	 *
	 * @return Tipo del DVD ("película", "documental", "serie").
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Establece un nuevo tipo para el DVD.
	 *
	 * @param tipo Nuevo tipo del DVD.
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Devuelve el tiempo de préstamo para los DVDs.
	 *
	 * @return Tiempo de préstamo en días (5 días para DVDs).
	 */
	@Override
	public int obtenerTiempoPrestamo() {
		return 5;
	}
}
