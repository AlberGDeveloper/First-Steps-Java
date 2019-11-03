package ClaseRebajas;
/**
 * 
 * @author Ionut Alin
 *
 */
	public class Rebajas {
		private int precioRebajado = 10;
		private int precioOriginal = 20;
		
		public void descubrePorcentaje() {
			float Porcentaje = 100 * precioRebajado / precioOriginal;
			System.out.println("El porcentaje es " + Porcentaje + "%");
		}	}


