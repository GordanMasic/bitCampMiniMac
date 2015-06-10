import java.util.Scanner;


public class StringName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String name = in.next();
		
		int b = name.length();
		
		for (int a=0;a<b;a++){
			
		
			if(a % 2 != 0){
				name.toUpperCase();
			
			System.out.println(name.charAt(a));
		}
			else{
				System.out.println(name.charAt(a));
			}
		}
		
	}

}
