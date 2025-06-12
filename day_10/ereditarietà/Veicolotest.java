package day_10.ereditarietà;

public class Veicolotest {
	public static void main(String[] args) {
		Moto honda = new Moto("ta78rga", "honda", "CBR", false);
		Auto ferrari = new Auto("fe987rr", "ferrari", "Testa Rossa", false);
		VeicoloController.stampaVeicolo(ferrari);
	}
}