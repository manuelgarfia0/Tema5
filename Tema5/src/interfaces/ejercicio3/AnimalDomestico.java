package interfaces.ejercicio3;

/**
 * @author manuel.garfia
 */
abstract class AnimalDomestico implements Animal {
	/**
	 * Nombre del animal
	 */
	protected String nombre = "";
	/**
	 * Raza del animal
	 */
	protected String raza = "";
	/**
	 * Peso del animal
	 */
	protected double peso = 0;
	/**
	 * Color del animal
	 */
	protected String color = "";

	/**
	 * Constructor de animal domestico
	 * 
	 * @param nombre
	 * @param raza
	 * @param peso
	 * @param color
	 */
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}

	/**
	 * Método para que el animal esté vacunado
	 */
	public void vacunar() {
		System.out.println(nombre + " ha sido vacunado.");
	}

	/**
	 * Método para que el animal esté durmiendo
	 */
	@Override
	public void dormir() {
		System.out.println(nombre + " está durmiendo.");
	}

	/**
	 * Método para que el animal esté comiendo
	 */
	@Override
	public void comer() {
		System.out.println(nombre + " está comiendo.");
	}

	/**
	 * Método abstracto para que el animal haga caso
	 */
	public abstract boolean hacerCaso();

}
