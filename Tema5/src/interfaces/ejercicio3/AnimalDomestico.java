package interfaces.ejercicio3;

/**
 * @author manuel.garfia
 */
abstract class AnimalDomestico implements Animal {

	protected String nombre = "";
	protected String raza = "";
	protected double peso = 0;
	protected String color = "";

	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}

	public void vacunar() {
		System.out.println(nombre + " ha sido vacunado.");
	}

	@Override
	public void dormir() {
		System.out.println(nombre + " está durmiendo.");
	}

	@Override
	public void comer() {
		System.out.println(nombre + " está comiendo.");
	}

	public abstract boolean hacerCaso();

}
