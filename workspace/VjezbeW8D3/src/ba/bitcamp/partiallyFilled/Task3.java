package ba.bitcamp.partiallyFilled;

import java.util.Arrays;

public class Task3 {

	public static String[] partFill(String...strings){
		
		int counter = 0;
		for (int i = 0; i < strings.length; i++) {
			if(strings[i] != null){
				counter++;
			}
		}
		String[] s = new String[counter];
		counter = 0;
		for (int i = 0; i < strings.length; i++) {
			if(strings[i] != null){
				s[counter] = strings[i];
				counter++;
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(partFill("java","doc",null,"bla bla",null,"sjdakl",null,"sdas","gfdsg","ghdfsg")));
	}
}
