package ClaseTemperatura;

public class Test {
	static double farenheit = 40;
	static double celsius = 29;
	
	public static void main(String[] args) {
		Temperatura f = new Temperatura();
		Temperatura c = new Temperatura();



		System.out.println("Temperatura de 29º Celsius en Farenheit es " + f.celsiusTofarenheit(celsius));
		System.out.println(("Temperatura de 40º farenheit en Celsius es ") + c.farenheitTocelsius(farenheit));
	}

}
