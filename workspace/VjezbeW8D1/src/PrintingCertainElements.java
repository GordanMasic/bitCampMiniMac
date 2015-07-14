public class PrintingCertainElements {

	public static void main(String[] args) {

		char[] array = new char[] { 'A', 'b', 'c', 'I', 'd', 'e', 'f', 'R' };

		for (char c : array) {
			if (Character.isUpperCase(c)) {
				System.out.print(c);
			}
		}

	}

}
