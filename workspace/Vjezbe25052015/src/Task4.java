
public class Task4 {

	public static void main(String[] args) {
		
		int numbers = 5;
		int factoriel = 1;
		int num = 1;
		
		
		while (num <= numbers){
			
			factoriel *= num;
			num++;
		} 
		System.out.println(factoriel);

	}

}
