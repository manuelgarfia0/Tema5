package ejercicio3;

/**
 * @author manuel.garfia
 */
public class Perecedero extends Producto {
	private int diasCaducar;

	/**
	 * 
	 * @param nombre
	 * @param precio
	 * @param diasCaducar
	 */
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		this.diasCaducar = diasCaducar;
	}

	/**
	 * 
	 * @return diasCaducar
	 */
	public int getDiasCaducar() {
		return diasCaducar;
	}

	/**
	 * 
	 * @param diasCaducar
	 */
	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}

	/**
	 * 
	 */
	public double calcular(int cantidad) {
		double total = super.calcular(cantidad);
		switch (diasCaducar) {
		case 1:
			return total / 4;
		case 2:
			return total / 3;
		case 3:
			return total / 2;
		default:
			return total;
		}
	}

	/**
	 * Método toString
	 * 
	 * @return Cadena de texto para todos los objetos producto
	 */
	public String toString() {
		return super.toString() + " Días a caducar: " + diasCaducar;
	}
}