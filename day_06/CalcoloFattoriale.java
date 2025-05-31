package day_06;

public class CalcoloFattoriale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 3; // numero si chiama parametro attuale
		System.out.println("fattoriale del numero " + numero + ": " + fattoriale(numero));
	}

	// risoluzione del problema con metodo iterativo
	// esempio: 9! = 9*8*7*6*5*4*3*2*1
	public static int fattoriale(int num) { // num si chiama parametro formale
		int fat = 1;
		for (int i = 1; i <= num; i++) {
			fat *= i; // sarebbe come scrivere fat= fat*i
		}
		return fat;
	}

}
//if (num <= 1 and num >= 0){
// return 1;
//}