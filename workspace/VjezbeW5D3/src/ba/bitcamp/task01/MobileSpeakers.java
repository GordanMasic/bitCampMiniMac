package ba.bitcamp.task01;

public class MobileSpeakers {

	private static final int MAX_VOLUME = 100;
	private static final int MIN_VOLUME = 0;
	private static final int MIN_USAGE = 0;
	private static final int MAX_USAGE = 100;
	
	
	
	private String manufacturerName;
	private int price;
	private boolean isOn;
	private int currentVolume;
	private int batteryUsagePerHour;
	
	/**
	 * Constructor for creating MobileSpeakers objects
	 * @param manufacturerName
	 * @param price
	 * @param baterryUsagePerHour
	 */
	public MobileSpeakers(String manufacturerName, int price,
			int batteryUsagePerHour) {
		if(price<0){
			throw new IllegalArgumentException("Price can't be negative!");
		}
		if(batteryUsagePerHour <= MIN_USAGE || batteryUsagePerHour > MAX_USAGE){
			throw new IllegalArgumentException("Battery usage per hour must be in range from 1 to 100!");
		}
		this.manufacturerName = manufacturerName;
		this.price = price;
		this.batteryUsagePerHour = batteryUsagePerHour;
		this.isOn = false;
		this.currentVolume = 0;
	}
	
	/**
	 * Returns manufacturer name
	 * @return manufacturerName
	 */
	public String getManufacturerName(){
		return manufacturerName;
	}
	/**
	 * Returns product price
	 * @return price
	 */
	public int getPrice(){
		return price;
	}
	
	/**
	 * Returns if product is ON or OFF
	 * @return isOn
	 */
	public boolean checkIsOn(){
		return isOn;
	}
	
	
	/**
	 * Turn ON speakers
	 */
	public void enable(){
		isOn = true;
	}
	
	/**
	 * Turn OFF speakers
	 */
	public void disable(){
		isOn = false;
	}
	
	/**
	 * Decrease volume by 10
	 */
	public void lowerVolume(){
		if(currentVolume > MIN_VOLUME){
			currentVolume-=10;
		}
	}
	
	/**
	 * Increase volume by 10
	 */
	public void increaseVolume(){
		if(currentVolume < MAX_VOLUME){
			currentVolume += 10;
		}
	}

	
	/**
	 * toString method for MobileSpeakers class
	 */
	public String toString() {
		String s = "\n";
		s += "Manufacturer: " + manufacturerName + "\n";
		if (isOn == true) {
			s += "Current volume: " + currentVolume + "\n";
		} else {
			s += "Current volume: OFF";
		}
		return s;
	}


	/**
	 * Returns battery usage per hour
	 * @return the baterryUsagePerHour
	 */
	public int getBaterryUsagePerHour() {
		return batteryUsagePerHour;
	}
	
	
}
