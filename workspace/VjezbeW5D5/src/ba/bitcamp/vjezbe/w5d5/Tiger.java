package ba.bitcamp.vjezbe.w5d5;

public class Tiger extends Animal {

	public static final Integer STATE_HUNT = 1;
	public static final Integer STATE_RESTING = 2;
	public static final Integer STATE_EATING = 3;

	public static final Integer STATE_GOOD = 1;
	public static final Integer STATE_SICK = 2;
	public static final Integer STATE_DEATHLY_SICK = 3;
	public static final Integer STATE_DEATH = 4;

	private Integer speed;
	private Integer state;
	private Integer healthState;
	private Integer health;

	/**
	 * Constructor
	 * 
	 * @param isAlive
	 * @param animalWeight
	 * @param mainFood
	 * @param speed
	 * @param state
	 */
	public Tiger(Boolean isAlive, double animalWeight, int mainFood,
			Integer speed, Integer state, Integer health) {
		super(isAlive, animalWeight, mainFood);
		if (health < 0 || health > 100) {
			throw new IllegalArgumentException(
					"Health must be in range from 0 to 100!");
		}
		this.health = health;
		this.speed = speed;
		this.state = state;
		this.mainFood = FOOD_ANIMAL;
	}

	// Getters and Setters
	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
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
		String activity = "";
		if (state == STATE_RESTING) {
			activity = "resting";
		} else if (state == STATE_HUNT) {
			activity = "hunting";
		} else if (state == STATE_EATING) {
			activity = "eating";
		}
		return String.format("Speed: %s\nState: %s\n", speed, activity);
	}

	/**
	 * equals method
	 * 
	 * @param other
	 * @return true or false
	 */
	public boolean equals(Tiger other) {
		return (other != null && super.equals(other)
				&& this.speed == other.speed && this.state == other.state);
	}

	@Override
	public void eat(LifeForm lifeForm) {

		if (lifeForm instanceof Animal) {
			Animal animal = (Animal) lifeForm;
			if (animal instanceof Tiger) {
				System.out.println("Tiger doesn't eat other tiger!");
			} else if (animal instanceof Zebra) {
				Zebra zebra = (Zebra) animal;
				if (state == STATE_RESTING) {
					System.out.println("Tiger is resting");
				} else if (state == STATE_EATING) {
					System.out.println("Tiger is already eating");
				} else {
					System.out.println("Tiger will eat it!");
					if (zebra.getState() == Zebra.STATE_SICK
							|| zebra.getState() == Zebra.STATE_DEATH
							|| zebra.getState() == Zebra.STATE_DEATHLY_SICK){
						health -= (int)zebra.animalWeight/2;
					
						if (health < 0) {
							health = 0;
							state = 4;
							System.out.println("Tiger dies!");
						} else if (health > 0 && health < 15) {
							state = 3;
							System.out.println("Tiger is deathly sick!");
						} else if (health > 15 && health <= 50) {
							state = 2;
							System.out.println("Tiger is sick!");
						} else if (health > 50) {
							state = 1;
							System.out.println("TIger is healthy!");
						}
					}else{
						health += (int)zebra.animalWeight/10;
						if (health > 100) {
							health = 100;
						}
					}
				}
			}
		} else if (lifeForm instanceof Plant) {
			System.out.println("Tiger doesn't eat plants!");
		}

	}

}
