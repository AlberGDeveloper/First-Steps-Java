//@Autor: Alberto García López
package ClaseCoche;

public class TestCoche {


	public static void main(String[] args) {
		Coche miCoche = new Coche();
		int mas = 30;
		int menos = 20; 
		miCoche.acelera(mas);
		miCoche.frena(menos);

		System.out.println("Velocidad actual " + miCoche.getVelocidad());
	}
}
