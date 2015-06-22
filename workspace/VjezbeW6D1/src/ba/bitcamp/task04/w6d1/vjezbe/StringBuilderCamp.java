package ba.bitcamp.task04.w6d1.vjezbe;

public class StringBuilderCamp {

	private char[] characters;
	public static final int DEFAULT_SIZE = 0;

	public StringBuilderCamp() {
		this.characters = new char[DEFAULT_SIZE];
	}

	/**
	 * Places characters in the end
	 */
	public void append(Object o) {
		int charLength = characters.length;
		int newChar = charLength;
		newChar += o.toString().length();
		// Creating temp character array that will keep our letters
		char[] temp = new char[newChar];
		// Putting characters into temp array using loop
		for (int i = 0; i < characters.length; i++) {
			temp[i] = characters[i];
		}
		int counter = 0;
		// Converting word that comes in as object to characters, using loop
		for (int i = characters.length; i < temp.length; i++) {
			temp[i] = o.toString().charAt(counter++);
		}
		characters = temp;
	}

	// Places characters at the beginning
	public void prepend(Object o) {

		int charLength = characters.length;
		int newChar = charLength;
		newChar += o.toString().length();

		// Creating temp character array that will keep our letters
		char[] temp = new char[newChar];
		// Putting letters from Object o to temp as character using loop
		for (int i = 0; i < o.toString().length(); i++) {
			temp[i] = o.toString().charAt(i);
		}
		int counter = 0;
		// Putting characters one by one to temp
		for (int i = o.toString().length(); i < temp.length; i++) {
			temp[i] = characters[counter++];
		}
		characters = temp;
	}

	// Print method
	public String toString() {
		String s = "";
		for (int i = 0; i < characters.length; i++) {
			s += characters[i];
		}
		return s;
	}

	static class Statik {

		public void appendujGa(char[] characters, int num) {
			char[] array = new char[characters.length + num];
			for (int i = 0; i < characters.length; i++) {
				array[i] = characters[i];
			}
			characters = array;
		}

		public void metniUNiz(char[] characters, String s, int indexBegin) {
			char[] array = new char[characters.length + s.length()];
			if (0 <= indexBegin && indexBegin < characters.length) {
				for (int i = 0; i < indexBegin; i++) {
					array[i] = characters[i];
				}
				for (int i = indexBegin; i < s.length(); i++) {
					array[i] = s.charAt(i-indexBegin);
				}
				for (int i = indexBegin + s.length(); i < array.length; i++) {
					array[i] = characters[i-s.length()];
				}
			}
		}
		
		public void shiftajGa(char[] characters){
			char[] array = new char[characters.length+1];
			for (int i = array.length-characters.length; i < array.length; i++) {
				array[i] = characters[i-1];
			}
		}

	}

}
