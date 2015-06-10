import java.util.Scanner;
public class PetljaUPetlji {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.printf("Unesi prvi broj ");
		int num1 = in.nextInt();
		System.out.print("Unesi drugi broj ");
		int num2 = in.nextInt();
		int prod;
		for (int i = 1; i <= num1; i++){
			for (int j = 1; j <= num2; j++){
				prod = i*j;
				System.out.printf("%4d", prod );
			}
			System.out.println();
		}
in.close();
	}

}
