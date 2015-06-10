public class Task5 {

	public static void main(String[] args) {

		for (int i = 10301; i < 100000; i++) {

			int reverse = 0;
			for (int j = i; j > 0; j /= 10) {

				reverse = reverse * 10 + j % 10;

			}
		
			boolean found = true;
			for (int z = 2; z < i; z++) {
				
				if (i % z == 0) {
					found = false;
					break;
				}
				
			}
			
			if (found == true && reverse == i){
				System.out.println(i);
			}
		}

	}

}
