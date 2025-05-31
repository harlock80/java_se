package day_06;

/*Esercizio_11: Verifica se un numero è primo
*14
*Academy Java – Ing. Dario Serafini - Ing. Antonio Pagano
*Scrivi un programma java per verificare se un numero 
*è primo con il metodo
*del crivello di eratostene.
*/

import java.util.Scanner;

public class VerificaCrivelloEratostene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero intero e ti darò i numeri primi fino a quel numero");
		int numero = scanner.nextInt();
		boolean[] isPrimo = new boolean[numero + 1]; // creazione arrey booleano default false
		for (int i = 2; i <= numero; i++) {
			isPrimo[i] = true;
		}
		for (int i = 2; i * i <= numero; i++) {
			if (isPrimo[i])
				for (int j = i * i; j <= numero; j += i) {
				isPrimo[j] = false;
			}
		}
		System.out.println("Numeri primi fino a "+ numero +":");
		for (int i = 2; i <= numero; i++) {
			if (isPrimo[i]) {
		  System.out.println(i);
		}
		}
		scanner.close();
	}

}


