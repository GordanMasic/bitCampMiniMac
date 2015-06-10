import java.util.Scanner;

public class DjeliociBroja {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesi neki broj: ");
		int number = in.nextInt();
		System.out.println("Broj je djeljiv sa: ");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i+ " ");
			}
		}in.close();
	}
}
