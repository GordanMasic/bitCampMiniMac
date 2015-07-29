package ba.bitcamp.task01;

import java.util.InputMismatchException;

public class Employee implements Comparable<Employee>{

	private static final char MALE = 'M';
	private static final char FEMALE = 'F';

	private String name;
	private String surname;
	private char gender;
	private String position;
	private int salary;

	public Employee(String name, String surname, char gender, String position,
			int salary) {
		this.name = name;
		this.surname = surname;
		if (gender == MALE || gender == FEMALE) {
			this.gender = gender;
		} else {
			throw new InputMismatchException("Incorrect gender!");
		}
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String
				.format("Employee name: %s\nSurname: %s\nGender: %s\nPosition: %s\nSalary: %s\n",
						name, surname, gender, position, salary);
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

}
