package ba.bitcamp.gordan;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputElements {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// User defines number of rows
		System.out.print("Insert number of rows: ");
		int row = in.nextInt();

		// User defines number of columns
		System.out.print("Insert number of columns: ");
		int column = in.nextInt();

		// User decides which column he wants to see as 1D array
		System.out.print("Which column you want to see? ");
		int numOfColumn = in.nextInt();
		System.out.println();

		// Creating empty matrix with dimensions rows x columns
		int[][] matrix = new int[row][column];

		// With loop user inserts numbers in every element of matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("Insert element at indexes [%d] [%d]: ", i,
						j, "\n");
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();

		System.out.println();
		System.out.println("Your matrix is: ");
		System.out.println();

		// Printing matrix on the screen
		print2DArray(matrix, column);

		System.out.println();
		System.out.println("Column you choosed to see is " + numOfColumn
				+ " and her elements are:");

		// Printing column on the screen
		System.out.println(Arrays.toString(getColumn(matrix, numOfColumn - 1)));
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

	/**
	 * Returns column that user chooses
	 * 
	 * @param array
	 *            - matrix whose column user chooses
	 * @param column
	 *            - index of column that user chooses
	 * @return oneColumn - column that user chooses as array
	 * 
	 * @throws InputMismatchException
	 * @throws IndexOutOfBoundsException
	 */
	public static int[] getColumn(int[][] array, int column) {
		int[] oneColumn = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			oneColumn[i] = array[i][column];
		}
		return oneColumn;
	}
}
