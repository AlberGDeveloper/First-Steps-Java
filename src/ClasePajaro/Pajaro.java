package ClasePajaro;
/**
 * 
 * @author Ionut Alin
 *
 */
public class Pajaro {
	public void setEdad(int e){edad = e;}
	public void printEdad(){System.out.println(edad);}
	public void setcolor(char c){color=c;}
	private char color;
	private int edad; 
}

//La clase está mal definida porque primero hay que definir los atributos, 
//despues el constructor y por último los métodos

//Si compila y ha generado un fichero .class porque no tiene ningún error sintáctico

//Un ejemplo para esta clase sería crear una tienda de animales, con  un constructor pájaro y que cada pajaro posea
//Unos atributos y unos métodos