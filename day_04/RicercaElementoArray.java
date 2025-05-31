package day_04;

import java.util.Scanner;

//Scrivi un programma Java che ricerca un elemento specifico 
//all'interno di un
//array di interi e restituisce la sua posizione (indice).

public class RicercaElementoArray {

Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // primo modo di dicharare gli array
	     double[] numeri = { 10.15, 15.2, 10.1 };

	     // secondo modo di dichaare gli array
	     double[] numeri1 = new double[5];

	     numeri1[0] = 15.0;
	     numeri1[1] = 10.2;
	     numeri1[2] = 9.5;
	     numeri1[3] = 20.1;
	     numeri1[4] = 30.6;

	     System.out.println("indirizzo di memoria numeri : " + numeri);
	     System.out.println("indirizzo di memoria numeri : " + numeri1);
	     
	     double somma = 0;
	     for (int i = 0; i < numeri.length; i++) {
	     	somma += numeri[i]; // somma = somma + numeri[i];
	     	
	     }
	     double media = somma / numeri.length;
	     System.out.println("array numeri :" + media);
	     	

	    }

	}

	