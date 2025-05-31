package day_03;

import java.util.Scanner;
public class ValoreAssoluto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("inserisci un numero");
double numero = input.nextDouble();
System.out.println("funzione modulo" + Math.abs(numero));
input.close();
	}

}
