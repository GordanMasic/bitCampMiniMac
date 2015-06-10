import java.util.Scanner;
public class MagicNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Unesi neki broj: ");
		int number = in.nextInt();
		int sum = 1;
		for (int i = 2; i < number; i++){
			if (number % i == 0){
				sum += i;
			}
		}if (sum == number){
			System.out.println("Magic number!");
		}else{
			System.out.println("Not a magic number!");
		}
		in.close();
	}

}
