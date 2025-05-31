package day_03;

public class TipiNumerici {

	public static void main(String[] args) {
		byte numero = 122; // in binario :01111010;
		short numeroShort = numero; // in binario sarebbe : 00000000 01111010
		int numeroInt = numeroShort; // in binario sarebbe 00000000 00000000 00000000 01111010
		float numeroFloat = numeroInt;
		double numeroDouble = numeroFloat;
		System.out.println("numerodouble:" + numeroDouble);
	}

}
