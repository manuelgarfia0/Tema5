package interfaces.ejercicio3;

public class Principal {

	public static void main(String[] args) {
		Perro perro = new Perro("Nala", "Pastor alemán", 30.5, "Marrón");
		Gato gato = new Gato("Bigoteh", "Siames", 4.2, "Naranja");

		perro.comer();
		perro.hacerRuido();
		System.out.println(perro.hacerCaso() ? "El perro obedece." : "El perro no obedece.");
		perro.sacarPaseo();

		System.out.println();

		gato.comer();
		gato.hacerRuido();
		System.out.println(gato.hacerCaso() ? "El gato obedece." : "El gato no obedece.");
		gato.toserBolaPelo();
	}

}
