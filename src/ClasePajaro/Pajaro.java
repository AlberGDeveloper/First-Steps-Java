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

//La clase est� mal definida porque primero hay que definir los atributos, 
//despues el constructor y por �ltimo los m�todos

//Si compila y ha generado un fichero .class porque no tiene ning�n error sint�ctico

//Un ejemplo para esta clase ser�a crear una tienda de animales, con  un constructor p�jaro y que cada pajaro posea
//Unos atributos y unos m�todos