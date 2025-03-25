package interfaces.ejercicio3;

import java.util.Random;

public class Gato extends AnimalDomestico {

	static Random random = new Random();

	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	public void hacerRuido() {
		System.out.println("Miau");
	}

	@Override
	public boolean hacerCaso() {
		return random.nextDouble() < 0.05;
	}

	public void toserBolaPelo() {
		System.out.println(nombre + " ha tosido una bola de pelo.");
	}

}
