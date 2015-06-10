import java.util.Scanner;


public class KeepTheChange {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input quarters: ");
		int quarters = in.nextInt();
		System.out.println("Input dimes: ");
		int dimes = in.nextInt();
		System.out.println("Input nickels: ");
		int nickels = in.nextInt();
		System.out.println("Input pennies: ");
		int pennies = in.nextInt();
		double dollars;
		int totalCents;   // Total number of cents in the coins.

		totalCents = 25*quarters + 10*dimes + 5*nickels + pennies;
		dollars = totalCents/100.00;	
		System.out.println("Dollars: $"+ dollars);
	}
		
}
