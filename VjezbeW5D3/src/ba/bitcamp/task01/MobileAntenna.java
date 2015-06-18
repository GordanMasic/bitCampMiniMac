package ba.bitcamp.task01;

public class MobileAntenna {

	private static final int MIN_SIGNAL = 0;
	private static final int MAX_SIGNAL = 4;
	private static final String CAL = "CAL";
	private static final String SMS = "SMS";
	private static final String CALL_NUM = "387";
	private static final int NUM_LENGTH = 11;

	private String antennaManufacturerName;
	private int signalStrength;
	private int batteryUsage;// per hour

	/**
	 * Constructor for creating MobileAntenna objects
	 * 
	 * @param antennaManufacturerName
	 * @param batteryUsage
	 */
	public MobileAntenna(String antennaManufacturerName, int batteryUsage) {
		if (batteryUsage < 0) {
			throw new IllegalArgumentException("Usage can't be negative!");
		}
		this.antennaManufacturerName = antennaManufacturerName;
		this.batteryUsage = batteryUsage;
		this.signalStrength = 4;
	}

	/**
	 * Returns manufacturer's name
	 * 
	 * @return the antennaManufacturerName
	 */
	public String getAntennaManufacturerName() {
		return antennaManufacturerName;
	}

	/**
	 * Returns battery usage per hour
	 * 
	 * @return the batteryUsage
	 */
	public int getBatteryUsage() {
		return batteryUsage;
	}

	/**
	 * Returns signal strength
	 * 
	 * @return the signalStrength
	 */
	public int getSignalStrength() {
		return signalStrength;
	}

	/**
	 * Sets antenna's signal strength at wanted value
	 * 
	 * @param signalStrength
	 *            the signalStrength to set
	 */
	public void setSignalStrength(int signalStrength) {
		if (signalStrength < MIN_SIGNAL || signalStrength > MAX_SIGNAL) {
			throw new IllegalArgumentException(
					"Antenna can't have that signal!");
		}
		this.signalStrength = signalStrength;
	}

	/**
	 * Returns does antenna have signal to capture call or message
	 * 
	 * @param signal
	 * @param str
	 * @return
	 */
	public boolean hasSignal(int signal, String str) {
		if (signalStrength < MIN_SIGNAL || signalStrength > MAX_SIGNAL) {
			throw new IllegalArgumentException(
					"Antenna can't have that signal!");
		}
		if (signal > signalStrength) {
			return false;
		}
		if (!str.substring(0, 3).equals(CAL)
				&& !str.substring(0, 3).equals(SMS)) {
			return false;
		}
		if (!str.substring(3, 6).equals(CALL_NUM)) {
			return false;
		}
		if (str.substring(3).length() != NUM_LENGTH) {
			return false;
		}
		return true;
	}

	/**
	 * toString method for MobileAntenna
	 */
	public String toString() {
		return String.format("\nManufacturer: %s \nSignal status: %d",
				antennaManufacturerName, signalStrength);
	}

}
