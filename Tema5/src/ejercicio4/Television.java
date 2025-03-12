package ejercicio4;

/**
 * @author manuel.garfia
 */
public class Television extends Electrodomestico {

	private int resolucion;
	private boolean sintonizadorTDT;

	/**
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param resolucion
	 * @param sintonizadorTDT
	 */
	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		if (this.resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * 
	 * @return
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * 
	 * @param resolucion
	 */
	public void setResolucion(int resolucion) {
		if (this.resolucion > 0) {
			this.resolucion = resolucion;
		}
	}

	/**
	 * 
	 * @return
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * 
	 * @param sintonizadorTDT
	 */
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	/**
	 * 
	 */
	public void precioFinal() {
		if (this.resolucion > 40) {
			this.precioBase += (this.precioBase / 30) * 100;
		}
		if (this.sintonizadorTDT) {
			this.precioBase += 50;
		}
		super.precioFinal();
	}

}
