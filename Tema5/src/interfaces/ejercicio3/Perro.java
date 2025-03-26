package interfaces.ejercicio3;

/**
 * @author manuel.garfia
 */
public class Perro extends AnimalDomestico {
	/**
	 * Constructor de perro
	 * 
	 * @param nombre Nombre del perro
	 * @param raza   Raza del perro
	 * @param peso   Peso del perro
	 * @param color  Color del perro
	 */
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * Método para que el perro ladre
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Guau");
	}

	/**
	 * Método para saber si el perro hace caso o no
	 * 
	 * @return boolean, true si el random saca un número entre 0 - 90, es decir,
	 *         90%. False si el random saca un número entre 91 - 100, es decir, 10%.
	 */
	@Override
	public boolean hacerCaso() {
		boolean res = false;
		int posibilidad = (int) (Math.random() * 101);
		if (posibilidad > 0 && posibilidad <= 90) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}

	/**
	 * Método para sacar a pasear al perro
	 */
	public void sacarPaseo() {
		System.out.println(this.nombre + " está siendo sacado a pasear.");
	}

}
