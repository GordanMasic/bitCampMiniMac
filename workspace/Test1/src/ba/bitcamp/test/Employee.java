package ba.bitcamp.test;

public class Employee implements Comparable<Employee>, Searchable {

	// Variables
	private Integer counter = 0;

	private Integer id;
	private String name;
	private String surname;
	private Integer sallary;

	/**
	 * Constructor for creating Employee object
	 * 
	 * @param name
	 * @param surname
	 * @param sallary
	 */
	public Employee(String name, String surname, Integer sallary) {
		this.id = counter++;
		this.name = name;
		this.surname = surname;
		this.sallary = sallary;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Integer getSallary() {
		return sallary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setSallary(Integer sallary) {
		this.sallary = sallary;
	}

	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return String.format("Employee ID: %s\nName: %s %s\nSallary: %s\n", id,
				name, surname, sallary);
	}

	/**
	 * Searches certain string in this object
	 * 
	 * @param s
	 *            string to be searched
	 * @return true if find it , false if don't
	 */
	@Override
	public boolean fitsSearch(String s) {
		if (this.name.equals(s)) {
			return true;
		} else if (this.surname.equals(s)) {
			return true;
		} else if (String.valueOf(id).equals(s)) {
			return true;
		} else if (String.valueOf(sallary).equals(s)) {
			return true;
		} else

			return false;
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

}
