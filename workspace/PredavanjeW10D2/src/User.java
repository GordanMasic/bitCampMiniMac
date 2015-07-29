import java.io.Serializable;


public class User implements Serializable{

	private static final long serialVersionUID = -4654318766566313061L;
	
	private String name;
	private int year;
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public User(String name, int year) {
		this.name = name;
		this.year = year;
	}
	@Override
	public String toString() {
		return String.format("User name = %s\nAge = %s", name, year);
	}
	
	
}
