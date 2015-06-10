import java.util.Scanner;

public class LowestIncommonDivident {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.printf("Unesi prvi broj ");
		int num1 = in.nextInt();
		System.out.print("Unesi drugi broj ");
		int num2 = in.nextInt();
		
		int min = num1;
		if(min > num2){
			min = num2;
		}
		int lcd = -1;
		boolean found = false;
		for (int i = 2; i <= min; i++){
			if (num1 % i == 0 && num2 % i == 0 ){
				lcd = i;
				found = true;
				break;
			}
		}
		if (found == true){
			System.out.print("LCD = " + lcd);
		}else{
			System.out.println("Nema LCD");
		}in.close();
	}
	

}
