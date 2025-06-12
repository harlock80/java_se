package day_13;

import java.util.Scanner;

public class CodiceISBN {

	public static void main(String[] args) {
		
		/* Il Processo di verifica ISBN-10 viene utilizzato per convalidare i numeri di identificazione del libro. 
		 * Questi normalmente contengono trattini e tipo: 3-598-21508-8 XISBN
		 * Il formato ISBN-10 è di 9 cifre da (0 a 9) più un carattere di controllo (una cifra o un X only). 
		 * Nel caso in cui il carattere di controllo sia una X, questo rappresenta il valore '10'.
		 * Questi possono essere comunicati con o senza trattini e possono essere controllati per verificarne 
		 * la validità con la seguente formula:
		 * (d₁ * 10 + d₂ * 9 + d₃ * 8 + d₄ * 7 + d₅ * 6 + d₆ * 5 + d₇ * 4 + d₈ * 3 + d₉ * 2 + d₁₀ * 1) mod 11 == 0
		 * Se il risultato è 0, allora è un ISBN-10 valido, altrimenti non è valido.
		 * Esempio
		 * Prendiamo l'ISBN-10   3-598-21508-8. Lo colleghiamo alla formula e otteniamo:
		 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 * 1) mod 11 == 0
		 * Poiché il risultato è 0, ciò dimostra che il nostro codice ISBN è valido.
		 * */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci codice isbn valido:");
		String str = scanner.nextLine();
		str = str.replace("-" , "");
		str = str.replace(" " , "");
		char[] caratteri = str.toCharArray();
		if(caratteri[caratteri.length - 1] == 'X') {
		   caratteri [caratteri.length - 1] = 10;
				
		}
			
		int somma = 0;
		/*for (int i = caratteri.length, j = 0; i >= 1; i--, j++) {
		 somma = somma + Character.getNumeriValue(caratteri[j] * i;*/
		for(int i = 0; i<caratteri.length;i++) {
			
			somma =somma+Character.getNumericValue(caratteri[1])*(10-i);
				
			}
			
			if(somma %11 == 0) {
			System.out.println("isbn è valido");
		}else {
			System.out.println("isbn non è valido");
		}


	}

}
