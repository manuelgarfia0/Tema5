package interfaces.ejercicio3;

public class Gato extends AnimalDomestico {

	@Override
	public void hacerRuido() {
		System.out.println("Miau");
		super.hacerRuido();
	}

	@Override
	public void hacerCaso() {
		super.hacerCaso();
	}

}
