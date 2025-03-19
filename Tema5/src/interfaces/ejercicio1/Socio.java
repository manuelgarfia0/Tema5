package interfaces.ejercicio1;

interface Comparable {
	void compareTo();
}

public class Socio implements Comparable {

	int id;
	String nombre;
	int edad;

	public Socio(int id, String nombre, int edad) {
		if (id > 0) {
			this.id = id;
		}
		if (!nombre.isBlank() || !nombre.isEmpty() || nombre != null) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
	}

	@Override
	public void compareTo() {
		
	}

	@Override
	public String toString() {
		return "Socio--> id = " + id + ", nombre = " + nombre + ", edad = " + edad;
	}

}
