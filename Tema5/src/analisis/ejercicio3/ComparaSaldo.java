package analisis.ejercicio3;

import java.util.Comparator;

public class ComparaSaldo implements Comparator<CuentaBancaria> {

	@Override
	public int compare(CuentaBancaria o1, CuentaBancaria o2) {
		return (int) (o2.saldo - o1.saldo);
	}

}