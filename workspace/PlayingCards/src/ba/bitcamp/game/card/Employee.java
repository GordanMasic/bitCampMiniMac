package ba.bitcamp.game.card;

public class Employee {

	protected String name;
	protected String gender;
	
	
	public Employee(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	
	public String toString(){
		return "Employee class: " + name + " " + gender;
	}
	
}
