
public class Main {

	public static void main(String[] args) {
		
		
		
		User u = new User("John", "Doe");
		

		User u1 = new User("Joe", "Bloggs",12);
		
		
		System.out.println(u.getName() + " " + u.getId());
		System.out.println(u1.getName() + " " + u1.getId());
	}
}
