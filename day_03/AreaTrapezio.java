package day_03;

import java.util.Scanner;

/*
 * Calcola l'area di un trapezio
 *Implementa un programma che chieda all'utente di inserire la lunghezza delle basi e
 *l'altezza di un trapezio e calcoli la sua area utilizzando le formule geometriche.
 *public class AreaTrapezio 
 */
  public class AreaTrapezio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il valore della base maggiore: ");
		double baseMaggiore = input.nextDouble();
		System.out.println("Inserisci il valore della base minore: )");
		double baseMinore = input.nextDouble();
		System.out.println("Inserisci il valore dell'altezza: ");
		double altezza = input.nextDouble();
		double area = (baseMaggiore + baseMinore) * altezza / 2;
		System.out.println("L'area del trapezio misura: " + area);
input.close();
	}

}
