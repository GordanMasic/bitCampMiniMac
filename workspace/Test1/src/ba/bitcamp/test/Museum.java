package ba.bitcamp.test;

import java.util.ArrayList;
import java.util.Collections;

public class Museum {

	// Variables
	private ArrayList<Employee> employees;
	private ArrayList<Exponate> exponates;

	/**
	 * Constructor for creating Museum objects
	 */
	public Museum() {
		this.employees = new ArrayList<Employee>();
		this.exponates = new ArrayList<Exponate>();
	}

	/**
	 * Add employee to museum
	 * 
	 * @param employee
	 *            employee
	 */
	public void add(Employee employee) {
		this.employees.add(employee);
	}

	/**
	 * Add artifact to museum
	 * 
	 * @param artifact
	 *            artifact
	 */
	public void add(Artifacts artifact) {
		this.exponates.add(artifact);
	}

	/**
	 * Add artWork to museum
	 * 
	 * @param artWork
	 *            art work
	 */
	public void add(ArtWorks artWork) {
		this.exponates.add(artWork);
	}

	/**
	 * toString method
	 */
	public String toString() {
		return employees + "\n" + exponates + "\n";
	}

	/**
	 * Sort employees by name
	 */
	public void sortEmployees() {
		Collections.sort(employees);
	}

	/**
	 * Sort exponates by name
	 */
	public void sortExponates() {
		Collections.sort(exponates);
	}
}
