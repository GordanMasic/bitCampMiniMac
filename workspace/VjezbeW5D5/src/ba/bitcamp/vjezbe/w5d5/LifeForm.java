package ba.bitcamp.vjezbe.w5d5;

public abstract class LifeForm {

	protected Boolean isAlive;

	// Getters and Setters
	public Boolean getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(Boolean isAlive) {
		this.isAlive = isAlive;
	}

	/**
	 * Constructor
	 * 
	 * @param isAlive
	 */
	public LifeForm(Boolean isAlive) {
		super();
		this.isAlive = isAlive;
	}

	/**
	 * toString
	 */
	public String toString() {
		return String.format("Is alive: %s \n", isAlive);
	}

	/**
	 * equals method
	 * 
	 * @param other
	 * @return true or false
	 */
	public boolean equals(LifeForm other) {
		return (other != null && this.isAlive == other.isAlive);
	}

}
