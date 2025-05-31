package day_7.car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car panda = new Car("bv349877gf", "Fiat", "Panda", 100.0, 1);
		Car ferrari = new Car("ag23456er", "Ferrari", "F40", 100.0, 1);
		Car bmw = new Car("df23457sd", "Bmw", "C68", 100.0, 1);
		Car lamborghini = new Car("dr3456er", "Lamborghini", "Miura", 100.0, 1);
		System.out.println("targa Ferrari:" + ferrari.getTarga());
		ferrari.setTarga("AAAAAAAA");
		System.out.println("targa Ferrari:" + ferrari.getTarga());
		panda.setTarga("Frt4566");
		System.out.println("Targa Panda: " + panda.getTarga());
		System.out.println(panda.toString());
		System.out.println(bmw);
		CarController.aggiornaFuel(ferrari, 10);
		System.out.println(ferrari);
		// Giusto dal punto di vista sintattico ma sbagliato dal punto di vista logico
		

		CarController.addFuel(panda,10);
		System.out.println(panda);
		
		System.out.println(panda);
		CarController.aggiornaFuel(ferrari, 10);
		System.out.println(lamborghini);
		CarController.aggiornaFuel(panda, 10);
		System.out.println(panda.toString());
		

	}

}
