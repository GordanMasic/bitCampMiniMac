public class CompareThreeStrings {

	public static String getFirst(String word1, String word2, String word3) {

		if (word2.compareTo(word3) <= 0) {
			if (word1.compareTo(word2) <= 0) {
				return word1;
			} else {
				return word2;
			}
		} else {
			if (word1.compareTo(word3) <= 0) {
				return word1;
			} else {
				return word3;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(getFirst("Camp", "Java", "Bit"));

	}

}
