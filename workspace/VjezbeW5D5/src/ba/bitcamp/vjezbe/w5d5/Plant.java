package ba.bitcamp.vjezbe.w5d5;

public class Plant extends LifeForm {

	public static final Integer QUANTITY_LOW = 1;
	public static final Integer QUANTITY_NORMAL = 2;
	public static final Integer QUANTITY_HIGH = 3;

	private Boolean isToxic;
	private Integer quantity;

	/**
	 * Constructor
	 * 
	 * @param isAlive
	 * @param isToxic
	 * @param quantity
	 */
	public Plant(Boolean isAlive, Boolean isToxic, Integer quantity) {
		super(isAlive);
		this.isToxic = isToxic;
		this.quantity = quantity;
	}

	// Getters and Setters
	public Boolean getIsToxic() {
		return isToxic;
	}

	public void setIsToxic(Boolean isToxic) {
		this.isToxic = isToxic;
	}

	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * toString method
	 */
	public String toString() {
		String eatable = "";
		if (quantity == QUANTITY_LOW) {
			eatable = "little bit";
		} else if (quantity == QUANTITY_NORMAL) {
			eatable = "normal";
		} else if (quantity == QUANTITY_HIGH) {
			eatable = "a lot";
		}
		return String.format("Is toxic plant: %s\nEatable: %s\n", isToxic,
				eatable);
	}

	/**
	 * equals method
	 * 
	 * @param other
	 * @return true or false
	 */
	public boolean equals(Plant other) {
		return (other != null && super.equals(other) && this.isToxic == other.isToxic);
	}

}
