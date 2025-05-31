package day_7.car;

public class CarController {
	public static void aggiornaFuel(Car car, double km) {
		double consumo = km * car.getconsumoMedio();
		car.setFuel(car.getFuel ()- consumo);
		
	}
public static void addFuel(Car car, double litri) {
	car.setFuel(car.getFuel() + litri);  
}
}
