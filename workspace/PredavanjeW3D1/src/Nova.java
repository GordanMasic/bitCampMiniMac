import java.util.Scanner;
import java.util.InputMismatchException;

public class Nova {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		

		while (true) {
			try {
				System.out.println("Input number");
				int num = in.nextInt();
				System.out.println(num);
				break;

			} catch (InputMismatchException e) {
				System.out.println("pogresan unos");
				in.nextLine();
			}

		}in.close();
	}
}
