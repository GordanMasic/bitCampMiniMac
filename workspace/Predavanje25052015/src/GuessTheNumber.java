import java.util.Scanner;


public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxNum = 1000;
		int randomNum = (int)(Math.random() * maxNum);
		System.out.println("Zamislio sam broj od 0 do " + maxNum);
		int pokusaj,brojPokusaja = 0;
		Scanner ulaz = new Scanner (System.in);
		
		do {
			brojPokusaja++;
			System.out.print("Unesi broj: ");
			pokusaj = ulaz.nextInt();
			if (pokusaj > randomNum){
				System.out.println("Unesi manji broj ");
			}else if ( pokusaj < randomNum){
				System.out.println("Unesi veci broj ");
			}
		}while (pokusaj != randomNum);
		System.out.println("Pogodjen broj "+ randomNum + " u " + brojPokusaja + " pokusaja");

	}

}
