package day_03;
import java.util.Scanner;
public class Modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("inserisci un numero ");
double numero = input.nextDouble();
System.out.println("funzione modulo" + Math.abs(numero) );
input.close();
	}

}
