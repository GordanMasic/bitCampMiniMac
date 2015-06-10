
public class Task10 {

	public static void main(String[] args) {
		
		
		
		long fibonaci = 50;
		long num1 = 1;
		long num2 = 0;
		long num3;
		
		System.out.print(num1 + " ");
		
		while (num1 < fibonaci){
			num3 = num1 + num2;
			num2 = num1;
			num1 = num3;
			System.out.print(num3 + " ");
			
		}

	}

}
