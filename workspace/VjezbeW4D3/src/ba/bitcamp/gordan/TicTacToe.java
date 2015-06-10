package ba.bitcamp.gordan;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert size of field: ");
		int sizeField = in.nextInt();
		String[][] fieldXO = ticTacToe(sizeField);
		print2DArray(fieldXO, 2 * sizeField);
		print2DArray(userPlayX(fieldXO), 2 * sizeField);
	}

	/**
	 * 
	 * @param sizeField
	 * @return
	 */
	public static String[][] ticTacToe(int sizeField) {
		String[][] field = new String[2 * sizeField][2 * sizeField];
		for (int i = 0; i < field.length; i++) {
			for (int j = 1; j < field.length; j += 2) {
				field[j][i] = "-";
				field[i][j] = "|";

			}
		}

		for (int i = 0; i < field.length; i += 2) {
			for (int j = 0; j < field.length; j += 2) {
				field[i][j] = " ";
			}

		}

		for (int i = 1; i < field.length; i += 2) {
			for (int j = 0; j < field.length; j++) {
				field[j][i] = "|";

			}

		}
		return field;
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
	public static void print2DArray(String[][] array, int column) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");

				if (j == column - 1) {
					System.out.print("\n");
				}
			}
		}
	}

	public static String[][] userPlayX(String[][] array) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		while (true) {

			System.out.print("Input row index: ");
			int x = in.nextInt();
			System.out.print("Input column index: ");
			int y = in.nextInt();
			if (array[x][y].equals(" ")) {
				array[x][y] = "X";
				break;
			} else {
				System.out.println("It's already used field! Try again!");
			}
			
		}
		return array;
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
