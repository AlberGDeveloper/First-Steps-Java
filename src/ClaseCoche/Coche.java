//@Autor: Alberto Garc�a L�pez

package ClaseCoche;

public class Coche {

	private int velocidad;

	Coche() {
		velocidad = 0;
	}

	private int getVelocidad() {
		return velocidad;

	}
	private void acelera(int mas) {
		velocidad += mas;
	}
	private void frena(int menos) {
		velocidad -= menos;

	}
}
