import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Unesi neki broj ");

		int number = in.nextInt();

		int sum = 0;

		for (int a = number; a > 0; a /= 10) {

			sum += a % 10;

		}
		System.out.print("Zbir cifara je " + sum);

		in.close();
	}

}
