package day_02;

import java.util.Scanner;

public class AreaRettangolo {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("inserisci la base del rettangolo");
	double base = input.nextDouble();
	System.out.println("inserisci l'altezza del rettangolo");
	double altezza = input.nextDouble();
	
	double area = base*altezza;
	System.out.println("l'area del rettangolo è: " + area);
	input.close();
	}	
	
}