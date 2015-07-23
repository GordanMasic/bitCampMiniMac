package ba.bitcamp.test;

import java.util.StringTokenizer;

public abstract class Exponate implements Comparable<Exponate>, Searchable {

	// Variables
	private Integer counter = 0;

	private Integer id;
	private String name;
	private String description;

	/**
	 * Constructor for getting Exponate object variable values
	 * 
	 * @param name
	 * @param description
	 */
	public Exponate(String name, String description) {
		this.id = counter++;
		this.name = name;
		this.description = description;
	}

	// Getters and setters
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return String.format("Exponate:\nID: %s\nName: %s\nDescription: %s\n",
				id, name, description);
	}

	/**
	 * Equals method for comparing two Exponate objects
	 * 
	 * @param other
	 *            Exponate object to compare with
	 * @return true if same, false if not
	 */
	public boolean equals(Exponate other) {
		return (this.name.equals(other.name) && this.id == other.id && this.description
				.equals(other.description));

	}

	/**
	 * Compares two Exponate objects by name
	 */
	@Override
	public int compareTo(Exponate o) {
		return name.compareTo(o.name);
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
		} else if (String.valueOf(id).equals(s)) {
			return true;
		} else {
			for (int i = 0; i < description.length(); i++) {
				StringTokenizer st = new StringTokenizer(description, " ");
				while (st.hasMoreTokens()) {
					if (st.nextToken().equals(s)) {
						return true;
					}
				}
			}

		}

		return false;
	}

}
