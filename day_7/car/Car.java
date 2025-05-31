package day_7.car;

public class Car {
	private String targa;
	private String marca;
	private String modello;
	private double fuel;
	private double consumomedio;

	public Car() {
		super();

	}// Costruttore di default

	public Car(String targa, String marca, String modello, double fuel, double consumoMedio) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.fuel = fuel;
		this.consumomedio = consumoMedio;
		// Costruttore parametrico
	}

	public String getTarga() {
		return this.targa;
	}
	
	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModello() {
		return this.modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public Double getFuel() {
		return this.fuel;
	}
	
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	public Double getconsumoMedio() {
		return this.consumomedio;
	}
	
	public void setconsumoMedio(Double consumoMedio) {
		this.consumomedio = consumoMedio;
	}
	
	public String toString() {
		return "[targa: " + this.targa + ", marca: " + this.marca + ", modello: " + this.modello + 
		           ", fuel: " + this.fuel + ", consumoMedio: " + this.consumomedio + "]";
	
	}
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car panda = new Car("bv349877gf", "Fiat", "Panda", 100.0, 1);
		Car ferrari = new Car("ag23456er", "Ferrari", "F40", 100.0, 1);
		Car bmw = new Car("df23457sd", "Bmw", "C68", 100.0, 1);
		Car lamborghini = new Car("dr3456er", "Lamborghini", "Miura", 100.0, 1);
	}*/

}
