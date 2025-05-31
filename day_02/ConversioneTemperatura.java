package day_02;

import java.util.Scanner;

/*
 * Esercizio: Conversione di temperatura
 * Traccia: Scrivi un programma Java che chieda all'utente di inserire una
 * temperatura in gradi Celsius e stampi la corrispondente temperatura in
 * gradi Fahrenheit. Utilizza la formula: Fahrenheit = Celsius * 9/5 + 32.
 */
public class ConversioneTemperatura {

    public static void main(String[] args) {
        // Creazione dello Scanner per l'input
        Scanner input = new Scanner(System.in);
        
        try {
            // Richiesta della temperatura in Celsius
            System.out.println("Inserisci la temperatura in gradi Celsius:");
            double celsius = input.nextDouble();
            
            // Calcolo della temperatura in Fahrenheit
            double fahrenheit = celsius * 9.0 / 5.0 + 32;
            
            // Stampa del risultato
            System.out.println("La temperatura in gradi Fahrenheit è: " + fahrenheit);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Errore: Inserisci un numero valido!");
        } finally {
            input.close();
        }
    }
}