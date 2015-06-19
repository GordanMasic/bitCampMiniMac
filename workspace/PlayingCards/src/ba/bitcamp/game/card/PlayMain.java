package ba.bitcamp.game.card;



public class PlayMain {

	public static void main(String[] args) {

		Employee e = new Employee("John", "Male");
		System.out.println(e);
		
		SalaryEmployee se = new SalaryEmployee("Sue", "Female", 2000);
		System.out.println(se);
	}

}
