
public class Task6 {

	public static void main(String[] args) {
		
		int number = 1561564;
		int numOperat = 0;
		
		while (number / 10 != 0){
			number = number/10;
			numOperat++;
		}
		System.out.println(numOperat+1);
		
		

	}

}
