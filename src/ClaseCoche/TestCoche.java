//@Autor: Alberto García López
package ClaseCoche;

public class TestCoche {


	public static void main(String[] args, int menos) {
		Coche miCoche = new Coche();

		miCoche.acelera(30);
		miCoche.frena(20);
		System.out.println(miCoche.getVelocidad());
		
		
//		Quiero imprimir la velocidad después de acelerar y frenar pero no lo consigo
//		System.out.println("La velocidad después de la frenada es " + miCoche.frena());
//		System.out.println("La velocidad después de acelerar es " + miCoche.acelera());
	}
}
