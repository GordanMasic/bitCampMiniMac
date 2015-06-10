
public class Task4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1001; i < 10000; i++){
			
			
			int reverse = 0;
				for (int j = i; j > 0; j /= 10){
					
					reverse = reverse*10 +j%10;
					
				}if (reverse == i){
					System.out.println(reverse);
				}
			
		}
	}


	}


