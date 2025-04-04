package analisis.ejercicio3;

/**
 * Clase que representa a un titular de una cuenta bancaria.
 */
public class Titular implements Comparable<Titular> {

	private String dni;

	private String nombre;

	private String apellidos;

	private int telf;

	/**
	 * Constructor de la clase titular
	 * 
	 * @param dni       dni del titular
	 * @param nombre    nombre del titular
	 * @param apellidos apellidos del titular
	 * @param telf      teléfono del titular
	 */
	public Titular(String dni, String nombre, String apellidos, int telf) {
		if (dni != null && !dni.isBlank())
			this.dni = dni;

		if (nombre != null && !nombre.isBlank())
			this.nombre = nombre;

		if (apellidos != null && !apellidos.isBlank())
			this.apellidos = apellidos;

		if (telf > 0)
			this.telf = telf;
	}

	/**
	 * Devuelve el teléfono
	 * 
	 * @return teléfono del titular
	 */
	public int getTelf() {
		return telf;
	}

	/**
	 * Modifica el teléfono
	 * 
	 * @param telf el nuevo teléfono
	 */
	public void setTelf(int telf) {
		if (telf > 0)
			this.telf = telf;
	}

	/**
	 * Devuelve el dni
	 * 
	 * @return dni del titular
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Devuelve el nombre
	 * 
	 * @return nombre del titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve los apellidos
	 * 
	 * @return apellidos del titular
	 */
	public String getApellidos() {
		return apellidos;
	}

	@Override
	public String toString() {
		return "Dni: " + dni + "\n Nombre: " + nombre + "\n Apellidos: " + apellidos + "\n Teléfono: " + telf + "\n";
	}

	@Override
	public int compareTo(Titular o) {
		return this.dni.compareToIgnoreCase(o.dni);
	}
}