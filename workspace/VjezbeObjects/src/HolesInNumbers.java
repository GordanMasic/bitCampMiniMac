
public class HolesInNumbers {

	public static int getNumberOfHoles(int num){
		int counter = 0;
		int residuum = 0;
		for (int i = num; i > 0;i /= 10){
			residuum = i % 10;
			
				if(residuum == 0 || residuum == 4 || residuum == 6 || residuum == 9){
					counter += 1;
				}else if (residuum == 8){
					counter += 2;
				}
			
		}return counter;
	}
	
	public static void main(String[] args) {
		int counter = getNumberOfHoles(14983);
		System.out.println(counter);
		
	}
}
