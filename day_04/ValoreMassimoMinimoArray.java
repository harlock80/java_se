package day_04;

public class ValoreMassimoMinimoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeri = { -1, 10, 20, 30, 40, 10 };

		//int min = numeri[0];
		//int max = numeri[0];
		// oppure
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numeri.length; i++) {
			if (min > numeri[i]) {
				min = numeri[i];

			}
			if (max < numeri[i]) {
				max = numeri[i];

			}

		}
		System.out.println("numeri min e max " + min + " " + max);

	}

}
