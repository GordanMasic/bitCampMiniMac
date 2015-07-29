package ba.bitcamp.Objects;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -3712478401762933397L;
	
	private String name;
	private int sallary;

	public Employee(String name, int sallary) {
		this.name = name;
		this.sallary = sallary;
	}

	public String getName() {
		return name;
	}

	public int getSallary() {
		return sallary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSallary(int sallary) {
		this.sallary = sallary;
	}

	@Override
	public String toString() {
		return String.format("Employee name: %s, sallary: %s\n", name, sallary);
	}

}
