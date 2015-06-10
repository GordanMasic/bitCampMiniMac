import java.util.Scanner;

public class Sabiranje {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while (true) {
			try {
				System.out
						.println("Enter a expresion of type int operator int");
				String operation = in.nextLine();
				
				int result = 0;
				int l = operation.length();
				String num1 = "";
				String num2 = "";
				int counter = 0;
				for (int i = 0; i < l; i++) {
					if (operation.charAt(i) == '+'
							|| operation.charAt(i) == '-'
							|| operation.charAt(i) == '/'
							|| operation.charAt(i) == '*') {

						counter = operation.indexOf(operation.charAt(i));
					}

				}
				num1 = operation.substring(0, counter);

				num2 = operation.substring(counter + 1, l);

				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);

				// 1+2-4+6....
System.out.println(counter);
				switch (operation.charAt(counter)) {
				case '+':
					result = number1 + number2;
					System.out.printf("%d %c %d = %d",number1,operation.charAt(counter),number2,result);
					break;
				case '-':
					result = number1 - number2;
					System.out.println(result);
					break;
				case '/':
					result = number1 / number2;
					System.out.println(result);
					break;
				case '*':
					result = number1 * number2;
					System.out.println(result);
					break;
				}

				break;
			} catch (NumberFormatException e) {
				System.out.println("Wrong input!");
			}
			
		}
	}
}
