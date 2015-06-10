package ba.bitcam.vjezbe.W04d01;

import java.util.InputMismatchException;

public class SUm {

	public static void main(String[] args) {
		getSumArray(args);
	}
	
	/**
	 * Returns sum of inputed numbers
	 * 
	 * @param args	inputed numbers
	 * 
	 * @throws InputMismatchException
	 * @throws IllegalArgumentException
	 */
	public static void getSumArray(String[] args) {
		int sum = 0;
		for(String arg:args ){
			
			sum += Integer.parseInt(arg);
			
		}
		System.out.println("Sum of inputed numbers is: "+sum);

	}

}
