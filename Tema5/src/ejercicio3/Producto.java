package ejercicio3;

/**
 * @author manuel.garfia
 */
public class Producto {
	private String nombre;
	private double precio;

	/**
	 * 
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

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
	 * 
	 * @return precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * 
	 * @param cantidad
	 * @return precio * cantidad
	 */
	public double calcular(int cantidad) {
		return precio * cantidad;
	}

	/**
	 * Método toString
	 * 
	 * @return Cadena de texto para todos los objetos producto
	 */
	public String toString() {
		return "Nombre: " + nombre + " Precio: " + precio;
	}
}