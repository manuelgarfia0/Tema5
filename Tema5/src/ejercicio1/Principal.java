package ejercicio1;

public class Principal {

	public static void main(String[] args) {

		Hora h1 = new Hora(3, 59);
		HoraExacta h2 = new HoraExacta(3, 59, 59);

		System.out.println(h1.toString());
		System.out.println(h2.toString());

		h1.inc();
		h2.inc();

		System.out.println(h1.toString());
		System.out.println(h2.toString());
	}

}
