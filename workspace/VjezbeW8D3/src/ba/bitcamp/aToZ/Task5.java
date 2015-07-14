package ba.bitcamp.aToZ;

import java.util.Arrays;



public class Task5 {

	public static String[] sortStrings(String...strings){
		Arrays.sort(strings);
		return strings;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortStrings("java","doc","bla bla","sjdakl","sdas","gfdsg","ghdfsg")));
	}
}
