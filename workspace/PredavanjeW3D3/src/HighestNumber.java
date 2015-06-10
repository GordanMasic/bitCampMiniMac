import java.util.Scanner;


public class HighestNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input first number: ");
		int num1 = in.nextInt();
		System.out.println("Input second number:");
		int num2 = in.nextInt();
		System.out.println("Input third number:");
		int num3 = in.nextInt();
		in.close();
		if (num1 > num2 && num1 > num3){
			System.out.println("Highest number is " + num1 );
		}else if (num2 > num3 && num2 > num1){
			System.out.println("Highest number is " + num2);
		}else{
			System.out.println("Highest number is " + num3);
		}
	}

}
