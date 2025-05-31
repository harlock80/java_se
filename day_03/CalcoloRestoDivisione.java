package day_03;

import java.util.Scanner;

/*
 * Calcolo del resto della divisione tra due numeri Implementa un programma che
 * chieda all'utente di inserire due numeri e calcoli il resto della divisione
 * tra il primo numero e il secondo numero utilizzando l'operatore modulo. 
 * 
 */
public class CalcoloRestoDivisione {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Inserisci il primo numero:");
			int numero1 = scanner.nextInt();
			System.out.print("Inserisci il secondo numero: ");
			int numero2 = scanner.nextInt();
			int resto = numero1 % numero2;
			
			System.out.println("Il resto della divisione tra " + numero1 + " e " + numero2 + " è " + resto);
			
		}
	}	
}	