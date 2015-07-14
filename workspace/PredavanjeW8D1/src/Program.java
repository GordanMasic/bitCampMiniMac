public class Program {

	// private static int sumParams(int... params){
	// int sum = 0;
	// for (int i = 0; i < params.length; i++) {
	// sum+= params[i];
	// }
	// return sum;
	// }
	//
	// private static String stringify(Object... params){
	// StringBuilder sb = new StringBuilder();
	// for(Object s: params){
	// sb.append(s);
	// }
	//
	// return sb.toString();
	// }

	private static boolean hasUniqueCharacters(String s) {
		// for (int i = 0; i < s.length(); i++) {
		// String sub = s.substring(i+1);
		// for (int j = 0; j < sub.length(); j++) {
		// if(s.charAt(i) == sub.charAt(j)){
		// return false;
		// }
		// }
		//
		//
		// }
		// return true;

		int[] signs = new int[255];
		for (int i = 0; i < s.length(); i++) {
			signs[s.charAt(i)]++;
			if (signs[i] != 1) {
				return false;
			}

		}
		return true;
	}

	private static boolean isPermutation(String s1, String s2) {

		int[] signs = new int[255];
		for (int i = 0; i < s1.length(); i++) {
			signs[s1.charAt(i)]++;
			signs[s2.charAt(i)]--;
		}
		
		for (int i = 0; i < signs.length; i++) {
			if(signs[i] != 0){
				return false;
			}
		}
		
		return true;

	}

	private static boolean isSubstring(String original,String substring){
		int index = 0;
		for (int i = 0; i < original.length(); i++) {
			if(original.charAt(i) == substring.charAt(0)){
				index = i;
				break;
			}
		}
		String sub = original.substring(index)+original.substring(0, index);
		original = sub;
		for (int i = 0; i < substring.length(); i++) {
			if(substring.charAt(i) != original.charAt(i)){
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {

		// System.out.println(sumParams(1,2,3,4,5,6,7,8,9));
		//
		// System.out.println();
		//
		// System.out.println(sumParams(1,2));

		// System.out.println(stringify("Neki","String"));
		//
		// System.out.println(stringify(1,2,3,4,5,6,7));

//		System.out.println(hasUniqueCharacters("Kristna12"));
		
		System.out.println(isSubstring("vozdra", "zdrav"));
	}

}
