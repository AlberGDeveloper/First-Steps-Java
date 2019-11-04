/*
 * @autor: Juan Manuel Retuerta Serrano
 */


package ClaseSatelite;

//Le he añadido una "s" a la clase class

public class Satelite {
	private double meridiano;
	
	//He añadido ":" al final que faltaban
	private double paralelo;
	private double distancia_tierra;
	Satelite (double m,double p,double d){
	meridiano=m;
	paralelo=p;
	distancia_tierra=d;
	}
	
	//He creado uun método para satélite
	public void satelite (){
	meridiano=paralelo=distancia_tierra=0;
	}
	public void setPosicion(double m,double p,double d){
	meridiano=m;
	paralelo=p;
	
	//He creado una variable "double" que le faltaba
	double distancia_tiera = d;
	}
	public void printPosicion(){
		
	//Dentro del paréntesis he cambiado las comillas que no eran las que había que usar
	System.out.println("El satélite se encuentra en el paralelo "+ paralelo+ 
			
	//La "m" de meridiano estaba en mayúscula y he modificado las ""
	meridiano + meridiano + "a una distancia de la tierra de" + distancia_tierra +
	"Kilómetros");
	}

}

