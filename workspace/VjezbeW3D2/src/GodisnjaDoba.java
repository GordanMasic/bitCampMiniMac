import java.util.Scanner;

public class GodisnjaDoba {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Input name of the month: (eg. May) ");
		String month = in.nextLine();
		in.close();

		switch (month) {
		case "January":
		case "February":
		case "March":
			System.out.println("Winter!");
			break;
		case "April":
		case "May":
		case "June":
			System.out.println("Spring!");
			break;
		case "July":
		case "August":
		case "September":
			System.out.println("Summer!");
			break;
		case "October":
		case "November":
		case "December":
			System.out.println("Autumn!");
			break;
		}
	}

}
