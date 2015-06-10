public class Task8 {

	public static void main(String[] args) {

		for (long i = 10000000; i < 100000000; i++) {
			long sum = 1;
			if (i % 2 == 0) {
				for (long j = 2; j < i; j++) {
					if (i % j == 0) {
						sum += j;
					}

				}
				if (sum != i) {
					System.out.println(i);
				}
			}
		}

	}

}
