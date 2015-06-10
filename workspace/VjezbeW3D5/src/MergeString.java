public class MergeString {

	public static String merge(String word1, String word2) {
		return (word2.substring(0, word2.length() / 2).concat(word1)
				.concat(word2.substring(word2.length() / 2, word2.length())));
	}

	public static void main(String[] args) {
		System.out.println(merge(" ", "Java"));

	}

}
