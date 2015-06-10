
public class Main1 {

	
	
	public static boolean isPrime(int num){
		for (int i = 2; i < num; i++){
			if (num % i == 0){
				return false;
			}
			
		}
		return true;
	}
	public static void main(String [] args){
		boolean b = isPrime(11);
		System.out.println(b);
	}
	
}
