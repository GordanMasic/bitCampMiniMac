package ba.bitcan.trashCan;

import java.util.InputMismatchException;

public class FillCan {

	public static int[][] createArray(int x) {
		int[][] array = new int[10][10];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if ((i == 0 || i == array.length - 1)
						&& (j > 0 && j < array.length - 1)) {
					array[i][j] = 1;
				} else if ((j == 0 || j == array.length - 1)
						&& (i > 0 && i < array.length - 1)) {
					array[i][j] = 1;
				} else {
					array[i][j] = 0;
				}
			}
		}
		return array;
	}

	public static void fillArray(int[][] array) {
		fillArray(array, 2, 2);
	}

	public static void fillArray(int[][] array, int x, int y) {
		if (x < 0 || x > array.length - 1 || y < 0 || y > array.length) {
			return;
		}
		if (array[x][y] == 0) {
			array[x][y] = 1;
			fillArray(array, x + 1, y);
			fillArray(array, x - 1, y);
			fillArray(array, x, y + 1);
			fillArray(array, x, y - 1);
		}
		return;
	}

	public static void main(String[] args) {
		int[][] array = createArray(10);
		print2DArray(array, 10);
		System.out.println();
		System.out.println();
		fillArray(array);
		print2DArray(array, 10);
	}

	/**
	 * Prints 2D matrix
	 * 
	 * @param array
	 *            - matrix we want to print
	 * @param column
	 *            - number of columns in matrix
	 * 
	 * @throws InputMismatchException
	 */
	public static void print2DArray(int[][] array, int column) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");

				if (j == column - 1) {
					System.out.print("\n");
				}
			}
		}
	}
}
