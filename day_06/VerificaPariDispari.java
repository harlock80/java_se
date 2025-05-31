package day_06;

import java.util.Scanner;

public class VerificaPariDispari {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci un numero intero");

		int numero = input.nextInt();
		if (numero % 2 == 0) {
			System.out.println("numero pari");
		} else {
			System.out.println("numero dispari");
		}
		input.close();
	}

}