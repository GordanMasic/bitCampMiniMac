package ba.bitcamp.task01;

public class MobileBattery {

	private static final int MAX_BATTERY_PERCENTAGE = 100;
	private static final int MIN_BATTERY_PERCENTAGE = 0;

	private String batteryManufacturer;
	private int batteryPercentage;
	private double charging;

	/**
	 * Constructor for MobileBattery objects
	 * 
	 * @param batteryManufacturer
	 *            manufacturer's name
	 * @param charging
	 *            speed of charging
	 */
	public MobileBattery(String batteryManufacturer, double charging) {

		if (charging < 0) {
			throw new IllegalArgumentException(
					"Cahrging speed can't be negative");
		}
		this.batteryManufacturer = batteryManufacturer;
		this.batteryPercentage = 50;
		this.charging = charging;
	}

	/**
	 * Returns manufacturer's name
	 * 
	 * @return the batteryManufacturer
	 */
	public String getBatteryManufacturer() {
		return batteryManufacturer;
	}

	/**
	 * Returns battery status
	 * 
	 * @return the batteryPercentage
	 */
	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	/**
	 * Charging battery
	 * 
	 * @param time
	 *            duration time
	 */
	public void chargeBatteryFor(int time) {
		if (time < 0) {
			throw new IllegalArgumentException("Time can't be negative!");
		}
		batteryPercentage += (int)(time * 60* charging);
		if (batteryPercentage > MAX_BATTERY_PERCENTAGE) {
			batteryPercentage = MAX_BATTERY_PERCENTAGE;
		}
	}

	/**
	 * Decreases battery percentage for some inputed value
	 * 
	 * @param percent
	 */
	public void batteryDecrease(int percent) {
		if (percent > MAX_BATTERY_PERCENTAGE) {
			throw new IllegalArgumentException(
					"Battery can't be decreased for that much!");
		}
		batteryPercentage -= percent;
		if (batteryPercentage < MIN_BATTERY_PERCENTAGE) {
			batteryPercentage = MIN_BATTERY_PERCENTAGE;
		}
	}

	/**
	 * toString method
	 */
	public String toString() {
		return String.format("Manufacturer: %s \nBattery Percentage: %d",
				batteryManufacturer, batteryPercentage);
	}
}