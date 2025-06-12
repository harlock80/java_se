package day_07.ProdottoSeriePiuGrande;

import java.util.Scanner;

public class ProdottoSeriePiuGrande {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci la sequenza di cifre: ");
		String input = scanner.nextLine();

		System.out.println("Inserisci la lunghezza della sottostringa (span): ");
		int span = scanner.nextInt();

		int maxProdotto = 0;
		int prodotto = 1;
		String serieTrovata = "";
		String serie = "";

		for (int i = 0; i <= input.length() - span; i++) {
			 serie = input.substring(i, i + span);
			 prodotto = 1;
			for (char c : serie.toCharArray()) {
				if (!Character.isDigit(c)) {
					throw new IllegalArgumentException("Contiene caratteri non numerici.");

				}
				prodotto = prodotto * (c -'0');
				//prodotto = prodotto * Integer.parseInt(serie, i);
			}
			if (maxProdotto < prodotto) {
				maxProdotto = prodotto;
				serieTrovata = serie;
			}
		}
		System.out.println("Prodotto più grande della serie: " + serieTrovata);
        System.out.println("Prodotto più grande della serie: " + maxProdotto);
		scanner.close();

	}

}
