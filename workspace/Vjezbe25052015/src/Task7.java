public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 111221111;
		int b = 0;
		int c = 0;
		int a = number;
		int numOperat = 0;
		
		while (a / 10 != 0){
			a = a/10;
			numOperat++;
		}
		
		a = number;
		System.out.println(number);
		
		while (numOperat >= 0){
			b = a % 10;
			a = a / 10;
			c += (int) (b * Math.pow(10, numOperat));
			numOperat--;
		}
		
		if (c == number){
			System.out.println(" broj je palindrom");
		}else{
			System.out.println(" broj nije palindrom");
		}
		
	}

}
