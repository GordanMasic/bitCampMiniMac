
public class Primjer1 {

	public static void test(int num){
		
		int counter = 1;
		while(num > 1){
			System.out.println(num);
			if(num %2 == 1)
				num = 3 * num + 1;
			else num = num /2;
			counter++;
		}System.out.println(num);
		System.out.println("There were " + counter + " terms in the sequence.");
		
	}
	public static void main(String[] args) {
		
		test(83);
	}

}
