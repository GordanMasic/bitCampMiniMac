import java.util.Scanner;


public class MathQuiz {

	public static void main(String[] args) {
		
		long milliseconds =System.currentTimeMillis();
		int seconds = (int) (milliseconds / 1000) % 60 ;
		int minutes = (int) ((milliseconds / (1000*60)) % 60);
		int hours   = (int) ((milliseconds / (1000*60*60)) % 24);
		int hoursBalkan = hours+2;
		
		
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Person before you had ");
		TextIO.readFile("src/text.txt");
		 String result1 = TextIO.getWord();
		 String result2 = TextIO.getWord();
		 int result3 = TextIO.getInt();
		 String result4 = TextIO.getWord();
		 int result5 = TextIO.getInt();
		 String result6 = TextIO.getWord();
		 System.out.println(result1+" "+result2+" "+result3);
		 System.out.println(result4 + " " + result5);
		 System.out.println("Last time game played: "+result6);
		 TextIO.readStandardInput();
		 System.out.println();
		
		
		int counter = 0;
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		for (int i = 1; i <= 10; i++){
		int num1 = (int)(Math.random()*9+1);
		int num2 = (int)(Math.random()*9+1);
		
			System.out.printf("How much is %d * %d? \n", num1, num2);
			int solution = in.nextInt();
			if (solution == num1*num2){
				counter1++;
			}
		}System.out.printf("Your scored %d times\n",counter1);
		
		if (counter1 > 8){
			System.out.println("For higher level input 2 for end of game input 1:");
			int answer = in.nextInt();
			if (answer == 2){
				for (int i = 1; i <= 10; i++){
					int num1 = (int)(Math.random()*19+1);
					int num2 = (int)(Math.random()*9+1);
					
						System.out.printf("How much is %d * %d? \n", num1, num2);
						int solution = in.nextInt();
						if (solution == num1*num2){
							counter2++;
						}
					}System.out.printf("Your scored %d times\n",counter2);
					if (counter2 > 8){
						System.out.println("For higher level input 2 for end of game input 1:");
						int answer1 = in.nextInt();
						if (answer1 == 2){
							for (int i = 1; i <= 10; i++){
								int num1 = (int)(Math.random()*19+1);
								int num2 = (int)(Math.random()*19+1);
								
									System.out.printf("How much is %d * %d? \n", num1, num2);
									int solution = in.nextInt();
									if (solution == num1*num2){
										counter3++;
									}
								}System.out.printf("Your scored %d times\n",counter3);
							
						}
					}
				
			}
		}counter = counter1+ counter2+counter3;
		if (result5<counter){
			TextIO.writeFile("src/text.txt");
			TextIO.putln("Total score: " + counter);
			TextIO.putln("HIGHSCORE: " + counter);
			TextIO.putf("%d:%d:%d\n",hoursBalkan,minutes,seconds);
			TextIO.writeStandardOutput();
		}else{
			TextIO.writeFile("src/text.txt");
			TextIO.putln("Total score: " + counter);
			TextIO.putln("HIGHSCORE: " + result5);
			TextIO.putln(hoursBalkan+":"+minutes+":"+seconds);
			TextIO.writeStandardOutput();	
		}
	}

}
