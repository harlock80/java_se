package day_04;

import java.util.Scanner;

/*
 * Scrivi un programma Java che calcola la potenza 
 * di un numero base elevato
 a un esponente dato.
 */

public class CalcoloPotenzaNumero {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			try {
				//Chiedi all'utente di inseirire la base
				System.out.println("Inserisci la base:");
				double base = input.nextDouble();
				
				//Chiedi all'utente di inseirire l'esponente
				System.out.println("Inserisci l'esponente:");
				double esponente = input.nextDouble();
				
				// Calcola la potenza usando Math.pow
				double risultato = Math.pow(base, esponente);
				
				// Stampa il risultato
				System.out.println("La potenza di " + base + " elevato a " + esponente + " è: " + risultato);
				
				
			} catch (java.util.InputMismatchException e) {
				System.out.println("Errore: Inserisci solo numero validi!");
				
			}finally {
				
			}
		}

	}

}
