package ba.bitcamp.task01;

public class MobileDisplay {

	private static final int MAX_DISPLAY_STRENGTH = 100;
	private static final int MIN_DISPLAY_STRENGTH = 0;
	private static final int MAX_USAGE = 100;
	private static final int MIN_USAGE = 100;

	private String displayManufacturerName;
	private int currentDisplayStrength;
	private boolean isOn;
	private int batteryUsagePercent;

	/**
	 * Constructor for creating MobileDisplay objects
	 * 
	 * @param displayManufacturerName
	 * @param batteryUsagePercent
	 */
	public MobileDisplay(String displayManufacturerName, int batteryUsagePercent) {
		super();
		this.displayManufacturerName = displayManufacturerName;
		this.batteryUsagePercent = batteryUsagePercent;
		this.currentDisplayStrength = 100;
		this.isOn = false;
	}

	
	
	
	/**
	 * @return the batteryUsagePercent
	 */
	public int getBatteryUsagePercent() {
		return batteryUsagePercent;
	}




	/**
	 * @param batteryUsagePercent the batteryUsagePercent to set
	 */
	public void setBatteryUsagePercent(int batteryUsagePercent) {
		this.batteryUsagePercent = batteryUsagePercent;
	}




	/**
	 * Turn on mobile
	 */
	public void turnOn() {
		isOn = true;
	}

	/**
	 * Turn off mobile
	 */
	public void turnOff() {
		isOn = false;
	}

	/**
	 * Increase display strength for 10
	 */
	public void increaseDisplayStrength() {
		if (isOn == true) {
			currentDisplayStrength += 10;
		}
		if (currentDisplayStrength > MAX_DISPLAY_STRENGTH) {
			currentDisplayStrength = MAX_DISPLAY_STRENGTH;
		}
	}

	/**
	 * Decrease display strength for 10
	 */
	public void decreaseDisplayStrength() {
		if (isOn == true) {
			currentDisplayStrength -= 10;
		}
		if (currentDisplayStrength < MIN_DISPLAY_STRENGTH) {
			currentDisplayStrength = MIN_DISPLAY_STRENGTH;
		}
	}

	/**
	 * toString method for MobileSpeakers class
	 */
	public String toString() {
		String s = "\n";
		s += "Manufacturer: " + displayManufacturerName + "\n";
		if (isOn == true) {
			s += "Display brightness: " + currentDisplayStrength + "\n";
		} else {
			s += "Display brigthness: OFF \n";
		}
		return s;
	}
}
