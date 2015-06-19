package ba.bitcamp.vjezbe.w5d5;

public class Zebra extends Animal {

	public static final Integer STATE_GOOD = 1;
	public static final Integer STATE_SICK = 2;
	public static final Integer STATE_DEATHLY_SICK = 3;
	public static final Integer STATE_DEATH = 4;

	private Integer monthsOld;
	private Integer state;
	private Integer health;

	/**
	 * Constructor
	 * 
	 * @param isAlive
	 * @param animalWeight
	 * @param mainFood
	 * @param monthsOld
	 * @param state
	 */
	public Zebra(Boolean isAlive, double animalWeight, int mainFood,
			Integer monthsOld, Integer health) {
		super(isAlive, animalWeight, mainFood);
		if (health < 0 || health > 100) {
			throw new IllegalArgumentException(
					"Health must be in range from 0 to 100!");
		}
		this.health = health;
		this.monthsOld = monthsOld;
		this.mainFood = FOOD_PLANT;
	}

	// Getters and Setters
	public Integer getMonthsOld() {
		return monthsOld;
	}

	public void setMonthsOld(Integer monthsOld) {
		this.monthsOld = monthsOld;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * toString method
	 */
	public String toString() {
		String health = "";
		if (state == STATE_GOOD) {
			health = "healthy";
		} else if (state == STATE_SICK) {
			health = "sick";
		} else if (state == STATE_DEATHLY_SICK) {
			health = "deathly sick";
		}
		return String.format("Months old: %s\nHealth: %s\n", monthsOld, health);
	}

	/**
	 * equals method
	 * 
	 * @param other
	 * @return true or false
	 */
	public boolean equals(Zebra other) {
		return (other != null && super.equals(other)
				&& this.monthsOld == other.monthsOld && this.state == other.state);
	}

	@Override
	/**
	 * Method for feeding zebra
	 */
	public void eat(LifeForm lifeForm) {
		{
			//Checking if inputed life form is animal
			if (lifeForm instanceof Animal) {
				System.out.println("Zebra doesn't eat other animals");
			//Checking if life form is plant
			} else if (lifeForm instanceof Plant) {
				Plant plant = (Plant) lifeForm;
				//Checking is plant toxic
				if (plant.getIsToxic() == true) {
					//Checking if plant has a little bit of eatable parts
					if (plant.getQuantity() == Plant.QUANTITY_LOW) {
						//Health decreases for 20
						health -= 20;		
						if(health < 0){
							health = 0;
							state = 4;
							System.out.println("Zebra dies!");
						}else if(health > 0 && health < 15){
							state = 3;
							System.out.println("Zebra is deathly sick!");
						}else if(health > 15 && health <= 50){
							state = 2;
							System.out.println("Zebra is sick!");
						}else if(health > 50){
							state = 1;
							System.out.println("Zebra is healthy!");
						}
					} else if (plant.getQuantity() == Plant.QUANTITY_NORMAL) {
						health -= 40;
						if(health < 0){
							health = 0;
							state = 4;
							System.out.println("Zebra dies!");
						}else if(health > 0 && health < 15){
							state = 3;
							System.out.println("Zebra is deathly sick!");
						}else if(health > 15 && health <= 50){
							state = 2;
							System.out.println("Zebra is sick!");
						}else if(health > 50){
							state = 1;
							System.out.println("Zebra is healthy!");
						}
					} else if (plant.getQuantity() == Plant.QUANTITY_HIGH) {
						health -= 60;
						if(health < 0){
							health = 0;
							state = 4;
							System.out.println("Zebra dies!");
						}else if(health > 0 && health < 15){
							state = 3;
							System.out.println("Zebra is deathly sick!");
						}else if(health > 15 && health <= 50){
							state = 2;
							System.out.println("Zebra is sick!");
						}else if(health > 50){
							state = 1;
							System.out.println("Zebra is healthy!");
						}
					}
				} else {
					if (plant.getQuantity() == Plant.QUANTITY_LOW) {
						health += 10;
						if (health > 100) {
							health = 100;
						}
					} else if (plant.getQuantity() == Plant.QUANTITY_NORMAL) {
						health += 20;
						if (health > 100) {
							health = 100;
						}
					} else if (plant.getQuantity() == Plant.QUANTITY_HIGH) {
						health += 30;
						if (health > 100) {
							health = 100;
						}
					}
				}
			}
		}
	}

}
