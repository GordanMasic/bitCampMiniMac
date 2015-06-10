import java.util.Scanner;

public class Mujo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input number of containers: ");
		int n = input.nextInt();
		
		System.out.print("Input capacity: ");
		int k = input.nextInt();
		int counter = 0;
		input.close();
		
		int reducedN = n;
		while (reducedN > k){
			reducedN = n;
			while (reducedN % 2 == 0){
				reducedN /= 2;
			}if (reducedN > k){
				n++;
				counter++;
			}
		}
		System.out.println(counter);	
	}

}
