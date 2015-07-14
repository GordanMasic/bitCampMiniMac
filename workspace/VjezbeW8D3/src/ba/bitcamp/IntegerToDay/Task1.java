package ba.bitcamp.IntegerToDay;

import java.util.ArrayList;

public class Task1 {

	public static String dayNum(int num) {
		try {
			ArrayList<String> days = new ArrayList<String>();
			days.add("Monday");
			days.add("Tuesday");
			days.add("Wednesday");
			days.add("Thursday");
			days.add("Friday");
			days.add("Saturday");
			days.add("Sunday");
			return days.get(num - 1);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Wrong input!");
			return null;
		}

	}

	private static String dayNumArray(int num) {
		try {
			String[] days = new String[7];
			days[0] = "Monday";
			days[1] = "Tuesday";
			days[2] = "Wednesday";
			days[3] = "Thursday";
			days[4] = "Friday";
			days[5] = "Saturday";
			days[6] = "Sunday";
			return days[num - 1];
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Wrong input!");
			return null;
		}
	}

	public static void main(String[] args) {

		int num = 1;
		System.out.println(dayNum(num));
		System.out.println(dayNumArray(num));

	}

}
