
public class FindHigherNum {

	public static int getMax(int num1, int num2){
		int max = (num1 >= num2)?num1:num2;
		return max;
	}
	public static void main(String[] args) {
		System.out.println(getMax(2, 5));

	}

}
