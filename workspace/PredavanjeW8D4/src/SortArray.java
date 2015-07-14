import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int arraySize = 100;
		int[] array = new int[arraySize];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * (3*arraySize-1) +1);
		}

		System.out.println(Arrays.toString(array));

		insertionSort(array);

		System.out.println(Arrays.toString(array));

		System.out.println(search(array, 155));

	}

	public static void sortArray(int[] array) {
		// for (int j = 0; j < array.length; j++) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					sorted = false;
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}

	}

	public static int search(int[] array, int number) {
		int min = 0;
		int max = array.length - 1;

		while (true) {
			int mid = (min + max) / 2;

			if (array[mid] == number) {
				return mid;
			} else if (array[mid] > number) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
			if (min > max) {
				break;
			}
		}
		return -1;

	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int location = i - 1;
			while (location >= 0 && temp < array[location]) {
				array[location + 1] = array[location];
				location--;
			}
			array[location +1]= temp;

		}

	}
}
