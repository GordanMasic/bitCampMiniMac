package ba.bitcamp.gordan.variables;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int num = 9;
		// int num2 = 2;
		// int multiplication = num * num2;
		// double division = num / num2;
		// String message = "Broj " + "je ";
		// int copyOfnum=num;
		// char character = 65 + 1;

		// System.out.println(message + division);
		// System.out.println(copyOfnum);

		int num = 9;
		int num2 = 2;

		boolean s = 2 == 3;
		double division = (double) num / num2;
		
		int crazyNumber = 3;
		
		crazyNumber += crazyNumber++ + ++crazyNumber;
		
		System.out.println("Crazy Number "+ crazyNumber);

		System.out.println("num++ " + num++);
		System.out.println("num " + num);

		System.out.println("++num2 " + ++num2);
		System.out.println("num2 " + num2);

		System.out.println("Boolean " + s);

		System.out.println("9/2 " + division);
	}

}
