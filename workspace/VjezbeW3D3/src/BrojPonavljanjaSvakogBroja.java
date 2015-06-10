import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BrojPonavljanjaSvakogBroja {

	public static int getInput() {
		Scanner in = new Scanner(System.in);
		int number = 0;

		while (true) {
			try {
				System.out.println("Input number");
				number = in.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Not a number");
				in.nextLine();
			}catch (NegativeArraySizeException e2){
				System.out.println("Size can't be negative!");
				in.nextLine();
				
			}
		}

		return number;
		
	}

	public static void main(String[] args) {
		
		Scanner in2 = new Scanner(System.in);
		
		System.out.println("Insert length of an array: ");

		int n = getInput();

		System.out.println("Insert number of inserts: ");
		int k = getInput();

		int[] array = new int[n];

		while (k > 0) {
			try {
				System.out.println("Insert number of index: ");
				int index = getInput();
				if (index >= n) {
					throw new IndexOutOfBoundsException();
				}
				System.out
						.println("Insert value of array element at that index: ");
				array[index] = getInput();
				k--;

			} catch (IndexOutOfBoundsException e1) {
				System.out.println("Index out of range. Please try again!");
				
			}catch (InputMismatchException e) {
				System.out.println("Please insert a number!");
				
				
			}
		}System.out.println(Arrays.toString(array));
	}
}
