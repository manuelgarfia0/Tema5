package analisis.ejercicio4;

/**
 * @author manuel.garfia
 */
public class Persona extends Contacto {
	private String cumpleanos;

	/**
	 * Constructor para inicializar una persona con nombre, teléfono y cumpleaños.
	 * 
	 * @param nombre     El nombre de la persona.
	 * @param telefono   El teléfono de la persona.
	 * @param cumpleanos El cumpleaños de la persona.
	 */
	public Persona(String nombre, String telefono, String cumpleanos) {
		super(nombre, telefono);
		this.cumpleanos = cumpleanos;
	}

	/**
	 * Obtiene el cumpleaños de la persona.
	 * 
	 * @return El cumpleaños de la persona.
	 */
	public String getCumpleanos() {
		return cumpleanos;
	}

	/**
	 * Modifica el cumpleaños de la persona.
	 * 
	 * @param cumpleanos El nuevo cumpleaños de la persona.
	 */
	public void setCumpleanos(String cumpleanos) {
		this.cumpleanos = cumpleanos;
	}

	/**
	 * Devuelve una representación en texto de la persona.
	 * 
	 * @return Cadena de texto con los datos de la persona.
	 */
	@Override
	public String toString() {
		return super.toString() + ", Cumpleaños: " + cumpleanos;
	}
}