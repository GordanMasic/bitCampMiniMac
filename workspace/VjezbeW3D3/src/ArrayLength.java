import java.util.Arrays;
import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
//Drugi zadatak
		Scanner in = new Scanner(System.in);

		System.out.println("Input array length: ");
		int length = in.nextInt();

		int[] array = new int[length];
		int i = 0;
		while (i < length) {
			System.out.println("Input number: ");
			array[i] = in.nextInt();
			i++;
		}
		System.out.println("Array = " + Arrays.toString(array));
//Treci zadatak
		System.out.println("Which number you want to check out: ");
		int search = in.nextInt();

		in.close();
		int counter = 0;
		for (i = 0; i < length; i++) {
			if (array[i] == search) {
				counter++;
			}

		}
		System.out.printf("Number %d is repeated %d times.\n", search,
				counter);
	}

}
