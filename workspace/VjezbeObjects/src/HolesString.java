
public class HolesString {

	public static int getNumberOfHoles(String num){
		int length = num.length();
		int counter = 0;
		for(int i = 0;i < length;i++){
			char digit = num.charAt(i);
					if(digit == '4' || digit == '6'||digit == '0' || digit == '9'){
						counter += 1;
					}else if (digit == '8'){
						counter += 2;
					}
		}
			
			
		return counter;
	}
	
	public static void main(String[] args) {
		int counter = getNumberOfHoles("225883");
		System.out.println(counter);
		
	}
}
