package ba.bitcamp.gordan;

import java.util.InputMismatchException;

public class Sudoku {

	public static void main(String[] args) {
		int field = 9;
		int[][] sudoku = new int[9][9];
		print2DArray(sudoku, field);
	}

	public static int[][] returnSudoku(int field) {
		int[][] sudoku = new int[9][9];

		// Fill matrix with the zeroes
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku.length; j++) {
				sudoku[i][j] = 0;
			}
		}

		// Put random number on random places
		for (int i = 0; i < sudoku.length; i++) {
			int j = (int) (Math.random() * (sudoku.length));
			sudoku[i][j] = (int) (Math.random() * 9 + 1);
		}
		
		
		return sudoku;
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
