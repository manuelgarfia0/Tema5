package analisis.ejercicio3;

/**
 * Clase que representa a un titular de una cuenta bancaria.
 */
public class Titular {
	private String dni;
	private String nombre;
	private String apellidos;
	private String telefono;

	/**
	 * Constructor para la clase Titular.
	 *
	 * @param dni       DNI del titular.
	 * @param nombre    Nombre del titular.
	 * @param apellidos Apellidos del titular.
	 * @param telefono  Teléfono del titular.
	 */
	public Titular(String dni, String nombre, String apellidos, String telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

	/**
	 * Obtiene el DNI del titular.
	 *
	 * @return DNI del titular.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Establece un nuevo DNI para el titular.
	 *
	 * @param dni Nuevo DNI del titular.
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Obtiene el nombre del titular.
	 *
	 * @return Nombre del titular.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece un nuevo nombre para el titular.
	 *
	 * @param nombre Nuevo nombre del titular.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene los apellidos del titular.
	 *
	 * @return Apellidos del titular.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Establece nuevos apellidos para el titular.
	 *
	 * @param apellidos Nuevos apellidos del titular.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Obtiene el teléfono del titular.
	 *
	 * @return Teléfono del titular.
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Establece un nuevo teléfono para el titular.
	 *
	 * @param telefono Nuevo teléfono del titular.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
