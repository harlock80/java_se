package day_14;

import java.util.Scanner;

public class VerificaLuhn {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Inserisci una sequenza numerica intera di 16 cifre");
		String numeri = input.nextLine();
		numeri=numeri.replace(" ", "");
		numeri=numeri.replace("-","");
		int somma=0;
		for (int i= numeri.length()-1; i >=0; i--){
			//i=incognita % divisione e resto ! risultato diverso
			int prodotto = (numeri.charAt(i)-'0');  // singole ' per i numeri doppie  " per lettere
			if (i % 2==0) { // così prende indici pari
				prodotto*=2;
				if (prodotto >9) {
				prodotto-=9;  //prodotto = prodotto -9
				
			}
		}
			somma +=prodotto; // come scrivere somma=somma+prodotto	
	}
if (somma%10==0) {
	System.out.println("Numero di Luhn valido");	
}
else {
	System.out.println("Numero di Luhn non valido");
}
}
}
