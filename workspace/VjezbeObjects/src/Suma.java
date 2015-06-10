
public class Suma {

	
	public static int getSum(int num1,int num2,int num3){
		int sum = 0;
		for (int i = 1;i <= num1;i++){
			 sum += i; 
		}
		for (int i = 1;i <= num2;i++){
			 sum += i; 
		} 
		for (int i = 1;i <= num3;i++){
			 sum += i; 
		}
		return sum;
	}
	public static void main(String[] args) {
		int sum = getSum(11,11,3);
		System.out.println(sum);

	}

}
