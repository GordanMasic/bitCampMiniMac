import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesi neki broj: ");
		
		int number = in.nextInt();
		System.out.println("Parni brojevi do tog broja su ");
		for(int i = 1; i < number; i++){
			if (i%2 == 0){
				System.out.print(i + " ");
				
			}
		}
		in.close();
	}

}
