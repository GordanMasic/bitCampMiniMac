package ba.bitcamp.gordan;

import java.util.Arrays;

public class Arrays2D {

	public static void main(String[] args) {
//		int[] array = new int[3];
		int[][]	matrix = new int[4][5];
		int counter = 1;
		 for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j]=counter;
				counter++;
			}
		}
		print2DArray(matrix);
		System.out.println();
		System.out.println(Arrays.toString(getColumn(matrix, 1)));
		
	}

	public static void print2DArray(int[][] array){
		 for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j]+"\t");
					
					if(j==array.length){
						System.out.print("\n");
					}
				}
		 }
	}
	
	public static void print1DArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
	
	public static int[] getColumn(int[][] array, int column){
		int[] oneColumn = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			oneColumn[i] = array[i][column];
		}
		return oneColumn;
	}
}
