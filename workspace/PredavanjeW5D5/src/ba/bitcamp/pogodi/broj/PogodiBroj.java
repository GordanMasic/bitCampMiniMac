package ba.bitcamp.pogodi.broj;

import java.util.Scanner;

public class PogodiBroj {

	private int maxBroj;
	private int maxBrojPogadjanja;

	public PogodiBroj(int maxBroj, int maxBrojPogadjanja) {
		super();
		this.maxBroj = maxBroj;
		this.maxBrojPogadjanja = maxBrojPogadjanja;
	}

	public PogodiBroj(int maxBroj) {
		this(maxBroj, maxBroj / 100 + 1);
	}

	public PogodiBroj() {
		this(1000, 10);
	}

	public void playGame() {
		Scanner in = new Scanner(System.in);
		int counter = 1;
		int number = 0;
		int result = (int) (Math.random() * maxBroj);
		while (counter <= maxBrojPogadjanja) {

			System.out.println("Unesi broj: ");
			number = in.nextInt();
			if (number == result) {
				System.out.println("Pobijedio si u " + counter + " pokusaja");
				break;
			} else if (number < result) {
				System.out.println("Broj je veci");
			} else {
				System.out.println("Broj je manji");
			}
			if (counter == maxBrojPogadjanja) {
				System.out.println("\nIzgubio si! Trazeni broj je: " + result);
			}
			counter++;
		}
		in.close();
	}
}
