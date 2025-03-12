package ejercicio4;

/**
 * @author manuel.garfia
 */
public class Electrodomestico {

	protected double precioBase = 100;
	protected Color color = Color.Blanco;
	protected ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;
	protected double peso = 5;

	enum Color {
		Blanco, Negro, Rojo, Azul, Gris
	}

	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	/**
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * 
	 * @return
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * 
	 * @return
	 */
	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * 
	 * @param consumoEnergetico
	 */
	public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	/**
	 * 
	 * @return precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * 
	 * @param precioBase
	 */
	public void setPrecioBase(double precioBase) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
	}

	/**
	 * 
	 * @return peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * 
	 * @param peso
	 */
	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * 
	 * @param letra
	 */
	private void comprobarConsumoEnergetico(char letra) {
		switch (letra) {
		case 'A' -> this.consumoEnergetico = ConsumoEnergetico.A;
		case 'B' -> this.consumoEnergetico = ConsumoEnergetico.B;
		case 'C' -> this.consumoEnergetico = ConsumoEnergetico.C;
		case 'D' -> this.consumoEnergetico = ConsumoEnergetico.D;
		case 'E' -> this.consumoEnergetico = ConsumoEnergetico.E;
		default -> this.consumoEnergetico = ConsumoEnergetico.F;

		}
	}

	/**
	 * 
	 * @param color
	 */
	private void comprobarColor(String color) {
		switch (color) {
		case "Gris" -> this.color = Color.Gris;
		case "Negro" -> this.color = Color.Negro;
		case "Rojo" -> this.color = Color.Rojo;
		case "Azul" -> this.color = Color.Azul;
		default -> this.color = Color.Blanco;

		}
	}

	/**
	 * 
	 */
	public void precioFinal() {
		switch (this.consumoEnergetico) {
		case A -> this.precioBase += 100;
		case B -> this.precioBase += 80;
		case C -> this.precioBase += 60;
		case D -> this.precioBase += 50;
		case E -> this.precioBase += 30;
		case F -> this.precioBase += 10;
		}

		if (this.peso >= 0 && this.peso <= 19) {
			this.precioBase += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			this.precioBase += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			this.precioBase += 80;
		} else if (this.peso >= 80) {
			this.precioBase += 100;
		}
	}

}
