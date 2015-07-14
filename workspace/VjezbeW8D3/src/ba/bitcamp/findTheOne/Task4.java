package ba.bitcamp.findTheOne;

import java.util.Arrays;

public class Task4 {

	public static boolean isThere(String s, char c){
		char[] array = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			array[i] = s.charAt(i);
		}
		Arrays.sort(array);
		if(Arrays.binarySearch(array, c) > 0){
			return true;
		}else{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		String s = "Budalo jedna budalasta!";
		
		System.out.println(isThere(s, 'n'));
		System.out.println(isThere(s, 'f'));
	}
}
