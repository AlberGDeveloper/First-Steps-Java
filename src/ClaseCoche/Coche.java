//@Autor: Alberto Garc�a L�pez
package ClaseCoche;

public class Coche {

	private int velocidad;
	Coche() {
		velocidad = 0;
	}

	public int getVelocidad() {
		return velocidad;

	}

	public void acelera(int mas) {
		velocidad += mas;
	}

	public void frena(int menos) {
		velocidad -= menos;
	}

}
