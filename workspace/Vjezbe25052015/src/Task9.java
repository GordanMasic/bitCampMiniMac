public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 9999;
		int b = 99999;
		
		while (a++ <= b) {

			int number = a;
			int c = 0;
			int d = 0;
			int e = number;
			int numOperat = 0;

			while (e / 10 != 0) {
				e = e / 10;
				numOperat++;
			}

			e = number;
			while (numOperat >= 0) {
				c = e % 10;
				e = e / 10;
				d += (int) (c * Math.pow(10, numOperat));
				numOperat--;
			}

			if (d == number) {
				int num = d;
				int i = 0;
				
				int counter = 0;
						
				while (i++ <= num){
					if (num % i == 0)			
					counter++;
					}
				if (counter == 2){
					System.out.println(d);
				}
			}

		}
	}
}
