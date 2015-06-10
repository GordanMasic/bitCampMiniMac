import java.util.InputMismatchException;
import java.util.Scanner;


public class WhatIsSafeItIsSafe {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		while(true){
			try{
				System.out.println("Input first number: ");
				int num1 = in.nextInt();
				System.out.println("Input second number: ");
				int num2 = in.nextInt();
				int div = (num1 / num2);
				System.out.println("Difference is: "+div);
				break;
			}catch(InputMismatchException e1){
				System.out.println("Wrong input, please try again!");in.nextLine();
			}catch(ArithmeticException e2){
				System.out.println("Wrong input, please try again!");
			}
		}

	}

}
