import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Which number from Fibonacci sequence you want: ");
		int number = in.nextInt();
		long first = 1;
		long second = 1;
		long third = 0;
		
		for (int howMany = 0; howMany <= number; howMany++) {
			
			third = second;
			
			second = first;
			first = first + second;
			
			}System.out.print(first);
		}
		

	}


