//@Autor: Alberto García López
package ClaseCoche;

public class TestCoche {


	public static void main(String[] args, int menos, int mas) {
		Coche miCoche = new Coche();

		miCoche.acelera(30);
		miCoche.frena(20);
		System.out.println(miCoche.getVelocidad());
		System.out.println(miCoche.getVelocidad() + (menos));
		System.out.println(miCoche.getVelocidad() + (mas));

	}
}
