import java.util.Scanner;

public class LowerPrimeNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Unesi neki broj: ");
		int num = in.nextInt();
		
		int endOfInterval = num;
		for (int j = 1; j <= endOfInterval; j++) {
			
			boolean isPrime = true;
			int c = j;
			for (int i = 2; i < c; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}if (isPrime == true) {
					System.out.println(c);
				}
		}

		in.close();
	}

}
