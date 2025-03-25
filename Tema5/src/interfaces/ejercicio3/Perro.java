package interfaces.ejercicio3;

public class Perro extends AnimalDomestico {

	@Override
	public void hacerRuido() {
		System.out.println("Guau");
		super.hacerRuido();
	}

	@Override
	public void hacerCaso() {
		super.hacerCaso();
	}

}
