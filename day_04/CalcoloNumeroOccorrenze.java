package day_04;

import java.util.Scanner;
/*
*Calcolo del numero di occorrenze 
*di una lettera in una stringa
*Scrivi un programma Java che calcola il numero di occorrenze di una lettera
*specificata all'interno di una stringa data.
*/

public class CalcoloNumeroOccorrenze {

	public static void main(String[] args) {
		// Creazione dello Scanner per l'input
		Scanner input = new Scanner(System.in);

		try {
			// Richiesta della stringa all'utente
			System.out.println("Inserisci una stringa:");
			String stringa = input.nextLine();

			// Richiesta della Lettera da cercare
			System.out.println("Inserisci la lettera da cercare (un solo carattere):");
			String lettera = input.nextLine();

			// Verifica che l'input della lettera sia un singolo carattere
			if (lettera.length() != 1) {
				System.out.println("Errore: Devi inserire esattamente un carattere!");

			} else if (stringa.trim().isEmpty()) {
				System.out.println("Errore: La stringa è vuota o contiene solo spazi!");

			} else {
				// Calcolo del numero di occorrenze
				char carattere = lettera.charAt(0); // Converte la stringa in un carattere
				int conteggio = 0;

				// Scorre la stringa per contare le occorrenze
				for (int i = 0; i < stringa.length(); i++) {
					if (stringa.charAt(i) == carattere) {
						conteggio++;
					}
				}

				// Stampa del risultato
				System.out.println("La lettera '" + carattere + "' appare " + conteggio + " volte nella stringa.");

			}
		} catch (Exception e) {
			System.out.println("Errore: Si è verificato un problema con l'input!");
		} finally {
			input.close();
		}

	}

}