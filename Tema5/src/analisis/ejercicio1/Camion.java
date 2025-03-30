package analisis.ejercicio1;

public class Camion extends Vehiculo {
	private float pesoMaximoAutorizado;
	private boolean transportaMercanciaPeligrosa;

	public Camion(String marca, String modelo, String color, String matricula, float pesoMaximoAutorizado,
			boolean transportaMercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		this.pesoMaximoAutorizado = pesoMaximoAutorizado;
		this.transportaMercanciaPeligrosa = transportaMercanciaPeligrosa;
	}

	public float getPesoMaximoAutorizado() {
		return pesoMaximoAutorizado;
	}

	public void setPesoMaximoAutorizado(float pesoMaximoAutorizado) {
		if (pesoMaximoAutorizado > 0) {
			this.pesoMaximoAutorizado = pesoMaximoAutorizado;
		}
	}

	public boolean isTransportaMercanciaPeligrosa() {
		return transportaMercanciaPeligrosa;
	}

	public void setTransportaMercanciaPeligrosa(boolean transportaMercanciaPeligrosa) {
		this.transportaMercanciaPeligrosa = transportaMercanciaPeligrosa;
	}
}
