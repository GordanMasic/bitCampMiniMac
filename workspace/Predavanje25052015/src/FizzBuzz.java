
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = 5;
		int i = 0;
		
		
		
		while (i++ < 100){
			
			if  (i % a == 0 && i % b == 0){
				System.out.println("FIZZBUZZ");
			}else if ((i % b) == 0) {
				System.out.println("BUZZ");
			}else if((i % a) == 0){
				System.out.println("FIZZ");
			}else {
				System.out.println(i);
			}
		}
	}

}
