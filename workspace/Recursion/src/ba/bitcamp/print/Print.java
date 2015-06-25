package ba.bitcamp.print;

import java.util.Arrays;

public class Print {

	// Task1
	public static void print(String s, int number) {
		if (number <= 0) {
			return;
		}
		System.out.println(s);
		print(s, number - 1);

	}

	// Task2
	public static void printEverySecondNumber(int number) {
		if (number <= 0) {
			return;
		}
		System.out.println(number);
		printEverySecondNumber(number - 2);
	}

	// task3
	public static int getSum(int number) {
		if (number == 1) {
			return 1;
		}
		return number + (getSum(number - 1));
	}

	// task4
	private static int getFibonacciNumber(int number) {
		if (number == 0) {
			return 0;
		}
		if (number == 1) {
			return 1;
		}

		return getFibonacciNumber(number - 1) + getFibonacciNumber(number - 2);
	}

	// task5
	public static void fillArray(int[] array) {
		fillArray(array, 0);
	}

	public static void fillArray(int[] array, int index) {
		if (index == array.length) {
			return;
		}
		array[index] = index + 1;
		index++;
		fillArray(array, index);
	}

	// task6
	public static boolean isInArray(int[] array, int n) {
		return isInArray(array, n, 0);
	}

	public static boolean isInArray(int[] array, int n, int index) {
		if (index >= array.length) {
			return false;
		}
		if (array[index] == n) {
			return true;
		} else {
			index++;
			return isInArray(array, n, index);
		}
	}

	// task7
	public static boolean areSame(int[] a, int[] b) {
		return areSame(a, b, 0);
	}

	public static boolean areSame(int[] a, int[] b, int index) {
		// if(a.length != b.length){
		// return false;
		// }
		if (index == a.length) {
			return true;
		}

		if (a[index] != b[index]) {
			return false;
		} else {
			index++;
			return areSame(a, b, index);
		}

	}

	public static void fillArray2(int[] array, int n) {
		array[n] = n;
		fillArray2(array, n - 1, n - 1, true);
		fillArray2(array, n + 1, n - 1, false);
	}

	public static void fillArray2(int[] array, int i, int j, boolean right) {
		array[i] = j;
		if (right) {
			j--;
			i--;
			if (i >= 0) {
				fillArray2(array, i, j, right);
			} else {
				return;
			}
		} else {
			i++;
			j--;
			if (i < array.length) {
				fillArray2(array, i, j, right);
			} else {
				return;
			}
		}
	}

	public static void main(String[] args) {

		// print("Cersei", 3);
		// printEverySecondNumber(10);
		// System.out.println(getSum(100));
		// System.out.println(getFibonacciNumber(9));
		// int[] array = new int[6];
		// int[] array1 = new int[6];
		// int[] array1 = new int[]{1,2,2,1,2,1};
		// fillArray(array1);
		// fillArray(array);
		//
		// System.out.println(Arrays.toString(array1));
		// int n = 1;
		// System.out.println(isInArray(array, n));
		// System.out.println(areSame(array, array1));
		int[] array = new int[10];
		int n = 4;
		fillArray2(array, n);
		System.out.println();
		System.out.println(Arrays.toString(array));
	}

}
