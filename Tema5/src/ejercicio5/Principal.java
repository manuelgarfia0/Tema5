package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	static Scanner scanner = new Scanner(System.in);

	static List<Polígono> ListaPolígonos = new ArrayList<>();

	public static void main(String[] args) {

		int opción;

		System.out.println("1. Introducir triángulo");
		System.out.println("2. Introducir rectángulo");
		System.out.println("3. Mostrar polígonos");
		opción = scanner.nextInt();
		scanner.nextLine();

		do {
			switch (opción) {
			case 1 -> System.out.println("triangúlo");
			case 2 -> System.out.println("cuadrao largo");
			case 3 -> System.out.println("mostráh");
			case 0 -> System.out.println("adio");
			}
		} while (opción != 0);

	}
	
	

}
