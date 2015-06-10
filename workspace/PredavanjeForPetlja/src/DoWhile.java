import java.util.Scanner;


public class DoWhile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int input = 0;
		int counter = 0;
		int parni = 0;
		int neparni = 0;
		do {
			System.out.println("Unesi broj: ");
			input = in.nextInt();
			if (input !=0 ){
				if (input % 2 == 0){
					parni++;
				}else {
					neparni++;
				}counter++;
			}
			
		}while(input != 0);
		
		System.out.printf("Uneseno je %d brojeva i to %d parnih i %d neparnih", counter, parni, neparni);
	}

}
