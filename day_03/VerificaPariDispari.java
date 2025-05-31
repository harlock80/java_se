package day_03;

import java.util.Scanner;

public class VerificaPariDispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci numero");
		int input = scanner.nextInt();
		String pariDispari = input % 2 == 0 ? "pari" : "dispari";
		System.out.println(pariDispari);
		scanner.close();

	}

}
