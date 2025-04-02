package interfaces.ejercicio1;

import java.util.Comparator;

/**
 * @author manuel.garfia
 */
public class Socio implements Comparable<Socio>, Comparator<Socio> {
	/**
	 * Id del socio
	 */
	int id;
	/**
	 * Nombre del socio
	 */
	String nombre;
	/**
	 * Edad del socio
	 */
	int edad;

	/**
	 * 
	 * Constructor de socio
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
	 * Método toString
	 * 
	 * @return Cadena de texto dando la información del socio
	 */
	@Override
	public String toString() {
		return "Socio--> id = " + id + ", nombre = " + nombre + ", edad = " + edad;
	}

	/**
	 * Método compareTo, para mostrar los toString de los socios por orden de id
	 */
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

	/**
	 * Método compareTo, para mostrar los socios ordenados por edad de mayor a menos
	 */
	@Override
	public int compare(Socio s1, Socio s2) {
		return s1.edad - s2.edad;
	}

}
