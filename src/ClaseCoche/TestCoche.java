//@Autor: Alberto Garc�a L�pez
package ClaseCoche;

public class TestCoche {


	public static void main(String[] args, int menos) {
		Coche miCoche = new Coche();

		miCoche.acelera(30);
		miCoche.frena(20);
		System.out.println(miCoche.getVelocidad());
		
		
//		Quiero imprimir la velocidad despu�s de acelerar y frenar pero no lo consigo
//		System.out.println("La velocidad despu�s de la frenada es " + miCoche.frena());
//		System.out.println("La velocidad despu�s de acelerar es " + miCoche.acelera());
	}
}
