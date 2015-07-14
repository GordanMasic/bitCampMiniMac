package ba.bitcamp.fillAnArray;

import java.util.Arrays;

public class Task7 {

	public static int[] fillArray(int numOfElements, int numberToFill,
			int beginIndex, int endIndex) {
		int[] array = new int[numOfElements];
		Arrays.fill(array, beginIndex, endIndex, numberToFill);
		return array;

	}

	public static void main(String[] args) {
		
		int[] array = fillArray(15, 9, 5, 10);
		
		System.out.println(Arrays.toString(array));
	}
}
