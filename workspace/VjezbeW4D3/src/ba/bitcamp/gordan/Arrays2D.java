package ba.bitcamp.gordan;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		int[][]	matrix =  fillMatrix();
		System.out.println();
		print2DArray(matrix, matrix.length);
		System.out.println();
		System.out.print("Is singular? " + isSingular(matrix));
	}
	/**
	 * User defines the elements of 2D matrix
	 * @return matrix - defined by user (int)
	 */
	public static int[][] fillMatrix() {
		Scanner in = new Scanner(System.in);
		// User defines number of rows
		System.out.print("Insert number of rows: ");
		int row = in.nextInt();

		// User defines number of columns
		System.out.print("Insert number of columns: ");
		int column = in.nextInt();

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

		return matrix;
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

	
	public static boolean isSingular(int[][] matrix){
		int determinant;
				
		determinant = matrix[0][0]*matrix[1][1]*matrix[2][2] + matrix[0][1]*matrix[1][2]*matrix[2][0] + matrix[0][2]*matrix[1][0]*matrix[2][1];
		determinant += -matrix[2][0]*matrix[1][1]*matrix[0][2] - matrix[2][1]*matrix[1][2]*matrix[0][0] - matrix[2][2]*matrix[1][0]*matrix[0][2];
		
		if (determinant == 0){
			return true;
		}else{
			return false;
		}
		
		
		
				
			
	}
}
