package day_02;

import java.util.Scanner;

/*
 * Esercizio: Calcolo della media di tre numeri
 * Traccia: Scrivi un programma Java che chieda all'utente di inserire tre
 * numeri e stampi la loro media.
 */
public class MediaNumeri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il primo numero:");
		int numero1 = input.nextInt();
		System.out.println("Inserisci il secondo numero:");
		int numero2 = input.nextInt();
		System.out.println("Inserisci il terzo numero:");
		int numero3 = input.nextInt();
		double media = (numero1 + numero2 + numero3) / 3;
		System.out.println("La media dei tre numeri è: " + media);
		input.close();

	}
}