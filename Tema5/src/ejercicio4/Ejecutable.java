package ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author manuel.garfia
 */
public class Ejecutable {

	public static void main(String[] args) {
		List<Electrodomestico> lista = new ArrayList<>();
		lista.add(new Electrodomestico(200, "rojo", 'A', 30));
		lista.add(new Lavadora(150, "azul", 'B', 40, 35));
		lista.add(new Television(300, "negro", 'C', 20, 50, true));

		double totalElectrodomesticos = 0;
		double totalLavadoras = 0;
		double totalTelevisiones = 0;

		for (Electrodomestico e : lista) {
			double precioFinal = e.precioFinal();
			totalElectrodomesticos += precioFinal;
			if (e instanceof Lavadora)
				totalLavadoras += precioFinal;
			if (e instanceof Television)
				totalTelevisiones += precioFinal;
		}

		System.out.println("Total Electrodomésticos: " + totalElectrodomesticos);
		System.out.println("Total Lavadoras: " + totalLavadoras);
		System.out.println("Total Televisiones: " + totalTelevisiones);
	}
}