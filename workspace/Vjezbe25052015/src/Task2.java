public class Task2 {

	public static void main(String[] args) {

		int day = 23;
		int month = 6;
		int year = 1995;
		int num = 0;
		do {
			year++;
			num++;
			if (day == day && month == month){
				System.out.println(day + "." + month + "." + year);
			}

		} while (year < 2015 && day == day && month == month);
		System.out.println(day + "." + month + "." + year);

	}

}
