
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 98689;
		int i = 0;
		
		int counter = 0;
				
		while (i++ <= num){
			if (num % i == 0)			
			counter++;
			}
		if (counter == 2){
			System.out.println("Broj je prost");
		}else
			System.out.println("Broj je slozen");

	}

}
