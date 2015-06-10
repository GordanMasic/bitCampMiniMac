import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesi neki broj: ");
		int num = in.nextInt();
		
		
		boolean isPrime = true;
		
		for (int i = 2; i < num; i++){
			if (num % i == 0){
				isPrime = false;
				break;
			}
		}if (isPrime == false){
			System.out.println("slozen");
		}else{
			System.out.println("prost");
		}
		in.close();
	}

}
