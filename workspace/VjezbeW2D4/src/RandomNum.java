public class RandomNum {

	public static void main(String[] args) {
		
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		int counter = 0;		
		do{
			
			for (int i = 1; i <= 1000; i++) {
			
				int rand = (int) (Math.random() * 5 + 1);
				if (rand == 1) {
				counter1++;
				} else if (rand == 2) {
				counter2++;
				} else if (rand == 3) {
				counter3++;
				} else if (rand == 4) {
				counter4++;
				} else if (rand == 5) {
				counter5++;
				}
				
			}
			
		}while(counter1 == counter2 && counter2 == counter3 && counter3 == counter4 && counter4 == counter5);	
		System.out.println(counter1);
	}
}
