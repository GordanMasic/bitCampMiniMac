import java.util.Scanner;

public class ToUpperCase {

	public static void main(String[] args) {

		/*
		 * Write a program that asks the user's name, and then greets the user
		 * by name. Before outputting the user's name, convert it to upper case
		 * letters. For example, if the user's name is Fred, then the program
		 * should respond "Hello, FRED, nice to meet you!".
		 */

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Upisi svoje ime: ");
		String ime = stdin.nextLine();
		String result = ime.toUpperCase();
		System.out.println(result);
	}

}
