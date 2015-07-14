
public class Repetitions {

	public static void main(String[] args) {
		
		repeats(5, 1,2,3,4,2,5,7,8,9,5,1,4,7,5,6,8,5);

	}

	public static void repeats(int number, int...is){
		int counter = 0;
		for (int i = 0; i < is.length; i++) {
			if(number == is[i]){
				counter++;
			}
		}
		System.out.println(counter);
	}
}
