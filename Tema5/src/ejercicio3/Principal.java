package ejercicio3;

public class Principal {

	public static void main(String[] args) {

		Producto producto1 = new Producto("Leche", 2.5);
		Perecedero producto2 = new Perecedero("Yogur", 1.0, 1);
		NoPerecedero producto3 = new NoPerecedero("Arroz", 3.0, "Granos");

		System.out.println("Precio total de " + producto1.getNombre() + ": " + producto1.calcular(5));
		System.out.println("Precio total de " + producto2.getNombre() + ": " + producto2.calcular(5));
		System.out.println("Precio total de " + producto3.getNombre() + ": " + producto3.calcular(5));

		System.out.println(producto1);
		System.out.println(producto2);
		System.out.println(producto3);
	}
}
