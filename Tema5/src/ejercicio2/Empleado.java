package ejercicio2;

/**
 * @author manuel.garfia
 */
public class Empleado {

	private String nombre;

	/**
	 * 
	 * @return nombre
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
	 * Método toString
	 * 
	 * @return Cadena de texto para todos los objetos empleados
	 */
	public String toString() {
		return "Empleado: " + this.nombre;
	}

}
