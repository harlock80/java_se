package day_04;

import java.util.Scanner;

/*Scrivi un programma Java 
 * che inverte una stringa data.
 */
public class InversioneStringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.println("inserisci la stringa da invertire");
		String str = input.nextLine();
		// tennis
		// 012345
		
		String invertita ="";// inizializzazione di stringa vuota
		for (int i = str.length() - 1; i >=0; i--) {
			invertita = invertita + str.charAt(i);
		}
		
		System.out.println("stringa invertita:" + invertita);
		input.close();
		}
	
}