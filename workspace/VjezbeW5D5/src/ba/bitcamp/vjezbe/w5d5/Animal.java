package ba.bitcamp.vjezbe.w5d5;

public abstract class Animal extends LifeForm {

	public static final Integer FOOD_ANIMAL = 1;
	public static final Integer FOOD_PLANT = 2;

	protected double animalWeight;
	protected int mainFood;

	/**
	 * Constructor
	 * 
	 * @param isAlive
	 * @param animalWeight
	 * @param mainFood
	 */
	public Animal(Boolean isAlive, double animalWeight, int mainFood) {
		super(isAlive);
		this.animalWeight = animalWeight;
		this.mainFood = mainFood;
	}

	// Getters and Setters
	public double getAnimalWeight() {
		return animalWeight;
	}

	public void setAnimalWeight(double animalWeight) {
		this.animalWeight = animalWeight;
	}

	public int getMainFood() {
		return mainFood;
	}

	public void setMainFood(int mainFood) {
		this.mainFood = mainFood;
	}

	/**
	 * equals method
	 * 
	 * @param other
	 * @return true or false
	 */
	public boolean equals(Animal other) {
		return (other != null && super.equals(other)
				&& this.animalWeight == other.animalWeight && this.mainFood == other.mainFood);
	}

	/**
	 * toString method
	 */
	public String toString() {
		String food = "";
		if (mainFood == FOOD_ANIMAL) {
			food = "animals";
		}else if(mainFood == FOOD_PLANT){
			food = "plants";
		}
		return String.format("Animal weight: %s\n Main food: %s\n",
				animalWeight, food);
	}

	public abstract void eat(LifeForm lifeForm);
}
