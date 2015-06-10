public class Vjezba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bin1 = 0b111000110101;
		int bin2 = 0b10101010;
		int sum = bin1 + bin2;
		int dif = bin1 - bin2;
		int negDif = bin2 - bin1;
		int prod = bin1 * bin2;

		System.out
				.printf("Broj1: %d \nBroj2: %d \nSuma: %d \nRazlika: %d \nNegativna razlika: %d \nProizvod: %d",
						bin1, bin2, sum, dif, negDif, prod);

		/*
		 * int bin = 0b100000000000000; int hex = 0x4000; boolean compare = bin == hex;
		 * 
		 * System.out.println(compare);
		 */
	}

}
