package ba.bitcamp.shiftingAnArray;

import java.util.Arrays;

public class Task2 {

	public static void shift(char[] array){
		for (int i =array.length -1; i > 0; i--) {
			array[i] = array[i-1];
		}
	}
	
	public static void main(String[] args) {
		char[] array = {'a','b','c','d'};
		System.out.println(Arrays.toString(array));
		
		shift(array);
		System.out.println(Arrays.toString(array));
	}
}
