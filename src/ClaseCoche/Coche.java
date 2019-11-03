package ClaseCoche;

public class Coche {

	private int velocidad;

	Coche() {
		velocidad = 0;
	}

	public int getVelocidad() {
		return velocidad;
	}

	private void acelera(int mas) {
		velocidad+=mas;
	}

	private void frena(int menos) {
		velocidad-=menos;
		

	}
}
