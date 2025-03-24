package interfaces.ejercicio1;

/**
 * 
 */
public class Socio implements Comparable<Socio> {
	/**
	 * 
	 */
	int id;
	/**
	 * 
	 */
	String nombre;
	/**
	 * 
	 */
	int edad;

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 */
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

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Socio--> id = " + id + ", nombre = " + nombre + ", edad = " + edad;
	}

	@Override
	public int compareTo(Socio s1) {
		int res = 0;
		if (this.id < s1.id) {
			res = -1;
		} else if (this.id > s1.id) {
			res = 1;
		}
		return res;
	}

}
