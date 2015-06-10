import java.util.Scanner;


public class SimpleFactors {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input random number: ");
		int number = in.nextInt();

		for(int i = 2; i <= number; i++){
			
			while (number % i == 0){
				System.out.print(i + " ");
				number /= i;
			}
		}
		in.close();
	}

}
