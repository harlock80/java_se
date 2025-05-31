package day_02;

import java.util.Random;

/*
 * Esercizio: Gioco del lancio del dado
 * Traccia: Scrivi un programma Java che simuli il lancio di un dado a sei facce.
 * Il programma dovrà generare casualmente un numero compreso tra 1 e 6 e stamparlo a schermo.
 */
public class LanciodelDado {

    public static void main(String[] args) {
        // Creazione di un oggetto Random per generare numeri casuali
        Random random = new Random();
        
        // Genera un numero casuale tra 1 e 6 (random.nextInt(6) genera 0-5, quindi +1)
        int risultato = random.nextInt(6) + 1;
        
        // Stampa il risultato
        System.out.println("Hai lanciato il dado! Il risultato è: " + risultato);
    }
}