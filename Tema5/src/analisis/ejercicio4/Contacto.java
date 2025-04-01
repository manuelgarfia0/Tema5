package analisis.ejercicio4;

/**
 * @author manuel.garfia
 */
public abstract class Contacto {
	protected String nombre;
	protected String telefono;

	/**
	 * Constructor para inicializar un contacto con nombre y teléfono.
	 * 
	 * @param nombre   El nombre del contacto.
	 * @param telefono El teléfono del contacto.
	 */
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	/**
	 * Obtiene el nombre del contacto.
	 * 
	 * @return El nombre del contacto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre del contacto.
	 * 
	 * @param nombre El nuevo nombre del contacto.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el teléfono del contacto.
	 * 
	 * @return El teléfono del contacto.
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Modifica el teléfono del contacto.
	 * 
	 * @param telefono El nuevo teléfono del contacto.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Compara si dos contactos son iguales según sus nombres.
	 * 
	 * @param obj El objeto a comparar.
	 * @return true si los nombres son iguales; false en caso contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Contacto contacto = (Contacto) obj;
		return nombre.equals(contacto.nombre);
	}

	/**
	 * Devuelve una representación en texto del contacto.
	 * 
	 * @return Cadena de texto con los datos del contacto.
	 */
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Teléfono: " + telefono;
	}
}