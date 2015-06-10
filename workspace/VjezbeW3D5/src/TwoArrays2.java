import java.util.Arrays;

public class TwoArrays2 {

	public static int[] getArray2(int n, int m) {
		int[] array = new int[n];
		int j = 1;
		for (int i = 0; i < n; i++) {
			while (j <= m) {
				array[i] = j;
				break;
			}
			if (j == m) {
				j = 1;
			} else {
				j++;
			}
		}

		return array;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray2(5, 2)));

	}

}
