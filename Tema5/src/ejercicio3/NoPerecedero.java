package ejercicio3;

/**
 * @author manuel.garfia
 */
public class NoPerecedero extends Producto {

	private String tipo;

	/**
	 * 
	 * @param nombre
	 * @param precio
	 * @param tipo
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	/**
	 * 
	 * @return tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Método calcular
	 * 
	 * @return precio * cantidad
	 */
	public double calcular(int cantidad) {
		return super.calcular(cantidad);
	}

	/**
	 * Método toString
	 * 
	 * @return Cadena de texto para todos los objetos producto
	 */
	public String toString() {
		return super.toString() + " Tipo: " + tipo;
	}
}