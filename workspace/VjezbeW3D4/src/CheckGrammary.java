public class CheckGrammary {

	public static String fixSentence(String sentence) {

		String fixed = "";
		for (int i=0;i<sentence.length();i++){
		fixed = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
		sentence = fixed;
		}
		if (sentence.charAt(sentence.length() - 1) != '.') {
			sentence += '.';
		}
		return sentence;
	}

	public static void main(String[] args) {
		System.out.println(fixSentence("hello"));

	}

}
