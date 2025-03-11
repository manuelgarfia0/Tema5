package ejercicio2;

public class Principal {

	public static void main(String[] args) {

		Empleado E1 = new Empleado();
		E1.setNombre("Rafa");
		Directivo D1 = new Directivo();
		D1.setNombre("Mario");
		Operario OP1 = new Operario();
		OP1.setNombre("Alfonso");
		Oficial OF1 = new Oficial();
		OF1.setNombre("Luis");
		Tecnico T1 = new Tecnico();
		T1.setNombre("Pablo");

		System.out.println(E1.toString());
		System.out.println(D1.toString());
		System.out.println(OP1.toString());
		System.out.println(OF1.toString());
		System.out.println(T1.toString());

	}

}
