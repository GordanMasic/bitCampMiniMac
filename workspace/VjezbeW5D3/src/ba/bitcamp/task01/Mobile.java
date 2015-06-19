package ba.bitcamp.task01;

public class Mobile {

	private String name;
	private MobileDisplay display;
	private MobileSpeakers speaker;
	private MobileBattery battery;
	private MobileAntenna antenna;
	/**
	 * @param display
	 * @param speaker
	 * @param battery
	 * @param antenna
	 */
	public Mobile(String name,MobileDisplay display, MobileSpeakers speaker,
			MobileBattery battery, MobileAntenna antenna) {
		this.name = name;
		this.display = display;
		this.speaker = speaker;
		this.battery = battery;
		this.antenna = antenna;
	}
	
	public String toString() {
		return String.format(
				"Mobile [display=%s, speaker=%s, battery=%s, antenna=%s]",
				display, speaker, battery, antenna);
	}

	/**
	 * @return the display
	 */
	public MobileDisplay getDisplay() {
		return display;
	}

	/**
	 * @param display the display to set
	 */
	public void setDisplay(MobileDisplay display) {
		this.display = display;
	}

	/**
	 * @return the speaker
	 */
	public MobileSpeakers getSpeaker() {
		return speaker;
	}

	/**
	 * @param speaker the speaker to set
	 */
	public void setSpeaker(MobileSpeakers speaker) {
		this.speaker = speaker;
	}

	/**
	 * @return the battery
	 */
	public MobileBattery getBattery() {
		return battery;
	}

	/**
	 * @param battery the battery to set
	 */
	public void setBattery(MobileBattery battery) {
		this.battery = battery;
	}

	/**
	 * @return the antenna
	 */
	public MobileAntenna getAntenna() {
		return antenna;
	}

	/**
	 * @param antenna the antenna to set
	 */
	public void setAntenna(MobileAntenna antenna) {
		this.antenna = antenna;
	}
	
	public int getBatteryStatusAfterWork(int time){
		
		battery.batteryDecrease(speaker.getBaterryUsagePerHour()*time + antenna.getBatteryUsage()*time + display.getBatteryUsagePercent()*time);
		return battery.getBatteryPercentage();
	}
	
	public int getBatteryStatusAfterCharging(int time){
		battery.chargeBatteryFor(time);
		return battery.getBatteryPercentage();
	}
}
