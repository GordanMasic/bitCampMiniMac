import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = in.nextInt();
		in.close();
		int factorial = 1;
		int output = 0;
		
		
		for (int i = 1; i <= n; i++) {
			factorial *= i;
			while (factorial % 10 == 0) {
				factorial /= 10;
			}
			factorial %= 1000000;
		}

		
		output = factorial % 100;
		System.out.println(output);
		
	}

}
