package day_04;

import java.util.Scanner;

/*
*Scrivi un programma Java che verifica 
*se una stringa data è un palindromo
*(cioè se può essere letta allo stesso
* modo da destra a sinistra e viceversa)
*/

public class VerificaStringaPalindromo {

	public static void main(String[] args) {
		try (//  TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("Inserisci la frase: ");
			String frase = scanner.nextLine();
			//radar
			//01234
			// int intero = 5/2;
			// Sistem.out.println("intero "+intero");
			for (int i = 0; i < frase.length() / 2; i++)  {
				if (!(frase.charAt(i) == frase.charAt(frase.length() - 1 - i))) {
					System.out.println("Non è un palindromo");
					return;
				}
			}
		}
		System.out.println(" è un palindromo");
	}
}
		

		