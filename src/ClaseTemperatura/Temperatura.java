package ClaseTemperatura;

public class Temperatura {

	public double celsiusTofarenheit(double celsius) {
		return (1.8 * celsius + 32);
	}

	public double farenheitTocelsius(double farenheit) {
		return (farenheit - 32) / 1.8;
	}

}
