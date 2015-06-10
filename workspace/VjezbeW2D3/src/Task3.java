public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for (int i = 101; i < 1000; i++) {
			boolean found = true;
			for (int j = 2; j < i; j++) {
				
				if (i % j == 0) {
					found = false;
					break;
				}
				
			}
			
			if (found == true){
				System.out.println(i);
			}
		}
	}

}
