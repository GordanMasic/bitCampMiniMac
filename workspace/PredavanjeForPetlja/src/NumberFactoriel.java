import java.util.Scanner;
public class NumberFactoriel {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input random number ");
		
		int number = in.nextInt();
		int factorial = 1;
		
		for (int i = 1; i <= number; i++){
			factorial *= i; 
		}
		System.out.println("Factorial = " + factorial);
		in.close();
	}

}
