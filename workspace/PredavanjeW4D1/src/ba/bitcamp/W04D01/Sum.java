package ba.bitcamp.W04D01;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		for (String number : args) {
			System.out.println(number);
			sum += Integer.parseInt(number);
		}
		System.out.println("Sum of inputed numbers is: " + sum);

	}

}
