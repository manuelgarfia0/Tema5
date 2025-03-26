package interfaces.ejercicio3;

public class Gato extends AnimalDomestico {
	/**
	 * Constructor para el gato
	 * 
	 * @param nombre
	 * @param raza
	 * @param peso
	 * @param color
	 */
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * Método para que el gato maulle
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Miau");
	}

	/**
	 * Método para saber si el gato hace caso o no
	 * 
	 * @return boolean, true si el random saca un número entre 0 - 5, es decir, 5%.
	 *         False si el random saca un número entre 6 - 100, es decir, 95%.
	 */
	@Override
	public boolean hacerCaso() {
		boolean res = false;
		int posibilidad = (int) (Math.random() * 101);
		if (posibilidad > 0 && posibilidad <= 5) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}

	/**
	 * Método para que el gato tosa una bola de pelo
	 */
	public void toserBolaPelo() {
		System.out.println(nombre + " ha tosido una bola de pelo.");
	}

}
