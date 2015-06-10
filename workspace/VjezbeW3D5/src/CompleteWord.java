public class CompleteWord {

	public static String getTheRest(String word1, String word2) {
		char c = word2.charAt(0);
		for (int i = 0; i < word1.length(); i++) {
			if (c == word1.charAt(i)) {
				return word2.concat(word1.substring(i+word2.length()));
			}
		}

		return null;
	}

	public static void main(String[] args) {
		System.out.println(getTheRest("BitCamp", "Ca"));// = „Camp“

	}

}
