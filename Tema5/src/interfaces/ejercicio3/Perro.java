package interfaces.ejercicio3;

import java.util.Random;

public class Perro extends AnimalDomestico {

	static Random random = new Random();

	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	public void hacerRuido() {
		System.out.println("Guau");
	}

	@Override
	public boolean hacerCaso() {
		return random.nextDouble() < 0.9;
	}

	public void sacarPaseo() {
		System.out.println(this.nombre + " está siendo sacado a pasear.");
	}

}
