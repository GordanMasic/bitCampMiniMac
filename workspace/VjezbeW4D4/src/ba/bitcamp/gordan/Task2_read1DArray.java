package ba.bitcamp.gordan;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_read1DArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out
				.println("Insert the path of file (e.g. Vjezbe/src/ba/bitcamp/gordan/file.in");

		String filePath = in.next();
		System.out.println();
		
		System.out.println("Array from the file is: ");
		readArray(filePath);
		in.close();
	}

	/**
	 * Prints array from the file  
	 * @param filePath	path to the file
	 */
	public static void readArray(String filePath) {
		int[] array = null;
		TextIO.readFile(filePath);
		int counter = 0;
		//counting number of lines in the file
		while (!TextIO.eof()) {
			TextIO.getln();
			counter++;
		}
		TextIO.readStandardInput();
		//If there are more than one line in the file
		if (counter > 1) {

			array = new int[counter];
			TextIO.readFile(filePath);
			for (int i = 0; i < array.length; i++) {
				array[i] = TextIO.getInt();
			}
			System.out.println(Arrays.toString(array)); 
		
		}
		//If there is only one line in the file
		else {
			TextIO.readFile(filePath);
			String[] array1 = new String[counter];
			for (int i = 0; i < array1.length; i++) {
				array1[i] =	TextIO.getln();
			}
			System.out.println(Arrays.toString(array1));
			TextIO.readStandardInput();
			
			
		}
		
	}
}
