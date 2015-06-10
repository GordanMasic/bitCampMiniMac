
public class Task5 {

	public static void main(String[] args) {
		
		int numbers = 100;
		int num1 = 3;
		int num2 = 5;
		
		int count = 0;
		
		while (count++ < numbers){
			if (count % 2 != 0 && count % 3 ==0 & count % 5 != 0){
				System.out.println(count);
			}
		}

	}

}
