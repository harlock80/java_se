package day_03;

import java.util.Scanner;

public class NomeSchermo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" inserisci il nome: ");
		String nome = input.nextLine();
		int lunghezza = nome.length();
		// System.outprintln("lunghezza" + lunghezza);
		System.out.println("+"+"-".repeat(lunghezza)+"+");
		System.out.println("|"+ nome+"|");
		System.out.println("+"+"-".repeat(lunghezza)+"+");
		

		input.close();
	}

}
