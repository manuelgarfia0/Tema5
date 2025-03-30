package analisis.ejercicio1;

public class Turismo extends Vehiculo {
	private int numeroPlazas;
	private String tipoUso; // Puede ser "Profesional" o "Particular"

	public Turismo(String marca, String modelo, String color, String matricula, int numeroPlazas, String tipoUso) {
		super(marca, modelo, color, matricula);
		this.numeroPlazas = numeroPlazas;
		this.tipoUso = tipoUso;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		if (numeroPlazas > 0) {
			this.numeroPlazas = numeroPlazas;
		}
	}

	public String getTipoUso() {
		return tipoUso;
	}

	public void setTipoUso(String tipoUso) {
		this.tipoUso = tipoUso;
	}
}
