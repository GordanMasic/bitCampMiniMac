import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int sum = 1;
		int counter = -1;
		int num = 0;
		double avg = 0;
		int min = 0;
		int max = 0;
		do {
			System.out.print("Unesi broj: ");
			num = in.nextInt();
			
			if (min <= num)
			sum += num;
			counter++;
			
		} while (num > -1);
		
		avg = (double) sum / counter;
		System.out.printf("AVG: %.2f", avg);

	}

}
