package ejercicio4;

/**
 * @author manuel.garfia
 */
public class Lavadora extends Electrodomestico {

	private double carga = 5;

	/**
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param carga
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		if (carga > 0) {
			this.carga = carga;
		}
	}

	/**
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * 
	 * @return
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * 
	 * @param carga
	 */
	public void setCarga(double carga) {
		if (carga > 0) {
			this.carga = carga;
		}
	}

	/**
	 * 
	 */
	public void precioFinal() {
		super.precioFinal();
		if (this.carga > 30) {
			this.precioBase += 50;
		}
	}

}
