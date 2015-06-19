package ba.bitcamp.gordan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_arrays2D {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Insert number of rows: ");
		int rows = in.nextInt();

		System.out.print("Insert number of columns: ");
		int columns = in.nextInt();

		int[][] matrix = matrixFiveToTen(rows, columns);

		MatrixHelper.print2DArray(matrix);
		
		System.out.print("True or false? ");
		boolean trueFalse = in.nextBoolean();
		
		reverseMatrix(trueFalse, matrix);
		in.close();
	}

	/**
	 * Returns matrix with dimensions n x m
	 * 
	 * @param n
	 *            number of rows
	 * @param m
	 *            number of columns
	 * @return matrix n x m filled with random numbers from 5 to 10
	 * 
	 * @throws InputMismatchException
	 */
	public static int[][] matrixFiveToTen(int n, int m) {
		int[][] matrix = new int[n][m];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 6 + 5);
			}
		}
		return matrix;
	}

	public static void reverseMatrix(boolean isTrue, int[][] matrix) {
		
		if (isTrue == true) {
			MatrixHelper.print2DArray(matrix);
		} else {

			for (int i = matrix.length-1; i >=0; i--) {
				for (int j = matrix[i].length-1; j >=0; j--) {
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println();
			}
			
		}

	}
}
