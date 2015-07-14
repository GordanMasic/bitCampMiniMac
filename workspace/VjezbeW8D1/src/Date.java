
public class Date {

	private int day;
	private int month;
	private int year;
	
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}


	@Override
	public String toString() {
		return String.format("%s.%s.%s", day, month,
				year);
	}
	
	public static void main(String[] args) {
		
		Date[] dates = {new Date(10, 6, 1991),new Date(12, 3, 1966), new Date(30, 5, 1997), new Date(17, 8, 1963)};
		
		for(Date d : dates){
			System.out.println(d.toString());
			System.out.println();
		}
	}
	
}
