public class Primjer3 {

	public static void main(String[] args) {

		System.out.println(threeNPlusOne(83));

	}

	public static String threeNPlusOne(int num) {
		String s = num + " ";
		while (num > 1) {
			if (num % 2 == 1) {
				num = 3 * num + 1;
				s +=", "+ num;
			} else {
				num /= 2;
				s +=", "+ num;
			}
		}
		return s;
	}
}
