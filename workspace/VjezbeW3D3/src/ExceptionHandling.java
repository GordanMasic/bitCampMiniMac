import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		
		try {
			System.out.println("Insert length of an array: ");

			int n = in.nextInt();

			System.out.println("Insert number of inserts: ");
			int k = in.nextInt();

			int[] array = new int[n];

			while (k > 0) {
				try {
					System.out.println("Insert number of index: ");
					int index = in.nextInt();
					if (index >= n) {
						throw new IndexOutOfBoundsException();
					}
					System.out
							.println("Insert value of array element at that index: ");
					array[index] = in.nextInt();
					k--;

				} catch (IndexOutOfBoundsException e1) {
					System.out.println("Index out of range. Please try again!");
				}catch (InputMismatchException e) {
			System.out.println("Please insert a number!");
			in.nextLine();
		}catch (NegativeArraySizeException e2){
			System.out.println("Size can't be negative!");
			break;
		}
			
		} System.out.println("Array: " + Arrays.toString(array));
		}catch (InputMismatchException e) {
			System.out.println("Please insert a number!");
		}
		in.close();
	}
}
