import java.util.InputMismatchException;
import java.util.Scanner;

public class Nova1 {
	public static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}

	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;
		Scanner in = new Scanner(System.in);
		try {
			num = in.nextInt();
			System.out.println(num / num2);
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Nije moguce");
		} catch (ArithmeticException e1) {
			System.out.println("Dijeljenje nije moguce");
		} finally {
			System.out.println("Ovo je finally");
		}
		System.out.println("Ovo je kraj programa");
		in.close();
	}

}
